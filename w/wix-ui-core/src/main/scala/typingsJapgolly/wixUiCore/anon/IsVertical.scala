package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsVertical extends StObject {
  
  def exists(): Boolean
  
  def isVertical(): Boolean
  
  def textContent(): Any
}
object IsVertical {
  
  inline def apply(exists: CallbackTo[Boolean], isVertical: CallbackTo[Boolean], textContent: CallbackTo[Any]): IsVertical = {
    val __obj = js.Dynamic.literal(exists = exists.toJsFn, isVertical = isVertical.toJsFn, textContent = textContent.toJsFn)
    __obj.asInstanceOf[IsVertical]
  }
  
  extension [Self <: IsVertical](x: Self) {
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setIsVertical(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVertical", value.toJsFn)
    
    inline def setTextContent(value: CallbackTo[Any]): Self = StObject.set(x, "textContent", value.toJsFn)
  }
}
