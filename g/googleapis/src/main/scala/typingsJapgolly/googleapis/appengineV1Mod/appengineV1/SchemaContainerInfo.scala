package typingsJapgolly.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Docker image that is used to create a container and start a VM instance for
  * the version that you deploy. Only applicable for instances running in the
  * App Engine flexible environment.
  */
@js.native
trait SchemaContainerInfo extends js.Object {
  /**
    * URI to the hosted container image in Google Container Registry. The URI
    * must be fully qualified and include a tag or digest. Examples:
    * &quot;gcr.io/my-project/image:tag&quot; or
    * &quot;gcr.io/my-project/image@digest&quot;
    */
  var image: js.UndefOr[String] = js.native
}

object SchemaContainerInfo {
  @scala.inline
  def apply(image: String = null): SchemaContainerInfo = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContainerInfo]
  }
}

