package typingsJapgolly.monacoEditor.anon

import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model extends StObject {
  
  val model: ITextModel
  
  val oldLanguage: String
}
object Model {
  
  inline def apply(model: ITextModel, oldLanguage: String): Model = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], oldLanguage = oldLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
  
  extension [Self <: Model](x: Self) {
    
    inline def setModel(value: ITextModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setOldLanguage(value: String): Self = StObject.set(x, "oldLanguage", value.asInstanceOf[js.Any])
  }
}
