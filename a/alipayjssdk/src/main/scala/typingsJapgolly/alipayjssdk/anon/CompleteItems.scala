package typingsJapgolly.alipayjssdk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.alipayjssdk.AlipayJSSDK.CompleteCallBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteItems extends StObject {
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  var items: js.Array[Icon | String]
}
object CompleteItems {
  
  inline def apply(items: js.Array[Icon | String]): CompleteItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteItems]
  }
  
  extension [Self <: CompleteItems](x: Self) {
    
    inline def setComplete(value: /* obj */ Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* obj */ Any) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setItems(value: js.Array[Icon | String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: (Icon | String)*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
