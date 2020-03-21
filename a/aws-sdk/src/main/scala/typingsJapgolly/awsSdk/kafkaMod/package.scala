package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kafkaMod {
  type BrokerAZDistribution = typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TLS
    - typingsJapgolly.awsSdk.awsSdkStrings.TLS_PLAINTEXT
    - typingsJapgolly.awsSdk.awsSdkStrings.PLAINTEXT
    - java.lang.String
  */
  type ClientBroker = typingsJapgolly.awsSdk.kafkaMod._ClientBroker | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.kafkaMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ClusterState = typingsJapgolly.awsSdk.kafkaMod._ClusterState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
    - typingsJapgolly.awsSdk.awsSdkStrings.PER_BROKER
    - typingsJapgolly.awsSdk.awsSdkStrings.PER_TOPIC_PER_BROKER
    - java.lang.String
  */
  type EnhancedMonitoring = typingsJapgolly.awsSdk.kafkaMod._EnhancedMonitoring | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DEPRECATED
    - java.lang.String
  */
  type KafkaVersionStatus = typingsJapgolly.awsSdk.kafkaMod._KafkaVersionStatus | java.lang.String
  type MaxResults = scala.Double
  type NodeType = typingsJapgolly.awsSdk.awsSdkStrings.BROKER | java.lang.String
  type _Blob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.kafkaMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-11-14`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.kafkaMod._apiVersion | java.lang.String
  type boolean = scala.Boolean
  type double = scala.Double
  type integer = scala.Double
  type integerMin1Max15 = scala.Double
  type integerMin1Max16384 = scala.Double
  type listOfBrokerEBSVolumeInfo = js.Array[typingsJapgolly.awsSdk.kafkaMod.BrokerEBSVolumeInfo]
  type listOfClusterInfo = js.Array[typingsJapgolly.awsSdk.kafkaMod.ClusterInfo]
  type listOfClusterOperationInfo = js.Array[typingsJapgolly.awsSdk.kafkaMod.ClusterOperationInfo]
  type listOfConfiguration = js.Array[typingsJapgolly.awsSdk.kafkaMod.Configuration]
  type listOfConfigurationRevision = js.Array[typingsJapgolly.awsSdk.kafkaMod.ConfigurationRevision]
  type listOfKafkaVersion = js.Array[typingsJapgolly.awsSdk.kafkaMod.KafkaVersion]
  type listOfNodeInfo = js.Array[typingsJapgolly.awsSdk.kafkaMod.NodeInfo]
  type listOfString = js.Array[typingsJapgolly.awsSdk.kafkaMod.string]
  type long = scala.Double
  type mapOfString = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.kafkaMod.string]
  type string = java.lang.String
  type stringMin1Max128 = java.lang.String
  type stringMin1Max64 = java.lang.String
  type stringMin5Max32 = java.lang.String
  type timestampIso8601 = js.Date
}
