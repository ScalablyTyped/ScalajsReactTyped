package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mediaconnectMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.aes128_
    - typingsJapgolly.awsSdk.awsSdkStrings.aes192
    - typingsJapgolly.awsSdk.awsSdkStrings.aes256_
    - java.lang.String
  */
  type Algorithm = typingsJapgolly.awsSdk.mediaconnectMod._Algorithm | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.mediaconnectMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.speke_
    - typingsJapgolly.awsSdk.awsSdkStrings.`static-key`
    - java.lang.String
  */
  type KeyType = typingsJapgolly.awsSdk.mediaconnectMod._KeyType | java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`zixi-push`
    - typingsJapgolly.awsSdk.awsSdkStrings.`rtp-fec`
    - typingsJapgolly.awsSdk.awsSdkStrings.rtp
    - typingsJapgolly.awsSdk.awsSdkStrings.`zixi-pull`
    - typingsJapgolly.awsSdk.awsSdkStrings.rist
    - java.lang.String
  */
  type Protocol = typingsJapgolly.awsSdk.mediaconnectMod._Protocol | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OWNED
    - typingsJapgolly.awsSdk.awsSdkStrings.ENTITLED
    - java.lang.String
  */
  type SourceType = typingsJapgolly.awsSdk.mediaconnectMod._SourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDBY
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type Status = typingsJapgolly.awsSdk.mediaconnectMod._Status | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-11-14`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.mediaconnectMod._apiVersion | java.lang.String
  type integer = scala.Double
  type listOfAddOutputRequest = js.Array[typingsJapgolly.awsSdk.mediaconnectMod.AddOutputRequest]
  type listOfEntitlement = js.Array[typingsJapgolly.awsSdk.mediaconnectMod.Entitlement]
  type listOfGrantEntitlementRequest = js.Array[typingsJapgolly.awsSdk.mediaconnectMod.GrantEntitlementRequest]
  type listOfListedEntitlement = js.Array[typingsJapgolly.awsSdk.mediaconnectMod.ListedEntitlement]
  type listOfListedFlow = js.Array[typingsJapgolly.awsSdk.mediaconnectMod.ListedFlow]
  type listOfOutput = js.Array[typingsJapgolly.awsSdk.mediaconnectMod.Output]
  type listOfString = js.Array[typingsJapgolly.awsSdk.mediaconnectMod.string]
  type mapOfString = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.mediaconnectMod.string]
  type string = java.lang.String
}
