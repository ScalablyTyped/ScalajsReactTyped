package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickDown extends StObject {
  
  def click(): js.Promise[Unit]
  
  def clickDown(): Any
  
  def clickUp(): Any
  
  def element(): js.Promise[Any]
  
  def exists(): js.Promise[Boolean]
  
  def isDownDisabled(): js.Promise[Boolean]
  
  def isUpDisabled(): js.Promise[Boolean]
}
object ClickDown {
  
  inline def apply(
    click: CallbackTo[js.Promise[Unit]],
    clickDown: CallbackTo[Any],
    clickUp: CallbackTo[Any],
    element: CallbackTo[js.Promise[Any]],
    exists: CallbackTo[js.Promise[Boolean]],
    isDownDisabled: CallbackTo[js.Promise[Boolean]],
    isUpDisabled: CallbackTo[js.Promise[Boolean]]
  ): ClickDown = {
    val __obj = js.Dynamic.literal(click = click.toJsFn, clickDown = clickDown.toJsFn, clickUp = clickUp.toJsFn, element = element.toJsFn, exists = exists.toJsFn, isDownDisabled = isDownDisabled.toJsFn, isUpDisabled = isUpDisabled.toJsFn)
    __obj.asInstanceOf[ClickDown]
  }
  
  extension [Self <: ClickDown](x: Self) {
    
    inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setClickDown(value: CallbackTo[Any]): Self = StObject.set(x, "clickDown", value.toJsFn)
    
    inline def setClickUp(value: CallbackTo[Any]): Self = StObject.set(x, "clickUp", value.toJsFn)
    
    inline def setElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "element", value.toJsFn)
    
    inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setIsDownDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDownDisabled", value.toJsFn)
    
    inline def setIsUpDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isUpDisabled", value.toJsFn)
  }
}
