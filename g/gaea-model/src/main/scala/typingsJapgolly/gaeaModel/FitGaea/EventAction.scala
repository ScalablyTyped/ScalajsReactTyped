package typingsJapgolly.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventAction extends StObject {
  
  var call: js.UndefOr[EventCallType] = js.undefined
  
  var name: String
  
  // 动作类型
  // call: 调用传进来的方法
  // jumpUrl: 跳转一个网址
  var `type`: String
}
object EventAction {
  
  inline def apply(name: String, `type`: String): EventAction = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAction]
  }
  
  extension [Self <: EventAction](x: Self) {
    
    inline def setCall(value: EventCallType): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
    
    inline def setCallUndefined: Self = StObject.set(x, "call", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
