package typingsJapgolly.atvlegacycontentkit.atv

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The type used for Apple TV elements, equivalent to Element in the normal DOM.
  */
trait Element
  extends StObject
     with Node {
  
  /**
    * Append a child to this element.
    * @param element The element to append.
    */
  def appendChild(element: Element): Unit
  
  /**
    * Get the child elements of this element.
    */
  val childElements: js.Array[Element]
  
  /**
    * Get an attribute from an element by the name of the attribute.
    * @param attributeName The name of the attribute to retrieve.
    */
  def getAttribute(attributeName: String): String
  
  /**
    * Get the first direct child element with the tag name specified.
    * @param name The tag name of the element to find.
    */
  def getElementByName(name: String): Element
  
  /**
    * Get all child elements with the tag name specified. This seems to include closing tags.
    * @param name The tag name of the element to find.
    */
  def getElementsByName(name: String): js.Array[Element]
  
  /**
    * Insert a child element after a specified element.
    * @param elementToInsert The element you wish to insert.
    * @param insertAfter The element you wish to insert the other element after.
    */
  def insertChildAfter(elementToInsert: Element, insertAfter: Element): Unit
  
  /**
    * Insert a child element before the specified element.
    * @param elementToInsert The element you wish to insert.
    * @param insertBefore The element you wish to insert the other element before.
    */
  def insertChildBefore(elementToInsert: Element, insertBefore: Element): Unit
  
  /**
    * Get the parent element of this element.
    */
  val parent: Element
  
  /**
    * Remove a specific attribute by its name.
    * @param attributeName The name of the attribute to remove.
    */
  def removeAttribute(attributeName: String): Unit
  
  /**
    * Remove the element from its parent.
    */
  def removeFromParent(): Unit
  
  /**
    * Replace a child element with a different element.
    * @param elementToBeReplaced The element that is going to be replaced.
    * @param elementToReplaceWith The element that has been replaced.
    */
  def replaceChild(elementToBeReplaced: Element, elementToReplaceWith: Element): Unit
  
  /**
    * Set an attribute on the element.
    * @param key The key of the attribute.
    * @param value The value of the attribute.
    */
  def setAttribute(key: String, value: String): Unit
  
  /**
    * The tag name of this element.
    */
  val tagName: String
  
  /**
    * The content of the text of this element.
    */
  val textContent: String
}
object Element {
  
  inline def apply(
    appendChild: Element => Callback,
    childElements: js.Array[Element],
    getAttribute: String => String,
    getElementByName: String => Element,
    getElementsByName: String => js.Array[Element],
    insertChildAfter: (Element, Element) => Callback,
    insertChildBefore: (Element, Element) => Callback,
    ownerDocument: Document,
    parent: Element,
    removeAttribute: String => Callback,
    removeFromParent: Callback,
    replaceChild: (Element, Element) => Callback,
    setAttribute: (String, String) => Callback,
    tagName: String,
    textContent: String
  ): Element = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1((t0: Element) => appendChild(t0).runNow()), childElements = childElements.asInstanceOf[js.Any], getAttribute = js.Any.fromFunction1(getAttribute), getElementByName = js.Any.fromFunction1(getElementByName), getElementsByName = js.Any.fromFunction1(getElementsByName), insertChildAfter = js.Any.fromFunction2((t0: Element, t1: Element) => (insertChildAfter(t0, t1)).runNow()), insertChildBefore = js.Any.fromFunction2((t0: Element, t1: Element) => (insertChildBefore(t0, t1)).runNow()), ownerDocument = ownerDocument.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], removeAttribute = js.Any.fromFunction1((t0: String) => removeAttribute(t0).runNow()), removeFromParent = removeFromParent.toJsFn, replaceChild = js.Any.fromFunction2((t0: Element, t1: Element) => (replaceChild(t0, t1)).runNow()), setAttribute = js.Any.fromFunction2((t0: String, t1: String) => (setAttribute(t0, t1)).runNow()), tagName = tagName.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setAppendChild(value: Element => Callback): Self = StObject.set(x, "appendChild", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setChildElements(value: js.Array[Element]): Self = StObject.set(x, "childElements", value.asInstanceOf[js.Any])
    
    inline def setChildElementsVarargs(value: Element*): Self = StObject.set(x, "childElements", js.Array(value*))
    
    inline def setGetAttribute(value: String => String): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
    
    inline def setGetElementByName(value: String => Element): Self = StObject.set(x, "getElementByName", js.Any.fromFunction1(value))
    
    inline def setGetElementsByName(value: String => js.Array[Element]): Self = StObject.set(x, "getElementsByName", js.Any.fromFunction1(value))
    
    inline def setInsertChildAfter(value: (Element, Element) => Callback): Self = StObject.set(x, "insertChildAfter", js.Any.fromFunction2((t0: Element, t1: Element) => (value(t0, t1)).runNow()))
    
    inline def setInsertChildBefore(value: (Element, Element) => Callback): Self = StObject.set(x, "insertChildBefore", js.Any.fromFunction2((t0: Element, t1: Element) => (value(t0, t1)).runNow()))
    
    inline def setParent(value: Element): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRemoveAttribute(value: String => Callback): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRemoveFromParent(value: Callback): Self = StObject.set(x, "removeFromParent", value.toJsFn)
    
    inline def setReplaceChild(value: (Element, Element) => Callback): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2((t0: Element, t1: Element) => (value(t0, t1)).runNow()))
    
    inline def setSetAttribute(value: (String, String) => Callback): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
  }
}
