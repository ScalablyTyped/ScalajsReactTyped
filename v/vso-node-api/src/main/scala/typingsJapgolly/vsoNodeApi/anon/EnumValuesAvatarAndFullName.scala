package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAvatarAndFullName extends StObject {
  
  var enumValues: AvatarAndFullName
}
object EnumValuesAvatarAndFullName {
  
  inline def apply(enumValues: AvatarAndFullName): EnumValuesAvatarAndFullName = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAvatarAndFullName]
  }
  
  extension [Self <: EnumValuesAvatarAndFullName](x: Self) {
    
    inline def setEnumValues(value: AvatarAndFullName): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
