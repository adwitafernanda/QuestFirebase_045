package com.example.questfirebase_045.model

data class Mahasiswa(
    val nim: String,
    val nama: String,
    val alamat: String,
    val jenisKelamin: String,
    val kelas: String,
    val angkatan: String,
    val judulskripsi: String,
    val dosenpemsatu : String,
    val dosenpemdua : String
){
    constructor() : this("", "", "", "", "", "","","","")
}
