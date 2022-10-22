package typingsJapgolly.sharepoint.CUI

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonXmlElement extends StObject {
  
  def appendChild(name: String, attrs: js.Array[String]): JsonXmlElement
  
  def appendChildNode(node: JsonXmlElement): JsonXmlElement
  
  def get_attributes(): js.Array[String]
  
  def get_childNodes(): js.Array[JsonXmlElement]
  
  def get_name(): String
}
object JsonXmlElement {
  
  inline def apply(
    appendChild: (String, js.Array[String]) => JsonXmlElement,
    appendChildNode: JsonXmlElement => JsonXmlElement,
    get_attributes: CallbackTo[js.Array[String]],
    get_childNodes: CallbackTo[js.Array[JsonXmlElement]],
    get_name: CallbackTo[String]
  ): JsonXmlElement = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction2(appendChild), appendChildNode = js.Any.fromFunction1(appendChildNode), get_attributes = get_attributes.toJsFn, get_childNodes = get_childNodes.toJsFn, get_name = get_name.toJsFn)
    __obj.asInstanceOf[JsonXmlElement]
  }
  
  extension [Self <: JsonXmlElement](x: Self) {
    
    inline def setAppendChild(value: (String, js.Array[String]) => JsonXmlElement): Self = StObject.set(x, "appendChild", js.Any.fromFunction2(value))
    
    inline def setAppendChildNode(value: JsonXmlElement => JsonXmlElement): Self = StObject.set(x, "appendChildNode", js.Any.fromFunction1(value))
    
    inline def setGet_attributes(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "get_attributes", value.toJsFn)
    
    inline def setGet_childNodes(value: CallbackTo[js.Array[JsonXmlElement]]): Self = StObject.set(x, "get_childNodes", value.toJsFn)
    
    inline def setGet_name(value: CallbackTo[String]): Self = StObject.set(x, "get_name", value.toJsFn)
  }
}
