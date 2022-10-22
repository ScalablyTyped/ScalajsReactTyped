package typingsJapgolly.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.REST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ApiDescription = String

type Arn = String

type AssetName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.S3_SNAPSHOT
  - typingsJapgolly.awsSdk.awsSdkStrings.REDSHIFT_DATA_SHARE
  - typingsJapgolly.awsSdk.awsSdkStrings.API_GATEWAY_API
  - java.lang.String
*/
type AssetType = _AssetType | String

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
type Code = _Code | String

type Description = String

type Id = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`Assets per revision`
  - typingsJapgolly.awsSdk.awsSdkStrings.`Asset size in GB`
  - typingsJapgolly.awsSdk.awsSdkStrings.`Amazon Redshift datashare assets per revision`
  - java.lang.String
*/
type JobErrorLimitName = _JobErrorLimitName | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.REVISION
  - typingsJapgolly.awsSdk.awsSdkStrings.ASSET
  - typingsJapgolly.awsSdk.awsSdkStrings.DATA_SET
  - java.lang.String
*/
type JobErrorResourceTypes = _JobErrorResourceTypes | String

type ListOfAssetDestinationEntry = js.Array[AssetDestinationEntry]

type ListOfAssetEntry = js.Array[AssetEntry]

type ListOfAssetSourceEntry = js.Array[AssetSourceEntry]

type ListOfDataSetEntry = js.Array[DataSetEntry]

type ListOfEventActionEntry = js.Array[EventActionEntry]

type ListOfJobEntry = js.Array[JobEntry]

type ListOfJobError = js.Array[JobError]

type ListOfRedshiftDataShareAssetSourceEntry = js.Array[RedshiftDataShareAssetSourceEntry]

type ListOfRevisionDestinationEntry = js.Array[RevisionDestinationEntry]

type ListOfRevisionEntry = js.Array[RevisionEntry]

type ListOfString = js.Array[string]

type MapOfString = StringDictionary[string]

type MaxResults = Double

type Name = String

type NextToken = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OWNED
  - typingsJapgolly.awsSdk.awsSdkStrings.ENTITLED
  - java.lang.String
*/
type Origin = _Origin | String

type ProtocolType = REST | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.awsColonkms
  - typingsJapgolly.awsSdk.awsSdkStrings.AES256
  - java.lang.String
*/
type ServerSideEncryptionTypes = _ServerSideEncryptionTypes | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WAITING
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMED_OUT
  - java.lang.String
*/
type State = _State | String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_ASSETS_FROM_S3
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_ASSET_FROM_SIGNED_URL
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPORT_ASSETS_TO_S3
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPORT_ASSET_TO_SIGNED_URL
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPORT_REVISIONS_TO_S3
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_ASSETS_FROM_REDSHIFT_DATA_SHARES
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_ASSET_FROM_API_GATEWAY_API
  - java.lang.String
*/
type Type = _Type | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-07-25`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type boolean = Boolean

type double = Double

type doubleMin0 = Double

type string = String

type stringMin0Max16384 = String

type stringMin10Max512 = String

type stringMin24Max24PatternAZaZ094AZaZ092AZaZ093 = String
