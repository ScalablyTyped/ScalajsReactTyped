package typingsJapgolly.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `ListServices` method.
  */
@js.native
trait SchemaListServicesResponse extends js.Object {
  /**
    * Token that can be passed to `ListServices` to resume a paginated query.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The available services for the requested project.
    */
  var services: js.UndefOr[js.Array[SchemaService]] = js.native
}

object SchemaListServicesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, services: js.Array[SchemaService] = null): SchemaListServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListServicesResponse]
  }
}

