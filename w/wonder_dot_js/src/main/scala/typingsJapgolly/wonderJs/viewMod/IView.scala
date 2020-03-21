package typingsJapgolly.wonderJs.viewMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsJapgolly.wonderJs.AnonY
import typingsJapgolly.wonderJs.mainDataMod.ContextConfigData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IView extends js.Object {
  var dom: js.Any
  var height: Double
  var offset: AnonY
  var styleHeight: String
  var styleWidth: String
  var width: Double
  var x: Double
  var y: Double
  def getContext(contextConfig: ContextConfigData): WebGLRenderingContext
  def initCanvas(): Unit
}

object IView {
  @scala.inline
  def apply(
    dom: js.Any,
    getContext: ContextConfigData => CallbackTo[WebGLRenderingContext],
    height: Double,
    initCanvas: Callback,
    offset: AnonY,
    styleHeight: String,
    styleWidth: String,
    width: Double,
    x: Double,
    y: Double
  ): IView = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], styleHeight = styleHeight.asInstanceOf[js.Any], styleWidth = styleWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("getContext")(js.Any.fromFunction1((t0: typingsJapgolly.wonderJs.mainDataMod.ContextConfigData) => getContext(t0).runNow()))
    __obj.updateDynamic("initCanvas")(initCanvas.toJsFn)
    __obj.asInstanceOf[IView]
  }
}

