package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 基础事件参数 */
trait BaseEvent[Mark /* <: IAnyObject */, CurrentTargetDataset /* <: IAnyObject */, TargetDataset /* <: IAnyObject */] extends StObject {
  
  /** 事件绑定的当前组件 */
  var currentTarget: Target[CurrentTargetDataset]
  
  /** 事件冒泡路径上所有由 `mark:` 开头的自定义属性组成的集合 */
  var mark: js.UndefOr[Mark] = js.undefined
  
  /** 触发事件的源组件 */
  var target: Target[TargetDataset]
  
  /** 页面打开到触发事件所经过的毫秒数 */
  var timeStamp: Double
  
  /** 事件类型 */
  var `type`: String
}
object BaseEvent {
  
  inline def apply[Mark /* <: IAnyObject */, CurrentTargetDataset /* <: IAnyObject */, TargetDataset /* <: IAnyObject */](
    currentTarget: Target[CurrentTargetDataset],
    target: Target[TargetDataset],
    timeStamp: Double,
    `type`: String
  ): BaseEvent[Mark, CurrentTargetDataset, TargetDataset] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEvent[Mark, CurrentTargetDataset, TargetDataset]]
  }
  
  extension [Self <: BaseEvent[?, ?, ?], Mark /* <: IAnyObject */, CurrentTargetDataset /* <: IAnyObject */, TargetDataset /* <: IAnyObject */](x: Self & (BaseEvent[Mark, CurrentTargetDataset, TargetDataset])) {
    
    inline def setCurrentTarget(value: Target[CurrentTargetDataset]): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setMark(value: Mark): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    inline def setTarget(value: Target[TargetDataset]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
