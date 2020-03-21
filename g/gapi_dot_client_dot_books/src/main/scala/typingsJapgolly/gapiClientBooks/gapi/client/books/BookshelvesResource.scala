package typingsJapgolly.gapiClientBooks.gapi.client.books

import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBooks.AnonKey
import typingsJapgolly.gapiClientBooks.AnonOauthtoken
import typingsJapgolly.gapiClientBooks.AnonPrettyPrint
import typingsJapgolly.gapiClientBooks.AnonQuotaUser
import typingsJapgolly.gapiClientBooks.AnonShelf
import typingsJapgolly.gapiClientBooks.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookshelvesResource extends js.Object {
  var volumes: VolumesResource = js.native
  /** Adds a volume to a bookshelf. */
  def addVolume(request: AnonPrettyPrint): Request_[Unit] = js.native
  /** Clears all volumes from a bookshelf. */
  def clearVolumes(request: AnonQuotaUser): Request_[Unit] = js.native
  /** Retrieves metadata for a specific bookshelf for the specified user. */
  def get(request: AnonKey): Request_[Bookshelf] = js.native
  /** Retrieves metadata for a specific bookshelf belonging to the authenticated user. */
  def get(request: AnonQuotaUser): Request_[Bookshelf] = js.native
  /** Retrieves a list of public bookshelves for the specified user. */
  def list(request: AnonOauthtoken): Request_[Bookshelves] = js.native
  /** Retrieves a list of bookshelves belonging to the authenticated user. */
  def list(request: AnonUserIp): Request_[Bookshelves] = js.native
  /** Moves a volume within a bookshelf. */
  def moveVolume(request: AnonShelf): Request_[Unit] = js.native
  /** Removes a volume from a bookshelf. */
  def removeVolume(request: AnonPrettyPrint): Request_[Unit] = js.native
}

