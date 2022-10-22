package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildExistsClickElement extends StObject {
  
  def childExists(dataHook: Any): Any
  
  def click(): js.Promise[Unit]
  
  def element(): js.Promise[Any]
  
  def exists(): js.Promise[Boolean]
}
object ChildExistsClickElement {
  
  inline def apply(
    childExists: Any => Any,
    click: CallbackTo[js.Promise[Unit]],
    element: CallbackTo[js.Promise[Any]],
    exists: CallbackTo[js.Promise[Boolean]]
  ): ChildExistsClickElement = {
    val __obj = js.Dynamic.literal(childExists = js.Any.fromFunction1(childExists), click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn)
    __obj.asInstanceOf[ChildExistsClickElement]
  }
  
  extension [Self <: ChildExistsClickElement](x: Self) {
    
    inline def setChildExists(value: Any => Any): Self = StObject.set(x, "childExists", js.Any.fromFunction1(value))
    
    inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "element", value.toJsFn)
    
    inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
  }
}
