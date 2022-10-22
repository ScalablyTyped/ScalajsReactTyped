package typingsJapgolly.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetModelCompositeModel extends StObject {
  
  /**
    * The description of the composite model.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The name of the composite model.
    */
  var name: Name
  
  /**
    * The asset property definitions for this composite model.
    */
  var properties: js.UndefOr[AssetModelProperties] = js.undefined
  
  /**
    * The type of the composite model. For alarm composite models, this type is AWS/ALARM.
    */
  var `type`: Name
}
object AssetModelCompositeModel {
  
  inline def apply(name: Name, `type`: Name): AssetModelCompositeModel = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetModelCompositeModel]
  }
  
  extension [Self <: AssetModelCompositeModel](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: AssetModelProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: AssetModelProperty*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setType(value: Name): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
