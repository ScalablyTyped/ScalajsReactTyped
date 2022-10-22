package typingsJapgolly.floatingUiCore.srcTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.floatingUiCore.floatingUiCoreBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@floating-ui/core.@floating-ui/core/src/types.Coords> */
trait MiddlewareReturn extends StObject {
  
  var data: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var reset: js.UndefOr[`true` | typingsJapgolly.floatingUiCore.anon.Placement] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object MiddlewareReturn {
  
  inline def apply(): MiddlewareReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiddlewareReturn]
  }
  
  extension [Self <: MiddlewareReturn](x: Self) {
    
    inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setReset(value: `true` | typingsJapgolly.floatingUiCore.anon.Placement): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
