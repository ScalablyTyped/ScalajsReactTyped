package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ramMod {
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.ramMod.ClientApiVersions
  type DateTime = js.Date
  type Integer = scala.Double
  type MaxResults = scala.Double
  type PermissionArnList = js.Array[typingsJapgolly.awsSdk.ramMod.String]
  type Policy = java.lang.String
  type PolicyList = js.Array[typingsJapgolly.awsSdk.ramMod.Policy]
  type PrincipalArnOrIdList = js.Array[typingsJapgolly.awsSdk.ramMod.String]
  type PrincipalList = js.Array[typingsJapgolly.awsSdk.ramMod.Principal]
  type ResourceArnList = js.Array[typingsJapgolly.awsSdk.ramMod.String]
  type ResourceList = js.Array[typingsJapgolly.awsSdk.ramMod.Resource]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SELF
    - typingsJapgolly.awsSdk.awsSdkStrings.`OTHER-ACCOUNTS`
    - java.lang.String
  */
  type ResourceOwner = typingsJapgolly.awsSdk.ramMod._ResourceOwner | java.lang.String
  type ResourceShareArnList = js.Array[typingsJapgolly.awsSdk.ramMod.String]
  type ResourceShareAssociationList = js.Array[typingsJapgolly.awsSdk.ramMod.ResourceShareAssociation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ASSOCIATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ASSOCIATED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISASSOCIATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DISASSOCIATED
    - java.lang.String
  */
  type ResourceShareAssociationStatus = typingsJapgolly.awsSdk.ramMod._ResourceShareAssociationStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PRINCIPAL
    - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE
    - java.lang.String
  */
  type ResourceShareAssociationType = typingsJapgolly.awsSdk.ramMod._ResourceShareAssociationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATED_FROM_POLICY
    - typingsJapgolly.awsSdk.awsSdkStrings.PROMOTING_TO_STANDARD
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
    - java.lang.String
  */
  type ResourceShareFeatureSet = typingsJapgolly.awsSdk.ramMod._ResourceShareFeatureSet | java.lang.String
  type ResourceShareInvitationArnList = js.Array[typingsJapgolly.awsSdk.ramMod.String]
  type ResourceShareInvitationList = js.Array[typingsJapgolly.awsSdk.ramMod.ResourceShareInvitation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCEPTED
    - typingsJapgolly.awsSdk.awsSdkStrings.REJECTED
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
    - java.lang.String
  */
  type ResourceShareInvitationStatus = typingsJapgolly.awsSdk.ramMod._ResourceShareInvitationStatus | java.lang.String
  type ResourceShareList = js.Array[typingsJapgolly.awsSdk.ramMod.ResourceShare]
  type ResourceSharePermissionList = js.Array[typingsJapgolly.awsSdk.ramMod.ResourceSharePermissionSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type ResourceShareStatus = typingsJapgolly.awsSdk.ramMod._ResourceShareStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.ZONAL_RESOURCE_INACCESSIBLE
    - typingsJapgolly.awsSdk.awsSdkStrings.LIMIT_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.UNAVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type ResourceStatus = typingsJapgolly.awsSdk.ramMod._ResourceStatus | java.lang.String
  type String = java.lang.String
  type TagFilters = js.Array[typingsJapgolly.awsSdk.ramMod.TagFilter]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.ramMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.ramMod.Tag]
  type TagValue = java.lang.String
  type TagValueList = js.Array[typingsJapgolly.awsSdk.ramMod.TagValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-01-04`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.ramMod._apiVersion | java.lang.String
}
