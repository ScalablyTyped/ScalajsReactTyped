package typingsJapgolly.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.dBW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEGREE_ANGLE
  - typingsJapgolly.awsSdk.awsSdkStrings.RADIAN
  - java.lang.String
*/
type AngleUnits = _AngleUnits | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GHz
  - typingsJapgolly.awsSdk.awsSdkStrings.MHz
  - typingsJapgolly.awsSdk.awsSdkStrings.kHz
  - java.lang.String
*/
type BandwidthUnits = _BandwidthUnits | java.lang.String

type Boolean = scala.Boolean

type BucketArn = java.lang.String

type ConfigArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`antenna-downlink`
  - typingsJapgolly.awsSdk.awsSdkStrings.`antenna-downlink-demod-decode`
  - typingsJapgolly.awsSdk.awsSdkStrings.`antenna-uplink`
  - typingsJapgolly.awsSdk.awsSdkStrings.`dataflow-endpoint`
  - typingsJapgolly.awsSdk.awsSdkStrings.tracking
  - typingsJapgolly.awsSdk.awsSdkStrings.`uplink-echo`
  - typingsJapgolly.awsSdk.awsSdkStrings.`s3-recording`
  - java.lang.String
*/
type ConfigCapabilityType = _ConfigCapabilityType | java.lang.String

type ConfigList = js.Array[ConfigListItem]

type ContactList = js.Array[ContactData]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_CANCELLED
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_FAILED
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
type ContactStatus = _ContactStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PREFERRED
  - typingsJapgolly.awsSdk.awsSdkStrings.REMOVED
  - typingsJapgolly.awsSdk.awsSdkStrings.REQUIRED
  - java.lang.String
*/
type Criticality = _Criticality | java.lang.String

type DataflowEdge = js.Array[ConfigArn]

type DataflowEdgeList = js.Array[DataflowEdge]

type DataflowEndpointGroupArn = java.lang.String

type DataflowEndpointGroupList = js.Array[DataflowEndpointListItem]

type DataflowEndpointMtuInteger = scala.Double

type DataflowList = js.Array[DataflowDetail]

type Double = scala.Double

type DurationInSeconds = scala.Double

type EirpUnits = dBW | java.lang.String

type EndpointDetailsList = js.Array[EndpointDetails]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.created__
  - typingsJapgolly.awsSdk.awsSdkStrings.creating__
  - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
  - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
  - typingsJapgolly.awsSdk.awsSdkStrings.failed__
  - java.lang.String
*/
type EndpointStatus = _EndpointStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GHz
  - typingsJapgolly.awsSdk.awsSdkStrings.MHz
  - typingsJapgolly.awsSdk.awsSdkStrings.kHz
  - java.lang.String
*/
type FrequencyUnits = _FrequencyUnits | java.lang.String

type GroundStationIdList = js.Array[String]

type GroundStationList = js.Array[GroundStationData]

type Integer = scala.Double

type JsonString = java.lang.String

type MissionProfileArn = java.lang.String

type MissionProfileList = js.Array[MissionProfileListItem]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LEFT_HAND
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.RIGHT_HAND
  - java.lang.String
*/
type Polarization = _Polarization | java.lang.String

type RoleArn = java.lang.String

type S3KeyPrefix = java.lang.String

type SafeName = java.lang.String

type SatelliteList = js.Array[SatelliteListItem]

type SecurityGroupIdList = js.Array[String]

type StatusList = js.Array[ContactStatus]

type String = java.lang.String

type SubnetList = js.Array[String]

type TagKeys = js.Array[String]

type TagsMap = StringDictionary[String]

type Timestamp = js.Date

type Uuid = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2019-05-23`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String

type noradSatelliteID = scala.Double

type satelliteArn = java.lang.String
