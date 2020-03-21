package typingsJapgolly.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceGroupsUpdate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * This parameter can only be used in a properly authorized request.
    * **Note:** This parameter is intended exclusively for YouTube content
    * partners that own and manage many different YouTube channels.  The
    * `onBehalfOfContentOwner` parameter indicates that the request's
    * authorization credentials identify a YouTube user who is acting on behalf
    * of the content owner specified in the parameter value. It allows content
    * owners to authenticate once and get access to all their video and channel
    * data, without having to provide authentication credentials for each
    * individual channel. The account that the user authenticates with must be
    * linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGroup] = js.native
}

