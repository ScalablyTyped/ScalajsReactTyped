package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.baseMod.CustomValidator
import typingsJapgolly.expressValidator.baseMod.StandardValidator
import typingsJapgolly.expressValidator.validationChainMod.ValidationChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items", JSImport.Namespace)
@js.native
object contextItemsMod extends js.Object {
  @js.native
  class ChainCondition protected ()
    extends typingsJapgolly.expressValidator.chainConditionMod.ChainCondition {
    def this(chain: ValidationChain) = this()
  }
  
  @js.native
  class CustomCondition protected ()
    extends typingsJapgolly.expressValidator.customConditionMod.CustomCondition {
    def this(condition: CustomValidator) = this()
  }
  
  @js.native
  class CustomValidation protected ()
    extends typingsJapgolly.expressValidator.customValidationMod.CustomValidation {
    def this(validator: CustomValidator, negated: Boolean) = this()
  }
  
  @js.native
  class StandardValidation protected ()
    extends typingsJapgolly.expressValidator.standardValidationMod.StandardValidation {
    def this(validator: StandardValidator, negated: Boolean) = this()
    def this(validator: StandardValidator, negated: Boolean, options: js.Array[_]) = this()
  }
  
}

