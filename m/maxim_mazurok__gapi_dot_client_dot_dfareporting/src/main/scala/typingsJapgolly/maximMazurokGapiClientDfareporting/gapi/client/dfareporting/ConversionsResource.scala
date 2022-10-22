package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.OauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.PrettyPrintProfileId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversionsResource extends StObject {
  
  def batchinsert(request: Callback, body: ConversionsBatchInsertRequest): Request[ConversionsBatchInsertResponse] = js.native
  /** Inserts conversions. */
  def batchinsert(request: OauthtokenPrettyPrint): Request[ConversionsBatchInsertResponse] = js.native
  
  def batchupdate(request: Callback, body: ConversionsBatchUpdateRequest): Request[ConversionsBatchUpdateResponse] = js.native
  /** Updates existing conversions. */
  def batchupdate(request: PrettyPrintProfileId): Request[ConversionsBatchUpdateResponse] = js.native
}
