package typingsJapgolly.reactAsyncScript

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AsyncScriptOnLoad extends StObject {
    
    var asyncScriptOnLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object AsyncScriptOnLoad {
    
    inline def apply(): AsyncScriptOnLoad = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncScriptOnLoad]
    }
    
    extension [Self <: AsyncScriptOnLoad](x: Self) {
      
      inline def setAsyncScriptOnLoad(value: Callback): Self = StObject.set(x, "asyncScriptOnLoad", value.toJsFn)
      
      inline def setAsyncScriptOnLoadUndefined: Self = StObject.set(x, "asyncScriptOnLoad", js.undefined)
    }
  }
}
