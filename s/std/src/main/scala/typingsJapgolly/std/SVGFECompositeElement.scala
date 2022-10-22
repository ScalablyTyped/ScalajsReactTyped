package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <feComposite> element. */
@js.native
trait SVGFECompositeElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  /* standard dom */
  val SVG_FECOMPOSITE_OPERATOR_ARITHMETIC: Double = js.native
  
  /* standard dom */
  val SVG_FECOMPOSITE_OPERATOR_ATOP: Double = js.native
  
  /* standard dom */
  val SVG_FECOMPOSITE_OPERATOR_IN: Double = js.native
  
  /* standard dom */
  val SVG_FECOMPOSITE_OPERATOR_OUT: Double = js.native
  
  /* standard dom */
  val SVG_FECOMPOSITE_OPERATOR_OVER: Double = js.native
  
  /* standard dom */
  val SVG_FECOMPOSITE_OPERATOR_UNKNOWN: Double = js.native
  
  /* standard dom */
  val SVG_FECOMPOSITE_OPERATOR_XOR: Double = js.native
  
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
  val in1: org.scalajs.dom.SVGAnimatedString = js.native
  
  /* standard dom */
  val in2: org.scalajs.dom.SVGAnimatedString = js.native
  
  /* standard dom */
  val k1: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val k2: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val k3: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val k4: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val operator: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
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
}
