package typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
  */
trait ManagedFieldsEntry extends StObject {
  
  /**
    * APIVersion defines the version of this resource that this field set applies to. The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
    */
  var apiVersion: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: "FieldsV1"
    */
  var fieldsType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * FieldsV1 holds the first JSON version format as described in the "FieldsV1" type.
    */
  var fieldsV1: js.UndefOr[Any] = js.undefined
  
  /**
    * Manager is an identifier of the workflow managing these fields.
    */
  var manager: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.
    */
  var operation: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource. The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.
    */
  var subresource: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Time is the timestamp of when the ManagedFields entry was added. The timestamp will also be updated if a field is added, the manager changes any of the owned fields value or removes a field. The timestamp does not update when a field is removed from the entry because another manager took it over.
    */
  var time: js.UndefOr[Input[String]] = js.undefined
}
object ManagedFieldsEntry {
  
  inline def apply(): ManagedFieldsEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedFieldsEntry]
  }
  
  extension [Self <: ManagedFieldsEntry](x: Self) {
    
    inline def setApiVersion(value: Input[String]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setFieldsType(value: Input[String]): Self = StObject.set(x, "fieldsType", value.asInstanceOf[js.Any])
    
    inline def setFieldsTypeUndefined: Self = StObject.set(x, "fieldsType", js.undefined)
    
    inline def setFieldsV1(value: Any): Self = StObject.set(x, "fieldsV1", value.asInstanceOf[js.Any])
    
    inline def setFieldsV1Undefined: Self = StObject.set(x, "fieldsV1", js.undefined)
    
    inline def setManager(value: Input[String]): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    inline def setManagerUndefined: Self = StObject.set(x, "manager", js.undefined)
    
    inline def setOperation(value: Input[String]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setSubresource(value: Input[String]): Self = StObject.set(x, "subresource", value.asInstanceOf[js.Any])
    
    inline def setSubresourceUndefined: Self = StObject.set(x, "subresource", js.undefined)
    
    inline def setTime(value: Input[String]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
