package typingsJapgolly.reBase.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushOptions extends StObject {
  
  /**
    * The data you're wanting to persist to Firebase.
    */
  var data: Any
  
  /**
    * A callback that will get invoked once the new data has been saved to
    * Firebase. If there is an error, it will be the only argument to this
    * function.
    */
  var `then`: js.UndefOr[js.Function1[/* result */ Any, Unit]] = js.undefined
}
object PushOptions {
  
  inline def apply(data: Any): PushOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushOptions]
  }
  
  extension [Self <: PushOptions](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setThen(value: /* result */ Any => Callback): Self = StObject.set(x, "then", js.Any.fromFunction1((t0: /* result */ Any) => value(t0).runNow()))
    
    inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
  }
}
