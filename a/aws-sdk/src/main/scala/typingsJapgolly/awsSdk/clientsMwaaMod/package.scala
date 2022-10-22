package typingsJapgolly.awsSdk.clientsMwaaMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AirflowConfigurationOptions = StringDictionary[ConfigValue]

type AirflowVersion = java.lang.String

type CloudWatchLogGroupArn = java.lang.String

type ConfigKey = java.lang.String

type ConfigValue = java.lang.String

type CreatedAt = js.Date

type Dimensions = js.Array[Dimension]

type Double = scala.Double

type EnvironmentArn = java.lang.String

type EnvironmentClass = java.lang.String

type EnvironmentList = js.Array[EnvironmentName]

type EnvironmentName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.UNAVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type EnvironmentStatus = _EnvironmentStatus | java.lang.String

type ErrorCode = java.lang.String

type ErrorMessage = java.lang.String

type Hostname = java.lang.String

type IamRoleArn = java.lang.String

type Integer = scala.Double

type KmsKey = java.lang.String

type ListEnvironmentsInputMaxResultsInteger = scala.Double

type LoggingEnabled = Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CRITICAL
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.WARNING
  - typingsJapgolly.awsSdk.awsSdkStrings.INFO
  - typingsJapgolly.awsSdk.awsSdkStrings.DEBUG
  - java.lang.String
*/
type LoggingLevel = _LoggingLevel | java.lang.String

type MaxWorkers = scala.Double

type MetricData = js.Array[MetricDatum]

type MinWorkers = scala.Double

type NextToken = java.lang.String

type RelativePath = java.lang.String

type S3BucketArn = java.lang.String

type S3ObjectVersion = java.lang.String

type Schedulers = scala.Double

type SecurityGroupId = java.lang.String

type SecurityGroupList = js.Array[SecurityGroupId]

type String = java.lang.String

type SubnetId = java.lang.String

type SubnetList = js.Array[SubnetId]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type Timestamp = js.Date

type Token = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Seconds_
  - typingsJapgolly.awsSdk.awsSdkStrings.Microseconds_
  - typingsJapgolly.awsSdk.awsSdkStrings.Milliseconds_
  - typingsJapgolly.awsSdk.awsSdkStrings.Bytes_
  - typingsJapgolly.awsSdk.awsSdkStrings.Kilobytes
  - typingsJapgolly.awsSdk.awsSdkStrings.Megabytes
  - typingsJapgolly.awsSdk.awsSdkStrings.Gigabytes
  - typingsJapgolly.awsSdk.awsSdkStrings.Terabytes_
  - typingsJapgolly.awsSdk.awsSdkStrings.Bits_
  - typingsJapgolly.awsSdk.awsSdkStrings.Kilobits
  - typingsJapgolly.awsSdk.awsSdkStrings.Megabits
  - typingsJapgolly.awsSdk.awsSdkStrings.Gigabits
  - typingsJapgolly.awsSdk.awsSdkStrings.Terabits
  - typingsJapgolly.awsSdk.awsSdkStrings.Percent_
  - typingsJapgolly.awsSdk.awsSdkStrings.Count_
  - typingsJapgolly.awsSdk.awsSdkStrings.BytesSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.KilobytesSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.MegabytesSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.GigabytesSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.TerabytesSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.BitsSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.KilobitsSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.MegabitsSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.GigabitsSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.TerabitsSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.CountSlashSecond
  - typingsJapgolly.awsSdk.awsSdkStrings.None_
  - java.lang.String
*/
type Unit = _Unit | java.lang.String

type UpdateCreatedAt = js.Date

type UpdateSource = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type UpdateStatus = _UpdateStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.PUBLIC_ONLY
  - java.lang.String
*/
type WebserverAccessMode = _WebserverAccessMode | java.lang.String

type WebserverUrl = java.lang.String

type WeeklyMaintenanceWindowStart = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-07-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
