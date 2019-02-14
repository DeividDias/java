package br.com.softbox.ivendas.sellin.entrada.mercadoria;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import br.com.softbox.core.util.Dados;

public class Java8Examples4 {

    public static void main(String[] args) {

        //3 apple, 2 banana, others 1
        List<Item> items = Arrays.asList(
                new Item("POSTO BEIRA LAGO DE BOA ESPERANCA LTDA", "01008404000194", 75575),
                new Item("DIOLINA ELIZABETH DE ALMEIDA ALVES ME", "12103686000125", 75574),
                new Item("DIOLINA ELIZABETH DE ALMEIDA ALVES ME", "12103686000125", 75632),
                new Item("DIOLINA ELIZABETH DE ALMEIDA ALVES ME", "12103686000125", 75633),
                new Item("LOGICA DISTRIBUICAO E COM DE PROD ALIMENTICIOS LTDA", "20237620000156", 75628)
                );

        //group by price        
        Map<String, List<Item>> groupByPriceMap = 
            items.stream().collect(Collectors.groupingBy(Item::getCnpj));

        System.out.println(groupByPriceMap);

        // group by price, uses 'mapping' to convert List<Item> to Set<String>
        Map<String, Set<String>> result =
                items.stream().collect(
                        Collectors.groupingBy(Item::getCnpj,
                                Collectors.mapping(Item::getNome, Collectors.toSet())
                        )
                );

        System.out.println(result);

    }
}

