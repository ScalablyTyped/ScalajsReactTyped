package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object supportMod {
  type AfterTime = java.lang.String
  type AttachmentId = java.lang.String
  type AttachmentSet = js.Array[typingsJapgolly.awsSdk.supportMod.AttachmentDetails]
  type AttachmentSetId = java.lang.String
  type Attachments = js.Array[typingsJapgolly.awsSdk.supportMod.Attachment]
  type BeforeTime = java.lang.String
  type Boolean = scala.Boolean
  type CaseId = java.lang.String
  type CaseIdList = js.Array[typingsJapgolly.awsSdk.supportMod.CaseId]
  type CaseList = js.Array[typingsJapgolly.awsSdk.supportMod.CaseDetails]
  type CaseStatus = java.lang.String
  type CategoryCode = java.lang.String
  type CategoryList = js.Array[typingsJapgolly.awsSdk.supportMod.Category]
  type CategoryName = java.lang.String
  type CcEmailAddress = java.lang.String
  type CcEmailAddressList = js.Array[typingsJapgolly.awsSdk.supportMod.CcEmailAddress]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.supportMod.ClientApiVersions
  type CommunicationBody = java.lang.String
  type CommunicationList = js.Array[typingsJapgolly.awsSdk.supportMod.Communication]
  type Data = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.supportMod.Blob | java.lang.String
  type DisplayId = java.lang.String
  type Double = scala.Double
  type ExpiryTime = java.lang.String
  type FileName = java.lang.String
  type IncludeCommunications = scala.Boolean
  type IncludeResolvedCases = scala.Boolean
  type IssueType = java.lang.String
  type Language = java.lang.String
  type Long = scala.Double
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type Result = scala.Boolean
  type ServiceCode = java.lang.String
  type ServiceCodeList = js.Array[typingsJapgolly.awsSdk.supportMod.ServiceCode]
  type ServiceList = js.Array[typingsJapgolly.awsSdk.supportMod.Service]
  type ServiceName = java.lang.String
  type SeverityCode = java.lang.String
  type SeverityLevelCode = java.lang.String
  type SeverityLevelName = java.lang.String
  type SeverityLevelsList = js.Array[typingsJapgolly.awsSdk.supportMod.SeverityLevel]
  type Status = java.lang.String
  type String = java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.supportMod.String]
  type Subject = java.lang.String
  type SubmittedBy = java.lang.String
  type TimeCreated = java.lang.String
  type TrustedAdvisorCheckList = js.Array[typingsJapgolly.awsSdk.supportMod.TrustedAdvisorCheckDescription]
  type TrustedAdvisorCheckRefreshStatusList = js.Array[typingsJapgolly.awsSdk.supportMod.TrustedAdvisorCheckRefreshStatus]
  type TrustedAdvisorCheckSummaryList = js.Array[typingsJapgolly.awsSdk.supportMod.TrustedAdvisorCheckSummary]
  type TrustedAdvisorResourceDetailList = js.Array[typingsJapgolly.awsSdk.supportMod.TrustedAdvisorResourceDetail]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2013-04-15`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.supportMod._apiVersion | java.lang.String
}
