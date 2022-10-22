package typingsJapgolly.reactOnsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifiersString extends StObject {
  
  var default: js.UndefOr[String] = js.undefined
  
  var material: js.UndefOr[String] = js.undefined
}
object ModifiersString {
  
  inline def apply(): ModifiersString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifiersString]
  }
  
  extension [Self <: ModifiersString](x: Self) {
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setMaterial(value: String): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
  }
}
