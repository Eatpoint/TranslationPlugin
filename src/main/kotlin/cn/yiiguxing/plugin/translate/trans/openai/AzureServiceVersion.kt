@file:Suppress("unused")

package cn.yiiguxing.plugin.translate.trans.openai

enum class AzureServiceVersion(val value: String) {
    V2024_06_01("2024-06-01"),
    V2024_02_01("2024-02-01"),
    V2023_05_15("2023-05-15"),
    V2024_09_01_PREVIEW("2024-09-01-preview");

    companion object {
        fun previewVersions() = AzureServiceVersion.values().filter {
            it.value.endsWith("preview", ignoreCase = true)
        }
    }
}