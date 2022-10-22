package typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
  */
trait ManagedFieldsEntryPatch extends StObject {
  
  /**
    * APIVersion defines the version of this resource that this field set applies to. The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
    */
  var apiVersion: String
  
  /**
    * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: "FieldsV1"
    */
  var fieldsType: String
  
  /**
    * FieldsV1 holds the first JSON version format as described in the "FieldsV1" type.
    */
  var fieldsV1: Any
  
  /**
    * Manager is an identifier of the workflow managing these fields.
    */
  var manager: String
  
  /**
    * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.
    */
  var operation: String
  
  /**
    * Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource. The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.
    */
  var subresource: String
  
  /**
    * Time is the timestamp of when the ManagedFields entry was added. The timestamp will also be updated if a field is added, the manager changes any of the owned fields value or removes a field. The timestamp does not update when a field is removed from the entry because another manager took it over.
    */
  var time: String
}
object ManagedFieldsEntryPatch {
  
  inline def apply(
    apiVersion: String,
    fieldsType: String,
    fieldsV1: Any,
    manager: String,
    operation: String,
    subresource: String,
    time: String
  ): ManagedFieldsEntryPatch = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], fieldsType = fieldsType.asInstanceOf[js.Any], fieldsV1 = fieldsV1.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], subresource = subresource.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedFieldsEntryPatch]
  }
  
  extension [Self <: ManagedFieldsEntryPatch](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setFieldsType(value: String): Self = StObject.set(x, "fieldsType", value.asInstanceOf[js.Any])
    
    inline def setFieldsV1(value: Any): Self = StObject.set(x, "fieldsV1", value.asInstanceOf[js.Any])
    
    inline def setManager(value: String): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setSubresource(value: String): Self = StObject.set(x, "subresource", value.asInstanceOf[js.Any])
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
