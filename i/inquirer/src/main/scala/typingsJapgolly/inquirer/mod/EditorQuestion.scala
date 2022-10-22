package typingsJapgolly.inquirer.mod

import typingsJapgolly.inquirer.inquirerStrings.editor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorQuestion[T /* <: Answers */]
  extends StObject
     with EditorQuestionOptions[T] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_EditorQuestion: editor
}
object EditorQuestion {
  
  inline def apply[T /* <: Answers */](): EditorQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("editor")
    __obj.asInstanceOf[EditorQuestion[T]]
  }
  
  extension [Self <: EditorQuestion[?], T /* <: Answers */](x: Self & EditorQuestion[T]) {
    
    inline def setType(value: editor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
