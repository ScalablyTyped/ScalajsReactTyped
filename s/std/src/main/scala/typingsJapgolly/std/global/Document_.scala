package typingsJapgolly.std.global

import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.Document
import typingsJapgolly.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Document")
@js.native
/* standard dom */
open class Document_ ()
  extends StObject
     with Document {
  
  /**
    * Returns the deepest element in the document through which or to which key events are being routed. This is, roughly speaking, the focused element in the document.
    *
    * For the purposes of this API, when a child browsing context is focused, its container is focused in the parent browsing context. For example, if the user moves the focus to a text control in an iframe, the iframe is the element returned by the activeElement API in the iframe's node document.
    *
    * Similarly, when the focused element is in a different node tree than documentOrShadowRoot, the element returned will be the host that's located in the same node tree as documentOrShadowRoot if documentOrShadowRoot is a shadow-including inclusive ancestor of the focused element, and null if not.
    */
  /* standard dom */
  /* CompleteClass */
  override val activeElement: org.scalajs.dom.Element | Null = js.native
  
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
  /* CompleteClass */
  var adoptedStyleSheets: js.Array[org.scalajs.dom.CSSStyleSheet] = js.native
  
  /**
    * Returns the element for the specified x coordinate and the specified y coordinate.
    * @param x The x-offset
    * @param y The y-offset
    */
  /* standard dom */
  /* CompleteClass */
  override def elementFromPoint(x: Double, y: Double): org.scalajs.dom.Element | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def elementsFromPoint(x: Double, y: Double): js.Array[org.scalajs.dom.Element] = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val fonts: typingsJapgolly.std.FontFaceSet = js.native
  
  /** Returns document's fullscreen element. */
  /* standard dom */
  /* CompleteClass */
  override val fullscreenElement: org.scalajs.dom.Element | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def getAnimations(): js.Array[typingsJapgolly.std.Animation] = js.native
  
  /** Returns the first element within node's descendants whose ID is elementId. */
  /* standard dom */
  /* CompleteClass */
  override def getElementById(elementId: java.lang.String): org.scalajs.dom.Element | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val pictureInPictureElement: org.scalajs.dom.Element | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val pointerLockElement: org.scalajs.dom.Element | Null = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  /** Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document. */
  /* standard dom */
  /* CompleteClass */
  override val styleSheets: org.scalajs.dom.StyleSheetList = js.native
}
