package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.srcBaseMod.CustomValidator
import typingsJapgolly.expressValidator.srcBaseMod.Meta
import typingsJapgolly.expressValidator.srcContextItemsContextItemMod.ContextItem
import typingsJapgolly.expressValidator.srcContextMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcContextItemsCustomValidationMod {
  
  @JSImport("express-validator/src/context-items/custom-validation", "CustomValidation")
  @js.native
  open class CustomValidation protected ()
    extends StObject
       with ContextItem {
    def this(validator: CustomValidator, negated: Boolean) = this()
    
    var message: Any = js.native
    
    /* private */ val negated: Any = js.native
    
    /* CompleteClass */
    override def run(context: Context, value: Any, meta: Meta): js.Promise[Unit] = js.native
    
    /* private */ val validator: Any = js.native
  }
}
