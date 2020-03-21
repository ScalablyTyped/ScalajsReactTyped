package typingsJapgolly.reactSvgPanZoom.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewerMouseEvent[T] extends js.Object {
  var SVGViewer: SVGSVGElement
  var originalEvent: ReactMouseEventFrom[T with Element]
  var point: Point
  var scaleFactor: Double
  var translationX: Double
  var translationY: Double
  var x: Double
  var y: Double
  def preventDefault(): Unit
  def stopPropagation(): Unit
}

object ViewerMouseEvent {
  @scala.inline
  def apply[T](
    SVGViewer: SVGSVGElement,
    originalEvent: ReactMouseEventFrom[T with Element],
    point: Point,
    preventDefault: Callback,
    scaleFactor: Double,
    stopPropagation: Callback,
    translationX: Double,
    translationY: Double,
    x: Double,
    y: Double
  ): ViewerMouseEvent[T] = {
    val __obj = js.Dynamic.literal(SVGViewer = SVGViewer.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any], translationX = translationX.asInstanceOf[js.Any], translationY = translationY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.asInstanceOf[ViewerMouseEvent[T]]
  }
}

