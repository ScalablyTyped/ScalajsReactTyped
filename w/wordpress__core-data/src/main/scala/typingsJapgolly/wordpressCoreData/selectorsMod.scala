package typingsJapgolly.wordpressCoreData

import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.wordpressApiFetch.AnonFormats
import typingsJapgolly.wordpressApiFetch.mod.Schema.User
import typingsJapgolly.wordpressCoreData.mod.Autosave
import typingsJapgolly.wordpressCoreData.mod.Entity
import typingsJapgolly.wordpressCoreData.wordpressCoreDataStrings.create
import typingsJapgolly.wordpressCoreData.wordpressCoreDataStrings.delete
import typingsJapgolly.wordpressCoreData.wordpressCoreDataStrings.read
import typingsJapgolly.wordpressCoreData.wordpressCoreDataStrings.update
import typingsJapgolly.wordpressCoreData.wordpressCoreDataStrings.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/core-data/selectors", JSImport.Namespace)
@js.native
object selectorsMod extends js.Object {
  @JSName("canUser")
  def canUser_create(action: create, resource: String, id: String): js.UndefOr[Boolean] = js.native
  @JSName("canUser")
  def canUser_create(action: create, resource: String, id: Double): js.UndefOr[Boolean] = js.native
  @JSName("canUser")
  def canUser_delete(action: delete, resource: String, id: String): js.UndefOr[Boolean] = js.native
  @JSName("canUser")
  def canUser_delete(action: delete, resource: String, id: Double): js.UndefOr[Boolean] = js.native
  @JSName("canUser")
  def canUser_read(action: read, resource: String, id: String): js.UndefOr[Boolean] = js.native
  @JSName("canUser")
  def canUser_read(action: read, resource: String, id: Double): js.UndefOr[Boolean] = js.native
  @JSName("canUser")
  def canUser_update(action: update, resource: String, id: String): js.UndefOr[Boolean] = js.native
  @JSName("canUser")
  def canUser_update(action: update, resource: String, id: Double): js.UndefOr[Boolean] = js.native
  def getAuthors(): js.Array[User[view]] = js.native
  def getAutosave(postType: String, postId: Double, authorId: Double): js.UndefOr[Autosave] = js.native
  def getAutosaves(postType: String, postId: Double): js.UndefOr[js.Array[Autosave]] = js.native
  def getCurrentUser(): User[view] = js.native
  def getEmbedPreview(url: String): js.UndefOr[Record[String, _]] = js.native
  def getEntitiesByKind(kind: String): js.Array[Entity] = js.native
  def getEntity(kind: String, name: String): js.UndefOr[Entity] = js.native
  def getEntityRecord(kind: String, name: String, key: Double): js.UndefOr[Record[String, _]] = js.native
  def getEntityRecords(kind: String, name: String): js.Array[Record[String, _]] = js.native
  def getEntityRecords(kind: String, name: String, query: Record[String, _]): js.Array[Record[String, _]] = js.native
  def getThemeSupports(): Partial[AnonFormats] = js.native
  def getUserQueryResults(queryId: String): js.Array[User[view]] = js.native
  def hasFetchedAutosaves(postType: String, postId: Double): Boolean = js.native
  def hasUploadPermissions(): Boolean = js.native
  def isPreviewEmbedFallback(url: String): Boolean = js.native
  def isRequestingEmbedPreview(url: String): Boolean = js.native
}

