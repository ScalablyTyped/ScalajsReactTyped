package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object managedblockchainMod {
  type AvailabilityZoneString = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.managedblockchainMod.ClientApiVersions
  type ClientRequestTokenString = java.lang.String
  type DescriptionString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STARTER
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
    - java.lang.String
  */
  type Edition = typingsJapgolly.awsSdk.managedblockchainMod._Edition | java.lang.String
  type Framework = typingsJapgolly.awsSdk.awsSdkStrings.HYPERLEDGER_FABRIC | java.lang.String
  type FrameworkVersionString = java.lang.String
  type InstanceTypeString = java.lang.String
  type InvitationList = js.Array[typingsJapgolly.awsSdk.managedblockchainMod.Invitation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCEPTED
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCEPTING
    - typingsJapgolly.awsSdk.awsSdkStrings.REJECTED
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
    - java.lang.String
  */
  type InvitationStatus = typingsJapgolly.awsSdk.managedblockchainMod._InvitationStatus | java.lang.String
  type InviteActionList = js.Array[typingsJapgolly.awsSdk.managedblockchainMod.InviteAction]
  type IsOwned = scala.Boolean
  type MemberListMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type MemberStatus = typingsJapgolly.awsSdk.managedblockchainMod._MemberStatus | java.lang.String
  type MemberSummaryList = js.Array[typingsJapgolly.awsSdk.managedblockchainMod.MemberSummary]
  type NameString = java.lang.String
  type NetworkListMaxResults = scala.Double
  type NetworkMemberNameString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type NetworkStatus = typingsJapgolly.awsSdk.managedblockchainMod._NetworkStatus | java.lang.String
  type NetworkSummaryList = js.Array[typingsJapgolly.awsSdk.managedblockchainMod.NetworkSummary]
  type NodeListMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type NodeStatus = typingsJapgolly.awsSdk.managedblockchainMod._NodeStatus | java.lang.String
  type NodeSummaryList = js.Array[typingsJapgolly.awsSdk.managedblockchainMod.NodeSummary]
  type PaginationToken = java.lang.String
  type PasswordString = java.lang.String
  type PrincipalString = java.lang.String
  type ProposalDurationInt = scala.Double
  type ProposalListMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.APPROVED
    - typingsJapgolly.awsSdk.awsSdkStrings.REJECTED
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTION_FAILED
    - java.lang.String
  */
  type ProposalStatus = typingsJapgolly.awsSdk.managedblockchainMod._ProposalStatus | java.lang.String
  type ProposalSummaryList = js.Array[typingsJapgolly.awsSdk.managedblockchainMod.ProposalSummary]
  type ProposalVoteList = js.Array[typingsJapgolly.awsSdk.managedblockchainMod.VoteSummary]
  type RemoveActionList = js.Array[typingsJapgolly.awsSdk.managedblockchainMod.RemoveAction]
  type ResourceIdString = java.lang.String
  type String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN
    - typingsJapgolly.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL_TO
    - java.lang.String
  */
  type ThresholdComparator = typingsJapgolly.awsSdk.managedblockchainMod._ThresholdComparator | java.lang.String
  type ThresholdPercentageInt = scala.Double
  type Timestamp = js.Date
  type UsernameString = java.lang.String
  type VoteCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.YES
    - typingsJapgolly.awsSdk.awsSdkStrings.NO
    - java.lang.String
  */
  type VoteValue = typingsJapgolly.awsSdk.managedblockchainMod._VoteValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-09-24`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.managedblockchainMod._apiVersion | java.lang.String
}
