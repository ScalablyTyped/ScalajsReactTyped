package typingsJapgolly.googleapis.safebrowsingV4Mod.safebrowsingV4

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEncodedupdatesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A client ID that uniquely identifies the client implementation of the
    * Safe Browsing API.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * The version of the client implementation.
    */
  var clientVersion: js.UndefOr[String] = js.native
  /**
    * A serialized FetchThreatListUpdatesRequest proto.
    */
  var encodedRequest: js.UndefOr[String] = js.native
}

