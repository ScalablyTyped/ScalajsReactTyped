package typingsJapgolly.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var baseline: String | Signal
}
object `2` {
  
  inline def apply(baseline: String | Signal): `2` = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setBaseline(value: String | Signal): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
  }
}
