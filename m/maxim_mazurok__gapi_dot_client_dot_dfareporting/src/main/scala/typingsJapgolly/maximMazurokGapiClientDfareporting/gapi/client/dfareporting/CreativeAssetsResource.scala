package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.AccesstokenAdvertiserId
import typingsJapgolly.maximMazurokGapiClientDfareporting.anon.AdvertiserIdAlt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeAssetsResource extends StObject {
  
  /** Inserts a new creative asset. */
  def insert(request: AccesstokenAdvertiserId): Request[CreativeAssetMetadata] = js.native
  def insert(request: AdvertiserIdAlt, body: CreativeAssetMetadata): Request[CreativeAssetMetadata] = js.native
}
