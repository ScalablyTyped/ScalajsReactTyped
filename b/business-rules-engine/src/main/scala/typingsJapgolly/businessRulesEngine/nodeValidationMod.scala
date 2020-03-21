package typingsJapgolly.businessRulesEngine

import typingsJapgolly.businessRulesEngine.mod.IError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-validation", JSImport.Namespace)
@js.native
object nodeValidationMod extends js.Object {
  @js.native
  class AbstractValidator[T] ()
    extends typingsJapgolly.businessRulesEngine.mod.AbstractValidator[T]
  
  @js.native
  class CompositeValidationResult protected ()
    extends typingsJapgolly.businessRulesEngine.mod.CompositeValidationResult {
    def this(Name: String) = this()
  }
  
  @js.native
  class Error ()
    extends typingsJapgolly.businessRulesEngine.mod.Error
  
  @js.native
  class MessageLocalization ()
    extends typingsJapgolly.businessRulesEngine.mod.MessageLocalization
  
  @js.native
  class ValidationFailure protected ()
    extends typingsJapgolly.businessRulesEngine.mod.ValidationFailure {
    def this(Error: IError, IsAsync: Boolean) = this()
  }
  
  @js.native
  class ValidationResult protected ()
    extends typingsJapgolly.businessRulesEngine.mod.ValidationResult {
    def this(Name: String) = this()
  }
  
  @js.native
  object CompareOperator extends js.Object {
    /* 2 */ val Equal: typingsJapgolly.businessRulesEngine.mod.CompareOperator.Equal with Double = js.native
    /* 5 */ val GreaterThan: typingsJapgolly.businessRulesEngine.mod.CompareOperator.GreaterThan with Double = js.native
    /* 4 */ val GreaterThanEqual: typingsJapgolly.businessRulesEngine.mod.CompareOperator.GreaterThanEqual with Double = js.native
    /* 0 */ val LessThan: typingsJapgolly.businessRulesEngine.mod.CompareOperator.LessThan with Double = js.native
    /* 1 */ val LessThanEqual: typingsJapgolly.businessRulesEngine.mod.CompareOperator.LessThanEqual with Double = js.native
    /* 3 */ val NotEqual: typingsJapgolly.businessRulesEngine.mod.CompareOperator.NotEqual with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.businessRulesEngine.mod.CompareOperator with Double] = js.native
  }
  
  /* static members */
  @js.native
  object MessageLocalization extends js.Object {
    var ValidationMessages: AnonContains = js.native
    var customMsg: String = js.native
    var defaultMessages: AnonContains = js.native
    def GetValidationMessage(validator: js.Any): String = js.native
  }
  
}

