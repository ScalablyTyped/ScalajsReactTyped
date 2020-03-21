package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object licensemanagerMod {
  type Boolean = scala.Boolean
  type BoxBoolean = scala.Boolean
  type BoxInteger = scala.Double
  type BoxLong = scala.Double
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.licensemanagerMod.ClientApiVersions
  type ConsumedLicenseSummaryList = js.Array[typingsJapgolly.awsSdk.licensemanagerMod.ConsumedLicenseSummary]
  type DateTime = js.Date
  type FilterName = java.lang.String
  type FilterValue = java.lang.String
  type FilterValues = js.Array[typingsJapgolly.awsSdk.licensemanagerMod.FilterValue]
  type Filters = js.Array[typingsJapgolly.awsSdk.licensemanagerMod.Filter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EQUALS
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_EQUALS
    - typingsJapgolly.awsSdk.awsSdkStrings.BEGINS_WITH
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTAINS
    - java.lang.String
  */
  type InventoryFilterCondition = typingsJapgolly.awsSdk.licensemanagerMod._InventoryFilterCondition | java.lang.String
  type InventoryFilterList = js.Array[typingsJapgolly.awsSdk.licensemanagerMod.InventoryFilter]
  type LicenseConfigurationAssociations = js.Array[typingsJapgolly.awsSdk.licensemanagerMod.LicenseConfigurationAssociation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type LicenseConfigurationStatus = typingsJapgolly.awsSdk.licensemanagerMod._LicenseConfigurationStatus | java.lang.String
  type LicenseConfigurationUsageList = js.Array[typingsJapgolly.awsSdk.licensemanagerMod.LicenseConfigurationUsage]
  type LicenseConfigurations = js.Array[typingsJapgolly.awsSdk.licensemanagerMod.LicenseConfiguration]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.vCPU
    - typingsJapgolly.awsSdk.awsSdkStrings.Instance_
    - typingsJapgolly.awsSdk.awsSdkStrings.Core_
    - typingsJapgolly.awsSdk.awsSdkStrings.Socket
    - java.lang.String
  */
  type LicenseCountingType = typingsJapgolly.awsSdk.licensemanagerMod._LicenseCountingType | java.lang.String
  type LicenseOperationFailureList = js.Array[typingsJapgolly.awsSdk.licensemanagerMod.LicenseOperationFailure]
  type LicenseSpecifications = js.Array[typingsJapgolly.awsSdk.licensemanagerMod.LicenseSpecification]
  type ManagedResourceSummaryList = js.Array[typingsJapgolly.awsSdk.licensemanagerMod.ManagedResourceSummary]
  type MetadataList = js.Array[typingsJapgolly.awsSdk.licensemanagerMod.Metadata]
  type ProductInformationFilterList = js.Array[typingsJapgolly.awsSdk.licensemanagerMod.ProductInformationFilter]
  type ProductInformationList = js.Array[typingsJapgolly.awsSdk.licensemanagerMod.ProductInformation]
  type ResourceInventoryList = js.Array[typingsJapgolly.awsSdk.licensemanagerMod.ResourceInventory]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EC2_INSTANCE
    - typingsJapgolly.awsSdk.awsSdkStrings.EC2_HOST
    - typingsJapgolly.awsSdk.awsSdkStrings.EC2_AMI
    - typingsJapgolly.awsSdk.awsSdkStrings.RDS
    - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEMS_MANAGER_MANAGED_INSTANCE
    - java.lang.String
  */
  type ResourceType = typingsJapgolly.awsSdk.licensemanagerMod._ResourceType | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.licensemanagerMod.String]
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.licensemanagerMod.String]
  type TagList = js.Array[typingsJapgolly.awsSdk.licensemanagerMod.Tag]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-08-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.licensemanagerMod._apiVersion | java.lang.String
}
