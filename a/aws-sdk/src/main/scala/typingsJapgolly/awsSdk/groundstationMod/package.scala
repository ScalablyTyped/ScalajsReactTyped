package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object groundstationMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEGREE_ANGLE
    - typingsJapgolly.awsSdk.awsSdkStrings.RADIAN
    - java.lang.String
  */
  type AngleUnits = typingsJapgolly.awsSdk.groundstationMod._AngleUnits | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GHz
    - typingsJapgolly.awsSdk.awsSdkStrings.MHz
    - typingsJapgolly.awsSdk.awsSdkStrings.kHz
    - java.lang.String
  */
  type BandwidthUnits = typingsJapgolly.awsSdk.groundstationMod._BandwidthUnits | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.groundstationMod.ClientApiVersions
  type ConfigArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`antenna-downlink`
    - typingsJapgolly.awsSdk.awsSdkStrings.`antenna-downlink-demod-decode`
    - typingsJapgolly.awsSdk.awsSdkStrings.`antenna-uplink`
    - typingsJapgolly.awsSdk.awsSdkStrings.`dataflow-endpoint`
    - typingsJapgolly.awsSdk.awsSdkStrings.tracking
    - typingsJapgolly.awsSdk.awsSdkStrings.`uplink-echo`
    - java.lang.String
  */
  type ConfigCapabilityType = typingsJapgolly.awsSdk.groundstationMod._ConfigCapabilityType | java.lang.String
  type ConfigList = js.Array[typingsJapgolly.awsSdk.groundstationMod.ConfigListItem]
  type ContactList = js.Array[typingsJapgolly.awsSdk.groundstationMod.ContactData]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS_CANCELLED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLING
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_TO_SCHEDULE
    - typingsJapgolly.awsSdk.awsSdkStrings.PASS
    - typingsJapgolly.awsSdk.awsSdkStrings.POSTPASS
    - typingsJapgolly.awsSdk.awsSdkStrings.PREPASS
    - typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULED
    - typingsJapgolly.awsSdk.awsSdkStrings.SCHEDULING
    - java.lang.String
  */
  type ContactStatus = typingsJapgolly.awsSdk.groundstationMod._ContactStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PREFERRED
    - typingsJapgolly.awsSdk.awsSdkStrings.REMOVED
    - typingsJapgolly.awsSdk.awsSdkStrings.REQUIRED
    - java.lang.String
  */
  type Criticality = typingsJapgolly.awsSdk.groundstationMod._Criticality | java.lang.String
  type DataflowEdge = js.Array[typingsJapgolly.awsSdk.groundstationMod.ConfigArn]
  type DataflowEdgeList = js.Array[typingsJapgolly.awsSdk.groundstationMod.DataflowEdge]
  type DataflowEndpointGroupArn = java.lang.String
  type DataflowEndpointGroupList = js.Array[typingsJapgolly.awsSdk.groundstationMod.DataflowEndpointListItem]
  type Double = scala.Double
  type DurationInSeconds = scala.Double
  type EirpUnits = typingsJapgolly.awsSdk.awsSdkStrings.dBW | java.lang.String
  type EndpointDetailsList = js.Array[typingsJapgolly.awsSdk.groundstationMod.EndpointDetails]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.created__
    - typingsJapgolly.awsSdk.awsSdkStrings.creating__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type EndpointStatus = typingsJapgolly.awsSdk.groundstationMod._EndpointStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GHz
    - typingsJapgolly.awsSdk.awsSdkStrings.MHz
    - typingsJapgolly.awsSdk.awsSdkStrings.kHz
    - java.lang.String
  */
  type FrequencyUnits = typingsJapgolly.awsSdk.groundstationMod._FrequencyUnits | java.lang.String
  type GroundStationIdList = js.Array[typingsJapgolly.awsSdk.groundstationMod.String]
  type GroundStationList = js.Array[typingsJapgolly.awsSdk.groundstationMod.GroundStationData]
  type Integer = scala.Double
  type JsonString = java.lang.String
  type MissionProfileArn = java.lang.String
  type MissionProfileList = js.Array[typingsJapgolly.awsSdk.groundstationMod.MissionProfileListItem]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.LEFT_HAND
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.RIGHT_HAND
    - java.lang.String
  */
  type Polarization = typingsJapgolly.awsSdk.groundstationMod._Polarization | java.lang.String
  type RoleArn = java.lang.String
  type SafeName = java.lang.String
  type SatelliteList = js.Array[typingsJapgolly.awsSdk.groundstationMod.SatelliteListItem]
  type SecurityGroupIdList = js.Array[typingsJapgolly.awsSdk.groundstationMod.String]
  type StatusList = js.Array[typingsJapgolly.awsSdk.groundstationMod.ContactStatus]
  type String = java.lang.String
  type SubnetList = js.Array[typingsJapgolly.awsSdk.groundstationMod.String]
  type TagKeys = js.Array[typingsJapgolly.awsSdk.groundstationMod.String]
  type TagsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.groundstationMod.String]
  type Timestamp = js.Date
  type Uuid = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2019-05-23`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.groundstationMod._apiVersion | java.lang.String
  type noradSatelliteID = scala.Double
  type satelliteArn = java.lang.String
}
