package typingsJapgolly.reactThreeFiber.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Manual extends StObject {
  
  var manual: js.UndefOr[Boolean] = js.undefined
}
object Manual {
  
  inline def apply(): Manual = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Manual]
  }
  
  extension [Self <: Manual](x: Self) {
    
    inline def setManual(value: Boolean): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
    
    inline def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
  }
}
