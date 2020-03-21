package typingsJapgolly.googleapis.texttospeechV1beta1Mod.texttospeechV1beta1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceVoicesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional (but recommended)
    * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. If
    * specified, the ListVoices call will only return voices that can be used
    * to synthesize this language_code. E.g. when specifying "en-NZ", you will
    * get supported "en-*" voices; when specifying "no", you will get supported
    * "no-*" (Norwegian) and "nb-*" (Norwegian Bokmal) voices; specifying "zh"
    * will also get supported "cmn-*" voices; specifying "zh-hk" will also get
    * supported "yue-*" voices.
    */
  var languageCode: js.UndefOr[String] = js.native
}

