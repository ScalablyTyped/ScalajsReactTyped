package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iotthingsgraphMod {
  type Arn = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.iotthingsgraphMod.ClientApiVersions
  type DefinitionLanguage = typingsJapgolly.awsSdk.awsSdkStrings.GRAPHQL | java.lang.String
  type DefinitionText = java.lang.String
  type DependencyRevisions = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.DependencyRevision]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GREENGRASS
    - typingsJapgolly.awsSdk.awsSdkStrings.CLOUD
    - java.lang.String
  */
  type DeploymentTarget = typingsJapgolly.awsSdk.iotthingsgraphMod._DeploymentTarget | java.lang.String
  type DeprecateExistingEntities = scala.Boolean
  type Enabled = scala.Boolean
  type EntityDescriptions = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.EntityDescription]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NAME
    - typingsJapgolly.awsSdk.awsSdkStrings.NAMESPACE
    - typingsJapgolly.awsSdk.awsSdkStrings.SEMANTIC_TYPE_PATH
    - typingsJapgolly.awsSdk.awsSdkStrings.REFERENCED_ENTITY_ID
    - java.lang.String
  */
  type EntityFilterName = typingsJapgolly.awsSdk.iotthingsgraphMod._EntityFilterName | java.lang.String
  type EntityFilterValue = java.lang.String
  type EntityFilterValues = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.EntityFilterValue]
  type EntityFilters = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.EntityFilter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEVICE
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE
    - typingsJapgolly.awsSdk.awsSdkStrings.DEVICE_MODEL
    - typingsJapgolly.awsSdk.awsSdkStrings.CAPABILITY
    - typingsJapgolly.awsSdk.awsSdkStrings.STATE
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTION
    - typingsJapgolly.awsSdk.awsSdkStrings.EVENT
    - typingsJapgolly.awsSdk.awsSdkStrings.PROPERTY
    - typingsJapgolly.awsSdk.awsSdkStrings.MAPPING
    - typingsJapgolly.awsSdk.awsSdkStrings.ENUM
    - java.lang.String
  */
  type EntityType = typingsJapgolly.awsSdk.iotthingsgraphMod._EntityType | java.lang.String
  type EntityTypes = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.EntityType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTION_STARTED
    - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTION_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTION_ABORTED
    - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTION_SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.STEP_STARTED
    - typingsJapgolly.awsSdk.awsSdkStrings.STEP_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.STEP_SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVITY_SCHEDULED
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVITY_STARTED
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVITY_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVITY_SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.START_FLOW_EXECUTION_TASK
    - typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULE_NEXT_READY_STEPS_TASK
    - typingsJapgolly.awsSdk.awsSdkStrings.THING_ACTION_TASK
    - typingsJapgolly.awsSdk.awsSdkStrings.THING_ACTION_TASK_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.THING_ACTION_TASK_SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.ACKNOWLEDGE_TASK_MESSAGE
    - java.lang.String
  */
  type FlowExecutionEventType = typingsJapgolly.awsSdk.iotthingsgraphMod._FlowExecutionEventType | java.lang.String
  type FlowExecutionId = java.lang.String
  type FlowExecutionMessageId = java.lang.String
  type FlowExecutionMessagePayload = java.lang.String
  type FlowExecutionMessages = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.FlowExecutionMessage]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.ABORTED
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type FlowExecutionStatus = typingsJapgolly.awsSdk.iotthingsgraphMod._FlowExecutionStatus | java.lang.String
  type FlowExecutionSummaries = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.FlowExecutionSummary]
  type FlowTemplateFilterName = typingsJapgolly.awsSdk.awsSdkStrings.DEVICE_MODEL_ID | java.lang.String
  type FlowTemplateFilterValue = java.lang.String
  type FlowTemplateFilterValues = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.FlowTemplateFilterValue]
  type FlowTemplateFilters = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.FlowTemplateFilter]
  type FlowTemplateSummaries = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.FlowTemplateSummary]
  type GreengrassDeploymentId = java.lang.String
  type GreengrassGroupId = java.lang.String
  type GreengrassGroupVersionId = java.lang.String
  type GroupName = java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type NamespaceDeletionStatus = typingsJapgolly.awsSdk.iotthingsgraphMod._NamespaceDeletionStatus | java.lang.String
  type NamespaceDeletionStatusErrorCodes = typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_FAILED | java.lang.String
  type NamespaceName = java.lang.String
  type NextToken = java.lang.String
  type ResourceArn = java.lang.String
  type RoleArn = java.lang.String
  type S3BucketName = java.lang.String
  type String = java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.String]
  type SyncWithPublicNamespace = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_DEPLOYED
    - typingsJapgolly.awsSdk.awsSdkStrings.BOOTSTRAP
    - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOY_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYED_IN_TARGET
    - typingsJapgolly.awsSdk.awsSdkStrings.UNDEPLOY_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_DELETE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED_IN_TARGET
    - java.lang.String
  */
  type SystemInstanceDeploymentStatus = typingsJapgolly.awsSdk.iotthingsgraphMod._SystemInstanceDeploymentStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM_TEMPLATE_ID
    - typingsJapgolly.awsSdk.awsSdkStrings.STATUS
    - typingsJapgolly.awsSdk.awsSdkStrings.GREENGRASS_GROUP_NAME
    - java.lang.String
  */
  type SystemInstanceFilterName = typingsJapgolly.awsSdk.iotthingsgraphMod._SystemInstanceFilterName | java.lang.String
  type SystemInstanceFilterValue = java.lang.String
  type SystemInstanceFilterValues = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.SystemInstanceFilterValue]
  type SystemInstanceFilters = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.SystemInstanceFilter]
  type SystemInstanceSummaries = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.SystemInstanceSummary]
  type SystemTemplateFilterName = typingsJapgolly.awsSdk.awsSdkStrings.FLOW_TEMPLATE_ID | java.lang.String
  type SystemTemplateFilterValue = java.lang.String
  type SystemTemplateFilterValues = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.SystemTemplateFilterValue]
  type SystemTemplateFilters = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.SystemTemplateFilter]
  type SystemTemplateSummaries = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.SystemTemplateSummary]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.Tag]
  type TagValue = java.lang.String
  type ThingArn = java.lang.String
  type ThingName = java.lang.String
  type Things = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.Thing]
  type Timestamp = js.Date
  type UploadId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type UploadStatus = typingsJapgolly.awsSdk.iotthingsgraphMod._UploadStatus | java.lang.String
  type Urn = java.lang.String
  type Urns = js.Array[typingsJapgolly.awsSdk.iotthingsgraphMod.Urn]
  type Version = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-09-06`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.iotthingsgraphMod._apiVersion | java.lang.String
}
