package typingsJapgolly.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A service with manual scaling runs continuously, allowing you to perform
  * complex initialization and rely on the state of its memory over time.
  */
@js.native
trait SchemaManualScaling extends js.Object {
  /**
    * Number of instances to assign to the service at the start. This number
    * can later be altered by using the Modules API
    * (https://cloud.google.com/appengine/docs/python/modules/functions)
    * set_num_instances() function.
    */
  var instances: js.UndefOr[Double] = js.native
}

object SchemaManualScaling {
  @scala.inline
  def apply(instances: Int | Double = null): SchemaManualScaling = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManualScaling]
  }
}

