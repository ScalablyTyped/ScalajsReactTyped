package typingsJapgolly.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.APPFLOW_INTEGRATION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AttributeSourceIdMap = StringDictionary[uuid]

type Attributes = StringDictionary[string1To255]

type Batches = js.Array[Batch]

type BucketName = String

type BucketPrefix = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RECENCY
  - typingsJapgolly.awsSdk.awsSdkStrings.SOURCE
  - java.lang.String
*/
type ConflictResolvingModel = _ConflictResolvingModel | String

type ConnectorProfileName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Incremental_
  - typingsJapgolly.awsSdk.awsSdkStrings.Complete_
  - java.lang.String
*/
type DataPullMode = _DataPullMode | String

type Date = js.Date

type DatetimeTypeFieldName = String

type DestinationField = String

type DomainList = js.Array[ListDomainItem]

type Double = scala.Double

type Double0To1 = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STRING
  - typingsJapgolly.awsSdk.awsSdkStrings.NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.PHONE_NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL_ADDRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.NAME
  - java.lang.String
*/
type FieldContentType = _FieldContentType | String

type FieldMap = StringDictionary[ObjectTypeField]

type FieldNameList = js.Array[name]

type FlowDescription = String

type FlowName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.MALE
  - typingsJapgolly.awsSdk.awsSdkStrings.FEMALE
  - typingsJapgolly.awsSdk.awsSdkStrings.UNSPECIFIED
  - java.lang.String
*/
type Gender = _Gender | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.PREPROCESSING
  - typingsJapgolly.awsSdk.awsSdkStrings.FIND_MATCHING
  - typingsJapgolly.awsSdk.awsSdkStrings.MERGING
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.PARTIAL_SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type IdentityResolutionJobStatus = _IdentityResolutionJobStatus | String

type IdentityResolutionJobsList = js.Array[IdentityResolutionJob]

type IntegrationList = js.Array[ListIntegrationItem]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUNDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.MONDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.TUESDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.WEDNESDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.THURSDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.FRIDAY
  - typingsJapgolly.awsSdk.awsSdkStrings.SATURDAY
  - java.lang.String
*/
type JobScheduleDayOfTheWeek = _JobScheduleDayOfTheWeek | String

type JobScheduleTime = String

type KeyMap = StringDictionary[ObjectTypeKeyList]

type KmsArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PROJECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN
  - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN
  - typingsJapgolly.awsSdk.awsSdkStrings.BETWEEN
  - typingsJapgolly.awsSdk.awsSdkStrings.ADDITION
  - typingsJapgolly.awsSdk.awsSdkStrings.MULTIPLICATION
  - typingsJapgolly.awsSdk.awsSdkStrings.DIVISION
  - typingsJapgolly.awsSdk.awsSdkStrings.SUBTRACTION
  - typingsJapgolly.awsSdk.awsSdkStrings.MASK_ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.MASK_FIRST_N
  - typingsJapgolly.awsSdk.awsSdkStrings.MASK_LAST_N
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NON_NULL
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NON_ZERO
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NON_NEGATIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NUMERIC
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_OP
  - java.lang.String
*/
type MarketoConnectorOperator = _MarketoConnectorOperator | String

type MatchesList = js.Array[MatchItem]

type MatchingAttributes = js.Array[string1To255]

type MatchingAttributesList = js.Array[MatchingAttributes]

type Object = String

type ObjectTypeKeyList = js.Array[ObjectTypeKey]

type ObjectTypeNames = StringDictionary[typeName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VALUE
  - typingsJapgolly.awsSdk.awsSdkStrings.VALUES
  - typingsJapgolly.awsSdk.awsSdkStrings.DATA_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPPER_BOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.LOWER_BOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.SOURCE_DATA_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.DESTINATION_DATA_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_ACTION
  - typingsJapgolly.awsSdk.awsSdkStrings.MASK_VALUE
  - typingsJapgolly.awsSdk.awsSdkStrings.MASK_LENGTH
  - typingsJapgolly.awsSdk.awsSdkStrings.TRUNCATE_LENGTH
  - typingsJapgolly.awsSdk.awsSdkStrings.MATH_OPERATION_FIELDS_ORDER
  - typingsJapgolly.awsSdk.awsSdkStrings.CONCAT_FORMAT
  - typingsJapgolly.awsSdk.awsSdkStrings.SUBFIELD_CATEGORY_MAP
  - java.lang.String
*/
type OperatorPropertiesKeys = _OperatorPropertiesKeys | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INDIVIDUAL
  - typingsJapgolly.awsSdk.awsSdkStrings.BUSINESS
  - typingsJapgolly.awsSdk.awsSdkStrings.OTHER
  - java.lang.String
*/
type PartyType = _PartyType | String

type ProfileIdList = js.Array[uuid]

type ProfileIdToBeMergedList = js.Array[uuid]

type ProfileList = js.Array[Profile]

type ProfileObjectList = js.Array[ListProfileObjectsItem]

type ProfileObjectTypeList = js.Array[ListProfileObjectTypeItem]

type ProfileObjectTypeTemplateList = js.Array[ListProfileObjectTypeTemplateItem]

type Property = String

type RoleArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PROJECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN
  - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN
  - typingsJapgolly.awsSdk.awsSdkStrings.BETWEEN
  - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUAL_TO
  - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL_TO
  - typingsJapgolly.awsSdk.awsSdkStrings.EQUAL_TO
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_EQUAL_TO
  - typingsJapgolly.awsSdk.awsSdkStrings.ADDITION
  - typingsJapgolly.awsSdk.awsSdkStrings.MULTIPLICATION
  - typingsJapgolly.awsSdk.awsSdkStrings.DIVISION
  - typingsJapgolly.awsSdk.awsSdkStrings.SUBTRACTION
  - typingsJapgolly.awsSdk.awsSdkStrings.MASK_ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.MASK_FIRST_N
  - typingsJapgolly.awsSdk.awsSdkStrings.MASK_LAST_N
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NON_NULL
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NON_ZERO
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NON_NEGATIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NUMERIC
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_OP
  - java.lang.String
*/
type S3ConnectorOperator = _S3ConnectorOperator | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PROJECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTAINS
  - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN
  - typingsJapgolly.awsSdk.awsSdkStrings.BETWEEN
  - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUAL_TO
  - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL_TO
  - typingsJapgolly.awsSdk.awsSdkStrings.EQUAL_TO
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_EQUAL_TO
  - typingsJapgolly.awsSdk.awsSdkStrings.ADDITION
  - typingsJapgolly.awsSdk.awsSdkStrings.MULTIPLICATION
  - typingsJapgolly.awsSdk.awsSdkStrings.DIVISION
  - typingsJapgolly.awsSdk.awsSdkStrings.SUBTRACTION
  - typingsJapgolly.awsSdk.awsSdkStrings.MASK_ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.MASK_FIRST_N
  - typingsJapgolly.awsSdk.awsSdkStrings.MASK_LAST_N
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NON_NULL
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NON_ZERO
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NON_NEGATIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NUMERIC
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_OP
  - java.lang.String
*/
type SalesforceConnectorOperator = _SalesforceConnectorOperator | String

type ScheduleExpression = String

type ScheduleOffset = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PROJECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTAINS
  - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN
  - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN
  - typingsJapgolly.awsSdk.awsSdkStrings.BETWEEN
  - typingsJapgolly.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUAL_TO
  - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL_TO
  - typingsJapgolly.awsSdk.awsSdkStrings.EQUAL_TO
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_EQUAL_TO
  - typingsJapgolly.awsSdk.awsSdkStrings.ADDITION
  - typingsJapgolly.awsSdk.awsSdkStrings.MULTIPLICATION
  - typingsJapgolly.awsSdk.awsSdkStrings.DIVISION
  - typingsJapgolly.awsSdk.awsSdkStrings.SUBTRACTION
  - typingsJapgolly.awsSdk.awsSdkStrings.MASK_ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.MASK_FIRST_N
  - typingsJapgolly.awsSdk.awsSdkStrings.MASK_LAST_N
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NON_NULL
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NON_ZERO
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NON_NEGATIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NUMERIC
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_OP
  - java.lang.String
*/
type ServiceNowConnectorOperator = _ServiceNowConnectorOperator | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Salesforce_
  - typingsJapgolly.awsSdk.awsSdkStrings.Marketo
  - typingsJapgolly.awsSdk.awsSdkStrings.Zendesk_
  - typingsJapgolly.awsSdk.awsSdkStrings.Servicenow_
  - typingsJapgolly.awsSdk.awsSdkStrings.S3
  - java.lang.String
*/
type SourceConnectorType = _SourceConnectorType | String

type SourceFields = js.Array[stringTo2048]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PROFILE
  - typingsJapgolly.awsSdk.awsSdkStrings.ASSET
  - typingsJapgolly.awsSdk.awsSdkStrings.CASE
  - typingsJapgolly.awsSdk.awsSdkStrings.UNIQUE
  - typingsJapgolly.awsSdk.awsSdkStrings.SECONDARY
  - typingsJapgolly.awsSdk.awsSdkStrings.LOOKUP_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.NEW_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.ORDER
  - java.lang.String
*/
type StandardIdentifier = _StandardIdentifier | String

type StandardIdentifierList = js.Array[StandardIdentifier]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.SPLIT
  - typingsJapgolly.awsSdk.awsSdkStrings.RETRY
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type Status = _Status | String

type TagArn = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type TaskPropertiesMap = StringDictionary[Property]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Arithmetic
  - typingsJapgolly.awsSdk.awsSdkStrings.Filter_
  - typingsJapgolly.awsSdk.awsSdkStrings.Map_
  - typingsJapgolly.awsSdk.awsSdkStrings.Mask_
  - typingsJapgolly.awsSdk.awsSdkStrings.Merge_
  - typingsJapgolly.awsSdk.awsSdkStrings.Truncate
  - typingsJapgolly.awsSdk.awsSdkStrings.Validate
  - java.lang.String
*/
type TaskType = _TaskType | String

type Tasks = js.Array[Task]

type Timezone = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Scheduled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Event_
  - typingsJapgolly.awsSdk.awsSdkStrings.OnDemand
  - java.lang.String
*/
type TriggerType = _TriggerType | String

type UpdateAttributes = StringDictionary[string0To255]

type WorkflowList = js.Array[ListWorkflowsItem]

type WorkflowStepsList = js.Array[WorkflowStepItem]

type WorkflowType = APPFLOW_INTEGRATION | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PROJECTION
  - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN
  - typingsJapgolly.awsSdk.awsSdkStrings.ADDITION
  - typingsJapgolly.awsSdk.awsSdkStrings.MULTIPLICATION
  - typingsJapgolly.awsSdk.awsSdkStrings.DIVISION
  - typingsJapgolly.awsSdk.awsSdkStrings.SUBTRACTION
  - typingsJapgolly.awsSdk.awsSdkStrings.MASK_ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.MASK_FIRST_N
  - typingsJapgolly.awsSdk.awsSdkStrings.MASK_LAST_N
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NON_NULL
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NON_ZERO
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NON_NEGATIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NUMERIC
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_OP
  - java.lang.String
*/
type ZendeskConnectorOperator = _ZendeskConnectorOperator | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-08-15`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type encryptionKey = String

type expirationDaysInteger = scala.Double

type long = scala.Double

type matchesNumber = scala.Double

type maxSize100 = scala.Double

type message = String

type name = String

type optionalBoolean = Boolean

type requestValueList = js.Array[string1To255]

type s3BucketName = String

type s3KeyName = String

type s3KeyNameCustomerOutputConfig = String

type sqsQueueUrl = String

type string0To1000 = String

type string0To255 = String

type string1To1000 = String

type string1To255 = String

type stringTo2048 = String

type stringifiedJson = String

type text = String

type timestamp = js.Date

type token = String

type typeName = String

type uuid = String
