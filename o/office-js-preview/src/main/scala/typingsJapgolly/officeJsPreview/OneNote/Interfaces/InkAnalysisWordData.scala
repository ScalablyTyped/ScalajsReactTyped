package typingsJapgolly.officeJsPreview.OneNote.Interfaces

import typingsJapgolly.officeJsPreview.OneNote.InkStrokePointer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `inkAnalysisWord.toJSON()`. */
trait InkAnalysisWordData extends StObject {
  
  /**
    * Gets the ID of the InkAnalysisWord object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the recognized language in this inkAnalysisWord. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var languageId: js.UndefOr[String] = js.undefined
  
  /**
    * Reference to the parent InkAnalysisLine. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var line: js.UndefOr[InkAnalysisLineData] = js.undefined
  
  /**
    * Weak references to the ink strokes that were recognized as part of this ink analysis word. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var strokePointers: js.UndefOr[js.Array[InkStrokePointer]] = js.undefined
  
  /**
    * The words that were recognized in this ink word, in order of likelihood. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var wordAlternates: js.UndefOr[js.Array[String]] = js.undefined
}
object InkAnalysisWordData {
  
  inline def apply(): InkAnalysisWordData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisWordData]
  }
  
  extension [Self <: InkAnalysisWordData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLanguageId(value: String): Self = StObject.set(x, "languageId", value.asInstanceOf[js.Any])
    
    inline def setLanguageIdUndefined: Self = StObject.set(x, "languageId", js.undefined)
    
    inline def setLine(value: InkAnalysisLineData): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setStrokePointers(value: js.Array[InkStrokePointer]): Self = StObject.set(x, "strokePointers", value.asInstanceOf[js.Any])
    
    inline def setStrokePointersUndefined: Self = StObject.set(x, "strokePointers", js.undefined)
    
    inline def setStrokePointersVarargs(value: InkStrokePointer*): Self = StObject.set(x, "strokePointers", js.Array(value*))
    
    inline def setWordAlternates(value: js.Array[String]): Self = StObject.set(x, "wordAlternates", value.asInstanceOf[js.Any])
    
    inline def setWordAlternatesUndefined: Self = StObject.set(x, "wordAlternates", js.undefined)
    
    inline def setWordAlternatesVarargs(value: String*): Self = StObject.set(x, "wordAlternates", js.Array(value*))
  }
}
