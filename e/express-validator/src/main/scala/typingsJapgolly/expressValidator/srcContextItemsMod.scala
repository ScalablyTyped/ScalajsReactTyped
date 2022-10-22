package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.srcBaseMod.CustomValidator
import typingsJapgolly.expressValidator.srcBaseMod.StandardValidator
import typingsJapgolly.expressValidator.srcChainValidationChainMod.ValidationChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcContextItemsMod {
  
  @JSImport("express-validator/src/context-items", "ChainCondition")
  @js.native
  open class ChainCondition protected ()
    extends typingsJapgolly.expressValidator.srcContextItemsChainConditionMod.ChainCondition {
    def this(chain: ValidationChain) = this()
  }
  
  @JSImport("express-validator/src/context-items", "CustomCondition")
  @js.native
  open class CustomCondition protected ()
    extends typingsJapgolly.expressValidator.srcContextItemsCustomConditionMod.CustomCondition {
    def this(condition: CustomValidator) = this()
  }
  
  @JSImport("express-validator/src/context-items", "CustomValidation")
  @js.native
  open class CustomValidation protected ()
    extends typingsJapgolly.expressValidator.srcContextItemsCustomValidationMod.CustomValidation {
    def this(validator: CustomValidator, negated: Boolean) = this()
  }
  
  @JSImport("express-validator/src/context-items", "StandardValidation")
  @js.native
  open class StandardValidation protected ()
    extends typingsJapgolly.expressValidator.srcContextItemsStandardValidationMod.StandardValidation {
    def this(validator: StandardValidator, negated: Boolean) = this()
    def this(validator: StandardValidator, negated: Boolean, options: js.Array[Any]) = this()
  }
}
