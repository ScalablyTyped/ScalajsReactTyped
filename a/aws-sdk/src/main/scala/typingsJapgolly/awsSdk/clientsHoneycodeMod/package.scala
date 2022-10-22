package typingsJapgolly.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.DELIMITED_TEXT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AwsUserArn = String

type BatchErrorMessage = String

type BatchItemId = String

type Cells = js.Array[Cell]

type ClientRequestToken = String

type CreateRowDataList = js.Array[CreateRowData]

type CreatedRowsMap = StringDictionary[RowId]

type DataItems = js.Array[DataItem]

type DelimitedTextDelimiter = String

type Email = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_URL_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_IMPORT_OPTIONS_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_TABLE_ID_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_TABLE_COLUMN_ID_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.TABLE_NOT_FOUND_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.FILE_EMPTY_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_FILE_TYPE_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.FILE_PARSING_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.FILE_SIZE_LIMIT_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.FILE_NOT_FOUND_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM_LIMIT_ERROR
  - java.lang.String
*/
type ErrorCode = _ErrorCode | String

type Fact = String

type FactList = js.Array[Fact]

type FailedBatchItems = js.Array[FailedBatchItem]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTO
  - typingsJapgolly.awsSdk.awsSdkStrings.NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.CURRENCY
  - typingsJapgolly.awsSdk.awsSdkStrings.DATE
  - typingsJapgolly.awsSdk.awsSdkStrings.TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.DATE_TIME
  - typingsJapgolly.awsSdk.awsSdkStrings.PERCENTAGE
  - typingsJapgolly.awsSdk.awsSdkStrings.TEXT
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNTING
  - typingsJapgolly.awsSdk.awsSdkStrings.CONTACT
  - typingsJapgolly.awsSdk.awsSdkStrings.ROWLINK
  - typingsJapgolly.awsSdk.awsSdkStrings.ROWSET
  - java.lang.String
*/
type Format = _Format | String

type FormattedValue = String

type FormattedValuesList = js.Array[FormattedValue]

type Formula = String

type HasHeaderRow = Boolean

type IgnoreEmptyRows = Boolean

type ImportColumnMap = StringDictionary[SourceDataColumnProperties]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`UTF-8`
  - typingsJapgolly.awsSdk.awsSdkStrings.`US-ASCII`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ISO-8859-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`UTF-16BE`
  - typingsJapgolly.awsSdk.awsSdkStrings.`UTF-16LE`
  - typingsJapgolly.awsSdk.awsSdkStrings.`UTF-16`
  - java.lang.String
*/
type ImportDataCharacterEncoding = _ImportDataCharacterEncoding | String

type ImportSourceDataFormat = DELIMITED_TEXT | String

type JobId = String

type MaxResults = Double

type Name = String

type PaginationToken = String

type RawValue = String

type ResourceArn = String

type ResourceId = String

type ResourceIds = js.Array[ResourceId]

type ResultHeader = js.Array[ColumnMetadata]

type ResultRows = js.Array[ResultRow]

type ResultSetMap = StringDictionary[ResultSet]

type RowDataInput = StringDictionary[CellInput]

type RowId = String

type RowIdList = js.Array[RowId]

type SecureURL = String

type SourceDataColumnIndex = Double

type TableColumnName = String

type TableColumns = js.Array[TableColumn]

type TableDataImportJobMessage = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUBMITTED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type TableDataImportJobStatus = _TableDataImportJobStatus | String

type TableName = String

type TableRows = js.Array[TableRow]

type Tables = js.Array[Table]

type TagKey = String

type TagKeysList = js.Array[TagKey]

type TagValue = String

type TagsMap = StringDictionary[TagValue]

type TimestampInMillis = js.Date

type UpdateRowDataList = js.Array[UpdateRowData]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATED
  - typingsJapgolly.awsSdk.awsSdkStrings.APPENDED
  - java.lang.String
*/
type UpsertAction = _UpsertAction | String

type UpsertRowDataList = js.Array[UpsertRowData]

type UpsertRowsResultMap = StringDictionary[UpsertRowsResult]

type VariableName = String

type VariableValueMap = StringDictionary[VariableValue]

type WorkbookCursor = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-03-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
