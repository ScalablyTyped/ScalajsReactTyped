package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.Height
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.ProfileIdQuotaUserResourceUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizesResource extends StObject {
  
  /** Gets one size by ID. */
  def get(): Request[Size] = js.native
  def get(request: Alt): Request[Size] = js.native
  
  def insert(request: Callback, body: Size): Request[Size] = js.native
  /** Inserts a new size. */
  def insert(request: ProfileIdQuotaUserResourceUploadType): Request[Size] = js.native
  
  /**
    * Retrieves a list of sizes, possibly filtered. Retrieved sizes are globally unique and may include values not currently in use by your account. Due to this, the list of sizes
    * returned by this method may differ from the list seen in the Trafficking UI.
    */
  def list(): Request[SizesListResponse] = js.native
  def list(request: Height): Request[SizesListResponse] = js.native
}
