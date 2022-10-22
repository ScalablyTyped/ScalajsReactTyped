package typingsJapgolly.activexWord

import typingsJapgolly.activexWord.Word.Application
import typingsJapgolly.activexWord.Word.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObjectNameMap extends StObject {
  
  @JSName("Word.Application")
  var WordDotApplication: Application
  
  @JSName("Word.Document")
  var WordDotDocument: Document
}
object ActiveXObjectNameMap {
  
  inline def apply(WordDotApplication: Application, WordDotDocument: Document): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Word.Application")(WordDotApplication.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Document")(WordDotDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  extension [Self <: ActiveXObjectNameMap](x: Self) {
    
    inline def setWordDotApplication(value: Application): Self = StObject.set(x, "Word.Application", value.asInstanceOf[js.Any])
    
    inline def setWordDotDocument(value: Document): Self = StObject.set(x, "Word.Document", value.asInstanceOf[js.Any])
  }
}
