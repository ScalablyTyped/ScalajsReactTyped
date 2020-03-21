package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object serverlessapplicationrepositoryMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CAPABILITY_IAM
    - typingsJapgolly.awsSdk.awsSdkStrings.CAPABILITY_NAMED_IAM
    - typingsJapgolly.awsSdk.awsSdkStrings.CAPABILITY_AUTO_EXPAND
    - typingsJapgolly.awsSdk.awsSdkStrings.CAPABILITY_RESOURCE_POLICY
    - java.lang.String
  */
  type Capability = typingsJapgolly.awsSdk.serverlessapplicationrepositoryMod._Capability | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.serverlessapplicationrepositoryMod.ClientApiVersions
  type MaxItems = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PREPARING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
    - java.lang.String
  */
  type Status = typingsJapgolly.awsSdk.serverlessapplicationrepositoryMod._Status | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-09-08`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.serverlessapplicationrepositoryMod._apiVersion | java.lang.String
  type boolean = scala.Boolean
  type integer = scala.Double
  type listOfApplicationDependencySummary = js.Array[
    typingsJapgolly.awsSdk.serverlessapplicationrepositoryMod.ApplicationDependencySummary
  ]
  type listOfApplicationPolicyStatement = js.Array[
    typingsJapgolly.awsSdk.serverlessapplicationrepositoryMod.ApplicationPolicyStatement
  ]
  type listOfApplicationSummary = js.Array[typingsJapgolly.awsSdk.serverlessapplicationrepositoryMod.ApplicationSummary]
  type listOfCapability = js.Array[typingsJapgolly.awsSdk.serverlessapplicationrepositoryMod.Capability]
  type listOfParameterDefinition = js.Array[typingsJapgolly.awsSdk.serverlessapplicationrepositoryMod.ParameterDefinition]
  type listOfParameterValue = js.Array[typingsJapgolly.awsSdk.serverlessapplicationrepositoryMod.ParameterValue]
  type listOfRollbackTrigger = js.Array[typingsJapgolly.awsSdk.serverlessapplicationrepositoryMod.RollbackTrigger]
  type listOfString = js.Array[typingsJapgolly.awsSdk.serverlessapplicationrepositoryMod.string]
  type listOfTag = js.Array[typingsJapgolly.awsSdk.serverlessapplicationrepositoryMod.Tag]
  type listOfVersionSummary = js.Array[typingsJapgolly.awsSdk.serverlessapplicationrepositoryMod.VersionSummary]
  type string = java.lang.String
}
