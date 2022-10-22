package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentOrShadowRoot extends StObject {
  
  /**
    * Returns the deepest element in the document through which or to which key events are being routed. This is, roughly speaking, the focused element in the document.
    *
    * For the purposes of this API, when a child browsing context is focused, its container is focused in the parent browsing context. For example, if the user moves the focus to a text control in an iframe, the iframe is the element returned by the activeElement API in the iframe's node document.
    *
    * Similarly, when the focused element is in a different node tree than documentOrShadowRoot, the element returned will be the host that's located in the same node tree as documentOrShadowRoot if documentOrShadowRoot is a shadow-including inclusive ancestor of the focused element, and null if not.
    */
  /* standard dom */
  val activeElement: org.scalajs.dom.Element | Null
  
  /* standard dom */
  var adoptedStyleSheets: js.Array[org.scalajs.dom.CSSStyleSheet]
  
  /**
    * Returns the element for the specified x coordinate and the specified y coordinate.
    * @param x The x-offset
    * @param y The y-offset
    */
  /* standard dom */
  def elementFromPoint(x: Double, y: Double): org.scalajs.dom.Element | Null
  
  /* standard dom */
  def elementsFromPoint(x: Double, y: Double): js.Array[org.scalajs.dom.Element]
  
  /** Returns document's fullscreen element. */
  /* standard dom */
  val fullscreenElement: org.scalajs.dom.Element | Null
  
  /* standard dom */
  def getAnimations(): js.Array[Animation]
  
  /* standard dom */
  val pictureInPictureElement: org.scalajs.dom.Element | Null
  
  /* standard dom */
  val pointerLockElement: org.scalajs.dom.Element | Null
  
  /** Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document. */
  /* standard dom */
  val styleSheets: org.scalajs.dom.StyleSheetList
}
object DocumentOrShadowRoot {
  
  inline def apply(
    adoptedStyleSheets: js.Array[org.scalajs.dom.CSSStyleSheet],
    elementFromPoint: (Double, Double) => org.scalajs.dom.Element | Null,
    elementsFromPoint: (Double, Double) => js.Array[org.scalajs.dom.Element],
    getAnimations: CallbackTo[js.Array[Animation]],
    styleSheets: org.scalajs.dom.StyleSheetList
  ): DocumentOrShadowRoot = {
    val __obj = js.Dynamic.literal(adoptedStyleSheets = adoptedStyleSheets.asInstanceOf[js.Any], elementFromPoint = js.Any.fromFunction2(elementFromPoint), elementsFromPoint = js.Any.fromFunction2(elementsFromPoint), getAnimations = getAnimations.toJsFn, styleSheets = styleSheets.asInstanceOf[js.Any], activeElement = null, fullscreenElement = null, pictureInPictureElement = null, pointerLockElement = null)
    __obj.asInstanceOf[DocumentOrShadowRoot]
  }
  
  extension [Self <: DocumentOrShadowRoot](x: Self) {
    
    inline def setActiveElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "activeElement", value.asInstanceOf[js.Any])
    
    inline def setActiveElementNull: Self = StObject.set(x, "activeElement", null)
    
    inline def setAdoptedStyleSheets(value: js.Array[org.scalajs.dom.CSSStyleSheet]): Self = StObject.set(x, "adoptedStyleSheets", value.asInstanceOf[js.Any])
    
    inline def setAdoptedStyleSheetsVarargs(value: org.scalajs.dom.CSSStyleSheet*): Self = StObject.set(x, "adoptedStyleSheets", js.Array(value*))
    
    inline def setElementFromPoint(value: (Double, Double) => org.scalajs.dom.Element | Null): Self = StObject.set(x, "elementFromPoint", js.Any.fromFunction2(value))
    
    inline def setElementsFromPoint(value: (Double, Double) => js.Array[org.scalajs.dom.Element]): Self = StObject.set(x, "elementsFromPoint", js.Any.fromFunction2(value))
    
    inline def setFullscreenElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "fullscreenElement", value.asInstanceOf[js.Any])
    
    inline def setFullscreenElementNull: Self = StObject.set(x, "fullscreenElement", null)
    
    inline def setGetAnimations(value: CallbackTo[js.Array[Animation]]): Self = StObject.set(x, "getAnimations", value.toJsFn)
    
    inline def setPictureInPictureElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "pictureInPictureElement", value.asInstanceOf[js.Any])
    
    inline def setPictureInPictureElementNull: Self = StObject.set(x, "pictureInPictureElement", null)
    
    inline def setPointerLockElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "pointerLockElement", value.asInstanceOf[js.Any])
    
    inline def setPointerLockElementNull: Self = StObject.set(x, "pointerLockElement", null)
    
    inline def setStyleSheets(value: org.scalajs.dom.StyleSheetList): Self = StObject.set(x, "styleSheets", value.asInstanceOf[js.Any])
  }
}
