package typingsJapgolly.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBigquery.anon.AltDatasetId
import typingsJapgolly.maximMazurokGapiClientBigquery.anon.SelectedFields
import typingsJapgolly.maximMazurokGapiClientBigquery.anon.TableId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabledataResource extends StObject {
  
  def insertAll(request: AltDatasetId, body: TableDataInsertAllRequest): Request[TableDataInsertAllResponse] = js.native
  /** Streams data into BigQuery one record at a time without needing to run a load job. Requires the WRITER dataset role. */
  def insertAll(request: TableId): Request[TableDataInsertAllResponse] = js.native
  
  /** Retrieves table data from a specified set of rows. Requires the READER dataset role. */
  def list(): Request[TableDataList] = js.native
  def list(request: SelectedFields): Request[TableDataList] = js.native
}
