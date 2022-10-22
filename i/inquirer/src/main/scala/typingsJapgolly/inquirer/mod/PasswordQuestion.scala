package typingsJapgolly.inquirer.mod

import typingsJapgolly.inquirer.inquirerStrings.password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordQuestion[T /* <: Answers */]
  extends StObject
     with PasswordQuestionOptions[T] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_PasswordQuestion: password
}
object PasswordQuestion {
  
  inline def apply[T /* <: Answers */](): PasswordQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("password")
    __obj.asInstanceOf[PasswordQuestion[T]]
  }
  
  extension [Self <: PasswordQuestion[?], T /* <: Answers */](x: Self & PasswordQuestion[T]) {
    
    inline def setType(value: password): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
