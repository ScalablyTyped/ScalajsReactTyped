package typingsJapgolly.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttribute extends StObject {
  
  /**
    * The name of the dataset field.
    */
  var AttributeName: js.UndefOr[Name] = js.undefined
  
  /**
    * The data type of the field. For a related time series dataset, other than date, item_id, and forecast dimensions attributes, all attributes should be of numerical type (integer/float).
    */
  var AttributeType: js.UndefOr[typingsJapgolly.awsSdk.clientsForecastserviceMod.AttributeType] = js.undefined
}
object SchemaAttribute {
  
  inline def apply(): SchemaAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttribute]
  }
  
  extension [Self <: SchemaAttribute](x: Self) {
    
    inline def setAttributeName(value: Name): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setAttributeType(value: AttributeType): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    
    inline def setAttributeTypeUndefined: Self = StObject.set(x, "AttributeType", js.undefined)
  }
}
