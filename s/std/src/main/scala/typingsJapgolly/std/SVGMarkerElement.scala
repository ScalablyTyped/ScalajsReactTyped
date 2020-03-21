package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGMarkerElement
  extends SVGElement
     with SVGFitToViewBox {
  val SVG_MARKERUNITS_STROKEWIDTH: Double = js.native
  val SVG_MARKERUNITS_UNKNOWN: Double = js.native
  val SVG_MARKERUNITS_USERSPACEONUSE: Double = js.native
  val SVG_MARKER_ORIENT_ANGLE: Double = js.native
  val SVG_MARKER_ORIENT_AUTO: Double = js.native
  val SVG_MARKER_ORIENT_UNKNOWN: Double = js.native
  val markerHeight: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  val markerUnits: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
  val markerWidth: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  val orientAngle: org.scalajs.dom.raw.SVGAnimatedAngle = js.native
  val orientType: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
  val refX: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  val refY: org.scalajs.dom.raw.SVGAnimatedLength = js.native
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
  def setOrientToAngle(angle: org.scalajs.dom.raw.SVGAngle): Unit = js.native
  def setOrientToAuto(): Unit = js.native
}

@JSGlobal("SVGMarkerElement")
@js.native
object SVGMarkerElement extends Instantiable0[SVGMarkerElement] {
  val SVG_MARKERUNITS_STROKEWIDTH: Double = js.native
  val SVG_MARKERUNITS_UNKNOWN: Double = js.native
  val SVG_MARKERUNITS_USERSPACEONUSE: Double = js.native
  val SVG_MARKER_ORIENT_ANGLE: Double = js.native
  val SVG_MARKER_ORIENT_AUTO: Double = js.native
  val SVG_MARKER_ORIENT_UNKNOWN: Double = js.native
}

