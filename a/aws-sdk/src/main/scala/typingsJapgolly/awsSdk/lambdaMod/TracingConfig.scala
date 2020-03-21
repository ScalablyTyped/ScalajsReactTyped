package typingsJapgolly.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TracingConfig extends js.Object {
  /**
    * The tracing mode.
    */
  var Mode: js.UndefOr[TracingMode] = js.native
}

object TracingConfig {
  @scala.inline
  def apply(Mode: TracingMode = null): TracingConfig = {
    val __obj = js.Dynamic.literal()
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracingConfig]
  }
}

