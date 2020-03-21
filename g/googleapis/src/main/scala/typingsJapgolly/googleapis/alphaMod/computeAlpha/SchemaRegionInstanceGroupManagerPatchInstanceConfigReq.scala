package typingsJapgolly.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RegionInstanceGroupManagers.patchPerInstanceConfigs
  */
@js.native
trait SchemaRegionInstanceGroupManagerPatchInstanceConfigReq extends js.Object {
  /**
    * The list of per-instance configs to insert or patch on this managed
    * instance group.
    */
  var perInstanceConfigs: js.UndefOr[js.Array[SchemaPerInstanceConfig]] = js.native
}

object SchemaRegionInstanceGroupManagerPatchInstanceConfigReq {
  @scala.inline
  def apply(perInstanceConfigs: js.Array[SchemaPerInstanceConfig] = null): SchemaRegionInstanceGroupManagerPatchInstanceConfigReq = {
    val __obj = js.Dynamic.literal()
    if (perInstanceConfigs != null) __obj.updateDynamic("perInstanceConfigs")(perInstanceConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagerPatchInstanceConfigReq]
  }
}

