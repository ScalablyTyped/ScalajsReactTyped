package typingsJapgolly.weixinApp.wx

import typingsJapgolly.weixinApp.weixinAppStrings.button
import typingsJapgolly.weixinApp.weixinAppStrings.menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region Page
trait PageShareAppMessageOptions extends StObject {
  
  /** 转发事件来源。button：页面内转发按钮；menu：右上角转发菜单 */
  var from: button | menu
  
  /** 如果 from 值是 button，则 target 是触发这次转发事件的 button，否则为 undefined */
  var target: js.UndefOr[js.Object] = js.undefined
}
object PageShareAppMessageOptions {
  
  inline def apply(from: button | menu): PageShareAppMessageOptions = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageShareAppMessageOptions]
  }
  
  extension [Self <: PageShareAppMessageOptions](x: Self) {
    
    inline def setFrom(value: button | menu): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
