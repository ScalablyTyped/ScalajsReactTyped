package typingsJapgolly.gapiClientTranslate.gapi.client.translate

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientTranslate.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguagesResource extends js.Object {
  /**
    * Supported language code, generally consisting of its ISO 639-1
    * identifier. (E.g. 'en', 'ja'). In certain cases, BCP-47 codes including
    * language + region identifiers are returned (e.g. 'zh-TW' and 'zh-CH')
    */
  var language: js.UndefOr[String] = js.undefined
  /** Human readable name of the language localized to the target language. */
  var name: js.UndefOr[String] = js.undefined
  /** Returns a list of supported languages for translation. */
  def list(request: AnonAccesstoken): Request_[LanguagesListResponse]
}

object LanguagesResource {
  @scala.inline
  def apply(
    list: AnonAccesstoken => CallbackTo[Request_[LanguagesListResponse]],
    language: String = null,
    name: String = null
  ): LanguagesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTranslate.AnonAccesstoken) => list(t0).runNow()))
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguagesResource]
  }
}

