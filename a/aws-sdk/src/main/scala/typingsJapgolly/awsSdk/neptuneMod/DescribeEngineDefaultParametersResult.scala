package typingsJapgolly.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEngineDefaultParametersResult extends js.Object {
  var EngineDefaults: js.UndefOr[typingsJapgolly.awsSdk.neptuneMod.EngineDefaults] = js.native
}

object DescribeEngineDefaultParametersResult {
  @scala.inline
  def apply(EngineDefaults: EngineDefaults = null): DescribeEngineDefaultParametersResult = {
    val __obj = js.Dynamic.literal()
    if (EngineDefaults != null) __obj.updateDynamic("EngineDefaults")(EngineDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEngineDefaultParametersResult]
  }
}

