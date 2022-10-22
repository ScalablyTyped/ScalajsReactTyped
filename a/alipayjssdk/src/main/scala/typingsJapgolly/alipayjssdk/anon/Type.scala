package typingsJapgolly.alipayjssdk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.alipayjssdk.AlipayJSSDK.CompleteCallBack
import typingsJapgolly.alipayjssdk.alipayjssdkStrings.bar
import typingsJapgolly.alipayjssdk.alipayjssdkStrings.qr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** 扫描目标类型，支持 qr / bar，相应扫码选框会不同，默认 qr */
  var `type`: qr | bar
}
object Type {
  
  inline def apply(`type`: qr | bar): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setComplete(value: /* obj */ Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* obj */ Any) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setType(value: qr | bar): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
