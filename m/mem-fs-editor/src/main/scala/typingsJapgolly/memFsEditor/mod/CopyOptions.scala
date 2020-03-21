package typingsJapgolly.memFsEditor.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.glob.mod.IOptions
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyOptions extends js.Object {
  var globOptions: js.UndefOr[IOptions] = js.undefined
  var process: js.UndefOr[ProcessingFunc] = js.undefined
}

object CopyOptions {
  @scala.inline
  def apply(
    globOptions: IOptions = null,
    process: (/* contents */ Buffer, /* path */ String) => CallbackTo[Contents] = null
  ): CopyOptions = {
    val __obj = js.Dynamic.literal()
    if (globOptions != null) __obj.updateDynamic("globOptions")(globOptions.asInstanceOf[js.Any])
    if (process != null) __obj.updateDynamic("process")(js.Any.fromFunction2((t0: /* contents */ typingsJapgolly.node.Buffer, t1: /* path */ java.lang.String) => process(t0, t1).runNow()))
    __obj.asInstanceOf[CopyOptions]
  }
}

