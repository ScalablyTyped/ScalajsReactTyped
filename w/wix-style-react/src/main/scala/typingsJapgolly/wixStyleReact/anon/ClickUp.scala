package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickUp extends StObject {
  
  def clickDown(): Unit
  
  def clickUp(): Unit
  
  def exists(): Boolean
  
  def getDown(): Any
  
  def getUp(): Any
  
  def isDownDisabled(): Any
  
  def isUpDisabled(): Any
}
object ClickUp {
  
  inline def apply(
    clickDown: Callback,
    clickUp: Callback,
    exists: CallbackTo[Boolean],
    getDown: CallbackTo[Any],
    getUp: CallbackTo[Any],
    isDownDisabled: CallbackTo[Any],
    isUpDisabled: CallbackTo[Any]
  ): ClickUp = {
    val __obj = js.Dynamic.literal(clickDown = clickDown.toJsFn, clickUp = clickUp.toJsFn, exists = exists.toJsFn, getDown = getDown.toJsFn, getUp = getUp.toJsFn, isDownDisabled = isDownDisabled.toJsFn, isUpDisabled = isUpDisabled.toJsFn)
    __obj.asInstanceOf[ClickUp]
  }
  
  extension [Self <: ClickUp](x: Self) {
    
    inline def setClickDown(value: Callback): Self = StObject.set(x, "clickDown", value.toJsFn)
    
    inline def setClickUp(value: Callback): Self = StObject.set(x, "clickUp", value.toJsFn)
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetDown(value: CallbackTo[Any]): Self = StObject.set(x, "getDown", value.toJsFn)
    
    inline def setGetUp(value: CallbackTo[Any]): Self = StObject.set(x, "getUp", value.toJsFn)
    
    inline def setIsDownDisabled(value: CallbackTo[Any]): Self = StObject.set(x, "isDownDisabled", value.toJsFn)
    
    inline def setIsUpDisabled(value: CallbackTo[Any]): Self = StObject.set(x, "isUpDisabled", value.toJsFn)
  }
}
