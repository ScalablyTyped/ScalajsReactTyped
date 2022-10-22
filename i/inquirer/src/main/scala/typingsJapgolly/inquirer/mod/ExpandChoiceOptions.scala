package typingsJapgolly.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandChoiceOptions
  extends StObject
     with ChoiceOptions {
  
  /**
    * The key to press for selecting the choice.
    */
  var key: js.UndefOr[String] = js.undefined
}
object ExpandChoiceOptions {
  
  inline def apply(): ExpandChoiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandChoiceOptions]
  }
  
  extension [Self <: ExpandChoiceOptions](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
