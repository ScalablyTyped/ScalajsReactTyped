package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import typingsJapgolly.maximMazurokGapiClientSheets.anon.Callback
import typingsJapgolly.maximMazurokGapiClientSheets.anon.DateTimeRenderOption
import typingsJapgolly.maximMazurokGapiClientSheets.anon.IncludeValuesInResponse
import typingsJapgolly.maximMazurokGapiClientSheets.anon.InsertDataOption
import typingsJapgolly.maximMazurokGapiClientSheets.anon.MajorDimension
import typingsJapgolly.maximMazurokGapiClientSheets.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientSheets.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientSheets.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientSheets.anon.Range
import typingsJapgolly.maximMazurokGapiClientSheets.anon.Resource
import typingsJapgolly.maximMazurokGapiClientSheets.anon.ResponseDateTimeRenderOption
import typingsJapgolly.maximMazurokGapiClientSheets.anon.ResponseValueRenderOption
import typingsJapgolly.maximMazurokGapiClientSheets.anon.SpreadsheetId
import typingsJapgolly.maximMazurokGapiClientSheets.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValuesResource extends StObject {
  
  /**
    * Appends values to a spreadsheet. The input range is used to search for existing data and find a "table" within that range. Values will be appended to the next row of the table,
    * starting with the first column of the table. See the [guide](/sheets/api/guides/values#appending_values) and [sample code](/sheets/api/samples/writing#append_values) for specific
    * details of how tables are detected and data is appended. The caller must specify the spreadsheet ID, range, and a valueInputOption. The `valueInputOption` only controls how the
    * input data will be added to the sheet (column-wise or row-wise), it does not influence what cell the data starts being written to.
    */
  def append(request: IncludeValuesInResponse): typingsJapgolly.gapiClient.gapi.client.Request[AppendValuesResponse] = js.native
  def append(request: InsertDataOption, body: ValueRange): typingsJapgolly.gapiClient.gapi.client.Request[AppendValuesResponse] = js.native
  
  def batchClear(request: Callback, body: BatchClearValuesRequest): typingsJapgolly.gapiClient.gapi.client.Request[BatchClearValuesResponse] = js.native
  /**
    * Clears one or more ranges of values from a spreadsheet. The caller must specify the spreadsheet ID and one or more ranges. Only values are cleared -- all other properties of the
    * cell (such as formatting and data validation) are kept.
    */
  def batchClear(request: Oauthtoken): typingsJapgolly.gapiClient.gapi.client.Request[BatchClearValuesResponse] = js.native
  
  def batchClearByDataFilter(request: Callback, body: BatchClearValuesByDataFilterRequest): typingsJapgolly.gapiClient.gapi.client.Request[BatchClearValuesByDataFilterResponse] = js.native
  /**
    * Clears one or more ranges of values from a spreadsheet. The caller must specify the spreadsheet ID and one or more DataFilters. Ranges matching any of the specified data filters
    * will be cleared. Only values are cleared -- all other properties of the cell (such as formatting, data validation, etc..) are kept.
    */
  def batchClearByDataFilter(request: PrettyPrint): typingsJapgolly.gapiClient.gapi.client.Request[BatchClearValuesByDataFilterResponse] = js.native
  
  /** Returns one or more ranges of values from a spreadsheet. The caller must specify the spreadsheet ID and one or more ranges. */
  def batchGet(): typingsJapgolly.gapiClient.gapi.client.Request[BatchGetValuesResponse] = js.native
  def batchGet(request: DateTimeRenderOption): typingsJapgolly.gapiClient.gapi.client.Request[BatchGetValuesResponse] = js.native
  
  def batchGetByDataFilter(request: Callback, body: BatchGetValuesByDataFilterRequest): typingsJapgolly.gapiClient.gapi.client.Request[BatchGetValuesByDataFilterResponse] = js.native
  /**
    * Returns one or more ranges of values that match the specified data filters. The caller must specify the spreadsheet ID and one or more DataFilters. Ranges that match any of the data
    * filters in the request will be returned.
    */
  def batchGetByDataFilter(request: QuotaUser): typingsJapgolly.gapiClient.gapi.client.Request[BatchGetValuesByDataFilterResponse] = js.native
  
  def batchUpdate(request: Callback, body: BatchUpdateValuesRequest): typingsJapgolly.gapiClient.gapi.client.Request[BatchUpdateValuesResponse] = js.native
  /** Sets values in one or more ranges of a spreadsheet. The caller must specify the spreadsheet ID, a valueInputOption, and one or more ValueRanges. */
  def batchUpdate(request: Resource): typingsJapgolly.gapiClient.gapi.client.Request[BatchUpdateValuesResponse] = js.native
  
  def batchUpdateByDataFilter(request: Callback, body: BatchUpdateValuesByDataFilterRequest): typingsJapgolly.gapiClient.gapi.client.Request[BatchUpdateValuesByDataFilterResponse] = js.native
  /** Sets values in one or more ranges of a spreadsheet. The caller must specify the spreadsheet ID, a valueInputOption, and one or more DataFilterValueRanges. */
  def batchUpdateByDataFilter(request: SpreadsheetId): typingsJapgolly.gapiClient.gapi.client.Request[BatchUpdateValuesByDataFilterResponse] = js.native
  
  /**
    * Clears values from a spreadsheet. The caller must specify the spreadsheet ID and range. Only values are cleared -- all other properties of the cell (such as formatting, data
    * validation, etc..) are kept.
    */
  def clear(request: Range): typingsJapgolly.gapiClient.gapi.client.Request[ClearValuesResponse] = js.native
  def clear(request: UploadType, body: ClearValuesRequest): typingsJapgolly.gapiClient.gapi.client.Request[ClearValuesResponse] = js.native
  
  /** Returns a range of values from a spreadsheet. The caller must specify the spreadsheet ID and a range. */
  def get(): typingsJapgolly.gapiClient.gapi.client.Request[ValueRange] = js.native
  def get(request: MajorDimension): typingsJapgolly.gapiClient.gapi.client.Request[ValueRange] = js.native
  
  /** Sets values in a range of a spreadsheet. The caller must specify the spreadsheet ID, range, and a valueInputOption. */
  def update(request: ResponseDateTimeRenderOption): typingsJapgolly.gapiClient.gapi.client.Request[UpdateValuesResponse] = js.native
  def update(request: ResponseValueRenderOption, body: ValueRange): typingsJapgolly.gapiClient.gapi.client.Request[UpdateValuesResponse] = js.native
}
