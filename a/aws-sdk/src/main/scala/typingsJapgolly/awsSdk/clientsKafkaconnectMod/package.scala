package typingsJapgolly.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ConnectorState = _ConnectorState | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.JAR
  - typingsJapgolly.awsSdk.awsSdkStrings.ZIP
  - java.lang.String
*/
type CustomPluginContentType = _CustomPluginContentType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type CustomPluginState = _CustomPluginState | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM
  - java.lang.String
*/
type KafkaClusterClientAuthenticationType = _KafkaClusterClientAuthenticationType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PLAINTEXT
  - typingsJapgolly.awsSdk.awsSdkStrings.TLS
  - java.lang.String
*/
type KafkaClusterEncryptionInTransitType = _KafkaClusterEncryptionInTransitType | String

type MaxResults = Double

type SyntheticCreateConnectorRequestMapOfString = StringDictionary[string]

type SyntheticCreateWorkerConfigurationRequestString = String

type SyntheticDescribeConnectorResponseMapOfString = StringDictionary[string]

type SyntheticWorkerConfigurationRevisionDescriptionString = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2021-09-14`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type boolean = Boolean

type integer = Double

type integerMin1Max10 = Double

type integerMin1Max100 = Double

type integerMin1Max8 = Double

type listOfConnectorSummary = js.Array[ConnectorSummary]

type listOfCustomPluginSummary = js.Array[CustomPluginSummary]

type listOfPlugin = js.Array[Plugin]

type listOfPluginDescription = js.Array[PluginDescription]

type listOfString = js.Array[string]

type listOfWorkerConfigurationSummary = js.Array[WorkerConfigurationSummary]

type long = Double

type longMin1 = Double

type string = String

type stringMax1024 = String

type stringMin1Max128 = String

type timestampIso8601 = js.Date
