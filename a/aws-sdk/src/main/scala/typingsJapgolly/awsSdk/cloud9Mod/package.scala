package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloud9Mod {
  type AutomaticStopTimeMinutes = scala.Double
  type BoundedEnvironmentIdList = js.Array[typingsJapgolly.awsSdk.cloud9Mod.EnvironmentId]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.cloud9Mod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type EnvironmentDescription = java.lang.String
  type EnvironmentId = java.lang.String
  type EnvironmentIdList = js.Array[typingsJapgolly.awsSdk.cloud9Mod.EnvironmentId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type EnvironmentLifecycleStatus = typingsJapgolly.awsSdk.cloud9Mod._EnvironmentLifecycleStatus | java.lang.String
  type EnvironmentList = js.Array[typingsJapgolly.awsSdk.cloud9Mod.Environment]
  type EnvironmentMembersList = js.Array[typingsJapgolly.awsSdk.cloud9Mod.EnvironmentMember]
  type EnvironmentName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.error__
    - typingsJapgolly.awsSdk.awsSdkStrings.creating__
    - typingsJapgolly.awsSdk.awsSdkStrings.connecting__
    - typingsJapgolly.awsSdk.awsSdkStrings.ready__
    - typingsJapgolly.awsSdk.awsSdkStrings.stopping__
    - typingsJapgolly.awsSdk.awsSdkStrings.stopped__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - java.lang.String
  */
  type EnvironmentStatus = typingsJapgolly.awsSdk.cloud9Mod._EnvironmentStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ssh_
    - typingsJapgolly.awsSdk.awsSdkStrings.ec2_
    - java.lang.String
  */
  type EnvironmentType = typingsJapgolly.awsSdk.cloud9Mod._EnvironmentType | java.lang.String
  type InstanceType = java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`read-write`
    - typingsJapgolly.awsSdk.awsSdkStrings.`read-only`
    - java.lang.String
  */
  type MemberPermissions = typingsJapgolly.awsSdk.cloud9Mod._MemberPermissions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.owner__
    - typingsJapgolly.awsSdk.awsSdkStrings.`read-write`
    - typingsJapgolly.awsSdk.awsSdkStrings.`read-only`
    - java.lang.String
  */
  type Permissions = typingsJapgolly.awsSdk.cloud9Mod._Permissions | java.lang.String
  type PermissionsList = js.Array[typingsJapgolly.awsSdk.cloud9Mod.Permissions]
  type String = java.lang.String
  type SubnetId = java.lang.String
  type Timestamp = js.Date
  type UserArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-09-23`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.cloud9Mod._apiVersion | java.lang.String
}
