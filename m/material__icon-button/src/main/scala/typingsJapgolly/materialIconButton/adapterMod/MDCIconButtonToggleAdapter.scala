package typingsJapgolly.materialIconButton.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialIconButton.typesMod.MDCIconButtonToggleEventDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCIconButtonToggleAdapter extends js.Object {
  def addClass(className: String): Unit
  def hasClass(className: String): Boolean
  def notifyChange(evtData: MDCIconButtonToggleEventDetail): Unit
  def removeClass(className: String): Unit
  def setAttr(attrName: String, attrValue: String): Unit
}

object MDCIconButtonToggleAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    hasClass: String => CallbackTo[Boolean],
    notifyChange: MDCIconButtonToggleEventDetail => Callback,
    removeClass: String => Callback,
    setAttr: (String, String) => Callback
  ): MDCIconButtonToggleAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("hasClass")(js.Any.fromFunction1((t0: java.lang.String) => hasClass(t0).runNow()))
    __obj.updateDynamic("notifyChange")(js.Any.fromFunction1((t0: typingsJapgolly.materialIconButton.typesMod.MDCIconButtonToggleEventDetail) => notifyChange(t0).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("setAttr")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setAttr(t0, t1).runNow()))
    __obj.asInstanceOf[MDCIconButtonToggleAdapter]
  }
}

