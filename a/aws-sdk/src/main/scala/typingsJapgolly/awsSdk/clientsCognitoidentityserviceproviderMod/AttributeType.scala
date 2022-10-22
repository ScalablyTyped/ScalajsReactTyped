package typingsJapgolly.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeType extends StObject {
  
  /**
    * The name of the attribute.
    */
  var Name: AttributeNameType
  
  /**
    * The value of the attribute.
    */
  var Value: js.UndefOr[AttributeValueType] = js.undefined
}
object AttributeType {
  
  inline def apply(Name: AttributeNameType): AttributeType = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeType]
  }
  
  extension [Self <: AttributeType](x: Self) {
    
    inline def setName(value: AttributeNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: AttributeValueType): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
