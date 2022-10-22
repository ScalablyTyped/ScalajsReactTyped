package typingsJapgolly.ionic.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Progress extends StObject {
  
  var progress: js.UndefOr[js.Function2[/* loaded */ Double, /* total */ Double, Unit]] = js.undefined
}
object Progress {
  
  inline def apply(): Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Progress]
  }
  
  extension [Self <: Progress](x: Self) {
    
    inline def setProgress(value: (/* loaded */ Double, /* total */ Double) => Callback): Self = StObject.set(x, "progress", js.Any.fromFunction2((t0: /* loaded */ Double, t1: /* total */ Double) => (value(t0, t1)).runNow()))
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
