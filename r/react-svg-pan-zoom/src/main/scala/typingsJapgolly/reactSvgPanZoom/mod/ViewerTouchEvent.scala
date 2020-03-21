package typingsJapgolly.reactSvgPanZoom.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewerTouchEvent[T] extends js.Object {
  var SVGViewer: SVGSVGElement
  var changedPoints: js.Array[Point]
  var originalEvent: ReactTouchEventFrom[T with Element]
  var points: js.Array[Point]
  var scaleFactor: Double
  var translationX: Double
  var translationY: Double
  def preventDefault(): Unit
  def stopPropagation(): Unit
}

object ViewerTouchEvent {
  @scala.inline
  def apply[T](
    SVGViewer: SVGSVGElement,
    changedPoints: js.Array[Point],
    originalEvent: ReactTouchEventFrom[T with Element],
    points: js.Array[Point],
    preventDefault: Callback,
    scaleFactor: Double,
    stopPropagation: Callback,
    translationX: Double,
    translationY: Double
  ): ViewerTouchEvent[T] = {
    val __obj = js.Dynamic.literal(SVGViewer = SVGViewer.asInstanceOf[js.Any], changedPoints = changedPoints.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any], translationX = translationX.asInstanceOf[js.Any], translationY = translationY.asInstanceOf[js.Any])
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.asInstanceOf[ViewerTouchEvent[T]]
  }
}

