package typingsJapgolly.googleapis.translateV2Mod.translateV2

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceLanguagesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The model type for which supported languages should be returned.
    */
  var model: js.UndefOr[String] = js.native
  /**
    * The language to use to return localized, human readable names of
    * supported languages.
    */
  var target: js.UndefOr[String] = js.native
}

