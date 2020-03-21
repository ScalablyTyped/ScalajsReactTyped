package typingsJapgolly.googleapis.speechV1Mod.speechV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information to the recognizer that specifies how to process the
  * request.
  */
@js.native
trait SchemaRecognitionConfig extends js.Object {
  /**
    * *Optional* The number of channels in the input audio data. ONLY set this
    * for MULTI-CHANNEL recognition. Valid values for LINEAR16 and FLAC are
    * `1`-`8`. Valid values for OGG_OPUS are &#39;1&#39;-&#39;254&#39;. Valid
    * value for MULAW, AMR, AMR_WB and SPEEX_WITH_HEADER_BYTE is only `1`. If
    * `0` or omitted, defaults to one channel (mono). Note: We only recognize
    * the first channel by default. To perform independent recognition on each
    * channel set `enable_separate_recognition_per_channel` to &#39;true&#39;.
    */
  var audioChannelCount: js.UndefOr[Double] = js.native
  /**
    * *Optional* If &#39;true&#39;, adds punctuation to recognition result
    * hypotheses. This feature is only available in select languages. Setting
    * this for requests in other languages has no effect at all. The default
    * &#39;false&#39; value does not add punctuation to result hypotheses.
    * Note: This is currently offered as an experimental service, complimentary
    * to all users. In the future this may be exclusively available as a
    * premium feature.
    */
  var enableAutomaticPunctuation: js.UndefOr[Boolean] = js.native
  /**
    * This needs to be set to `true` explicitly and `audio_channel_count` &gt;
    * 1 to get each channel recognized separately. The recognition result will
    * contain a `channel_tag` field to state which channel that result belongs
    * to. If this is not true, we will only recognize the first channel. The
    * request is billed cumulatively for all channels recognized:
    * `audio_channel_count` multiplied by the length of the audio.
    */
  var enableSeparateRecognitionPerChannel: js.UndefOr[Boolean] = js.native
  /**
    * *Optional* If `true`, the top result includes a list of words and the
    * start and end time offsets (timestamps) for those words. If `false`, no
    * word-level time offset information is returned. The default is `false`.
    */
  var enableWordTimeOffsets: js.UndefOr[Boolean] = js.native
  /**
    * Encoding of audio data sent in all `RecognitionAudio` messages. This
    * field is optional for `FLAC` and `WAV` audio files and required for all
    * other audio formats. For details, see AudioEncoding.
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * *Required* The language of the supplied audio as a
    * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
    * Example: &quot;en-US&quot;. See [Language
    * Support](/speech-to-text/docs/languages) for a list of the currently
    * supported language codes.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * *Optional* Maximum number of recognition hypotheses to be returned.
    * Specifically, the maximum number of `SpeechRecognitionAlternative`
    * messages within each `SpeechRecognitionResult`. The server may return
    * fewer than `max_alternatives`. Valid values are `0`-`30`. A value of `0`
    * or `1` will return a maximum of one. If omitted, will return a maximum of
    * one.
    */
  var maxAlternatives: js.UndefOr[Double] = js.native
  /**
    * *Optional* Metadata regarding this request.
    */
  var metadata: js.UndefOr[SchemaRecognitionMetadata] = js.native
  /**
    * *Optional* Which model to select for the given request. Select the model
    * best suited to your domain to get best results. If a model is not
    * explicitly specified, then we auto-select a model based on the parameters
    * in the RecognitionConfig. &lt;table&gt;   &lt;tr&gt;
    * &lt;td&gt;&lt;b&gt;Model&lt;/b&gt;&lt;/td&gt;
    * &lt;td&gt;&lt;b&gt;Description&lt;/b&gt;&lt;/td&gt;   &lt;/tr&gt;
    * &lt;tr&gt;
    * &lt;td&gt;&lt;code&gt;command_and_search&lt;/code&gt;&lt;/td&gt;
    * &lt;td&gt;Best for short queries such as voice commands or voice
    * search.&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;
    * &lt;td&gt;&lt;code&gt;phone_call&lt;/code&gt;&lt;/td&gt; &lt;td&gt;Best
    * for audio that originated from a phone call (typically     recorded at an
    * 8khz sampling rate).&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;
    * &lt;td&gt;&lt;code&gt;video&lt;/code&gt;&lt;/td&gt;     &lt;td&gt;Best
    * for audio that originated from from video or includes multiple speakers.
    * Ideally the audio is recorded at a 16khz or greater         sampling
    * rate. This is a premium model that costs more than the         standard
    * rate.&lt;/td&gt;   &lt;/tr&gt;   &lt;tr&gt;
    * &lt;td&gt;&lt;code&gt;default&lt;/code&gt;&lt;/td&gt;     &lt;td&gt;Best
    * for audio that is not one of the specific audio models.         For
    * example, long-form audio. Ideally the audio is high-fidelity, recorded at
    * a 16khz or greater sampling rate.&lt;/td&gt;   &lt;/tr&gt; &lt;/table&gt;
    */
  var model: js.UndefOr[String] = js.native
  /**
    * *Optional* If set to `true`, the server will attempt to filter out
    * profanities, replacing all but the initial character in each filtered
    * word with asterisks, e.g. &quot;f***&quot;. If set to `false` or omitted,
    * profanities won&#39;t be filtered out.
    */
  var profanityFilter: js.UndefOr[Boolean] = js.native
  /**
    * Sample rate in Hertz of the audio data sent in all `RecognitionAudio`
    * messages. Valid values are: 8000-48000. 16000 is optimal. For best
    * results, set the sampling rate of the audio source to 16000 Hz. If
    * that&#39;s not possible, use the native sample rate of the audio source
    * (instead of re-sampling). This field is optional for FLAC and WAV audio
    * files, but is required for all other audio formats. For details, see
    * AudioEncoding.
    */
  var sampleRateHertz: js.UndefOr[Double] = js.native
  /**
    * *Optional* array of SpeechContext. A means to provide context to assist
    * the speech recognition. For more information, see [Phrase
    * Hints](/speech-to-text/docs/basics#phrase-hints).
    */
  var speechContexts: js.UndefOr[js.Array[SchemaSpeechContext]] = js.native
  /**
    * *Optional* Set to true to use an enhanced model for speech recognition.
    * If `use_enhanced` is set to true and the `model` field is not set, then
    * an appropriate enhanced model is chosen if: 1. project is eligible for
    * requesting enhanced models 2. an enhanced model exists for the audio  If
    * `use_enhanced` is true and an enhanced version of the specified model
    * does not exist, then the speech is recognized using the standard version
    * of the specified model.  Enhanced speech models require that you opt-in
    * to data logging using instructions in the
    * [documentation](/speech-to-text/docs/enable-data-logging). If you set
    * `use_enhanced` to true and you have not enabled audio logging, then you
    * will receive an error.
    */
  var useEnhanced: js.UndefOr[Boolean] = js.native
}

object SchemaRecognitionConfig {
  @scala.inline
  def apply(
    audioChannelCount: Int | Double = null,
    enableAutomaticPunctuation: js.UndefOr[Boolean] = js.undefined,
    enableSeparateRecognitionPerChannel: js.UndefOr[Boolean] = js.undefined,
    enableWordTimeOffsets: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    languageCode: String = null,
    maxAlternatives: Int | Double = null,
    metadata: SchemaRecognitionMetadata = null,
    model: String = null,
    profanityFilter: js.UndefOr[Boolean] = js.undefined,
    sampleRateHertz: Int | Double = null,
    speechContexts: js.Array[SchemaSpeechContext] = null,
    useEnhanced: js.UndefOr[Boolean] = js.undefined
  ): SchemaRecognitionConfig = {
    val __obj = js.Dynamic.literal()
    if (audioChannelCount != null) __obj.updateDynamic("audioChannelCount")(audioChannelCount.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAutomaticPunctuation)) __obj.updateDynamic("enableAutomaticPunctuation")(enableAutomaticPunctuation.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSeparateRecognitionPerChannel)) __obj.updateDynamic("enableSeparateRecognitionPerChannel")(enableSeparateRecognitionPerChannel.asInstanceOf[js.Any])
    if (!js.isUndefined(enableWordTimeOffsets)) __obj.updateDynamic("enableWordTimeOffsets")(enableWordTimeOffsets.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (maxAlternatives != null) __obj.updateDynamic("maxAlternatives")(maxAlternatives.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(profanityFilter)) __obj.updateDynamic("profanityFilter")(profanityFilter.asInstanceOf[js.Any])
    if (sampleRateHertz != null) __obj.updateDynamic("sampleRateHertz")(sampleRateHertz.asInstanceOf[js.Any])
    if (speechContexts != null) __obj.updateDynamic("speechContexts")(speechContexts.asInstanceOf[js.Any])
    if (!js.isUndefined(useEnhanced)) __obj.updateDynamic("useEnhanced")(useEnhanced.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRecognitionConfig]
  }
}

