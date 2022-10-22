package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostalCodesResource extends StObject {
  
  /** Gets one postal code by ID. */
  def get(): Request[PostalCode] = js.native
  def get(request: Code): Request[PostalCode] = js.native
  
  /** Retrieves a list of postal codes. */
  def list(): Request[PostalCodesListResponse] = js.native
  def list(request: Callback): Request[PostalCodesListResponse] = js.native
}
