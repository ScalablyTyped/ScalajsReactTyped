package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <feConvolveMatrix> element. */
@js.native
trait SVGFEConvolveMatrixElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  /* standard dom */
  val SVG_EDGEMODE_DUPLICATE: Double = js.native
  
  /* standard dom */
  val SVG_EDGEMODE_NONE: Double = js.native
  
  /* standard dom */
  val SVG_EDGEMODE_UNKNOWN: Double = js.native
  
  /* standard dom */
  val SVG_EDGEMODE_WRAP: Double = js.native
  
  /* standard dom */
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
  
  /* standard dom */
  val bias: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val divisor: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val edgeMode: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
  /* standard dom */
  val in1: org.scalajs.dom.SVGAnimatedString = js.native
  
  /* standard dom */
  val kernelMatrix: org.scalajs.dom.SVGAnimatedNumberList = js.native
  
  /* standard dom */
  val kernelUnitLengthX: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val kernelUnitLengthY: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val orderX: org.scalajs.dom.SVGAnimatedInteger = js.native
  
  /* standard dom */
  val orderY: org.scalajs.dom.SVGAnimatedInteger = js.native
  
  /* standard dom */
  val preserveAlpha: org.scalajs.dom.SVGAnimatedBoolean = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  /* standard dom */
  val targetX: org.scalajs.dom.SVGAnimatedInteger = js.native
  
  /* standard dom */
  val targetY: org.scalajs.dom.SVGAnimatedInteger = js.native
}
