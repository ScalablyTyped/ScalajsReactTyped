package typingsJapgolly.googleAppsScript.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddOnParameters extends StObject {
  
  var addOnParameters: StringDictionary[String]
}
object AddOnParameters {
  
  inline def apply(addOnParameters: StringDictionary[String]): AddOnParameters = {
    val __obj = js.Dynamic.literal(addOnParameters = addOnParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOnParameters]
  }
  
  extension [Self <: AddOnParameters](x: Self) {
    
    inline def setAddOnParameters(value: StringDictionary[String]): Self = StObject.set(x, "addOnParameters", value.asInstanceOf[js.Any])
  }
}
