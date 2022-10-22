package typingsJapgolly.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCorrect extends StObject {
  
  /* private */ @JSName("Access.AutoCorrect_typekey")
  var AccessDotAutoCorrect_typekey: AutoCorrect
  
  var DisplayAutoCorrectOptions: Boolean
  
  def IsMemberSafe(dispid: Double): Boolean
}
object AutoCorrect {
  
  inline def apply(
    AccessDotAutoCorrect_typekey: AutoCorrect,
    DisplayAutoCorrectOptions: Boolean,
    IsMemberSafe: Double => Boolean
  ): AutoCorrect = {
    val __obj = js.Dynamic.literal(DisplayAutoCorrectOptions = DisplayAutoCorrectOptions.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe))
    __obj.updateDynamic("Access.AutoCorrect_typekey")(AccessDotAutoCorrect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCorrect]
  }
  
  extension [Self <: AutoCorrect](x: Self) {
    
    inline def setAccessDotAutoCorrect_typekey(value: AutoCorrect): Self = StObject.set(x, "Access.AutoCorrect_typekey", value.asInstanceOf[js.Any])
    
    inline def setDisplayAutoCorrectOptions(value: Boolean): Self = StObject.set(x, "DisplayAutoCorrectOptions", value.asInstanceOf[js.Any])
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
  }
}
