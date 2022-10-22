package typingsJapgolly.floatingUiCore.srcTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.floatingUiCore.anon.Escaped
import typingsJapgolly.floatingUiCore.anon.Index
import typingsJapgolly.floatingUiCore.anon.PartialCoordscenterOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MiddlewareData
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var arrow: js.UndefOr[PartialCoordscenterOffset] = js.undefined
  
  var autoPlacement: js.UndefOr[Index] = js.undefined
  
  var flip: js.UndefOr[Index] = js.undefined
  
  var hide: js.UndefOr[Escaped] = js.undefined
  
  var offset: js.UndefOr[Coords] = js.undefined
  
  var shift: js.UndefOr[Coords] = js.undefined
}
object MiddlewareData {
  
  inline def apply(): MiddlewareData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiddlewareData]
  }
  
  extension [Self <: MiddlewareData](x: Self) {
    
    inline def setArrow(value: PartialCoordscenterOffset): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    inline def setAutoPlacement(value: Index): Self = StObject.set(x, "autoPlacement", value.asInstanceOf[js.Any])
    
    inline def setAutoPlacementUndefined: Self = StObject.set(x, "autoPlacement", js.undefined)
    
    inline def setFlip(value: Index): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
    
    inline def setHide(value: Escaped): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setOffset(value: Coords): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setShift(value: Coords): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    
    inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
  }
}
