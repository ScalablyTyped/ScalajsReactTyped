package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesArtifacts extends StObject {
  
  var enumValues: Artifacts
}
object EnumValuesArtifacts {
  
  inline def apply(enumValues: Artifacts): EnumValuesArtifacts = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesArtifacts]
  }
  
  extension [Self <: EnumValuesArtifacts](x: Self) {
    
    inline def setEnumValues(value: Artifacts): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
