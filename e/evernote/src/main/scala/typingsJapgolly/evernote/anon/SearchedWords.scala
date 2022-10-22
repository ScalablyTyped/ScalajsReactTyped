package typingsJapgolly.evernote.anon

import typingsJapgolly.evernote.mod.NoteStore.NoteMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchedWords extends StObject {
  
  var notes: js.UndefOr[js.Array[NoteMetadata]] = js.undefined
  
  var searchedWords: js.UndefOr[js.Array[String]] = js.undefined
  
  var startIndex: js.UndefOr[Double] = js.undefined
  
  var stoppedWords: js.UndefOr[js.Array[String]] = js.undefined
  
  var totalNotes: js.UndefOr[Double] = js.undefined
  
  var updateCount: js.UndefOr[Double] = js.undefined
}
object SearchedWords {
  
  inline def apply(): SearchedWords = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchedWords]
  }
  
  extension [Self <: SearchedWords](x: Self) {
    
    inline def setNotes(value: js.Array[NoteMetadata]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNotesVarargs(value: NoteMetadata*): Self = StObject.set(x, "notes", js.Array(value*))
    
    inline def setSearchedWords(value: js.Array[String]): Self = StObject.set(x, "searchedWords", value.asInstanceOf[js.Any])
    
    inline def setSearchedWordsUndefined: Self = StObject.set(x, "searchedWords", js.undefined)
    
    inline def setSearchedWordsVarargs(value: String*): Self = StObject.set(x, "searchedWords", js.Array(value*))
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setStoppedWords(value: js.Array[String]): Self = StObject.set(x, "stoppedWords", value.asInstanceOf[js.Any])
    
    inline def setStoppedWordsUndefined: Self = StObject.set(x, "stoppedWords", js.undefined)
    
    inline def setStoppedWordsVarargs(value: String*): Self = StObject.set(x, "stoppedWords", js.Array(value*))
    
    inline def setTotalNotes(value: Double): Self = StObject.set(x, "totalNotes", value.asInstanceOf[js.Any])
    
    inline def setTotalNotesUndefined: Self = StObject.set(x, "totalNotes", js.undefined)
    
    inline def setUpdateCount(value: Double): Self = StObject.set(x, "updateCount", value.asInstanceOf[js.Any])
    
    inline def setUpdateCountUndefined: Self = StObject.set(x, "updateCount", js.undefined)
  }
}
