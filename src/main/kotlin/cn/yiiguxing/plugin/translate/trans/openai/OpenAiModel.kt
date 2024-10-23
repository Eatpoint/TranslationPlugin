@file:Suppress("unused")

package cn.yiiguxing.plugin.translate.trans.openai

/**
 * See: [OpenAi Models](https://platform.openai.com/docs/models)
 */
sealed interface OpenAiModel {
    val modelId: String
    val modelName: String
}

/**
 * See: [OpenAi GPT Models](https://platform.openai.com/docs/models)
 */
enum class OpenAiGPTModel(override val modelId: String, override val modelName: String) : OpenAiModel {
    GPT_4O_MINI("gpt-4o-mini", "GPT-4o mini"),
    GPT_4O("gpt-4o", "GPT-4o"),
    GPT_4_TURBO("gpt-4-turbo", "GPT-4 Turbo"),
    GPT_4("gpt-4", "GPT-4"),
    GPT_3_5_TURBO("gpt-3.5-turbo", "GPT-3.5 Turbo"),
}

/**
 * See: [OpenAi TTS Models](https://platform.openai.com/docs/models/tts)
 */
enum class OpenAiTTSModel(override val modelId: String, override val modelName: String) : OpenAiModel {
    TTS_1("tts-1", "TTS-1"),
    TTS_1_HD("tts-1-hd", "TTS-1 HD"),
}