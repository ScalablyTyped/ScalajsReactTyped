package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesNotSet extends StObject {
  
  var enumValues: NotSet
}
object EnumValuesNotSet {
  
  inline def apply(enumValues: NotSet): EnumValuesNotSet = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesNotSet]
  }
  
  extension [Self <: EnumValuesNotSet](x: Self) {
    
    inline def setEnumValues(value: NotSet): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
