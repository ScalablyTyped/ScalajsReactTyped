package typingsJapgolly.ecmarkup.anon

import typingsJapgolly.ecmarkup.ecmarkupStrings.union
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Types
  extends StObject
     with typingsJapgolly.ecmarkup.libBiblioMod.Type {
  
  var kind: union
  
  var types: js.Array[Exclude[typingsJapgolly.ecmarkup.libBiblioMod.Type, `1`]]
}
object Types {
  
  inline def apply(types: js.Array[Exclude[typingsJapgolly.ecmarkup.libBiblioMod.Type, `1`]]): Types = {
    val __obj = js.Dynamic.literal(kind = "union", types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types]
  }
  
  extension [Self <: Types](x: Self) {
    
    inline def setKind(value: union): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[Exclude[typingsJapgolly.ecmarkup.libBiblioMod.Type, `1`]]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: (Exclude[typingsJapgolly.ecmarkup.libBiblioMod.Type, `1`])*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
