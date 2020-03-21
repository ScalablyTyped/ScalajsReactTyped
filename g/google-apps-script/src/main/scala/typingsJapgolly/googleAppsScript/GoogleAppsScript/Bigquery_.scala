package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Collection.DatasetsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Collection.JobsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Collection.ProjectsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Collection.TabledataCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Collection.TablesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BigQueryModelTraining
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BigtableColumn
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BigtableColumnFamily
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BigtableOptions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BqmlIterationResult
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BqmlTrainingRun
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BqmlTrainingRunTrainingOptions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.Clustering
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.CsvOptions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.Dataset
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.DatasetAccess
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.DatasetReference
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.DestinationTableProperties
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.EncryptionConfiguration
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ErrorProto
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ExplainQueryStage
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ExplainQueryStep
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ExternalDataConfiguration
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.GoogleSheetsOptions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.Job
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobConfiguration
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobConfigurationExtract
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobConfigurationLoad
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobConfigurationQuery
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobConfigurationTableCopy
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobReference
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatistics
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatistics2
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatistics2ReservationUsage
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatistics3
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatistics4
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatisticsReservationUsage
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatus
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.MaterializedViewDefinition
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ModelDefinition
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ModelDefinitionModelOptions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.QueryParameter
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.QueryParameterType
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.QueryParameterTypeStructTypes
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.QueryParameterValue
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.QueryRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.QueryTimelineSample
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.RangePartitioning
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.RangePartitioningRange
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.RoutineReference
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.Streamingbuffer
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.Table
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TableDataInsertAllRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TableDataInsertAllRequestRows
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TableFieldSchema
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TableFieldSchemaCategories
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TableReference
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TableSchema
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TimePartitioning
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.UserDefinedFunctionResource
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ViewDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bigquery_ extends js.Object {
  var Datasets: js.UndefOr[DatasetsCollection] = js.undefined
  var Jobs: js.UndefOr[JobsCollection] = js.undefined
  var Projects: js.UndefOr[ProjectsCollection] = js.undefined
  var Tabledata: js.UndefOr[TabledataCollection] = js.undefined
  var Tables: js.UndefOr[TablesCollection] = js.undefined
  // Create a new instance of BigQueryModelTraining
  def newBigQueryModelTraining(): BigQueryModelTraining
  // Create a new instance of BigtableColumn
  def newBigtableColumn(): BigtableColumn
  // Create a new instance of BigtableColumnFamily
  def newBigtableColumnFamily(): BigtableColumnFamily
  // Create a new instance of BigtableOptions
  def newBigtableOptions(): BigtableOptions
  // Create a new instance of BqmlIterationResult
  def newBqmlIterationResult(): BqmlIterationResult
  // Create a new instance of BqmlTrainingRun
  def newBqmlTrainingRun(): BqmlTrainingRun
  // Create a new instance of BqmlTrainingRunTrainingOptions
  def newBqmlTrainingRunTrainingOptions(): BqmlTrainingRunTrainingOptions
  // Create a new instance of Clustering
  def newClustering(): Clustering
  // Create a new instance of CsvOptions
  def newCsvOptions(): CsvOptions
  // Create a new instance of Dataset
  def newDataset(): Dataset
  // Create a new instance of DatasetAccess
  def newDatasetAccess(): DatasetAccess
  // Create a new instance of DatasetReference
  def newDatasetReference(): DatasetReference
  // Create a new instance of DestinationTableProperties
  def newDestinationTableProperties(): DestinationTableProperties
  // Create a new instance of EncryptionConfiguration
  def newEncryptionConfiguration(): EncryptionConfiguration
  // Create a new instance of ErrorProto
  def newErrorProto(): ErrorProto
  // Create a new instance of ExplainQueryStage
  def newExplainQueryStage(): ExplainQueryStage
  // Create a new instance of ExplainQueryStep
  def newExplainQueryStep(): ExplainQueryStep
  // Create a new instance of ExternalDataConfiguration
  def newExternalDataConfiguration(): ExternalDataConfiguration
  // Create a new instance of GoogleSheetsOptions
  def newGoogleSheetsOptions(): GoogleSheetsOptions
  // Create a new instance of Job
  def newJob(): Job
  // Create a new instance of JobConfiguration
  def newJobConfiguration(): JobConfiguration
  // Create a new instance of JobConfigurationExtract
  def newJobConfigurationExtract(): JobConfigurationExtract
  // Create a new instance of JobConfigurationLoad
  def newJobConfigurationLoad(): JobConfigurationLoad
  // Create a new instance of JobConfigurationQuery
  def newJobConfigurationQuery(): JobConfigurationQuery
  // Create a new instance of JobConfigurationTableCopy
  def newJobConfigurationTableCopy(): JobConfigurationTableCopy
  // Create a new instance of JobReference
  def newJobReference(): JobReference
  // Create a new instance of JobStatistics
  def newJobStatistics(): JobStatistics
  // Create a new instance of JobStatistics2
  def newJobStatistics2(): JobStatistics2
  // Create a new instance of JobStatistics2ReservationUsage
  def newJobStatistics2ReservationUsage(): JobStatistics2ReservationUsage
  // Create a new instance of JobStatistics3
  def newJobStatistics3(): JobStatistics3
  // Create a new instance of JobStatistics4
  def newJobStatistics4(): JobStatistics4
  // Create a new instance of JobStatisticsReservationUsage
  def newJobStatisticsReservationUsage(): JobStatisticsReservationUsage
  // Create a new instance of JobStatus
  def newJobStatus(): JobStatus
  // Create a new instance of MaterializedViewDefinition
  def newMaterializedViewDefinition(): MaterializedViewDefinition
  // Create a new instance of ModelDefinition
  def newModelDefinition(): ModelDefinition
  // Create a new instance of ModelDefinitionModelOptions
  def newModelDefinitionModelOptions(): ModelDefinitionModelOptions
  // Create a new instance of QueryParameter
  def newQueryParameter(): QueryParameter
  // Create a new instance of QueryParameterType
  def newQueryParameterType(): QueryParameterType
  // Create a new instance of QueryParameterTypeStructTypes
  def newQueryParameterTypeStructTypes(): QueryParameterTypeStructTypes
  // Create a new instance of QueryParameterValue
  def newQueryParameterValue(): QueryParameterValue
  // Create a new instance of QueryRequest
  def newQueryRequest(): QueryRequest
  // Create a new instance of QueryTimelineSample
  def newQueryTimelineSample(): QueryTimelineSample
  // Create a new instance of RangePartitioning
  def newRangePartitioning(): RangePartitioning
  // Create a new instance of RangePartitioningRange
  def newRangePartitioningRange(): RangePartitioningRange
  // Create a new instance of RoutineReference
  def newRoutineReference(): RoutineReference
  // Create a new instance of Streamingbuffer
  def newStreamingbuffer(): Streamingbuffer
  // Create a new instance of Table
  def newTable(): Table
  // Create a new instance of TableDataInsertAllRequest
  def newTableDataInsertAllRequest(): TableDataInsertAllRequest
  // Create a new instance of TableDataInsertAllRequestRows
  def newTableDataInsertAllRequestRows(): TableDataInsertAllRequestRows
  // Create a new instance of TableFieldSchema
  def newTableFieldSchema(): TableFieldSchema
  // Create a new instance of TableFieldSchemaCategories
  def newTableFieldSchemaCategories(): TableFieldSchemaCategories
  // Create a new instance of TableReference
  def newTableReference(): TableReference
  // Create a new instance of TableSchema
  def newTableSchema(): TableSchema
  // Create a new instance of TimePartitioning
  def newTimePartitioning(): TimePartitioning
  // Create a new instance of UserDefinedFunctionResource
  def newUserDefinedFunctionResource(): UserDefinedFunctionResource
  // Create a new instance of ViewDefinition
  def newViewDefinition(): ViewDefinition
}

object Bigquery_ {
  @scala.inline
  def apply(
    newBigQueryModelTraining: CallbackTo[BigQueryModelTraining],
    newBigtableColumn: CallbackTo[BigtableColumn],
    newBigtableColumnFamily: CallbackTo[BigtableColumnFamily],
    newBigtableOptions: CallbackTo[BigtableOptions],
    newBqmlIterationResult: CallbackTo[BqmlIterationResult],
    newBqmlTrainingRun: CallbackTo[BqmlTrainingRun],
    newBqmlTrainingRunTrainingOptions: CallbackTo[BqmlTrainingRunTrainingOptions],
    newClustering: CallbackTo[Clustering],
    newCsvOptions: CallbackTo[CsvOptions],
    newDataset: CallbackTo[Dataset],
    newDatasetAccess: CallbackTo[DatasetAccess],
    newDatasetReference: CallbackTo[DatasetReference],
    newDestinationTableProperties: CallbackTo[DestinationTableProperties],
    newEncryptionConfiguration: CallbackTo[EncryptionConfiguration],
    newErrorProto: CallbackTo[ErrorProto],
    newExplainQueryStage: CallbackTo[ExplainQueryStage],
    newExplainQueryStep: CallbackTo[ExplainQueryStep],
    newExternalDataConfiguration: CallbackTo[ExternalDataConfiguration],
    newGoogleSheetsOptions: CallbackTo[GoogleSheetsOptions],
    newJob: CallbackTo[Job],
    newJobConfiguration: CallbackTo[JobConfiguration],
    newJobConfigurationExtract: CallbackTo[JobConfigurationExtract],
    newJobConfigurationLoad: CallbackTo[JobConfigurationLoad],
    newJobConfigurationQuery: CallbackTo[JobConfigurationQuery],
    newJobConfigurationTableCopy: CallbackTo[JobConfigurationTableCopy],
    newJobReference: CallbackTo[JobReference],
    newJobStatistics: CallbackTo[JobStatistics],
    newJobStatistics2: CallbackTo[JobStatistics2],
    newJobStatistics2ReservationUsage: CallbackTo[JobStatistics2ReservationUsage],
    newJobStatistics3: CallbackTo[JobStatistics3],
    newJobStatistics4: CallbackTo[JobStatistics4],
    newJobStatisticsReservationUsage: CallbackTo[JobStatisticsReservationUsage],
    newJobStatus: CallbackTo[JobStatus],
    newMaterializedViewDefinition: CallbackTo[MaterializedViewDefinition],
    newModelDefinition: CallbackTo[ModelDefinition],
    newModelDefinitionModelOptions: CallbackTo[ModelDefinitionModelOptions],
    newQueryParameter: CallbackTo[QueryParameter],
    newQueryParameterType: CallbackTo[QueryParameterType],
    newQueryParameterTypeStructTypes: CallbackTo[QueryParameterTypeStructTypes],
    newQueryParameterValue: CallbackTo[QueryParameterValue],
    newQueryRequest: CallbackTo[QueryRequest],
    newQueryTimelineSample: CallbackTo[QueryTimelineSample],
    newRangePartitioning: CallbackTo[RangePartitioning],
    newRangePartitioningRange: CallbackTo[RangePartitioningRange],
    newRoutineReference: CallbackTo[RoutineReference],
    newStreamingbuffer: CallbackTo[Streamingbuffer],
    newTable: CallbackTo[Table],
    newTableDataInsertAllRequest: CallbackTo[TableDataInsertAllRequest],
    newTableDataInsertAllRequestRows: CallbackTo[TableDataInsertAllRequestRows],
    newTableFieldSchema: CallbackTo[TableFieldSchema],
    newTableFieldSchemaCategories: CallbackTo[TableFieldSchemaCategories],
    newTableReference: CallbackTo[TableReference],
    newTableSchema: CallbackTo[TableSchema],
    newTimePartitioning: CallbackTo[TimePartitioning],
    newUserDefinedFunctionResource: CallbackTo[UserDefinedFunctionResource],
    newViewDefinition: CallbackTo[ViewDefinition],
    Datasets: DatasetsCollection = null,
    Jobs: JobsCollection = null,
    Projects: ProjectsCollection = null,
    Tabledata: TabledataCollection = null,
    Tables: TablesCollection = null
  ): Bigquery_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newBigQueryModelTraining")(newBigQueryModelTraining.toJsFn)
    __obj.updateDynamic("newBigtableColumn")(newBigtableColumn.toJsFn)
    __obj.updateDynamic("newBigtableColumnFamily")(newBigtableColumnFamily.toJsFn)
    __obj.updateDynamic("newBigtableOptions")(newBigtableOptions.toJsFn)
    __obj.updateDynamic("newBqmlIterationResult")(newBqmlIterationResult.toJsFn)
    __obj.updateDynamic("newBqmlTrainingRun")(newBqmlTrainingRun.toJsFn)
    __obj.updateDynamic("newBqmlTrainingRunTrainingOptions")(newBqmlTrainingRunTrainingOptions.toJsFn)
    __obj.updateDynamic("newClustering")(newClustering.toJsFn)
    __obj.updateDynamic("newCsvOptions")(newCsvOptions.toJsFn)
    __obj.updateDynamic("newDataset")(newDataset.toJsFn)
    __obj.updateDynamic("newDatasetAccess")(newDatasetAccess.toJsFn)
    __obj.updateDynamic("newDatasetReference")(newDatasetReference.toJsFn)
    __obj.updateDynamic("newDestinationTableProperties")(newDestinationTableProperties.toJsFn)
    __obj.updateDynamic("newEncryptionConfiguration")(newEncryptionConfiguration.toJsFn)
    __obj.updateDynamic("newErrorProto")(newErrorProto.toJsFn)
    __obj.updateDynamic("newExplainQueryStage")(newExplainQueryStage.toJsFn)
    __obj.updateDynamic("newExplainQueryStep")(newExplainQueryStep.toJsFn)
    __obj.updateDynamic("newExternalDataConfiguration")(newExternalDataConfiguration.toJsFn)
    __obj.updateDynamic("newGoogleSheetsOptions")(newGoogleSheetsOptions.toJsFn)
    __obj.updateDynamic("newJob")(newJob.toJsFn)
    __obj.updateDynamic("newJobConfiguration")(newJobConfiguration.toJsFn)
    __obj.updateDynamic("newJobConfigurationExtract")(newJobConfigurationExtract.toJsFn)
    __obj.updateDynamic("newJobConfigurationLoad")(newJobConfigurationLoad.toJsFn)
    __obj.updateDynamic("newJobConfigurationQuery")(newJobConfigurationQuery.toJsFn)
    __obj.updateDynamic("newJobConfigurationTableCopy")(newJobConfigurationTableCopy.toJsFn)
    __obj.updateDynamic("newJobReference")(newJobReference.toJsFn)
    __obj.updateDynamic("newJobStatistics")(newJobStatistics.toJsFn)
    __obj.updateDynamic("newJobStatistics2")(newJobStatistics2.toJsFn)
    __obj.updateDynamic("newJobStatistics2ReservationUsage")(newJobStatistics2ReservationUsage.toJsFn)
    __obj.updateDynamic("newJobStatistics3")(newJobStatistics3.toJsFn)
    __obj.updateDynamic("newJobStatistics4")(newJobStatistics4.toJsFn)
    __obj.updateDynamic("newJobStatisticsReservationUsage")(newJobStatisticsReservationUsage.toJsFn)
    __obj.updateDynamic("newJobStatus")(newJobStatus.toJsFn)
    __obj.updateDynamic("newMaterializedViewDefinition")(newMaterializedViewDefinition.toJsFn)
    __obj.updateDynamic("newModelDefinition")(newModelDefinition.toJsFn)
    __obj.updateDynamic("newModelDefinitionModelOptions")(newModelDefinitionModelOptions.toJsFn)
    __obj.updateDynamic("newQueryParameter")(newQueryParameter.toJsFn)
    __obj.updateDynamic("newQueryParameterType")(newQueryParameterType.toJsFn)
    __obj.updateDynamic("newQueryParameterTypeStructTypes")(newQueryParameterTypeStructTypes.toJsFn)
    __obj.updateDynamic("newQueryParameterValue")(newQueryParameterValue.toJsFn)
    __obj.updateDynamic("newQueryRequest")(newQueryRequest.toJsFn)
    __obj.updateDynamic("newQueryTimelineSample")(newQueryTimelineSample.toJsFn)
    __obj.updateDynamic("newRangePartitioning")(newRangePartitioning.toJsFn)
    __obj.updateDynamic("newRangePartitioningRange")(newRangePartitioningRange.toJsFn)
    __obj.updateDynamic("newRoutineReference")(newRoutineReference.toJsFn)
    __obj.updateDynamic("newStreamingbuffer")(newStreamingbuffer.toJsFn)
    __obj.updateDynamic("newTable")(newTable.toJsFn)
    __obj.updateDynamic("newTableDataInsertAllRequest")(newTableDataInsertAllRequest.toJsFn)
    __obj.updateDynamic("newTableDataInsertAllRequestRows")(newTableDataInsertAllRequestRows.toJsFn)
    __obj.updateDynamic("newTableFieldSchema")(newTableFieldSchema.toJsFn)
    __obj.updateDynamic("newTableFieldSchemaCategories")(newTableFieldSchemaCategories.toJsFn)
    __obj.updateDynamic("newTableReference")(newTableReference.toJsFn)
    __obj.updateDynamic("newTableSchema")(newTableSchema.toJsFn)
    __obj.updateDynamic("newTimePartitioning")(newTimePartitioning.toJsFn)
    __obj.updateDynamic("newUserDefinedFunctionResource")(newUserDefinedFunctionResource.toJsFn)
    __obj.updateDynamic("newViewDefinition")(newViewDefinition.toJsFn)
    if (Datasets != null) __obj.updateDynamic("Datasets")(Datasets.asInstanceOf[js.Any])
    if (Jobs != null) __obj.updateDynamic("Jobs")(Jobs.asInstanceOf[js.Any])
    if (Projects != null) __obj.updateDynamic("Projects")(Projects.asInstanceOf[js.Any])
    if (Tabledata != null) __obj.updateDynamic("Tabledata")(Tabledata.asInstanceOf[js.Any])
    if (Tables != null) __obj.updateDynamic("Tables")(Tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bigquery_]
  }
}

