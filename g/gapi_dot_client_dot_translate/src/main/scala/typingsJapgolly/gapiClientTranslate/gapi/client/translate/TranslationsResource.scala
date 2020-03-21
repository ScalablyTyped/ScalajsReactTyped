package typingsJapgolly.gapiClientTranslate.gapi.client.translate

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientTranslate.AnonAlt
import typingsJapgolly.gapiClientTranslate.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslationsResource extends js.Object {
  /**
    * The source language of the initial request, detected automatically, if
    * no source language was passed within the initial request. If the
    * source language was passed, auto-detection of the language will not
    * occur and this field will be empty.
    */
  var detectedSourceLanguage: js.UndefOr[String] = js.undefined
  /**
    * The `model` type used for this translation. Valid values are
    * listed in public documentation. Can be different from requested `model`.
    * Present only if specific model type was explicitly requested.
    */
  var model: js.UndefOr[String] = js.undefined
  /** Text translated into the target language. */
  var translatedText: js.UndefOr[String] = js.undefined
  /** Translates input text, returning translated text. */
  def list(request: AnonAlt): Request_[TranslationsListResponse]
  /** Translates input text, returning translated text. */
  def translate(request: AnonBearertoken): Request_[TranslationsListResponse]
}

object TranslationsResource {
  @scala.inline
  def apply(
    list: AnonAlt => CallbackTo[Request_[TranslationsListResponse]],
    translate: AnonBearertoken => CallbackTo[Request_[TranslationsListResponse]],
    detectedSourceLanguage: String = null,
    model: String = null,
    translatedText: String = null
  ): TranslationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTranslate.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("translate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTranslate.AnonBearertoken) => translate(t0).runNow()))
    if (detectedSourceLanguage != null) __obj.updateDynamic("detectedSourceLanguage")(detectedSourceLanguage.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (translatedText != null) __obj.updateDynamic("translatedText")(translatedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationsResource]
  }
}

