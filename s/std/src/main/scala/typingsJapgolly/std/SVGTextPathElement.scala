package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <textPath> element. */
@js.native
trait SVGTextPathElement
  extends StObject
     with SVGTextContentElement
     with SVGURIReference {
  
  /* standard dom */
  val TEXTPATH_METHODTYPE_ALIGN: Double = js.native
  
  /* standard dom */
  val TEXTPATH_METHODTYPE_STRETCH: Double = js.native
  
  /* standard dom */
  val TEXTPATH_METHODTYPE_UNKNOWN: Double = js.native
  
  /* standard dom */
  val TEXTPATH_SPACINGTYPE_AUTO: Double = js.native
  
  /* standard dom */
  val TEXTPATH_SPACINGTYPE_EXACT: Double = js.native
  
  /* standard dom */
  val TEXTPATH_SPACINGTYPE_UNKNOWN: Double = js.native
  
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
  val method: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
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
  val spacing: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
  /* standard dom */
  val startOffset: org.scalajs.dom.SVGAnimatedLength = js.native
}
