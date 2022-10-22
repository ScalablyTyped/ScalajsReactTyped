package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContent extends StObject {
  
  /** returns element **/
  def element(): Any
  
  /** returns whether element is rendered */
  def exists(): Boolean
  
  /** Get content as a tooltip text value. */
  def getContent(): Any
  
  /** Get size. */
  def getSize(): Any
  
  /** Hover on icon. */
  def hover(): Any
}
object GetContent {
  
  inline def apply(
    element: CallbackTo[Any],
    exists: CallbackTo[Boolean],
    getContent: CallbackTo[Any],
    getSize: CallbackTo[Any],
    hover: CallbackTo[Any]
  ): GetContent = {
    val __obj = js.Dynamic.literal(element = element.toJsFn, exists = exists.toJsFn, getContent = getContent.toJsFn, getSize = getSize.toJsFn, hover = hover.toJsFn)
    __obj.asInstanceOf[GetContent]
  }
  
  extension [Self <: GetContent](x: Self) {
    
    inline def setElement(value: CallbackTo[Any]): Self = StObject.set(x, "element", value.toJsFn)
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetContent(value: CallbackTo[Any]): Self = StObject.set(x, "getContent", value.toJsFn)
    
    inline def setGetSize(value: CallbackTo[Any]): Self = StObject.set(x, "getSize", value.toJsFn)
    
    inline def setHover(value: CallbackTo[Any]): Self = StObject.set(x, "hover", value.toJsFn)
  }
}
