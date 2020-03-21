package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object detectiveMod {
  type AccountId = java.lang.String
  type AccountIdList = js.Array[typingsJapgolly.awsSdk.detectiveMod.AccountId]
  type AccountList = js.Array[typingsJapgolly.awsSdk.detectiveMod.Account]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.detectiveMod.ClientApiVersions
  type EmailAddress = java.lang.String
  type EmailMessage = java.lang.String
  type GraphArn = java.lang.String
  type GraphList = js.Array[typingsJapgolly.awsSdk.detectiveMod.Graph]
  type MemberDetailList = js.Array[typingsJapgolly.awsSdk.detectiveMod.MemberDetail]
  type MemberResultsLimit = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INVITED
    - typingsJapgolly.awsSdk.awsSdkStrings.VERIFICATION_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.VERIFICATION_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - java.lang.String
  */
  type MemberStatus = typingsJapgolly.awsSdk.detectiveMod._MemberStatus | java.lang.String
  type PaginationToken = java.lang.String
  type Timestamp = js.Date
  type UnprocessedAccountList = js.Array[typingsJapgolly.awsSdk.detectiveMod.UnprocessedAccount]
  type UnprocessedReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-10-26`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.detectiveMod._apiVersion | java.lang.String
}
