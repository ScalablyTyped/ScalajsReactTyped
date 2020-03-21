package typingsJapgolly.reactOnclickoutside.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedOnClickOutProps extends js.Object {
  def disableOnClickOutside(): Unit
  def enableOnClickOutside(): Unit
}

object InjectedOnClickOutProps {
  @scala.inline
  def apply(disableOnClickOutside: Callback, enableOnClickOutside: Callback): InjectedOnClickOutProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disableOnClickOutside")(disableOnClickOutside.toJsFn)
    __obj.updateDynamic("enableOnClickOutside")(enableOnClickOutside.toJsFn)
    __obj.asInstanceOf[InjectedOnClickOutProps]
  }
}

