package typingsJapgolly.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSqladmin.anon.DatabaseVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlagsResource extends StObject {
  
  /** Lists all available database flags for Cloud SQL instances. */
  def list(): Request[FlagsListResponse] = js.native
  def list(request: DatabaseVersion): Request[FlagsListResponse] = js.native
}
