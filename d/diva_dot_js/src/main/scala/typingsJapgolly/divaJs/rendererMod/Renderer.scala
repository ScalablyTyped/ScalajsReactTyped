package typingsJapgolly.divaJs.rendererMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.divaJs.interfacesMod.SourceProvider
import typingsJapgolly.divaJs.interfacesMod.ViewportPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Renderer extends js.Object {
  var layout: typingsJapgolly.divaJs.documentLayoutMod.default | Null
  def adjust(): Unit
  def destroy(): Unit
  def getRenderedPages(): js.Any
  def goto(pageIndex: Double, verticalOffset: Double, horizontalOffset: Double): Unit
  def isPageVisible(pageIndex: Double): Boolean
  def load(config: js.Object, viewportPosition: ViewportPosition, sourceResolver: SourceProvider): Unit
  def transitionViewportPosition(options: js.Object): Unit
}

object Renderer {
  @scala.inline
  def apply(
    adjust: Callback,
    destroy: Callback,
    getRenderedPages: CallbackTo[js.Any],
    goto: (Double, Double, Double) => Callback,
    isPageVisible: Double => CallbackTo[Boolean],
    load: (js.Object, ViewportPosition, SourceProvider) => Callback,
    transitionViewportPosition: js.Object => Callback,
    layout: typingsJapgolly.divaJs.documentLayoutMod.default = null
  ): Renderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adjust")(adjust.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getRenderedPages")(getRenderedPages.toJsFn)
    __obj.updateDynamic("goto")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => goto(t0, t1, t2).runNow()))
    __obj.updateDynamic("isPageVisible")(js.Any.fromFunction1((t0: scala.Double) => isPageVisible(t0).runNow()))
    __obj.updateDynamic("load")(js.Any.fromFunction3((t0: js.Object, t1: typingsJapgolly.divaJs.interfacesMod.ViewportPosition, t2: typingsJapgolly.divaJs.interfacesMod.SourceProvider) => load(t0, t1, t2).runNow()))
    __obj.updateDynamic("transitionViewportPosition")(js.Any.fromFunction1((t0: js.Object) => transitionViewportPosition(t0).runNow()))
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Renderer]
  }
}

