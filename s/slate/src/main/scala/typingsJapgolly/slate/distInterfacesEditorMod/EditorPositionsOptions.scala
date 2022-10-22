package typingsJapgolly.slate.distInterfacesEditorMod

import typingsJapgolly.slate.distInterfacesLocationMod.Location
import typingsJapgolly.slate.distInterfacesTypesMod.TextUnitAdjustment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorPositionsOptions extends StObject {
  
  var at: js.UndefOr[Location] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var unit: js.UndefOr[TextUnitAdjustment] = js.undefined
  
  var voids: js.UndefOr[Boolean] = js.undefined
}
object EditorPositionsOptions {
  
  inline def apply(): EditorPositionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorPositionsOptions]
  }
  
  extension [Self <: EditorPositionsOptions](x: Self) {
    
    inline def setAt(value: Location): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    inline def setAtVarargs(value: Double*): Self = StObject.set(x, "at", js.Array(value*))
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setUnit(value: TextUnitAdjustment): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setVoids(value: Boolean): Self = StObject.set(x, "voids", value.asInstanceOf[js.Any])
    
    inline def setVoidsUndefined: Self = StObject.set(x, "voids", js.undefined)
  }
}
