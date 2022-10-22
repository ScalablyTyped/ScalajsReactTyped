package typingsJapgolly.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute extends StObject {
  
  /**
    * A list of possible values an attribute can be assigned.
    */
  var allowedValues: js.UndefOr[listOfStrings] = js.undefined
  
  /**
    * A specified value for the attribute.
    */
  var assignedValue: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * The specified data type of the attribute. 
    */
  var dataType: NodeDataType
  
  /**
    * The default value of the attribute.
    */
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * A brief description of the attribute.
    */
  var description: js.UndefOr[typingsJapgolly.awsSdk.clientsIotfleetwiseMod.description] = js.undefined
  
  /**
    * The fully qualified name of the attribute. For example, the fully qualified name of an attribute might be Vehicle.Body.Engine.Type.
    */
  var fullyQualifiedName: java.lang.String
  
  /**
    * The specified possible maximum value of the attribute.
    */
  var max: js.UndefOr[double] = js.undefined
  
  /**
    * The specified possible minimum value of the attribute.
    */
  var min: js.UndefOr[double] = js.undefined
  
  /**
    * The scientific unit for the attribute.
    */
  var unit: js.UndefOr[java.lang.String] = js.undefined
}
object Attribute {
  
  inline def apply(dataType: NodeDataType, fullyQualifiedName: java.lang.String): Attribute = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], fullyQualifiedName = fullyQualifiedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
  
  extension [Self <: Attribute](x: Self) {
    
    inline def setAllowedValues(value: listOfStrings): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    inline def setAllowedValuesVarargs(value: java.lang.String*): Self = StObject.set(x, "allowedValues", js.Array(value*))
    
    inline def setAssignedValue(value: java.lang.String): Self = StObject.set(x, "assignedValue", value.asInstanceOf[js.Any])
    
    inline def setAssignedValueUndefined: Self = StObject.set(x, "assignedValue", js.undefined)
    
    inline def setDataType(value: NodeDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: java.lang.String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFullyQualifiedName(value: java.lang.String): Self = StObject.set(x, "fullyQualifiedName", value.asInstanceOf[js.Any])
    
    inline def setMax(value: double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setUnit(value: java.lang.String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
