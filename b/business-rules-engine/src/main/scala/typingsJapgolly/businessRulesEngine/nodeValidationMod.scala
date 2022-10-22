package typingsJapgolly.businessRulesEngine

import typingsJapgolly.businessRulesEngine.anon.Contains
import typingsJapgolly.businessRulesEngine.mod.IError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeValidationMod {
  
  @JSImport("node-validation", "AbstractValidator")
  @js.native
  open class AbstractValidator[T] ()
    extends typingsJapgolly.businessRulesEngine.mod.AbstractValidator[T]
  
  @JSImport("node-validation", "CompareOperator")
  @js.native
  object CompareOperator extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.businessRulesEngine.mod.CompareOperator & Double] = js.native
    
    /* 2 */ val Equal: typingsJapgolly.businessRulesEngine.mod.CompareOperator.Equal & Double = js.native
    
    /* 5 */ val GreaterThan: typingsJapgolly.businessRulesEngine.mod.CompareOperator.GreaterThan & Double = js.native
    
    /* 4 */ val GreaterThanEqual: typingsJapgolly.businessRulesEngine.mod.CompareOperator.GreaterThanEqual & Double = js.native
    
    /* 0 */ val LessThan: typingsJapgolly.businessRulesEngine.mod.CompareOperator.LessThan & Double = js.native
    
    /* 1 */ val LessThanEqual: typingsJapgolly.businessRulesEngine.mod.CompareOperator.LessThanEqual & Double = js.native
    
    /* 3 */ val NotEqual: typingsJapgolly.businessRulesEngine.mod.CompareOperator.NotEqual & Double = js.native
  }
  
  @JSImport("node-validation", "CompositeValidationResult")
  @js.native
  open class CompositeValidationResult protected ()
    extends typingsJapgolly.businessRulesEngine.mod.CompositeValidationResult {
    def this(Name: String) = this()
  }
  
  @JSImport("node-validation", "Error")
  @js.native
  open class Error ()
    extends typingsJapgolly.businessRulesEngine.mod.Error
  
  @JSImport("node-validation", "MessageLocalization")
  @js.native
  open class MessageLocalization ()
    extends typingsJapgolly.businessRulesEngine.mod.MessageLocalization
  /* static members */
  object MessageLocalization {
    
    @JSImport("node-validation", "MessageLocalization")
    @js.native
    val ^ : js.Any = js.native
    
    inline def GetValidationMessage(validator: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetValidationMessage")(validator.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("node-validation", "MessageLocalization.ValidationMessages")
    @js.native
    def ValidationMessages: Contains = js.native
    inline def ValidationMessages_=(x: Contains): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ValidationMessages")(x.asInstanceOf[js.Any])
    
    @JSImport("node-validation", "MessageLocalization.customMsg")
    @js.native
    def customMsg: String = js.native
    inline def customMsg_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customMsg")(x.asInstanceOf[js.Any])
    
    @JSImport("node-validation", "MessageLocalization.defaultMessages")
    @js.native
    def defaultMessages: Contains = js.native
    inline def defaultMessages_=(x: Contains): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMessages")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("node-validation", "ValidationFailure")
  @js.native
  open class ValidationFailure protected ()
    extends typingsJapgolly.businessRulesEngine.mod.ValidationFailure {
    def this(Error: IError, IsAsync: Boolean) = this()
  }
  
  @JSImport("node-validation", "ValidationResult")
  @js.native
  open class ValidationResult protected ()
    extends typingsJapgolly.businessRulesEngine.mod.ValidationResult {
    def this(Name: String) = this()
  }
}
