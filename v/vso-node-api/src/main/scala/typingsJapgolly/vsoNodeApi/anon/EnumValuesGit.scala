package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesGit extends StObject {
  
  var enumValues: Git
}
object EnumValuesGit {
  
  inline def apply(enumValues: Git): EnumValuesGit = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesGit]
  }
  
  extension [Self <: EnumValuesGit](x: Self) {
    
    inline def setEnumValues(value: Git): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
