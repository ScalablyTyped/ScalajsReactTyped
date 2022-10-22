package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTaskTemplateResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the task template resource.
    */
  var Arn: js.UndefOr[TaskTemplateArn] = js.undefined
  
  /**
    * Constraints that are applicable to the fields listed.
    */
  var Constraints: js.UndefOr[TaskTemplateConstraints] = js.undefined
  
  /**
    * The identifier of the flow that runs by default when a task is created by referencing this template.
    */
  var ContactFlowId: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.ContactFlowId] = js.undefined
  
  /**
    * The timestamp when the task template was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The default values for fields when a task is created by referencing this template.
    */
  var Defaults: js.UndefOr[TaskTemplateDefaults] = js.undefined
  
  /**
    * The description of the task template.
    */
  var Description: js.UndefOr[TaskTemplateDescription] = js.undefined
  
  /**
    * Fields that are part of the template.
    */
  var Fields: js.UndefOr[TaskTemplateFields] = js.undefined
  
  /**
    * The identifier of the task template resource.
    */
  var Id: js.UndefOr[TaskTemplateId] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.InstanceId] = js.undefined
  
  /**
    * The timestamp when the task template was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the task template.
    */
  var Name: js.UndefOr[TaskTemplateName] = js.undefined
  
  /**
    * Marks a template as ACTIVE or INACTIVE for a task to refer to it. Tasks can only be created from ACTIVE templates. If a template is marked as INACTIVE, then a task that refers to this template cannot be created.
    */
  var Status: js.UndefOr[TaskTemplateStatus] = js.undefined
}
object UpdateTaskTemplateResponse {
  
  inline def apply(): UpdateTaskTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTaskTemplateResponse]
  }
  
  extension [Self <: UpdateTaskTemplateResponse](x: Self) {
    
    inline def setArn(value: TaskTemplateArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setConstraints(value: TaskTemplateConstraints): Self = StObject.set(x, "Constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "Constraints", js.undefined)
    
    inline def setContactFlowId(value: ContactFlowId): Self = StObject.set(x, "ContactFlowId", value.asInstanceOf[js.Any])
    
    inline def setContactFlowIdUndefined: Self = StObject.set(x, "ContactFlowId", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDefaults(value: TaskTemplateDefaults): Self = StObject.set(x, "Defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "Defaults", js.undefined)
    
    inline def setDescription(value: TaskTemplateDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFields(value: TaskTemplateFields): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "Fields", js.undefined)
    
    inline def setFieldsVarargs(value: TaskTemplateField*): Self = StObject.set(x, "Fields", js.Array(value*))
    
    inline def setId(value: TaskTemplateId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setName(value: TaskTemplateName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: TaskTemplateStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
