package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <feTurbulence> element. */
@js.native
trait SVGFETurbulenceElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  /* standard dom */
  val SVG_STITCHTYPE_NOSTITCH: Double = js.native
  
  /* standard dom */
  val SVG_STITCHTYPE_STITCH: Double = js.native
  
  /* standard dom */
  val SVG_STITCHTYPE_UNKNOWN: Double = js.native
  
  /* standard dom */
  val SVG_TURBULENCE_TYPE_FRACTALNOISE: Double = js.native
  
  /* standard dom */
  val SVG_TURBULENCE_TYPE_TURBULENCE: Double = js.native
  
  /* standard dom */
  val SVG_TURBULENCE_TYPE_UNKNOWN: Double = js.native
  
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
  val baseFrequencyX: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val baseFrequencyY: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val numOctaves: org.scalajs.dom.SVGAnimatedInteger = js.native
  
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
  val seed: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /* standard dom */
  val stitchTiles: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
  /* standard dom */
  val `type`: org.scalajs.dom.SVGAnimatedEnumeration = js.native
}
