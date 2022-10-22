package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <feBlend> element. */
@js.native
trait SVGFEBlendElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  /* standard dom */
  val SVG_FEBLEND_MODE_COLOR: Double = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_COLOR_BURN: Double = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_COLOR_DODGE: Double = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_DARKEN: Double = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_DIFFERENCE: Double = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_EXCLUSION: Double = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_HARD_LIGHT: Double = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_HUE: Double = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_LIGHTEN: Double = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_LUMINOSITY: Double = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_MULTIPLY: Double = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_NORMAL: Double = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_OVERLAY: Double = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_SATURATION: Double = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_SCREEN: Double = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_SOFT_LIGHT: Double = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_UNKNOWN: Double = js.native
  
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
  val mode: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
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
