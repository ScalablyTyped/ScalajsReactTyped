package typingsJapgolly.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomEntityTypeRequest extends StObject {
  
  /**
    * The name of the custom pattern that you want to retrieve.
    */
  var Name: NameString
}
object GetCustomEntityTypeRequest {
  
  inline def apply(Name: NameString): GetCustomEntityTypeRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomEntityTypeRequest]
  }
  
  extension [Self <: GetCustomEntityTypeRequest](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
