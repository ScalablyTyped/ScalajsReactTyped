package typingsJapgolly.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringParameter extends StObject {
  
  /**
    * A display name for a string parameter.
    */
  var Name: NonEmptyString
  
  /**
    * The values of a string parameter.
    */
  var Values: StringList
}
object StringParameter {
  
  inline def apply(Name: NonEmptyString, Values: StringList): StringParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringParameter]
  }
  
  extension [Self <: StringParameter](x: Self) {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: StringList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
