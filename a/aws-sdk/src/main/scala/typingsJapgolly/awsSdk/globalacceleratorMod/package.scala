package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object globalacceleratorMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEPLOYED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - java.lang.String
  */
  type AcceleratorStatus = typingsJapgolly.awsSdk.globalacceleratorMod._AcceleratorStatus | java.lang.String
  type Accelerators = js.Array[typingsJapgolly.awsSdk.globalacceleratorMod.Accelerator]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.SOURCE_IP
    - java.lang.String
  */
  type ClientAffinity = typingsJapgolly.awsSdk.globalacceleratorMod._ClientAffinity | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.globalacceleratorMod.ClientApiVersions
  type EndpointConfigurations = js.Array[typingsJapgolly.awsSdk.globalacceleratorMod.EndpointConfiguration]
  type EndpointDescriptions = js.Array[typingsJapgolly.awsSdk.globalacceleratorMod.EndpointDescription]
  type EndpointGroups = js.Array[typingsJapgolly.awsSdk.globalacceleratorMod.EndpointGroup]
  type EndpointWeight = scala.Double
  type GenericBoolean = scala.Boolean
  type GenericString = java.lang.String
  type HealthCheckIntervalSeconds = scala.Double
  type HealthCheckPort = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TCP
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTP
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTPS
    - java.lang.String
  */
  type HealthCheckProtocol = typingsJapgolly.awsSdk.globalacceleratorMod._HealthCheckProtocol | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INITIAL
    - typingsJapgolly.awsSdk.awsSdkStrings.HEALTHY
    - typingsJapgolly.awsSdk.awsSdkStrings.UNHEALTHY
    - java.lang.String
  */
  type HealthState = typingsJapgolly.awsSdk.globalacceleratorMod._HealthState | java.lang.String
  type IdempotencyToken = java.lang.String
  type IpAddress = java.lang.String
  type IpAddressType = typingsJapgolly.awsSdk.awsSdkStrings.IPV4 | java.lang.String
  type IpAddresses = js.Array[typingsJapgolly.awsSdk.globalacceleratorMod.IpAddress]
  type IpSets = js.Array[typingsJapgolly.awsSdk.globalacceleratorMod.IpSet]
  type Listeners = js.Array[typingsJapgolly.awsSdk.globalacceleratorMod.Listener]
  type MaxResults = scala.Double
  type PortNumber = scala.Double
  type PortRanges = js.Array[typingsJapgolly.awsSdk.globalacceleratorMod.PortRange]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TCP
    - typingsJapgolly.awsSdk.awsSdkStrings.UDP
    - java.lang.String
  */
  type Protocol = typingsJapgolly.awsSdk.globalacceleratorMod._Protocol | java.lang.String
  type ThresholdCount = scala.Double
  type Timestamp = js.Date
  type TrafficDialPercentage = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-08-08`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.globalacceleratorMod._apiVersion | java.lang.String
}
