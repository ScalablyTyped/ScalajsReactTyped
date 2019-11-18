package typingsJapgolly.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelaunchOptions extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var execPath: js.UndefOr[String] = js.undefined
}

object RelaunchOptions {
  @scala.inline
  def apply(args: js.Array[String] = null, execPath: String = null): RelaunchOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (execPath != null) __obj.updateDynamic("execPath")(execPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelaunchOptions]
  }
}

