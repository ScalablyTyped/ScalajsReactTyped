package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Click extends StObject {
  
  def click(): js.Promise[Unit]
  
  def element(): js.Promise[Any]
  
  def exists(): js.Promise[Boolean]
  
  /** Returns size property value */
  def getSize(): Any
}
object Click {
  
  inline def apply(
    click: CallbackTo[js.Promise[Unit]],
    element: CallbackTo[js.Promise[Any]],
    exists: CallbackTo[js.Promise[Boolean]],
    getSize: CallbackTo[Any]
  ): Click = {
    val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getSize = getSize.toJsFn)
    __obj.asInstanceOf[Click]
  }
  
  extension [Self <: Click](x: Self) {
    
    inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "element", value.toJsFn)
    
    inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetSize(value: CallbackTo[Any]): Self = StObject.set(x, "getSize", value.toJsFn)
  }
}
