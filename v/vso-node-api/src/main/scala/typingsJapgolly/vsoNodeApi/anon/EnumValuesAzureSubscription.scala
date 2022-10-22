package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAzureSubscription extends StObject {
  
  var enumValues: AzureSubscription
}
object EnumValuesAzureSubscription {
  
  inline def apply(enumValues: AzureSubscription): EnumValuesAzureSubscription = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAzureSubscription]
  }
  
  extension [Self <: EnumValuesAzureSubscription](x: Self) {
    
    inline def setEnumValues(value: AzureSubscription): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
