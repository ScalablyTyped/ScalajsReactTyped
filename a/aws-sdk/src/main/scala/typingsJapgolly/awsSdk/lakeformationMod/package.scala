package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lakeformationMod {
  type BatchPermissionsFailureList = js.Array[typingsJapgolly.awsSdk.lakeformationMod.BatchPermissionsFailureEntry]
  type BatchPermissionsRequestEntryList = js.Array[typingsJapgolly.awsSdk.lakeformationMod.BatchPermissionsRequestEntry]
  type CatalogIdString = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.lakeformationMod.ClientApiVersions
  type ColumnNames = js.Array[typingsJapgolly.awsSdk.lakeformationMod.NameString]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EQ
    - typingsJapgolly.awsSdk.awsSdkStrings.NE
    - typingsJapgolly.awsSdk.awsSdkStrings.LE
    - typingsJapgolly.awsSdk.awsSdkStrings.LT
    - typingsJapgolly.awsSdk.awsSdkStrings.GE
    - typingsJapgolly.awsSdk.awsSdkStrings.GT
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTAINS
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_CONTAINS
    - typingsJapgolly.awsSdk.awsSdkStrings.BEGINS_WITH
    - typingsJapgolly.awsSdk.awsSdkStrings.IN
    - typingsJapgolly.awsSdk.awsSdkStrings.BETWEEN
    - java.lang.String
  */
  type ComparisonOperator = typingsJapgolly.awsSdk.lakeformationMod._ComparisonOperator | java.lang.String
  type DataLakePrincipalList = js.Array[typingsJapgolly.awsSdk.lakeformationMod.DataLakePrincipal]
  type DataLakePrincipalString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CATALOG
    - typingsJapgolly.awsSdk.awsSdkStrings.DATABASE
    - typingsJapgolly.awsSdk.awsSdkStrings.TABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.DATA_LOCATION
    - java.lang.String
  */
  type DataLakeResourceType = typingsJapgolly.awsSdk.lakeformationMod._DataLakeResourceType | java.lang.String
  type DescriptionString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_ARN
    - typingsJapgolly.awsSdk.awsSdkStrings.ROLE_ARN
    - typingsJapgolly.awsSdk.awsSdkStrings.LAST_MODIFIED
    - java.lang.String
  */
  type FieldNameString = typingsJapgolly.awsSdk.lakeformationMod._FieldNameString | java.lang.String
  type FilterConditionList = js.Array[typingsJapgolly.awsSdk.lakeformationMod.FilterCondition]
  type IAMRoleArn = java.lang.String
  type Identifier = java.lang.String
  type LastModifiedTimestamp = js.Date
  type NameString = java.lang.String
  type NullableBoolean = scala.Boolean
  type PageSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - typingsJapgolly.awsSdk.awsSdkStrings.SELECT
    - typingsJapgolly.awsSdk.awsSdkStrings.ALTER
    - typingsJapgolly.awsSdk.awsSdkStrings.DROP
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
    - typingsJapgolly.awsSdk.awsSdkStrings.INSERT
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_DATABASE
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_TABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.DATA_LOCATION_ACCESS
    - java.lang.String
  */
  type Permission = typingsJapgolly.awsSdk.lakeformationMod._Permission | java.lang.String
  type PermissionList = js.Array[typingsJapgolly.awsSdk.lakeformationMod.Permission]
  type PrincipalPermissionsList = js.Array[typingsJapgolly.awsSdk.lakeformationMod.PrincipalPermissions]
  type PrincipalResourcePermissionsList = js.Array[typingsJapgolly.awsSdk.lakeformationMod.PrincipalResourcePermissions]
  type ResourceArnString = java.lang.String
  type ResourceInfoList = js.Array[typingsJapgolly.awsSdk.lakeformationMod.ResourceInfo]
  type StringValue = java.lang.String
  type StringValueList = js.Array[typingsJapgolly.awsSdk.lakeformationMod.StringValue]
  type Token = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-03-31`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.lakeformationMod._apiVersion | java.lang.String
}
