package typingsJapgolly.smoothScrollbar.pluginMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.smoothScrollbar.data2dMod.Data2d
import typingsJapgolly.smoothScrollbar.scrollbarMod.Scrollbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarPlugin extends js.Object {
  val name: String
  val options: js.Any
  val scrollbar: Scrollbar
  def onDestroy(): Unit
  def onInit(): Unit
  def onRender(remainMomentum: Data2d): Unit
  def onUpdate(): Unit
  def transformDelta(delta: Data2d, fromEvent: js.Any): Data2d
}

object ScrollbarPlugin {
  @scala.inline
  def apply(
    name: String,
    onDestroy: Callback,
    onInit: Callback,
    onRender: Data2d => Callback,
    onUpdate: Callback,
    options: js.Any,
    scrollbar: Scrollbar,
    transformDelta: (Data2d, js.Any) => CallbackTo[Data2d]
  ): ScrollbarPlugin = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any])
    __obj.updateDynamic("onDestroy")(onDestroy.toJsFn)
    __obj.updateDynamic("onInit")(onInit.toJsFn)
    __obj.updateDynamic("onRender")(js.Any.fromFunction1((t0: typingsJapgolly.smoothScrollbar.data2dMod.Data2d) => onRender(t0).runNow()))
    __obj.updateDynamic("onUpdate")(onUpdate.toJsFn)
    __obj.updateDynamic("transformDelta")(js.Any.fromFunction2((t0: typingsJapgolly.smoothScrollbar.data2dMod.Data2d, t1: js.Any) => transformDelta(t0, t1).runNow()))
    __obj.asInstanceOf[ScrollbarPlugin]
  }
}

