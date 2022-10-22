package typingsJapgolly.wordpressCoreData.anon

import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.wordpressCoreData.mod.Autosave
import typingsJapgolly.wordpressCoreData.mod.Entity
import typingsJapgolly.wordpressCoreData.schemaMod.Schema.User
import typingsJapgolly.wordpressCoreData.wordpressCoreDataStrings.create
import typingsJapgolly.wordpressCoreData.wordpressCoreDataStrings.delete
import typingsJapgolly.wordpressCoreData.wordpressCoreDataStrings.read
import typingsJapgolly.wordpressCoreData.wordpressCoreDataStrings.update
import typingsJapgolly.wordpressCoreData.wordpressCoreDataStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedSelectors extends StObject {
  
  def canUser(action: create | read | update | delete, resource: String, id: String): js.UndefOr[Boolean] = js.native
  def canUser(action: create | read | update | delete, resource: String, id: Double): js.UndefOr[Boolean] = js.native
  
  def getAuthors(): js.Array[User[view]] = js.native
  
  def getAutosave(postType: String, postId: Double, authorId: Double): js.UndefOr[Autosave] = js.native
  
  def getAutosaves(postType: String, postId: Double): js.UndefOr[js.Array[Autosave]] = js.native
  
  def getCurrentUser(): User[view] = js.native
  
  def getEmbedPreview(url: String): js.UndefOr[Record[String, Any]] = js.native
  
  def getEntitiesByKind(kind: String): js.Array[Entity] = js.native
  
  def getEntity(kind: String, name: String): js.UndefOr[Entity] = js.native
  
  def getEntityRecord(kind: String, name: String, key: Double): js.UndefOr[Record[String, Any]] = js.native
  
  def getEntityRecords(kind: String, name: String): js.Array[Record[String, Any]] = js.native
  def getEntityRecords(kind: String, name: String, query: Record[String, Any]): js.Array[Record[String, Any]] = js.native
  
  def getThemeSupports(): Partial[Formats] = js.native
  
  def getUserQueryResults(queryId: String): js.Array[User[view]] = js.native
  
  def hasFetchedAutosaves(postType: String, postId: Double): Boolean = js.native
  
  def hasUploadPermissions(): Boolean = js.native
  
  def isPreviewEmbedFallback(url: String): Boolean = js.native
  
  def isRequestingEmbedPreview(url: String): Boolean = js.native
}
