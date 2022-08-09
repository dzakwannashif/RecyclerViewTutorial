package com.dzakwan.dicodingtutorial.data

object DataNabi {

    val nNabi = arrayListOf(
        "Nabi Adam AS",
        "Nabi Idris AS",
        "Nabi Nuh AS",
        "Nabi Hud AS",
        "Nabi Saleh AS",
        "Nabi Ibrahim AS",
        "Nabi Luth AS",
        "Nabi Ismail AS",
        "Nabi Ishaq AS",
        "Nabi Yaqub AS",
        "Nabi Yusuf AS",
        "Nabi Ayub AS",
        "Nabi Syu'aib AS",
        "Nabi Musa AS",
        "Nabi Harun AS",
        "Nabi Dzulkifli AS",
        "Nabi Daud AS",
        "Nabi Sulaiman AS",
        "Nabi Ilyas AS",
        "Nabi Ilyasa AS",
        "Nabi Yunus AS",
        "Nabi Zakaria AS",
        "Nabi Yahya AS",
        "Nabi Isa AS",
        "Nabi Muhammad SAW",
    )

    val listName: ArrayList<DNabi>
        get() {
            val listNama = arrayListOf<DNabi>()
            for (position in nNabi.indices){
                val data = DNabi(
                   nama = nNabi[position]
                )
                listNama.add(data)
            }
            return listNama
        }
}
