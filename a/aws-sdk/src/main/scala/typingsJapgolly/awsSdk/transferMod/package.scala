package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transferMod {
  type AddressAllocationId = java.lang.String
  type AddressAllocationIds = js.Array[typingsJapgolly.awsSdk.transferMod.AddressAllocationId]
  type Arn = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.transferMod.ClientApiVersions
  type DateImported = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PUBLIC
    - typingsJapgolly.awsSdk.awsSdkStrings.VPC
    - typingsJapgolly.awsSdk.awsSdkStrings.VPC_ENDPOINT
    - java.lang.String
  */
  type EndpointType = typingsJapgolly.awsSdk.transferMod._EndpointType | java.lang.String
  type HomeDirectory = java.lang.String
  type HomeDirectoryMappings = js.Array[typingsJapgolly.awsSdk.transferMod.HomeDirectoryMapEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PATH
    - typingsJapgolly.awsSdk.awsSdkStrings.LOGICAL
    - java.lang.String
  */
  type HomeDirectoryType = typingsJapgolly.awsSdk.transferMod._HomeDirectoryType | java.lang.String
  type HostKey = java.lang.String
  type HostKeyFingerprint = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_MANAGED
    - typingsJapgolly.awsSdk.awsSdkStrings.API_GATEWAY
    - java.lang.String
  */
  type IdentityProviderType = typingsJapgolly.awsSdk.transferMod._IdentityProviderType | java.lang.String
  type ListedServers = js.Array[typingsJapgolly.awsSdk.transferMod.ListedServer]
  type ListedUsers = js.Array[typingsJapgolly.awsSdk.transferMod.ListedUser]
  type MapEntry = java.lang.String
  type MapTarget = java.lang.String
  type MaxResults = scala.Double
  type Message = java.lang.String
  type NextToken = java.lang.String
  type NullableRole = java.lang.String
  type Policy = java.lang.String
  type Response = java.lang.String
  type Role = java.lang.String
  type ServerId = java.lang.String
  type SshPublicKeyBody = java.lang.String
  type SshPublicKeyCount = scala.Double
  type SshPublicKeyId = java.lang.String
  type SshPublicKeys = js.Array[typingsJapgolly.awsSdk.transferMod.SshPublicKey]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OFFLINE
    - typingsJapgolly.awsSdk.awsSdkStrings.ONLINE
    - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
    - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
    - typingsJapgolly.awsSdk.awsSdkStrings.START_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.STOP_FAILED
    - java.lang.String
  */
  type State = typingsJapgolly.awsSdk.transferMod._State | java.lang.String
  type StatusCode = scala.Double
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[typingsJapgolly.awsSdk.transferMod.SubnetId]
  type TagKey = java.lang.String
  type TagKeys = js.Array[typingsJapgolly.awsSdk.transferMod.TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[typingsJapgolly.awsSdk.transferMod.Tag]
  type Url = java.lang.String
  type UserCount = scala.Double
  type UserName = java.lang.String
  type UserPassword = java.lang.String
  type VpcEndpointId = java.lang.String
  type VpcId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-11-05`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.transferMod._apiVersion | java.lang.String
}
