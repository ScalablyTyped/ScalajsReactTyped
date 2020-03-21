package typingsJapgolly.googleapis.pubsubV1Mod.pubsubV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsSubscriptionsCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The name of the subscription. It must have the format
    * `"projects/{project}/subscriptions/{subscription}"`. `{subscription}`
    * must start with a letter, and contain only letters (`[A-Za-z]`), numbers
    * (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`),
    * plus (`+`) or percent signs (`%`). It must be between 3 and 255
    * characters in length, and it must not start with `"goog"`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSubscription] = js.native
}

