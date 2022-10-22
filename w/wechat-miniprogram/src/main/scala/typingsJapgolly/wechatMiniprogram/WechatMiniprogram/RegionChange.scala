package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import typingsJapgolly.wechatMiniprogram.anon.Rotate
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.begin
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.drag
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.end
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.gesture
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.scale
import typingsJapgolly.wechatMiniprogram.wechatMiniprogramStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 在地图渲染更新完成时触发
  *
  * 最低基础库: 1.6.0
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wechatMiniprogram.anon.typebegincausedBygestureu
  - typingsJapgolly.wechatMiniprogram.anon.typeendcausedBydragscaleu
*/
trait RegionChange extends StObject
object RegionChange {
  
  inline def typebegincausedBygestureu(
    causedBy: gesture | update,
    currentTarget: Target[IAnyObject],
    detail: Rotate,
    target: Target[IAnyObject],
    timeStamp: Double,
    `type`: begin & String
  ): typingsJapgolly.wechatMiniprogram.anon.typebegincausedBygestureu = {
    val __obj = js.Dynamic.literal(causedBy = causedBy.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.wechatMiniprogram.anon.typebegincausedBygestureu]
  }
  
  inline def typeendcausedBydragscaleu(
    causedBy: drag | scale | update,
    currentTarget: Target[IAnyObject],
    detail: Rotate,
    target: Target[IAnyObject],
    timeStamp: Double,
    `type`: end & String
  ): typingsJapgolly.wechatMiniprogram.anon.typeendcausedBydragscaleu = {
    val __obj = js.Dynamic.literal(causedBy = causedBy.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.wechatMiniprogram.anon.typeendcausedBydragscaleu]
  }
}
