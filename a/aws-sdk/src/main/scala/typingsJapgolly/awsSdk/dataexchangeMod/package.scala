package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dataexchangeMod {
  type Arn = java.lang.String
  type AssetName = java.lang.String
  type AssetType = typingsJapgolly.awsSdk.awsSdkStrings.S3_SNAPSHOT | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.dataexchangeMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_DENIED_EXCEPTION
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_SERVER_EXCEPTION
    - typingsJapgolly.awsSdk.awsSdkStrings.MALWARE_DETECTED
    - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND_EXCEPTION
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_QUOTA_EXCEEDED_EXCEPTION
    - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_EXCEPTION
    - typingsJapgolly.awsSdk.awsSdkStrings.MALWARE_SCAN_ENCRYPTED_FILE
    - java.lang.String
  */
  type Code = typingsJapgolly.awsSdk.dataexchangeMod._Code | java.lang.String
  type Description = java.lang.String
  type Id = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`Assets per revision`
    - typingsJapgolly.awsSdk.awsSdkStrings.`Asset size in GB`
    - java.lang.String
  */
  type JobErrorLimitName = typingsJapgolly.awsSdk.dataexchangeMod._JobErrorLimitName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.REVISION
    - typingsJapgolly.awsSdk.awsSdkStrings.ASSET
    - java.lang.String
  */
  type JobErrorResourceTypes = typingsJapgolly.awsSdk.dataexchangeMod._JobErrorResourceTypes | java.lang.String
  type ListOfAssetDestinationEntry = js.Array[typingsJapgolly.awsSdk.dataexchangeMod.AssetDestinationEntry]
  type ListOfAssetEntry = js.Array[typingsJapgolly.awsSdk.dataexchangeMod.AssetEntry]
  type ListOfAssetSourceEntry = js.Array[typingsJapgolly.awsSdk.dataexchangeMod.AssetSourceEntry]
  type ListOfDataSetEntry = js.Array[typingsJapgolly.awsSdk.dataexchangeMod.DataSetEntry]
  type ListOfJobEntry = js.Array[typingsJapgolly.awsSdk.dataexchangeMod.JobEntry]
  type ListOfJobError = js.Array[typingsJapgolly.awsSdk.dataexchangeMod.JobError]
  type ListOfRevisionEntry = js.Array[typingsJapgolly.awsSdk.dataexchangeMod.RevisionEntry]
  type ListOfString = js.Array[typingsJapgolly.awsSdk.dataexchangeMod.string]
  type MapOfString = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.dataexchangeMod.string]
  type MaxResults = scala.Double
  type Name = java.lang.String
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OWNED
    - typingsJapgolly.awsSdk.awsSdkStrings.ENTITLED
    - java.lang.String
  */
  type Origin = typingsJapgolly.awsSdk.dataexchangeMod._Origin | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.WAITING
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
    - typingsJapgolly.awsSdk.awsSdkStrings.TIMED_OUT
    - java.lang.String
  */
  type State = typingsJapgolly.awsSdk.dataexchangeMod._State | java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_ASSETS_FROM_S3
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_ASSET_FROM_SIGNED_URL
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPORT_ASSETS_TO_S3
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPORT_ASSET_TO_SIGNED_URL
    - java.lang.String
  */
  type Type = typingsJapgolly.awsSdk.dataexchangeMod._Type | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-07-25`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.dataexchangeMod._apiVersion | java.lang.String
  type boolean = scala.Boolean
  type double = scala.Double
  type doubleMin0 = scala.Double
  type string = java.lang.String
  type stringMin0Max16384 = java.lang.String
  type stringMin24Max24PatternAZaZ094AZaZ092AZaZ093 = java.lang.String
}
