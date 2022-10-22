package typingsJapgolly.awsSdk.clientsLicensemanagerMod

import typingsJapgolly.awsSdk.awsSdkStrings.JWT_PS384
import typingsJapgolly.awsSdk.awsSdkStrings.REFRESH_TOKEN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateGrant
  - typingsJapgolly.awsSdk.awsSdkStrings.CheckoutLicense
  - typingsJapgolly.awsSdk.awsSdkStrings.CheckoutBorrowLicense
  - typingsJapgolly.awsSdk.awsSdkStrings.CheckInLicense
  - typingsJapgolly.awsSdk.awsSdkStrings.ExtendConsumptionLicense
  - typingsJapgolly.awsSdk.awsSdkStrings.ListPurchasedLicenses
  - typingsJapgolly.awsSdk.awsSdkStrings.CreateToken
  - java.lang.String
*/
type AllowedOperation = _AllowedOperation | java.lang.String

type AllowedOperationList = js.Array[AllowedOperation]

type Arn = java.lang.String

type ArnList = js.Array[Arn]

type Boolean = scala.Boolean

type BoxBoolean = scala.Boolean

type BoxInteger = Double

type BoxLong = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PROVISIONAL
  - typingsJapgolly.awsSdk.awsSdkStrings.PERPETUAL
  - java.lang.String
*/
type CheckoutType = _CheckoutType | java.lang.String

type ClientRequestToken = java.lang.String

type ClientToken = java.lang.String

type ConsumedLicenseSummaryList = js.Array[ConsumedLicenseSummary]

type DateTime = js.Date

type DigitalSignatureMethod = JWT_PS384 | java.lang.String

type EntitlementDataList = js.Array[EntitlementData]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Count_
  - typingsJapgolly.awsSdk.awsSdkStrings.None_
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
  - java.lang.String
*/
type EntitlementDataUnit = _EntitlementDataUnit | java.lang.String

type EntitlementList = js.Array[Entitlement]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Count_
  - typingsJapgolly.awsSdk.awsSdkStrings.None_
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
  - java.lang.String
*/
type EntitlementUnit = _EntitlementUnit | java.lang.String

type EntitlementUsageList = js.Array[EntitlementUsage]

type FilterList = js.Array[Filter]

type FilterName = java.lang.String

type FilterValue = java.lang.String

type FilterValues = js.Array[FilterValue]

type Filters = js.Array[Filter]

type GrantList = js.Array[Grant]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_WORKFLOW
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_ACCEPT
  - typingsJapgolly.awsSdk.awsSdkStrings.REJECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_WORKFLOW
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_DELETE
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.WORKFLOW_COMPLETED
  - java.lang.String
*/
type GrantStatus = _GrantStatus | java.lang.String

type GrantedLicenseList = js.Array[GrantedLicense]

type ISO8601DateTime = java.lang.String

type Integer = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EQUALS
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_EQUALS
  - typingsJapgolly.awsSdk.awsSdkStrings.BEGINS_WITH
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTAINS
  - java.lang.String
*/
type InventoryFilterCondition = _InventoryFilterCondition | java.lang.String

type InventoryFilterList = js.Array[InventoryFilter]

type LicenseConfigurationAssociations = js.Array[LicenseConfigurationAssociation]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type LicenseConfigurationStatus = _LicenseConfigurationStatus | java.lang.String

type LicenseConfigurationUsageList = js.Array[LicenseConfigurationUsage]

type LicenseConfigurations = js.Array[LicenseConfiguration]

type LicenseConversionTaskId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type LicenseConversionTaskStatus = _LicenseConversionTaskStatus | java.lang.String

type LicenseConversionTasks = js.Array[LicenseConversionTask]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.vCPU_
  - typingsJapgolly.awsSdk.awsSdkStrings.Instance_
  - typingsJapgolly.awsSdk.awsSdkStrings.Core_
  - typingsJapgolly.awsSdk.awsSdkStrings.Socket
  - java.lang.String
*/
type LicenseCountingType = _LicenseCountingType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_DELETE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type LicenseDeletionStatus = _LicenseDeletionStatus | java.lang.String

type LicenseList = js.Array[License]

type LicenseOperationFailureList = js.Array[LicenseOperationFailure]

type LicenseSpecifications = js.Array[LicenseSpecification]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.DEACTIVATED
  - typingsJapgolly.awsSdk.awsSdkStrings.SUSPENDED
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_DELETE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type LicenseStatus = _LicenseStatus | java.lang.String

type Long = Double

type ManagedResourceSummaryList = js.Array[ManagedResourceSummary]

type MaxSize100 = Double

type MaxSize3StringList = js.Array[String]

type MetadataList = js.Array[Metadata]

type PrincipalArnList = js.Array[Arn]

type ProductInformationFilterList = js.Array[ProductInformationFilter]

type ProductInformationList = js.Array[ProductInformation]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_WORKFLOW
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_ACCEPT
  - typingsJapgolly.awsSdk.awsSdkStrings.REJECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_WORKFLOW
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.WORKFLOW_COMPLETED
  - java.lang.String
*/
type ReceivedStatus = _ReceivedStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.None_
  - typingsJapgolly.awsSdk.awsSdkStrings.Weekly_
  - typingsJapgolly.awsSdk.awsSdkStrings.Monthly_
  - java.lang.String
*/
type RenewType = _RenewType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DAY
  - typingsJapgolly.awsSdk.awsSdkStrings.WEEK
  - typingsJapgolly.awsSdk.awsSdkStrings.MONTH
  - java.lang.String
*/
type ReportFrequencyType = _ReportFrequencyType | java.lang.String

type ReportGeneratorList = js.Array[ReportGenerator]

type ReportGeneratorName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LicenseConfigurationSummaryReport
  - typingsJapgolly.awsSdk.awsSdkStrings.LicenseConfigurationUsageReport
  - java.lang.String
*/
type ReportType = _ReportType | java.lang.String

type ReportTypeList = js.Array[ReportType]

type ResourceInventoryList = js.Array[ResourceInventory]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EC2_INSTANCE
  - typingsJapgolly.awsSdk.awsSdkStrings.EC2_HOST
  - typingsJapgolly.awsSdk.awsSdkStrings.EC2_AMI
  - typingsJapgolly.awsSdk.awsSdkStrings.RDS
  - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEMS_MANAGER_MANAGED_INSTANCE
  - java.lang.String
*/
type ResourceType = _ResourceType | java.lang.String

type SignedToken = java.lang.String

type StatusReasonMessage = java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

type TagKeyList = js.Array[String]

type TagList = js.Array[Tag]

type TokenList = js.Array[TokenData]

type TokenString = java.lang.String

type TokenType = REFRESH_TOKEN | java.lang.String

type UsageOperation = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-08-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
