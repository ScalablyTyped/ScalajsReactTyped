package typingsJapgolly.evernote.anon

import typingsJapgolly.evernote.mod.Types.LinkedNotebook
import typingsJapgolly.evernote.mod.Types.Notebook
import typingsJapgolly.evernote.mod.Types.Resource
import typingsJapgolly.evernote.mod.Types.SavedSearch
import typingsJapgolly.evernote.mod.Types.Tag
import typingsJapgolly.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkHighUSN extends StObject {
  
  var chunkHighUSN: js.UndefOr[Double] = js.undefined
  
  var currentTime: js.UndefOr[Timestamp] = js.undefined
  
  var expungedLinkedNotebooks: js.UndefOr[js.Array[typingsJapgolly.evernote.mod.Types.Guid]] = js.undefined
  
  var expungedNotebooks: js.UndefOr[js.Array[typingsJapgolly.evernote.mod.Types.Guid]] = js.undefined
  
  var expungedNotes: js.UndefOr[js.Array[typingsJapgolly.evernote.mod.Types.Guid]] = js.undefined
  
  var expungedSearches: js.UndefOr[js.Array[typingsJapgolly.evernote.mod.Types.Guid]] = js.undefined
  
  var expungedTags: js.UndefOr[js.Array[typingsJapgolly.evernote.mod.Types.Guid]] = js.undefined
  
  var linkedNotebooks: js.UndefOr[js.Array[LinkedNotebook]] = js.undefined
  
  var notebooks: js.UndefOr[js.Array[Notebook]] = js.undefined
  
  var notes: js.UndefOr[js.Array[typingsJapgolly.evernote.mod.Types.Note]] = js.undefined
  
  var resources: js.UndefOr[js.Array[Resource]] = js.undefined
  
  var searches: js.UndefOr[js.Array[SavedSearch]] = js.undefined
  
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
  
  var updateCount: js.UndefOr[Double] = js.undefined
}
object ChunkHighUSN {
  
  inline def apply(): ChunkHighUSN = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkHighUSN]
  }
  
  extension [Self <: ChunkHighUSN](x: Self) {
    
    inline def setChunkHighUSN(value: Double): Self = StObject.set(x, "chunkHighUSN", value.asInstanceOf[js.Any])
    
    inline def setChunkHighUSNUndefined: Self = StObject.set(x, "chunkHighUSN", js.undefined)
    
    inline def setCurrentTime(value: Timestamp): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
    
    inline def setExpungedLinkedNotebooks(value: js.Array[typingsJapgolly.evernote.mod.Types.Guid]): Self = StObject.set(x, "expungedLinkedNotebooks", value.asInstanceOf[js.Any])
    
    inline def setExpungedLinkedNotebooksUndefined: Self = StObject.set(x, "expungedLinkedNotebooks", js.undefined)
    
    inline def setExpungedLinkedNotebooksVarargs(value: typingsJapgolly.evernote.mod.Types.Guid*): Self = StObject.set(x, "expungedLinkedNotebooks", js.Array(value*))
    
    inline def setExpungedNotebooks(value: js.Array[typingsJapgolly.evernote.mod.Types.Guid]): Self = StObject.set(x, "expungedNotebooks", value.asInstanceOf[js.Any])
    
    inline def setExpungedNotebooksUndefined: Self = StObject.set(x, "expungedNotebooks", js.undefined)
    
    inline def setExpungedNotebooksVarargs(value: typingsJapgolly.evernote.mod.Types.Guid*): Self = StObject.set(x, "expungedNotebooks", js.Array(value*))
    
    inline def setExpungedNotes(value: js.Array[typingsJapgolly.evernote.mod.Types.Guid]): Self = StObject.set(x, "expungedNotes", value.asInstanceOf[js.Any])
    
    inline def setExpungedNotesUndefined: Self = StObject.set(x, "expungedNotes", js.undefined)
    
    inline def setExpungedNotesVarargs(value: typingsJapgolly.evernote.mod.Types.Guid*): Self = StObject.set(x, "expungedNotes", js.Array(value*))
    
    inline def setExpungedSearches(value: js.Array[typingsJapgolly.evernote.mod.Types.Guid]): Self = StObject.set(x, "expungedSearches", value.asInstanceOf[js.Any])
    
    inline def setExpungedSearchesUndefined: Self = StObject.set(x, "expungedSearches", js.undefined)
    
    inline def setExpungedSearchesVarargs(value: typingsJapgolly.evernote.mod.Types.Guid*): Self = StObject.set(x, "expungedSearches", js.Array(value*))
    
    inline def setExpungedTags(value: js.Array[typingsJapgolly.evernote.mod.Types.Guid]): Self = StObject.set(x, "expungedTags", value.asInstanceOf[js.Any])
    
    inline def setExpungedTagsUndefined: Self = StObject.set(x, "expungedTags", js.undefined)
    
    inline def setExpungedTagsVarargs(value: typingsJapgolly.evernote.mod.Types.Guid*): Self = StObject.set(x, "expungedTags", js.Array(value*))
    
    inline def setLinkedNotebooks(value: js.Array[LinkedNotebook]): Self = StObject.set(x, "linkedNotebooks", value.asInstanceOf[js.Any])
    
    inline def setLinkedNotebooksUndefined: Self = StObject.set(x, "linkedNotebooks", js.undefined)
    
    inline def setLinkedNotebooksVarargs(value: LinkedNotebook*): Self = StObject.set(x, "linkedNotebooks", js.Array(value*))
    
    inline def setNotebooks(value: js.Array[Notebook]): Self = StObject.set(x, "notebooks", value.asInstanceOf[js.Any])
    
    inline def setNotebooksUndefined: Self = StObject.set(x, "notebooks", js.undefined)
    
    inline def setNotebooksVarargs(value: Notebook*): Self = StObject.set(x, "notebooks", js.Array(value*))
    
    inline def setNotes(value: js.Array[typingsJapgolly.evernote.mod.Types.Note]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNotesVarargs(value: typingsJapgolly.evernote.mod.Types.Note*): Self = StObject.set(x, "notes", js.Array(value*))
    
    inline def setResources(value: js.Array[Resource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setSearches(value: js.Array[SavedSearch]): Self = StObject.set(x, "searches", value.asInstanceOf[js.Any])
    
    inline def setSearchesUndefined: Self = StObject.set(x, "searches", js.undefined)
    
    inline def setSearchesVarargs(value: SavedSearch*): Self = StObject.set(x, "searches", js.Array(value*))
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUpdateCount(value: Double): Self = StObject.set(x, "updateCount", value.asInstanceOf[js.Any])
    
    inline def setUpdateCountUndefined: Self = StObject.set(x, "updateCount", js.undefined)
  }
}
