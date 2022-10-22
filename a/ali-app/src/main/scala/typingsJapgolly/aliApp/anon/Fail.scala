package typingsJapgolly.aliApp.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fail extends StObject {
  
  var fail: js.UndefOr[js.Function1[/* res */ Error, Unit]] = js.undefined
  
  var result: HitKeywords
}
object Fail {
  
  inline def apply(result: HitKeywords): Fail = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fail]
  }
  
  extension [Self <: Fail](x: Self) {
    
    inline def setFail(value: /* res */ Error => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ Error) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setResult(value: HitKeywords): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
