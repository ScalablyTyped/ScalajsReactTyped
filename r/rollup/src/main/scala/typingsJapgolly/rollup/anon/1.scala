package typingsJapgolly.rollup.anon

import typingsJapgolly.rollup.mod.RollupWatcherEvent
import typingsJapgolly.rollup.rollupStrings.END
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`
  extends StObject
     with RollupWatcherEvent {
  
  var code: END
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(code = "END")
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setCode(value: END): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
