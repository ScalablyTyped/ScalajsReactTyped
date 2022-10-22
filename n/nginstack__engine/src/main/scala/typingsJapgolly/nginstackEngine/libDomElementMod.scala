package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomElementMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dom/Element", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Element {
    
    /* CompleteClass */
    var attributes: NamedNodeMap = js.native
    
    /* CompleteClass */
    override def getAttribute(qualifiedName: String): String = js.native
    
    /* CompleteClass */
    override def getAttributeNode(qualifiedName: String): Attr = js.native
    
    /* CompleteClass */
    override def getElementsByTagName(tagName: String): NodeList = js.native
    
    /* CompleteClass */
    override def removeAttribute(qualifiedName: String): Unit = js.native
    
    /* CompleteClass */
    override def setAttribute(qualifiedName: String, value: String): Unit = js.native
    
    /* CompleteClass */
    override def setAttributeNode(attr: Attr): Attr = js.native
    
    /* CompleteClass */
    var tagName: String = js.native
  }
  @JSImport("@nginstack/engine/lib/dom/Element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Attr = typingsJapgolly.nginstackEngine.libDomAttrMod.^
  
  trait Element extends StObject {
    
    var attributes: NamedNodeMap
    
    def getAttribute(qualifiedName: String): String
    
    def getAttributeNode(qualifiedName: String): Attr
    
    def getElementsByTagName(tagName: String): NodeList
    
    def removeAttribute(qualifiedName: String): Unit
    
    def setAttribute(qualifiedName: String, value: String): Unit
    
    def setAttributeNode(attr: Attr): Attr
    
    var tagName: String
  }
  object Element {
    
    inline def apply(
      attributes: NamedNodeMap,
      getAttribute: String => String,
      getAttributeNode: String => Attr,
      getElementsByTagName: String => NodeList,
      removeAttribute: String => Callback,
      setAttribute: (String, String) => Callback,
      setAttributeNode: Attr => Attr,
      tagName: String
    ): Element = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], getAttribute = js.Any.fromFunction1(getAttribute), getAttributeNode = js.Any.fromFunction1(getAttributeNode), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), removeAttribute = js.Any.fromFunction1((t0: String) => removeAttribute(t0).runNow()), setAttribute = js.Any.fromFunction2((t0: String, t1: String) => (setAttribute(t0, t1)).runNow()), setAttributeNode = js.Any.fromFunction1(setAttributeNode), tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setAttributes(value: NamedNodeMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setGetAttribute(value: String => String): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetAttributeNode(value: String => Attr): Self = StObject.set(x, "getAttributeNode", js.Any.fromFunction1(value))
      
      inline def setGetElementsByTagName(value: String => NodeList): Self = StObject.set(x, "getElementsByTagName", js.Any.fromFunction1(value))
      
      inline def setRemoveAttribute(value: String => Callback): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetAttribute(value: (String, String) => Callback): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetAttributeNode(value: Attr => Attr): Self = StObject.set(x, "setAttributeNode", js.Any.fromFunction1(value))
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  type NamedNodeMap = typingsJapgolly.nginstackEngine.libDomNamedNodeMapMod.^
  
  type NodeList = typingsJapgolly.nginstackEngine.libDomNodeListMod.^
}
