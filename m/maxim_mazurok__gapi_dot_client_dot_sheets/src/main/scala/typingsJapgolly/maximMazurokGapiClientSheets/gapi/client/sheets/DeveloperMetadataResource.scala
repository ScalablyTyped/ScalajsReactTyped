package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import typingsJapgolly.maximMazurokGapiClientSheets.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientSheets.anon.Alt
import typingsJapgolly.maximMazurokGapiClientSheets.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeveloperMetadataResource extends StObject {
  
  /** Returns the developer metadata with the specified ID. The caller must specify the spreadsheet ID and the developer metadata's unique metadataId. */
  def get(): typingsJapgolly.gapiClient.gapi.client.Request[DeveloperMetadata] = js.native
  def get(request: Accesstoken): typingsJapgolly.gapiClient.gapi.client.Request[DeveloperMetadata] = js.native
  
  /**
    * Returns all developer metadata matching the specified DataFilter. If the provided DataFilter represents a DeveloperMetadataLookup object, this will return all DeveloperMetadata
    * entries selected by it. If the DataFilter represents a location in a spreadsheet, this will return all developer metadata associated with locations intersecting that region.
    */
  def search(request: Alt): typingsJapgolly.gapiClient.gapi.client.Request[SearchDeveloperMetadataResponse] = js.native
  def search(request: Callback, body: SearchDeveloperMetadataRequest): typingsJapgolly.gapiClient.gapi.client.Request[SearchDeveloperMetadataResponse] = js.native
}
