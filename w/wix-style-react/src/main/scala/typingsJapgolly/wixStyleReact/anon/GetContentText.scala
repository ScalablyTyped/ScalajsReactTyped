package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContentText extends StObject {
  
  def element(): js.Promise[Any]
  
  def exists(): js.Promise[Boolean]
  
  def getContentText(): Any
  
  def getToggleStyles(): Any
}
object GetContentText {
  
  inline def apply(
    element: CallbackTo[js.Promise[Any]],
    exists: CallbackTo[js.Promise[Boolean]],
    getContentText: CallbackTo[Any],
    getToggleStyles: CallbackTo[Any]
  ): GetContentText = {
    val __obj = js.Dynamic.literal(element = element.toJsFn, exists = exists.toJsFn, getContentText = getContentText.toJsFn, getToggleStyles = getToggleStyles.toJsFn)
    __obj.asInstanceOf[GetContentText]
  }
  
  extension [Self <: GetContentText](x: Self) {
    
    inline def setElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "element", value.toJsFn)
    
    inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetContentText(value: CallbackTo[Any]): Self = StObject.set(x, "getContentText", value.toJsFn)
    
    inline def setGetToggleStyles(value: CallbackTo[Any]): Self = StObject.set(x, "getToggleStyles", value.toJsFn)
  }
}
