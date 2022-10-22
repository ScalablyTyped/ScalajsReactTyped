package typingsJapgolly.alipayjssdk.anon

import typingsJapgolly.alipayjssdk.alipayjssdkStrings.add
import typingsJapgolly.alipayjssdk.alipayjssdkStrings.filter
import typingsJapgolly.alipayjssdk.alipayjssdkStrings.help
import typingsJapgolly.alipayjssdk.alipayjssdkStrings.info
import typingsJapgolly.alipayjssdk.alipayjssdkStrings.locate
import typingsJapgolly.alipayjssdk.alipayjssdkStrings.more
import typingsJapgolly.alipayjssdk.alipayjssdkStrings.scan
import typingsJapgolly.alipayjssdk.alipayjssdkStrings.search
import typingsJapgolly.alipayjssdk.alipayjssdkStrings.settings
import typingsJapgolly.alipayjssdk.alipayjssdkStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Badge extends StObject {
  
  /** 按钮红色气泡，默认 -1。其中 0 表示小红点，-1 表示不显示，其他值展示出来 */
  var badge: js.UndefOr[String | Double] = js.undefined
  
  /** 按钮标题文字颜色，与 type、icon 三选一。 */
  var color: js.UndefOr[String] = js.undefined
  
  /** 按钮图标，支持 base64。与 type 三选一 */
  var icon: js.UndefOr[String] = js.undefined
  
  /** 按钮标题，与 type、icon 三选一。 */
  var title: js.UndefOr[String] = js.undefined
  
  /** 按钮图标类型，与 title、icon 三选一。支持 user / filter / search / add / settings / scan / info / help / locate / more */
  var `type`: js.UndefOr[user | filter | search | add | settings | scan | info | help | locate | more] = js.undefined
}
object Badge {
  
  inline def apply(): Badge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Badge]
  }
  
  extension [Self <: Badge](x: Self) {
    
    inline def setBadge(value: String | Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: user | filter | search | add | settings | scan | info | help | locate | more): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
