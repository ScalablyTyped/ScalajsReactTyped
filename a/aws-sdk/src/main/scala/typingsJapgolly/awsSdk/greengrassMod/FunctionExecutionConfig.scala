package typingsJapgolly.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionExecutionConfig extends js.Object {
  var IsolationMode: js.UndefOr[FunctionIsolationMode] = js.native
  var RunAs: js.UndefOr[FunctionRunAsConfig] = js.native
}

object FunctionExecutionConfig {
  @scala.inline
  def apply(IsolationMode: FunctionIsolationMode = null, RunAs: FunctionRunAsConfig = null): FunctionExecutionConfig = {
    val __obj = js.Dynamic.literal()
    if (IsolationMode != null) __obj.updateDynamic("IsolationMode")(IsolationMode.asInstanceOf[js.Any])
    if (RunAs != null) __obj.updateDynamic("RunAs")(RunAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionExecutionConfig]
  }
}

