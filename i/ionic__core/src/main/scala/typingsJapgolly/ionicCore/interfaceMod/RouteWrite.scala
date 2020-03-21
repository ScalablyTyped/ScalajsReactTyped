package typingsJapgolly.ionicCore.interfaceMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteWrite extends js.Object {
  var changed: Boolean
  var element: js.UndefOr[HTMLElement] = js.undefined
  var markVisible: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
}

object RouteWrite {
  @scala.inline
  def apply(
    changed: Boolean,
    element: HTMLElement = null,
    markVisible: js.UndefOr[CallbackTo[Unit | js.Promise[Unit]]] = js.undefined
  ): RouteWrite = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    markVisible.foreach(p => __obj.updateDynamic("markVisible")(p.toJsFn))
    __obj.asInstanceOf[RouteWrite]
  }
}

