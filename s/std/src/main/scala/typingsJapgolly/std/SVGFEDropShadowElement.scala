package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGFEDropShadowElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val dx: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val dy: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val in1: org.scalajs.dom.raw.SVGAnimatedString = js.native
  val stdDeviationX: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val stdDeviationY: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  def setStdDeviation(stdDeviationX: Double, stdDeviationY: Double): Unit = js.native
}

@JSGlobal("SVGFEDropShadowElement")
@js.native
object SVGFEDropShadowElement extends Instantiable0[SVGFEDropShadowElement]

