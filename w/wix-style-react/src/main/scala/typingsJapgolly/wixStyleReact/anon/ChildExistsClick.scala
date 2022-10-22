package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildExistsClick extends StObject {
  
  def childExists(selector: Any): js.Promise[Any]
  
  def click(): js.Promise[Any]
  
  def exists(): js.Promise[Any]
  
  def isSelected(): js.Promise[Boolean]
}
object ChildExistsClick {
  
  inline def apply(
    childExists: Any => js.Promise[Any],
    click: CallbackTo[js.Promise[Any]],
    exists: CallbackTo[js.Promise[Any]],
    isSelected: CallbackTo[js.Promise[Boolean]]
  ): ChildExistsClick = {
    val __obj = js.Dynamic.literal(childExists = js.Any.fromFunction1(childExists), click = click.toJsFn, exists = exists.toJsFn, isSelected = isSelected.toJsFn)
    __obj.asInstanceOf[ChildExistsClick]
  }
  
  extension [Self <: ChildExistsClick](x: Self) {
    
    inline def setChildExists(value: Any => js.Promise[Any]): Self = StObject.set(x, "childExists", js.Any.fromFunction1(value))
    
    inline def setClick(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setExists(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setIsSelected(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSelected", value.toJsFn)
  }
}
