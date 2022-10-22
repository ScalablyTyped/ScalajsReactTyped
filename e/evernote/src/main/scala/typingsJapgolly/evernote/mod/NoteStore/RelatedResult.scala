package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.anon.CacheExpires
import typingsJapgolly.evernote.mod.Types.Note
import typingsJapgolly.evernote.mod.Types.Notebook
import typingsJapgolly.evernote.mod.Types.NotebookDescriptor
import typingsJapgolly.evernote.mod.Types.RelatedContent
import typingsJapgolly.evernote.mod.Types.Tag
import typingsJapgolly.evernote.mod.Types.UserProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.RelatedResult")
@js.native
open class RelatedResult () extends StObject {
  def this(args: CacheExpires) = this()
  
  var cacheExpires: js.UndefOr[Double] = js.native
  
  var cacheKey: js.UndefOr[String] = js.native
  
  var containingNotebooks: js.UndefOr[js.Array[NotebookDescriptor]] = js.native
  
  var debugInfo: js.UndefOr[String] = js.native
  
  var experts: js.UndefOr[js.Array[UserProfile]] = js.native
  
  var notebooks: js.UndefOr[js.Array[Notebook]] = js.native
  
  var notes: js.UndefOr[js.Array[Note]] = js.native
  
  var relatedContent: js.UndefOr[js.Array[RelatedContent]] = js.native
  
  var tags: js.UndefOr[js.Array[Tag]] = js.native
}
