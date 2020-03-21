package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object workmailMod {
  type AccessControlRuleAction = java.lang.String
  type AccessControlRuleDescription = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW
    - typingsJapgolly.awsSdk.awsSdkStrings.DENY
    - java.lang.String
  */
  type AccessControlRuleEffect = typingsJapgolly.awsSdk.workmailMod._AccessControlRuleEffect | java.lang.String
  type AccessControlRuleName = java.lang.String
  type AccessControlRuleNameList = js.Array[typingsJapgolly.awsSdk.workmailMod.AccessControlRuleName]
  type AccessControlRulesList = js.Array[typingsJapgolly.awsSdk.workmailMod.AccessControlRule]
  type ActionsList = js.Array[typingsJapgolly.awsSdk.workmailMod.AccessControlRuleAction]
  type Aliases = js.Array[typingsJapgolly.awsSdk.workmailMod.EmailAddress]
  type AmazonResourceName = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.workmailMod.ClientApiVersions
  type EmailAddress = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type EntityState = typingsJapgolly.awsSdk.workmailMod._EntityState | java.lang.String
  type GroupName = java.lang.String
  type Groups = js.Array[typingsJapgolly.awsSdk.workmailMod.Group]
  type IpAddress = java.lang.String
  type IpRange = java.lang.String
  type IpRangeList = js.Array[typingsJapgolly.awsSdk.workmailMod.IpRange]
  type MailboxQuota = scala.Double
  type MailboxSize = scala.Double
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GROUP
    - typingsJapgolly.awsSdk.awsSdkStrings.USER
    - java.lang.String
  */
  type MemberType = typingsJapgolly.awsSdk.workmailMod._MemberType | java.lang.String
  type Members = js.Array[typingsJapgolly.awsSdk.workmailMod.Member]
  type NextToken = java.lang.String
  type OrganizationId = java.lang.String
  type OrganizationName = java.lang.String
  type OrganizationSummaries = js.Array[typingsJapgolly.awsSdk.workmailMod.OrganizationSummary]
  type Password = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FULL_ACCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.SEND_AS
    - typingsJapgolly.awsSdk.awsSdkStrings.SEND_ON_BEHALF
    - java.lang.String
  */
  type PermissionType = typingsJapgolly.awsSdk.workmailMod._PermissionType | java.lang.String
  type PermissionValues = js.Array[typingsJapgolly.awsSdk.workmailMod.PermissionType]
  type Permissions = js.Array[typingsJapgolly.awsSdk.workmailMod.Permission]
  type ResourceDelegates = js.Array[typingsJapgolly.awsSdk.workmailMod.Delegate]
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ROOM
    - typingsJapgolly.awsSdk.awsSdkStrings.EQUIPMENT
    - java.lang.String
  */
  type ResourceType = typingsJapgolly.awsSdk.workmailMod._ResourceType | java.lang.String
  type Resources = js.Array[typingsJapgolly.awsSdk.workmailMod.Resource]
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.workmailMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.workmailMod.Tag]
  type TagValue = java.lang.String
  type Timestamp = js.Date
  type UserIdList = js.Array[typingsJapgolly.awsSdk.workmailMod.WorkMailIdentifier]
  type UserName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.USER
    - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE
    - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM_USER
    - java.lang.String
  */
  type UserRole = typingsJapgolly.awsSdk.workmailMod._UserRole | java.lang.String
  type Users = js.Array[typingsJapgolly.awsSdk.workmailMod.User]
  type WorkMailIdentifier = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-10-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.workmailMod._apiVersion | java.lang.String
}
