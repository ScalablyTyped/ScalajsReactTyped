package typingsJapgolly.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionDefaultConfig extends js.Object {
  var Execution: js.UndefOr[FunctionDefaultExecutionConfig] = js.native
}

object FunctionDefaultConfig {
  @scala.inline
  def apply(Execution: FunctionDefaultExecutionConfig = null): FunctionDefaultConfig = {
    val __obj = js.Dynamic.literal()
    if (Execution != null) __obj.updateDynamic("Execution")(Execution.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDefaultConfig]
  }
}

