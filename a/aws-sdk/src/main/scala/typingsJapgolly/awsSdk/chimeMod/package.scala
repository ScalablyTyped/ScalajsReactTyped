package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chimeMod {
  type AccountList = js.Array[typingsJapgolly.awsSdk.chimeMod.Account]
  type AccountName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Team
    - typingsJapgolly.awsSdk.awsSdkStrings.EnterpriseDirectory
    - typingsJapgolly.awsSdk.awsSdkStrings.EnterpriseLWA
    - typingsJapgolly.awsSdk.awsSdkStrings.EnterpriseOIDC
    - java.lang.String
  */
  type AccountType = typingsJapgolly.awsSdk.chimeMod._AccountType | java.lang.String
  type Arn = java.lang.String
  type AttendeeList = js.Array[typingsJapgolly.awsSdk.chimeMod.Attendee]
  type BatchCreateAttendeeErrorList = js.Array[typingsJapgolly.awsSdk.chimeMod.CreateAttendeeError]
  type Boolean = scala.Boolean
  type BotList = js.Array[typingsJapgolly.awsSdk.chimeMod.Bot]
  type BotType = typingsJapgolly.awsSdk.awsSdkStrings.ChatBot | java.lang.String
  type CallingName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Unassigned
    - typingsJapgolly.awsSdk.awsSdkStrings.UpdateInProgress
    - typingsJapgolly.awsSdk.awsSdkStrings.UpdateSucceeded
    - typingsJapgolly.awsSdk.awsSdkStrings.UpdateFailed
    - java.lang.String
  */
  type CallingNameStatus = typingsJapgolly.awsSdk.chimeMod._CallingNameStatus | java.lang.String
  type CallingRegion = java.lang.String
  type CallingRegionList = js.Array[typingsJapgolly.awsSdk.chimeMod.CallingRegion]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.chimeMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CpsLimit = scala.Double
  type CreateAttendeeRequestItemList = js.Array[typingsJapgolly.awsSdk.chimeMod.CreateAttendeeRequestItem]
  type CredentialList = js.Array[typingsJapgolly.awsSdk.chimeMod.Credential]
  type DataRetentionInHours = scala.Double
  type E164PhoneNumber = java.lang.String
  type E164PhoneNumberList = js.Array[typingsJapgolly.awsSdk.chimeMod.E164PhoneNumber]
  type EmailAddress = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NotSent
    - typingsJapgolly.awsSdk.awsSdkStrings.Sent
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type EmailStatus = typingsJapgolly.awsSdk.chimeMod._EmailStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BadRequest
    - typingsJapgolly.awsSdk.awsSdkStrings.Conflict_
    - typingsJapgolly.awsSdk.awsSdkStrings.Forbidden
    - typingsJapgolly.awsSdk.awsSdkStrings.NotFound
    - typingsJapgolly.awsSdk.awsSdkStrings.PreconditionFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.ResourceLimitExceeded
    - typingsJapgolly.awsSdk.awsSdkStrings.ServiceFailure
    - typingsJapgolly.awsSdk.awsSdkStrings.AccessDenied
    - typingsJapgolly.awsSdk.awsSdkStrings.ServiceUnavailable
    - typingsJapgolly.awsSdk.awsSdkStrings.Throttled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Unauthorized_
    - typingsJapgolly.awsSdk.awsSdkStrings.Unprocessable
    - typingsJapgolly.awsSdk.awsSdkStrings.VoiceConnectorGroupAssociationsExist
    - typingsJapgolly.awsSdk.awsSdkStrings.PhoneNumberAssociationsExist
    - java.lang.String
  */
  type ErrorCode = typingsJapgolly.awsSdk.chimeMod._ErrorCode | java.lang.String
  type ExternalUserIdType = java.lang.String
  type GuidString = java.lang.String
  type InviteList = js.Array[typingsJapgolly.awsSdk.chimeMod.Invite]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Accepted_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type InviteStatus = typingsJapgolly.awsSdk.chimeMod._InviteStatus | java.lang.String
  type Iso8601Timestamp = js.Date
  type JoinTokenString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Basic_
    - typingsJapgolly.awsSdk.awsSdkStrings.Plus
    - typingsJapgolly.awsSdk.awsSdkStrings.Pro
    - typingsJapgolly.awsSdk.awsSdkStrings.ProTrial
    - java.lang.String
  */
  type License = typingsJapgolly.awsSdk.chimeMod._License | java.lang.String
  type LicenseList = js.Array[typingsJapgolly.awsSdk.chimeMod.License]
  type MeetingList = js.Array[typingsJapgolly.awsSdk.chimeMod.Meeting]
  type MemberErrorList = js.Array[typingsJapgolly.awsSdk.chimeMod.MemberError]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.User_
    - typingsJapgolly.awsSdk.awsSdkStrings.Bot_
    - typingsJapgolly.awsSdk.awsSdkStrings.Webhook
    - java.lang.String
  */
  type MemberType = typingsJapgolly.awsSdk.chimeMod._MemberType | java.lang.String
  type MembershipItemList = js.Array[typingsJapgolly.awsSdk.chimeMod.MembershipItem]
  type NonEmptyString = java.lang.String
  type NonEmptyStringList = js.Array[typingsJapgolly.awsSdk.chimeMod.String]
  type NullableBoolean = scala.Boolean
  type OrderedPhoneNumberList = js.Array[typingsJapgolly.awsSdk.chimeMod.OrderedPhoneNumber]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Processing_
    - typingsJapgolly.awsSdk.awsSdkStrings.Acquired
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type OrderedPhoneNumberStatus = typingsJapgolly.awsSdk.chimeMod._OrderedPhoneNumberStatus | java.lang.String
  type OriginationRouteList = js.Array[typingsJapgolly.awsSdk.chimeMod.OriginationRoute]
  type OriginationRoutePriority = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TCP
    - typingsJapgolly.awsSdk.awsSdkStrings.UDP
    - java.lang.String
  */
  type OriginationRouteProtocol = typingsJapgolly.awsSdk.chimeMod._OriginationRouteProtocol | java.lang.String
  type OriginationRouteWeight = scala.Double
  type PhoneNumberAssociationList = js.Array[typingsJapgolly.awsSdk.chimeMod.PhoneNumberAssociation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AccountId
    - typingsJapgolly.awsSdk.awsSdkStrings.UserId
    - typingsJapgolly.awsSdk.awsSdkStrings.VoiceConnectorId
    - typingsJapgolly.awsSdk.awsSdkStrings.VoiceConnectorGroupId
    - java.lang.String
  */
  type PhoneNumberAssociationName = typingsJapgolly.awsSdk.chimeMod._PhoneNumberAssociationName | java.lang.String
  type PhoneNumberErrorList = js.Array[typingsJapgolly.awsSdk.chimeMod.PhoneNumberError]
  type PhoneNumberList = js.Array[typingsJapgolly.awsSdk.chimeMod.PhoneNumber]
  type PhoneNumberMaxResults = scala.Double
  type PhoneNumberOrderList = js.Array[typingsJapgolly.awsSdk.chimeMod.PhoneNumberOrder]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Processing_
    - typingsJapgolly.awsSdk.awsSdkStrings.Successful_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Partial_
    - java.lang.String
  */
  type PhoneNumberOrderStatus = typingsJapgolly.awsSdk.chimeMod._PhoneNumberOrderStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BusinessCalling
    - typingsJapgolly.awsSdk.awsSdkStrings.VoiceConnector
    - java.lang.String
  */
  type PhoneNumberProductType = typingsJapgolly.awsSdk.chimeMod._PhoneNumberProductType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AcquireInProgress
    - typingsJapgolly.awsSdk.awsSdkStrings.AcquireFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.Unassigned
    - typingsJapgolly.awsSdk.awsSdkStrings.Assigned_
    - typingsJapgolly.awsSdk.awsSdkStrings.ReleaseInProgress
    - typingsJapgolly.awsSdk.awsSdkStrings.DeleteInProgress
    - typingsJapgolly.awsSdk.awsSdkStrings.ReleaseFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.DeleteFailed
    - java.lang.String
  */
  type PhoneNumberStatus = typingsJapgolly.awsSdk.chimeMod._PhoneNumberStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Local_
    - typingsJapgolly.awsSdk.awsSdkStrings.TollFree
    - java.lang.String
  */
  type PhoneNumberType = typingsJapgolly.awsSdk.chimeMod._PhoneNumberType | java.lang.String
  type Port = scala.Double
  type ProfileServiceMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Unregistered
    - typingsJapgolly.awsSdk.awsSdkStrings.Registered_
    - typingsJapgolly.awsSdk.awsSdkStrings.Suspended_
    - java.lang.String
  */
  type RegistrationStatus = typingsJapgolly.awsSdk.chimeMod._RegistrationStatus | java.lang.String
  type ResultMax = scala.Double
  type RoomList = js.Array[typingsJapgolly.awsSdk.chimeMod.Room]
  type RoomMembershipList = js.Array[typingsJapgolly.awsSdk.chimeMod.RoomMembership]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Administrator
    - typingsJapgolly.awsSdk.awsSdkStrings.Member
    - java.lang.String
  */
  type RoomMembershipRole = typingsJapgolly.awsSdk.chimeMod._RoomMembershipRole | java.lang.String
  type SensitiveString = java.lang.String
  type SensitiveStringList = js.Array[typingsJapgolly.awsSdk.chimeMod.SensitiveString]
  type SigninDelegateGroupList = js.Array[typingsJapgolly.awsSdk.chimeMod.SigninDelegateGroup]
  type String = java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.chimeMod.String]
  type TollFreePrefix = java.lang.String
  type UpdatePhoneNumberRequestItemList = js.Array[typingsJapgolly.awsSdk.chimeMod.UpdatePhoneNumberRequestItem]
  type UpdateUserRequestItemList = js.Array[typingsJapgolly.awsSdk.chimeMod.UpdateUserRequestItem]
  type UriType = java.lang.String
  type UserEmailList = js.Array[typingsJapgolly.awsSdk.chimeMod.EmailAddress]
  type UserErrorList = js.Array[typingsJapgolly.awsSdk.chimeMod.UserError]
  type UserIdList = js.Array[typingsJapgolly.awsSdk.chimeMod.NonEmptyString]
  type UserList = js.Array[typingsJapgolly.awsSdk.chimeMod.User]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PrivateUser
    - typingsJapgolly.awsSdk.awsSdkStrings.SharedDevice
    - java.lang.String
  */
  type UserType = typingsJapgolly.awsSdk.chimeMod._UserType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-2`
    - java.lang.String
  */
  type VoiceConnectorAwsRegion = typingsJapgolly.awsSdk.chimeMod._VoiceConnectorAwsRegion | java.lang.String
  type VoiceConnectorGroupList = js.Array[typingsJapgolly.awsSdk.chimeMod.VoiceConnectorGroup]
  type VoiceConnectorGroupName = java.lang.String
  type VoiceConnectorItemList = js.Array[typingsJapgolly.awsSdk.chimeMod.VoiceConnectorItem]
  type VoiceConnectorItemPriority = scala.Double
  type VoiceConnectorList = js.Array[typingsJapgolly.awsSdk.chimeMod.VoiceConnector]
  type VoiceConnectorName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-05-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.chimeMod._apiVersion | java.lang.String
}
