package typingsJapgolly.monacoEditor.mod.editor

import typingsJapgolly.monacoEditor.mod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPasteEvent extends StObject {
  
  val languageId: String | Null
  
  val range: Range
}
object IPasteEvent {
  
  inline def apply(range: Range): IPasteEvent = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], languageId = null)
    __obj.asInstanceOf[IPasteEvent]
  }
  
  extension [Self <: IPasteEvent](x: Self) {
    
    inline def setLanguageId(value: String): Self = StObject.set(x, "languageId", value.asInstanceOf[js.Any])
    
    inline def setLanguageIdNull: Self = StObject.set(x, "languageId", null)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
