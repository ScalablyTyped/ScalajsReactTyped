package typingsJapgolly.mapboxGl.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IControl extends js.Object {
  var getDefaultPosition: js.UndefOr[js.Function0[String]] = js.undefined
  def onAdd(map: Map): HTMLElement
  def onRemove(map: Map): js.Any
}

object IControl {
  @scala.inline
  def apply(
    onAdd: Map => CallbackTo[HTMLElement],
    onRemove: Map => CallbackTo[js.Any],
    getDefaultPosition: js.UndefOr[CallbackTo[String]] = js.undefined
  ): IControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onAdd")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxGl.mod.Map) => onAdd(t0).runNow()))
    __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: typingsJapgolly.mapboxGl.mod.Map) => onRemove(t0).runNow()))
    getDefaultPosition.foreach(p => __obj.updateDynamic("getDefaultPosition")(p.toJsFn))
    __obj.asInstanceOf[IControl]
  }
}

