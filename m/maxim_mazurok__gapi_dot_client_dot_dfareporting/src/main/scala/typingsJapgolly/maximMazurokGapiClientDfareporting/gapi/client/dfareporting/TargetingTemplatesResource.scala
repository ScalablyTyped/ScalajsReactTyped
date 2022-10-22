package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.AccesstokenAltCallbackFieldsId
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.AccesstokenAltCallbackFieldsKey
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.IdsKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetingTemplatesResource extends StObject {
  
  /** Gets one targeting template by ID. */
  def get(): Request[TargetingTemplate] = js.native
  def get(request: Alt): Request[TargetingTemplate] = js.native
  
  /** Inserts a new targeting template. */
  def insert(request: AccesstokenAltCallbackFieldsKey): Request[TargetingTemplate] = js.native
  def insert(request: Callback, body: TargetingTemplate): Request[TargetingTemplate] = js.native
  
  /** Retrieves a list of targeting templates, optionally filtered. This method supports paging. */
  def list(): Request[TargetingTemplatesListResponse] = js.native
  def list(request: IdsKey): Request[TargetingTemplatesListResponse] = js.native
  
  /** Updates an existing targeting template. This method supports patch semantics. */
  def patch(request: AccesstokenAltCallbackFieldsId): Request[TargetingTemplate] = js.native
  def patch(request: Alt, body: TargetingTemplate): Request[TargetingTemplate] = js.native
  
  /** Updates an existing targeting template. */
  def update(request: AccesstokenAltCallbackFieldsKey): Request[TargetingTemplate] = js.native
  def update(request: Callback, body: TargetingTemplate): Request[TargetingTemplate] = js.native
}
