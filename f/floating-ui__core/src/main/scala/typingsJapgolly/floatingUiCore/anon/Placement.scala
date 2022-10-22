package typingsJapgolly.floatingUiCore.anon

import typingsJapgolly.floatingUiCore.floatingUiCoreBooleans.`true`
import typingsJapgolly.floatingUiCore.srcTypesMod.ElementRects
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placement extends StObject {
  
  var placement: js.UndefOr[typingsJapgolly.floatingUiCore.srcTypesMod.Placement] = js.undefined
  
  var rects: js.UndefOr[`true` | ElementRects] = js.undefined
}
object Placement {
  
  inline def apply(): Placement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Placement]
  }
  
  extension [Self <: Placement](x: Self) {
    
    inline def setPlacement(value: typingsJapgolly.floatingUiCore.srcTypesMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setRects(value: `true` | ElementRects): Self = StObject.set(x, "rects", value.asInstanceOf[js.Any])
    
    inline def setRectsUndefined: Self = StObject.set(x, "rects", js.undefined)
  }
}
