package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGGeometryElement extends SVGGraphicsElement {
  val pathLength: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  def getPointAtLength(distance: Double): DOMPoint = js.native
  def getTotalLength(): Double = js.native
  def isPointInFill(): scala.Boolean = js.native
  def isPointInFill(point: DOMPointInit): scala.Boolean = js.native
  def isPointInStroke(): scala.Boolean = js.native
  def isPointInStroke(point: DOMPointInit): scala.Boolean = js.native
}

@JSGlobal("SVGGeometryElement")
@js.native
object SVGGeometryElement extends Instantiable0[SVGGeometryElement]

