package typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientBooks.anon.Fields
import typingsJapgolly.maximMazurokGapiClientBooks.anon.Key
import typingsJapgolly.maximMazurokGapiClientBooks.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientBooks.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientBooks.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientBooks.anon.Shelf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BookshelvesResource extends StObject {
  
  /** Adds a volume to a bookshelf. */
  def addVolume(): Request[js.Object] = js.native
  def addVolume(request: Oauthtoken): Request[js.Object] = js.native
  
  /** Clears all volumes from a bookshelf. */
  def clearVolumes(): Request[js.Object] = js.native
  def clearVolumes(request: PrettyPrint): Request[js.Object] = js.native
  
  /** Retrieves metadata for a specific bookshelf for the specified user. */
  def get(): Request[Bookshelf] = js.native
  def get(request: Fields): Request[Bookshelf] = js.native
  def get(request: PrettyPrint): Request[Bookshelf] = js.native
  
  /** Retrieves a list of public bookshelves for the specified user. */
  def list(): Request[Bookshelves] = js.native
  def list(request: Key): Request[Bookshelves] = js.native
  def list(request: QuotaUser): Request[Bookshelves] = js.native
  
  /** Moves a volume within a bookshelf. */
  def moveVolume(): Request[js.Object] = js.native
  def moveVolume(request: Shelf): Request[js.Object] = js.native
  
  /** Removes a volume from a bookshelf. */
  def removeVolume(): Request[js.Object] = js.native
  def removeVolume(request: Oauthtoken): Request[js.Object] = js.native
  
  var volumes: VolumesResource = js.native
}
