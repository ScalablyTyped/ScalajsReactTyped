package typingsJapgolly.googleapis.visionV1Mod.visionV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsProductsetsProductsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ProductSet resource for which to retrieve Products.  Format is:
    * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The maximum number of items to return. Default 10, maximum 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The next_page_token returned from a previous List request, if any.
    */
  var pageToken: js.UndefOr[String] = js.native
}

