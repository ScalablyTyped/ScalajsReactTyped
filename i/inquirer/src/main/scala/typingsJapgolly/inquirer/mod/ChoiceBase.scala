package typingsJapgolly.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChoiceBase extends StObject {
  
  /**
    * The type of the choice.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ChoiceBase {
  
  inline def apply(): ChoiceBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChoiceBase]
  }
  
  extension [Self <: ChoiceBase](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
