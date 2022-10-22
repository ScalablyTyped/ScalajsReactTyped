package typingsJapgolly.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.BROKER
import typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BrokerAZDistribution = DEFAULT | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TLS
  - typingsJapgolly.awsSdk.awsSdkStrings.TLS_PLAINTEXT
  - typingsJapgolly.awsSdk.awsSdkStrings.PLAINTEXT
  - java.lang.String
*/
type ClientBroker = _ClientBroker | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.HEALING
  - typingsJapgolly.awsSdk.awsSdkStrings.MAINTENANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.REBOOTING_BROKER
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type ClusterState = _ClusterState | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PROVISIONED
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVERLESS
  - java.lang.String
*/
type ClusterType = _ClusterType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type ConfigurationState = _ConfigurationState | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
  - typingsJapgolly.awsSdk.awsSdkStrings.PER_BROKER
  - typingsJapgolly.awsSdk.awsSdkStrings.PER_TOPIC_PER_BROKER
  - typingsJapgolly.awsSdk.awsSdkStrings.PER_TOPIC_PER_PARTITION
  - java.lang.String
*/
type EnhancedMonitoring = _EnhancedMonitoring | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DEPRECATED
  - java.lang.String
*/
type KafkaVersionStatus = _KafkaVersionStatus | String

type MaxResults = Double

type NodeType = BROKER | String

type _Blob = Buffer | js.typedarray.Uint8Array | Blob | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-11-14`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type boolean = Boolean

type double = Double

type integer = Double

type integerMin1Max15 = Double

type integerMin1Max16384 = Double

type listOfBrokerEBSVolumeInfo = js.Array[BrokerEBSVolumeInfo]

type listOfCluster = js.Array[Cluster]

type listOfClusterInfo = js.Array[ClusterInfo]

type listOfClusterOperationInfo = js.Array[ClusterOperationInfo]

type listOfClusterOperationStep = js.Array[ClusterOperationStep]

type listOfCompatibleKafkaVersion = js.Array[CompatibleKafkaVersion]

type listOfConfiguration = js.Array[Configuration]

type listOfConfigurationRevision = js.Array[ConfigurationRevision]

type listOfKafkaVersion = js.Array[KafkaVersion]

type listOfNodeInfo = js.Array[NodeInfo]

type listOfString = js.Array[string]

type listOfUnprocessedScramSecret = js.Array[UnprocessedScramSecret]

type listOfVpcConfig = js.Array[VpcConfig]

type long = Double

type mapOfString = StringDictionary[string]

type string = String

type stringMin1Max128 = String

type stringMin1Max64 = String

type stringMin5Max32 = String

type timestampIso8601 = js.Date
