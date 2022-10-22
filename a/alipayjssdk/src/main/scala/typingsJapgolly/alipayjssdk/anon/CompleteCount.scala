package typingsJapgolly.alipayjssdk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.alipayjssdk.AlipayJSSDK.CompleteCallBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteCount extends StObject {
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** 单次最多选择联系人个数，默认 1，最大 10 */
  var count: js.UndefOr[Double] = js.undefined
}
object CompleteCount {
  
  inline def apply(): CompleteCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompleteCount]
  }
  
  extension [Self <: CompleteCount](x: Self) {
    
    inline def setComplete(value: /* obj */ Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* obj */ Any) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
