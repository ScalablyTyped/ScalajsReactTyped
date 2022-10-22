package typingsJapgolly.wechatMiniprogram.anon

import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.IAnyObject
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.RegionChange
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.drag
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.end
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.scale
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'end',   causedBy :'drag' | 'scale' | 'update'} & wechat-miniprogram.WechatMiniprogram.CustomEvent<{  rotate :number,   skew :number}, wechat-miniprogram.WechatMiniprogram.IAnyObject, wechat-miniprogram.WechatMiniprogram.IAnyObject, wechat-miniprogram.WechatMiniprogram.IAnyObject> */
trait typeendcausedBydragscaleu
  extends StObject
     with RegionChange {
  
  /**
    * 导致视野变化的原因
    *
    * - drag: 拖动地图导致
    * - scale: 缩放导致
    * - update: 调用接口导致
    */
  var causedBy: drag | scale | update
  
  /** 事件绑定的当前组件 */
  var currentTarget: typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject]
  
  /** 额外的信息 */
  var detail: Rotate
  
  /** 事件冒泡路径上所有由 `mark:` 开头的自定义属性组成的集合 */
  var mark: js.UndefOr[IAnyObject] = js.undefined
  
  /** 触发事件的源组件 */
  var target: typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject]
  
  /** 页面打开到触发事件所经过的毫秒数 */
  var timeStamp: Double
  
  /**
    * 视野变化结束时触发
    *
    * 视野变化结束为 `end`
    */
  /** 事件类型 */
  var `type`: end & String
}
object typeendcausedBydragscaleu {
  
  inline def apply(
    causedBy: drag | scale | update,
    currentTarget: typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject],
    detail: Rotate,
    target: typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject],
    timeStamp: Double,
    `type`: end & String
  ): typeendcausedBydragscaleu = {
    val __obj = js.Dynamic.literal(causedBy = causedBy.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typeendcausedBydragscaleu]
  }
  
  extension [Self <: typeendcausedBydragscaleu](x: Self) {
    
    inline def setCausedBy(value: drag | scale | update): Self = StObject.set(x, "causedBy", value.asInstanceOf[js.Any])
    
    inline def setCurrentTarget(value: typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject]): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: Rotate): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setMark(value: IAnyObject): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    inline def setTarget(value: typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Target[IAnyObject]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: end & String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
