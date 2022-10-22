package typingsJapgolly.pulumiKubernetes.typesOutputMod.apiextensions.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition
  */
trait CustomResourceDefinitionStatusPatch extends StObject {
  
  /**
    * acceptedNames are the names that are actually being used to serve discovery. They may be different than the names in spec.
    */
  var acceptedNames: CustomResourceDefinitionNamesPatch
  
  /**
    * conditions indicate state for particular aspects of a CustomResourceDefinition
    */
  var conditions: js.Array[CustomResourceDefinitionConditionPatch]
  
  /**
    * storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from `spec.versions` while they exist in this list.
    */
  var storedVersions: js.Array[String]
}
object CustomResourceDefinitionStatusPatch {
  
  inline def apply(
    acceptedNames: CustomResourceDefinitionNamesPatch,
    conditions: js.Array[CustomResourceDefinitionConditionPatch],
    storedVersions: js.Array[String]
  ): CustomResourceDefinitionStatusPatch = {
    val __obj = js.Dynamic.literal(acceptedNames = acceptedNames.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], storedVersions = storedVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionStatusPatch]
  }
  
  extension [Self <: CustomResourceDefinitionStatusPatch](x: Self) {
    
    inline def setAcceptedNames(value: CustomResourceDefinitionNamesPatch): Self = StObject.set(x, "acceptedNames", value.asInstanceOf[js.Any])
    
    inline def setConditions(value: js.Array[CustomResourceDefinitionConditionPatch]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: CustomResourceDefinitionConditionPatch*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setStoredVersions(value: js.Array[String]): Self = StObject.set(x, "storedVersions", value.asInstanceOf[js.Any])
    
    inline def setStoredVersionsVarargs(value: String*): Self = StObject.set(x, "storedVersions", js.Array(value*))
  }
}
