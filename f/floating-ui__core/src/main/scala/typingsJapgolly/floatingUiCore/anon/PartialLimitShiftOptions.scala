package typingsJapgolly.floatingUiCore.anon

import typingsJapgolly.floatingUiCore.srcMiddlewareShiftMod.LimitShiftOffset
import typingsJapgolly.floatingUiCore.srcTypesMod.MiddlewareArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@floating-ui/core.@floating-ui/core/src/middleware/shift.LimitShiftOptions> */
trait PartialLimitShiftOptions extends StObject {
  
  var crossAxis: js.UndefOr[Boolean] = js.undefined
  
  var mainAxis: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[LimitShiftOffset] = js.undefined
}
object PartialLimitShiftOptions {
  
  inline def apply(): PartialLimitShiftOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLimitShiftOptions]
  }
  
  extension [Self <: PartialLimitShiftOptions](x: Self) {
    
    inline def setCrossAxis(value: Boolean): Self = StObject.set(x, "crossAxis", value.asInstanceOf[js.Any])
    
    inline def setCrossAxisUndefined: Self = StObject.set(x, "crossAxis", js.undefined)
    
    inline def setMainAxis(value: Boolean): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
    
    inline def setMainAxisUndefined: Self = StObject.set(x, "mainAxis", js.undefined)
    
    inline def setOffset(value: LimitShiftOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetFunction1(value: /* args */ MiddlewareArguments => Double | CrossAxis): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
