

package Models;

public class Model_Nicaragua {
    private final String[] depart = { "Boaco", "Carazo", "Chinandega", "Chontales", "Costa Caribe Norte","Costa Caribe Sur", "Estelí", "Granada", "Jinotega", "León", "Madriz", "Managua","Masaya", "Matagalpa", "Nueva Segovia", "Río San Juan", "Rivas"};

    private final String[] Boaco = {"Boaco", "Camoapa", "Santa Lucía", "San José De los Remate", "San Lorenzo", "Teustepe"};
    private final String[] Carazo = {"Jinotepe", "Diriamba", "San Marcos", "Santa Teresa", "Dolores", "La Paz Carazo", "El Rosario", "La Conquista"};
    private final String[] Chinandega = {"Chinandega", "Corinto", "El Realejo", "Chichigalpa", "Posoltega", "El Viejo", "Puerto Morazán", "Somotillo", "Villa Nueva", "Santo Tomás del Norte", "Cinco Pinos", "San Francisco Del Norte", "San Pedro Del Norte"};
    private final String[] Chontales = {"Juigalpa", "Acoyapa", "Santo Tomás", "Villa Sandino", "San Pedro de Lóvago", "La Libertad", "Santo Domingo", "San Francisco Cuapa", "El Coral"};
    private final String[] CostaCaribeN = {"Puerto Cabezas", "Waspán", "Siuna", "Bonanza", "Rosita", "Bocana Paiwás", "Waslala", "Corn Island"};
    private final String[] CostaCaribeS = {"Bluefields", "El Rama", "Muelle De Los Buelles", "La Cruz De Rio Grande", "Prinzapolka", "Nueva Guinea", "Tortuguero", "Kukra Hill", "Laguna De Perlas", "Desembocadura Rio Grande", "El Ayote"};
    private final String[] Esteli = {"Estelí", "Pueblo Nuevo", "Condega", "San Juan Limay", "La Trinidad", "San Nicolás"};
    private final String[] Granada = {"Granada", "Nandaime", "Diriomo", "Diriá"};
    private final String[] Jinotega = {"Jinotega", "San Rafael Del Norte", "San Sebastián Yalí", "La Concordia", "San José De Bocay", "El Cuá Bocay", "Santa María Pantasma",};
    private final String[] Leon = {"León", "El Jicaral", "La Paz Centro", "Santa Rosa Del Peñón", "Quetzalguaque", "Nagarote", "El Sauce", "Achuapa", "Telica", "Larreynaga Malpaisillo"};
    private final String[] Madriz = {"Somoto", "Telpaneca", "Sn Juan Rio Coco", "Palacagüina", "Yalagüina", "Totogalpa", "San Lucas", "La Sabanas", "San José De Cusmapa"};
    private final String[] Managua = {"Managua", "San Rafael Del Sur", "Tipitapa", "Villa Carlos Fonseca", "San Francisco Libre", "Mateare", "Ticuantepe", "Ciudad Sandino", "El Crucero",};
    private final String[] Masaya = {"Masaya", "Nindirí", "Tisma", "Catarina", "San Juan Oriente", "Niquinohomo", "Nandasmo", "Masatepe", "La Concepción"};
    private final String[] Matagalpa = {"Matagalpa", "San Ramón", "Matiguás", "Muy Muy", "Esquipulas", "San Dionisio", "San Isidro", "Sébaco", "Ciudad Darío", "Terrabona", "Rio Blanco", "Tuma La Dalia", "Rancho Grande"};
    private final String[] NuevaSegovia = {"Ocotal", "Santa María", "Macuelizo", "Dipilto", "Ciudad Antigua", "Mozonte", "San Fernando", "El Jícaro", "Jalapa", "Murra", "Quilalí", "Wiwilí", "Wiwilí Nueva Segovia"};
    private final String[] RioSanJuan = {"San Carlos", "El Castillo", "San Miguelito", "Morrito", "San Juan del Norte", "El Almendro"};
    private final String[] Rivas = {"Rivas", "San Jorge", "Buenos Aires", "Potosí", "Belén", "Tola", "San Juan Sur", "Cárdenas", "Moyogalpa", "Altagracia",};
    
    public String[] getMunicipios(int i)
    {
        switch(i)
        {
            case 0 ->{return Boaco;}
            case 1 ->{return Carazo;}
            case 2 ->{return Chinandega;}
            case 3 ->{return Chontales;}
            case 4 ->{return CostaCaribeN;}
            case 5 ->{return CostaCaribeS;}
            case 6 ->{return Esteli;}
            case 7 ->{return Granada;}
            case 8 ->{return Jinotega;}
            case 9 ->{return Leon;}
            case 10 ->{return Madriz;}
            case 11 ->{return Managua;}
            case 12 ->{return Masaya;}
            case 13 ->{return Matagalpa;}
            case 14 ->{return NuevaSegovia;}
            case 15 ->{return RioSanJuan;}
            case 16 ->{return Rivas;}
        }
        return null;
    }
}

