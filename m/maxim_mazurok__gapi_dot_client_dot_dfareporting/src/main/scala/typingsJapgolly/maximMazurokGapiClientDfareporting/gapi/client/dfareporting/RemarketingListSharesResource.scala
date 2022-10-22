package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.FieldsKeyOauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.IdKeyOauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.RemarketingListId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemarketingListSharesResource extends StObject {
  
  /** Gets one remarketing list share by remarketing list ID. */
  def get(): Request[RemarketingListShare] = js.native
  def get(request: RemarketingListId): Request[RemarketingListShare] = js.native
  
  def patch(request: Alt, body: RemarketingListShare): Request[RemarketingListShare] = js.native
  /** Updates an existing remarketing list share. This method supports patch semantics. */
  def patch(request: IdKeyOauthtokenPrettyPrint): Request[RemarketingListShare] = js.native
  
  def update(request: Callback, body: RemarketingListShare): Request[RemarketingListShare] = js.native
  /** Updates an existing remarketing list share. */
  def update(request: FieldsKeyOauthtokenPrettyPrint): Request[RemarketingListShare] = js.native
}
