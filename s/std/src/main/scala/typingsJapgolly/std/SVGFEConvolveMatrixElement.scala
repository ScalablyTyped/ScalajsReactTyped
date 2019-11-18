package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the <feConvolveMatrix> element. */
@js.native
trait SVGFEConvolveMatrixElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val SVG_EDGEMODE_DUPLICATE: Double = js.native
  val SVG_EDGEMODE_NONE: Double = js.native
  val SVG_EDGEMODE_UNKNOWN: Double = js.native
  val SVG_EDGEMODE_WRAP: Double = js.native
  val bias: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val divisor: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val edgeMode: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
  val in1: org.scalajs.dom.raw.SVGAnimatedString = js.native
  val kernelMatrix: org.scalajs.dom.raw.SVGAnimatedNumberList = js.native
  val kernelUnitLengthX: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val kernelUnitLengthY: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val orderX: org.scalajs.dom.raw.SVGAnimatedInteger = js.native
  val orderY: org.scalajs.dom.raw.SVGAnimatedInteger = js.native
  val preserveAlpha: org.scalajs.dom.raw.SVGAnimatedBoolean = js.native
  val targetX: org.scalajs.dom.raw.SVGAnimatedInteger = js.native
  val targetY: org.scalajs.dom.raw.SVGAnimatedInteger = js.native
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

@JSGlobal("SVGFEConvolveMatrixElement")
@js.native
object SVGFEConvolveMatrixElement extends Instantiable0[SVGFEConvolveMatrixElement] {
  val SVG_EDGEMODE_DUPLICATE: Double = js.native
  val SVG_EDGEMODE_NONE: Double = js.native
  val SVG_EDGEMODE_UNKNOWN: Double = js.native
  val SVG_EDGEMODE_WRAP: Double = js.native
}

