package typingsJapgolly.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEngineDefaultClusterParametersResult extends js.Object {
  var EngineDefaults: js.UndefOr[typingsJapgolly.awsSdk.rdsMod.EngineDefaults] = js.native
}

object DescribeEngineDefaultClusterParametersResult {
  @scala.inline
  def apply(EngineDefaults: EngineDefaults = null): DescribeEngineDefaultClusterParametersResult = {
    val __obj = js.Dynamic.literal()
    if (EngineDefaults != null) __obj.updateDynamic("EngineDefaults")(EngineDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEngineDefaultClusterParametersResult]
  }
}

