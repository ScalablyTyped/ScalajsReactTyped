package typingsJapgolly.atAngularCompiler.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostListener extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var eventName: js.UndefOr[String] = js.undefined
}

object HostListener {
  @scala.inline
  def apply(args: js.Array[String] = null, eventName: String = null): HostListener = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (eventName != null) __obj.updateDynamic("eventName")(eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostListener]
  }
}

