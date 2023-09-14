# javase_coding
core java programs
String str = "aaabbaacdddaaeefgbbbbb"; //a7b2c1d3e2f1g1
        StringBuffer sb = new StringBuffer();
        /*
        Repeatable charators in a string
         */
        Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k,v)->sb.append(k).append(v));
        System.out.println(sb);
        /*
        max and min repeated character in a string
         */
      String ab =  Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet().stream().min(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
        /*
           Non-Repeatable characters in a string
         */
        Object[] res = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(x->x.getValue()==1).map(Map.Entry::getKey).toArray();
        /*
          Repeatable Characters in a String
         */
        Object[] ob = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(v->v.getValue()>1).map(Map.Entry::getKey).toArray();
