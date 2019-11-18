package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the <feTurbulence> element. */
@js.native
trait SVGFETurbulenceElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val SVG_STITCHTYPE_NOSTITCH: Double = js.native
  val SVG_STITCHTYPE_STITCH: Double = js.native
  val SVG_STITCHTYPE_UNKNOWN: Double = js.native
  val SVG_TURBULENCE_TYPE_FRACTALNOISE: Double = js.native
  val SVG_TURBULENCE_TYPE_TURBULENCE: Double = js.native
  val SVG_TURBULENCE_TYPE_UNKNOWN: Double = js.native
  val baseFrequencyX: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val baseFrequencyY: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val numOctaves: org.scalajs.dom.raw.SVGAnimatedInteger = js.native
  val seed: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val stitchTiles: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
  val `type`: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
  /**
    * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
    * 
    * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
    * 
    * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
    * 
    * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
    * 
    * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
    * 
    * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
    */
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
  /**
    * Removes the event listener in target's event listener list with the same type, callback, and options.
    */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
}

@JSGlobal("SVGFETurbulenceElement")
@js.native
object SVGFETurbulenceElement extends Instantiable0[SVGFETurbulenceElement] {
  val SVG_STITCHTYPE_NOSTITCH: Double = js.native
  val SVG_STITCHTYPE_STITCH: Double = js.native
  val SVG_STITCHTYPE_UNKNOWN: Double = js.native
  val SVG_TURBULENCE_TYPE_FRACTALNOISE: Double = js.native
  val SVG_TURBULENCE_TYPE_TURBULENCE: Double = js.native
  val SVG_TURBULENCE_TYPE_UNKNOWN: Double = js.native
}

