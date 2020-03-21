package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object discoveryMod {
  type AgentConfigurationStatusList = js.Array[typingsJapgolly.awsSdk.discoveryMod.AgentConfigurationStatus]
  type AgentId = java.lang.String
  type AgentIds = js.Array[typingsJapgolly.awsSdk.discoveryMod.AgentId]
  type AgentNetworkInfoList = js.Array[typingsJapgolly.awsSdk.discoveryMod.AgentNetworkInfo]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HEALTHY
    - typingsJapgolly.awsSdk.awsSdkStrings.UNHEALTHY
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
    - typingsJapgolly.awsSdk.awsSdkStrings.BLACKLISTED
    - typingsJapgolly.awsSdk.awsSdkStrings.SHUTDOWN
    - java.lang.String
  */
  type AgentStatus = typingsJapgolly.awsSdk.discoveryMod._AgentStatus | java.lang.String
  type AgentsInfo = js.Array[typingsJapgolly.awsSdk.discoveryMod.AgentInfo]
  type ApplicationId = java.lang.String
  type ApplicationIdsList = js.Array[typingsJapgolly.awsSdk.discoveryMod.ApplicationId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_FOUND
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_SERVER_ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.OVER_LIMIT
    - java.lang.String
  */
  type BatchDeleteImportDataErrorCode = typingsJapgolly.awsSdk.discoveryMod._BatchDeleteImportDataErrorCode | java.lang.String
  type BatchDeleteImportDataErrorDescription = java.lang.String
  type BatchDeleteImportDataErrorList = js.Array[typingsJapgolly.awsSdk.discoveryMod.BatchDeleteImportDataError]
  type Boolean = scala.Boolean
  type BoxedInteger = scala.Double
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.discoveryMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type Condition = java.lang.String
  type Configuration = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.discoveryMod.String]
  type ConfigurationId = java.lang.String
  type ConfigurationIdList = js.Array[typingsJapgolly.awsSdk.discoveryMod.ConfigurationId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVER
    - typingsJapgolly.awsSdk.awsSdkStrings.PROCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTION
    - typingsJapgolly.awsSdk.awsSdkStrings.APPLICATION
    - java.lang.String
  */
  type ConfigurationItemType = typingsJapgolly.awsSdk.discoveryMod._ConfigurationItemType | java.lang.String
  type ConfigurationTagSet = js.Array[typingsJapgolly.awsSdk.discoveryMod.ConfigurationTag]
  type Configurations = js.Array[typingsJapgolly.awsSdk.discoveryMod.Configuration]
  type ConfigurationsDownloadUrl = java.lang.String
  type ConfigurationsExportId = java.lang.String
  type ContinuousExportDescriptions = js.Array[typingsJapgolly.awsSdk.discoveryMod.ContinuousExportDescription]
  type ContinuousExportIds = js.Array[typingsJapgolly.awsSdk.discoveryMod.ConfigurationsExportId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.START_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.START_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.STOP_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.STOP_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type ContinuousExportStatus = typingsJapgolly.awsSdk.discoveryMod._ContinuousExportStatus | java.lang.String
  type DataSource = typingsJapgolly.awsSdk.awsSdkStrings.AGENT | java.lang.String
  type DatabaseName = java.lang.String
  type DescribeConfigurationsAttribute = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.discoveryMod.String]
  type DescribeConfigurationsAttributes = js.Array[typingsJapgolly.awsSdk.discoveryMod.DescribeConfigurationsAttribute]
  type DescribeContinuousExportsMaxResults = scala.Double
  type DescribeImportTasksFilterList = js.Array[typingsJapgolly.awsSdk.discoveryMod.ImportTaskFilter]
  type DescribeImportTasksMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CSV
    - typingsJapgolly.awsSdk.awsSdkStrings.GRAPHML
    - java.lang.String
  */
  type ExportDataFormat = typingsJapgolly.awsSdk.discoveryMod._ExportDataFormat | java.lang.String
  type ExportDataFormats = js.Array[typingsJapgolly.awsSdk.discoveryMod.ExportDataFormat]
  type ExportFilters = js.Array[typingsJapgolly.awsSdk.discoveryMod.ExportFilter]
  type ExportIds = js.Array[typingsJapgolly.awsSdk.discoveryMod.ConfigurationsExportId]
  type ExportRequestTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - java.lang.String
  */
  type ExportStatus = typingsJapgolly.awsSdk.discoveryMod._ExportStatus | java.lang.String
  type ExportStatusMessage = java.lang.String
  type ExportsInfo = js.Array[typingsJapgolly.awsSdk.discoveryMod.ExportInfo]
  type FilterName = java.lang.String
  type FilterValue = java.lang.String
  type FilterValues = js.Array[typingsJapgolly.awsSdk.discoveryMod.FilterValue]
  type Filters = js.Array[typingsJapgolly.awsSdk.discoveryMod.Filter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_COMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_COMPLETE_WITH_ERRORS
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_FAILED_SERVER_LIMIT_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_FAILED_RECORD_LIMIT_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_COMPLETE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED_LIMIT_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - java.lang.String
  */
  type ImportStatus = typingsJapgolly.awsSdk.discoveryMod._ImportStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT_TASK_ID
    - typingsJapgolly.awsSdk.awsSdkStrings.STATUS
    - typingsJapgolly.awsSdk.awsSdkStrings.NAME
    - java.lang.String
  */
  type ImportTaskFilterName = typingsJapgolly.awsSdk.discoveryMod._ImportTaskFilterName | java.lang.String
  type ImportTaskFilterValue = java.lang.String
  type ImportTaskFilterValueList = js.Array[typingsJapgolly.awsSdk.discoveryMod.ImportTaskFilterValue]
  type ImportTaskIdentifier = java.lang.String
  type ImportTaskList = js.Array[typingsJapgolly.awsSdk.discoveryMod.ImportTask]
  type ImportTaskName = java.lang.String
  type ImportURL = java.lang.String
  type Integer = scala.Double
  type Long = scala.Double
  type NeighborDetailsList = js.Array[typingsJapgolly.awsSdk.discoveryMod.NeighborConnectionDetail]
  type NextToken = java.lang.String
  type OrderByList = js.Array[typingsJapgolly.awsSdk.discoveryMod.OrderByElement]
  type S3Bucket = java.lang.String
  type S3PresignedUrl = java.lang.String
  type SchemaStorageConfig = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.discoveryMod.String]
  type String = java.lang.String
  type StringMax255 = java.lang.String
  type TagFilters = js.Array[typingsJapgolly.awsSdk.discoveryMod.TagFilter]
  type TagKey = java.lang.String
  type TagSet = js.Array[typingsJapgolly.awsSdk.discoveryMod.Tag]
  type TagValue = java.lang.String
  type TimeStamp = js.Date
  type ToDeleteIdentifierList = js.Array[typingsJapgolly.awsSdk.discoveryMod.ImportTaskIdentifier]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-11-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.discoveryMod._apiVersion | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ASC
    - typingsJapgolly.awsSdk.awsSdkStrings.DESC
    - java.lang.String
  */
  type orderString = typingsJapgolly.awsSdk.discoveryMod._orderString | java.lang.String
}
