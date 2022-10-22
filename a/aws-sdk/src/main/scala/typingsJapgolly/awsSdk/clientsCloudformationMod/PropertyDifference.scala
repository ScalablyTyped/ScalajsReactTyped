package typingsJapgolly.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyDifference extends StObject {
  
  /**
    * The actual property value of the resource property.
    */
  var ActualValue: PropertyValue
  
  /**
    * The type of property difference.    ADD: A value has been added to a resource property that's an array or list data type.    REMOVE: The property has been removed from the current resource configuration.    NOT_EQUAL: The current property value differs from its expected value (as defined in the stack template and any values specified as template parameters).  
    */
  var DifferenceType: typingsJapgolly.awsSdk.clientsCloudformationMod.DifferenceType
  
  /**
    * The expected property value of the resource property, as defined in the stack template and any values specified as template parameters.
    */
  var ExpectedValue: PropertyValue
  
  /**
    * The fully-qualified path to the resource property.
    */
  var PropertyPath: typingsJapgolly.awsSdk.clientsCloudformationMod.PropertyPath
}
object PropertyDifference {
  
  inline def apply(
    ActualValue: PropertyValue,
    DifferenceType: DifferenceType,
    ExpectedValue: PropertyValue,
    PropertyPath: PropertyPath
  ): PropertyDifference = {
    val __obj = js.Dynamic.literal(ActualValue = ActualValue.asInstanceOf[js.Any], DifferenceType = DifferenceType.asInstanceOf[js.Any], ExpectedValue = ExpectedValue.asInstanceOf[js.Any], PropertyPath = PropertyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyDifference]
  }
  
  extension [Self <: PropertyDifference](x: Self) {
    
    inline def setActualValue(value: PropertyValue): Self = StObject.set(x, "ActualValue", value.asInstanceOf[js.Any])
    
    inline def setDifferenceType(value: DifferenceType): Self = StObject.set(x, "DifferenceType", value.asInstanceOf[js.Any])
    
    inline def setExpectedValue(value: PropertyValue): Self = StObject.set(x, "ExpectedValue", value.asInstanceOf[js.Any])
    
    inline def setPropertyPath(value: PropertyPath): Self = StObject.set(x, "PropertyPath", value.asInstanceOf[js.Any])
  }
}
