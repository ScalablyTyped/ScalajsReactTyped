package typingsJapgolly.googleapis.visionV1Mod.visionV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsProductsetsPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The resource name of the ProductSet.  Format is:
    * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.  This
    * field is ignored when creating a ProductSet.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProductSet] = js.native
  /**
    * The FieldMask that specifies which fields to update. If update_mask isn't
    * specified, all mutable fields are to be updated. Valid mask path is
    * `display_name`.
    */
  var updateMask: js.UndefOr[String] = js.native
}

