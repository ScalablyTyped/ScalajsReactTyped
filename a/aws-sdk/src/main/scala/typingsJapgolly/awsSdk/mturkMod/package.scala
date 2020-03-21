package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mturkMod {
  type AssignmentList = js.Array[typingsJapgolly.awsSdk.mturkMod.Assignment]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Submitted_
    - typingsJapgolly.awsSdk.awsSdkStrings.Approved_
    - typingsJapgolly.awsSdk.awsSdkStrings.Rejected_
    - java.lang.String
  */
  type AssignmentStatus = typingsJapgolly.awsSdk.mturkMod._AssignmentStatus | java.lang.String
  type AssignmentStatusList = js.Array[typingsJapgolly.awsSdk.mturkMod.AssignmentStatus]
  type BonusPaymentList = js.Array[typingsJapgolly.awsSdk.mturkMod.BonusPayment]
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.mturkMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.LessThan
    - typingsJapgolly.awsSdk.awsSdkStrings.LessThanOrEqualTo
    - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThan
    - typingsJapgolly.awsSdk.awsSdkStrings.GreaterThanOrEqualTo
    - typingsJapgolly.awsSdk.awsSdkStrings.EqualTo
    - typingsJapgolly.awsSdk.awsSdkStrings.NotEqualTo
    - typingsJapgolly.awsSdk.awsSdkStrings.Exists
    - typingsJapgolly.awsSdk.awsSdkStrings.DoesNotExist
    - typingsJapgolly.awsSdk.awsSdkStrings.In_
    - typingsJapgolly.awsSdk.awsSdkStrings.NotIn
    - java.lang.String
  */
  type Comparator = typingsJapgolly.awsSdk.mturkMod._Comparator | java.lang.String
  type CountryParameters = java.lang.String
  type CurrencyAmount = java.lang.String
  type CustomerId = java.lang.String
  type CustomerIdList = js.Array[typingsJapgolly.awsSdk.mturkMod.CustomerId]
  type EntityId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AssignmentAccepted
    - typingsJapgolly.awsSdk.awsSdkStrings.AssignmentAbandoned
    - typingsJapgolly.awsSdk.awsSdkStrings.AssignmentReturned
    - typingsJapgolly.awsSdk.awsSdkStrings.AssignmentSubmitted
    - typingsJapgolly.awsSdk.awsSdkStrings.AssignmentRejected
    - typingsJapgolly.awsSdk.awsSdkStrings.AssignmentApproved
    - typingsJapgolly.awsSdk.awsSdkStrings.HITCreated
    - typingsJapgolly.awsSdk.awsSdkStrings.HITExpired
    - typingsJapgolly.awsSdk.awsSdkStrings.HITReviewable
    - typingsJapgolly.awsSdk.awsSdkStrings.HITExtended
    - typingsJapgolly.awsSdk.awsSdkStrings.HITDisposed
    - typingsJapgolly.awsSdk.awsSdkStrings.Ping
    - java.lang.String
  */
  type EventType = typingsJapgolly.awsSdk.mturkMod._EventType | java.lang.String
  type EventTypeList = js.Array[typingsJapgolly.awsSdk.mturkMod.EventType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Accept_
    - typingsJapgolly.awsSdk.awsSdkStrings.PreviewAndAccept
    - typingsJapgolly.awsSdk.awsSdkStrings.DiscoverPreviewAndAccept
    - java.lang.String
  */
  type HITAccessActions = typingsJapgolly.awsSdk.mturkMod._HITAccessActions | java.lang.String
  type HITLayoutParameterList = js.Array[typingsJapgolly.awsSdk.mturkMod.HITLayoutParameter]
  type HITList = js.Array[typingsJapgolly.awsSdk.mturkMod.HIT]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NotReviewed
    - typingsJapgolly.awsSdk.awsSdkStrings.MarkedForReview
    - typingsJapgolly.awsSdk.awsSdkStrings.ReviewedAppropriate
    - typingsJapgolly.awsSdk.awsSdkStrings.ReviewedInappropriate
    - java.lang.String
  */
  type HITReviewStatus = typingsJapgolly.awsSdk.mturkMod._HITReviewStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Assignable
    - typingsJapgolly.awsSdk.awsSdkStrings.Unassignable
    - typingsJapgolly.awsSdk.awsSdkStrings.Reviewable
    - typingsJapgolly.awsSdk.awsSdkStrings.Reviewing
    - typingsJapgolly.awsSdk.awsSdkStrings.Disposed
    - java.lang.String
  */
  type HITStatus = typingsJapgolly.awsSdk.mturkMod._HITStatus | java.lang.String
  type IdempotencyToken = java.lang.String
  type Integer = scala.Double
  type IntegerList = js.Array[typingsJapgolly.awsSdk.mturkMod.Integer]
  type LocaleList = js.Array[typingsJapgolly.awsSdk.mturkMod.Locale]
  type Long = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Email_
    - typingsJapgolly.awsSdk.awsSdkStrings.SQS
    - typingsJapgolly.awsSdk.awsSdkStrings.SNS
    - java.lang.String
  */
  type NotificationTransport = typingsJapgolly.awsSdk.mturkMod._NotificationTransport | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SoftFailure
    - typingsJapgolly.awsSdk.awsSdkStrings.HardFailure
    - java.lang.String
  */
  type NotifyWorkersFailureCode = typingsJapgolly.awsSdk.mturkMod._NotifyWorkersFailureCode | java.lang.String
  type NotifyWorkersFailureStatusList = js.Array[typingsJapgolly.awsSdk.mturkMod.NotifyWorkersFailureStatus]
  type PaginationToken = java.lang.String
  type ParameterMapEntryList = js.Array[typingsJapgolly.awsSdk.mturkMod.ParameterMapEntry]
  type PolicyParameterList = js.Array[typingsJapgolly.awsSdk.mturkMod.PolicyParameter]
  type QualificationList = js.Array[typingsJapgolly.awsSdk.mturkMod.Qualification]
  type QualificationRequestList = js.Array[typingsJapgolly.awsSdk.mturkMod.QualificationRequest]
  type QualificationRequirementList = js.Array[typingsJapgolly.awsSdk.mturkMod.QualificationRequirement]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Granted
    - typingsJapgolly.awsSdk.awsSdkStrings.Revoked_
    - java.lang.String
  */
  type QualificationStatus = typingsJapgolly.awsSdk.mturkMod._QualificationStatus | java.lang.String
  type QualificationTypeList = js.Array[typingsJapgolly.awsSdk.mturkMod.QualificationType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Active_
    - typingsJapgolly.awsSdk.awsSdkStrings.Inactive_
    - java.lang.String
  */
  type QualificationTypeStatus = typingsJapgolly.awsSdk.mturkMod._QualificationTypeStatus | java.lang.String
  type ResultSize = scala.Double
  type ReviewActionDetailList = js.Array[typingsJapgolly.awsSdk.mturkMod.ReviewActionDetail]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Intended
    - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
    - java.lang.String
  */
  type ReviewActionStatus = typingsJapgolly.awsSdk.mturkMod._ReviewActionStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Assignment
    - typingsJapgolly.awsSdk.awsSdkStrings.HIT
    - java.lang.String
  */
  type ReviewPolicyLevel = typingsJapgolly.awsSdk.mturkMod._ReviewPolicyLevel | java.lang.String
  type ReviewPolicyLevelList = js.Array[typingsJapgolly.awsSdk.mturkMod.ReviewPolicyLevel]
  type ReviewResultDetailList = js.Array[typingsJapgolly.awsSdk.mturkMod.ReviewResultDetail]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Reviewable
    - typingsJapgolly.awsSdk.awsSdkStrings.Reviewing
    - java.lang.String
  */
  type ReviewableHITStatus = typingsJapgolly.awsSdk.mturkMod._ReviewableHITStatus | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.mturkMod.String]
  type Timestamp = js.Date
  type WorkerBlockList = js.Array[typingsJapgolly.awsSdk.mturkMod.WorkerBlock]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-01-17`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.mturkMod._apiVersion | java.lang.String
}
