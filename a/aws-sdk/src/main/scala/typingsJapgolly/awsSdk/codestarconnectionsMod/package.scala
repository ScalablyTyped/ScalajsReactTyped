package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codestarconnectionsMod {
  type AccountId = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.codestarconnectionsMod.ClientApiVersions
  type ConnectionArn = java.lang.String
  type ConnectionList = js.Array[typingsJapgolly.awsSdk.codestarconnectionsMod.Connection]
  type ConnectionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type ConnectionStatus = typingsJapgolly.awsSdk.codestarconnectionsMod._ConnectionStatus | java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type ProviderType = typingsJapgolly.awsSdk.awsSdkStrings.Bitbucket_ | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-12-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.codestarconnectionsMod._apiVersion | java.lang.String
}
