package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesTestResult extends StObject {
  
  var enumValues: TestResult
}
object EnumValuesTestResult {
  
  inline def apply(enumValues: TestResult): EnumValuesTestResult = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesTestResult]
  }
  
  extension [Self <: EnumValuesTestResult](x: Self) {
    
    inline def setEnumValues(value: TestResult): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
