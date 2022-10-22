package typingsJapgolly.antvG2.libInterfaceMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAction extends StObject {
  
  /**
    * 上下文
    */
  var context: IInteractionContext
  
  /**
    * 销毁函数
    */
  def destroy(): Any
  
  /**
    * 初始化
    */
  def init(): Any
  
  /**
    * 交互 action (反馈)的名称
    */
  var name: String
}
object IAction {
  
  inline def apply(context: IInteractionContext, destroy: CallbackTo[Any], init: CallbackTo[Any], name: String): IAction = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], destroy = destroy.toJsFn, init = init.toJsFn, name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAction]
  }
  
  extension [Self <: IAction](x: Self) {
    
    inline def setContext(value: IInteractionContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: CallbackTo[Any]): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setInit(value: CallbackTo[Any]): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
