package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reference information for external resources and the relationship of those resources to a document and vice-versa. This object inherits all of the properties and methods of the HTMLElement interface. */
@js.native
trait HTMLLinkElement
  extends StObject
     with HTMLElement
     with LinkStyle {
  
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
  var as: java.lang.String = js.native
  
  /**
    * Sets or retrieves the character set used to encode the object.
    * @deprecated
    */
  /* standard dom */
  var charset: java.lang.String = js.native
  
  /* standard dom */
  var crossOrigin: java.lang.String | Null = js.native
  
  /* standard dom */
  var disabled: scala.Boolean = js.native
  
  /** Sets or retrieves a destination URL or an anchor point. */
  /* standard dom */
  var href: java.lang.String = js.native
  
  /** Sets or retrieves the language code of the object. */
  /* standard dom */
  var hreflang: java.lang.String = js.native
  
  /* standard dom */
  var imageSizes: java.lang.String = js.native
  
  /* standard dom */
  var imageSrcset: java.lang.String = js.native
  
  /* standard dom */
  var integrity: java.lang.String = js.native
  
  /** Sets or retrieves the media type. */
  /* standard dom */
  var media: java.lang.String = js.native
  
  /* standard dom */
  var referrerPolicy: java.lang.String = js.native
  
  /** Sets or retrieves the relationship between the object and the destination of the link. */
  /* standard dom */
  var rel: java.lang.String = js.native
  
  /* standard dom */
  val relList: org.scalajs.dom.DOMTokenList = js.native
  
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
  
  /**
    * Sets or retrieves the relationship between the object and the destination of the link.
    * @deprecated
    */
  /* standard dom */
  var rev: java.lang.String = js.native
  
  /* standard dom */
  val sizes: org.scalajs.dom.DOMTokenList = js.native
  
  /**
    * Sets or retrieves the window or frame at which to target content.
    * @deprecated
    */
  /* standard dom */
  var target: java.lang.String = js.native
  
  /** Sets or retrieves the MIME type of the object. */
  /* standard dom */
  var `type`: java.lang.String = js.native
}
