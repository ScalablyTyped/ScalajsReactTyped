package typingsJapgolly.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.Eq_
import typingsJapgolly.awsSdk.awsSdkStrings.KMS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Arn = String

type AttributeName = String

type AttributeValue = String

type Attributes = StringDictionary[AttributeValue]

type BandwidthAllocation = Double

type Boolean = scala.Boolean

type CampaignArn = String

type CampaignId = String

type CampaignName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Initialized_
  - typingsJapgolly.awsSdk.awsSdkStrings.Running_
  - typingsJapgolly.awsSdk.awsSdkStrings.Paused_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type CampaignState = _CampaignState | String

type CampaignSummaryList = js.Array[CampaignSummary]

type ClientToken = String

type ContactFlowId = String

type DestinationPhoneNumber = String

type DialRequestId = String

type DialRequestList = js.Array[DialRequest]

type Enabled = scala.Boolean

type EncryptionKey = String

type EncryptionType = KMS | String

type FailedCampaignStateResponseList = js.Array[FailedCampaignStateResponse]

type FailedRequestList = js.Array[FailedRequest]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidInput
  - typingsJapgolly.awsSdk.awsSdkStrings.RequestThrottled
  - typingsJapgolly.awsSdk.awsSdkStrings.UnknownError
  - java.lang.String
*/
type FailureCode = _FailureCode | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceNotFound
  - typingsJapgolly.awsSdk.awsSdkStrings.UnknownError
  - java.lang.String
*/
type GetCampaignStateBatchFailureCode = _GetCampaignStateBatchFailureCode | String

type GetCampaignStateBatchRequestCampaignIdsList = js.Array[CampaignId]

type InstanceId = String

type InstanceIdFilterOperator = Eq_ | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EVENT_BRIDGE_ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.EVENT_BRIDGE_MANAGED_RULE_LIMIT_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM_ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.KMS_ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.KMS_KEY_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_FAILURE
  - java.lang.String
*/
type InstanceOnboardingJobFailureCode = _InstanceOnboardingJobFailureCode | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type InstanceOnboardingJobStatusCode = _InstanceOnboardingJobStatusCode | String

type MaxResults = Double

type NextToken = String

type QueueId = String

type ServiceLinkedRoleArn = String

type SourcePhoneNumber = String

type SuccessfulCampaignStateResponseList = js.Array[SuccessfulCampaignStateResponse]

type SuccessfulRequestList = js.Array[SuccessfulRequest]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type TimeStamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2021-01-30`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
