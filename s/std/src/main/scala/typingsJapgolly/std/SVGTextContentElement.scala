package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Implemented by elements that support rendering child text content. It is inherited by various text-related interfaces, such as SVGTextElement, SVGTSpanElement, SVGTRefElement, SVGAltGlyphElement and SVGTextPathElement. */
@js.native
trait SVGTextContentElement
  extends StObject
     with SVGGraphicsElement {
  
  /* standard dom */
  val LENGTHADJUST_SPACING: Double = js.native
  
  /* standard dom */
  val LENGTHADJUST_SPACINGANDGLYPHS: Double = js.native
  
  /* standard dom */
  val LENGTHADJUST_UNKNOWN: Double = js.native
  
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
  def getCharNumAtPosition(): Double = js.native
  def getCharNumAtPosition(point: DOMPointInit): Double = js.native
  
  /* standard dom */
  def getComputedTextLength(): Double = js.native
  
  /* standard dom */
  def getEndPositionOfChar(charnum: Double): DOMPoint = js.native
  
  /* standard dom */
  def getExtentOfChar(charnum: Double): org.scalajs.dom.DOMRect = js.native
  
  /* standard dom */
  def getNumberOfChars(): Double = js.native
  
  /* standard dom */
  def getRotationOfChar(charnum: Double): Double = js.native
  
  /* standard dom */
  def getStartPositionOfChar(charnum: Double): DOMPoint = js.native
  
  /* standard dom */
  def getSubStringLength(charnum: Double, nchars: Double): Double = js.native
  
  /* standard dom */
  val lengthAdjust: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
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
  
  /** @deprecated */
  /* standard dom */
  def selectSubString(charnum: Double, nchars: Double): Unit = js.native
  
  /* standard dom */
  val textLength: org.scalajs.dom.SVGAnimatedLength = js.native
}
