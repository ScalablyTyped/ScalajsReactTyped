package typingsJapgolly.businessRulesEngine

import typingsJapgolly.businessRulesEngine.anon.Contains
import typingsJapgolly.businessRulesEngine.mod.IError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Utils {
    
    @JSGlobal("Utils.NumberFce")
    @js.native
    open class NumberFce ()
      extends StObject
         with typingsJapgolly.businessRulesEngine.Utils.NumberFce
    object NumberFce {
      
      @JSGlobal("Utils.NumberFce")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def GetNegDigits(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetNegDigits")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    }
    
    @JSGlobal("Utils.StringFce")
    @js.native
    open class StringFce ()
      extends StObject
         with typingsJapgolly.businessRulesEngine.Utils.StringFce
    object StringFce {
      
      @JSGlobal("Utils.StringFce")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def format(s: String, args: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(s.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
    }
  }
  
  object Validation {
    
    @JSGlobal("Validation.AbstractValidator")
    @js.native
    open class AbstractValidator[T] ()
      extends typingsJapgolly.businessRulesEngine.mod.AbstractValidator[T]
    
    @JSGlobal("Validation.CompareOperator")
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
    
    @JSGlobal("Validation.CompositeValidationResult")
    @js.native
    open class CompositeValidationResult protected ()
      extends typingsJapgolly.businessRulesEngine.mod.CompositeValidationResult {
      def this(Name: String) = this()
    }
    
    @JSGlobal("Validation.Error")
    @js.native
    open class Error ()
      extends typingsJapgolly.businessRulesEngine.mod.Error
    
    @JSGlobal("Validation.MessageLocalization")
    @js.native
    open class MessageLocalization ()
      extends typingsJapgolly.businessRulesEngine.mod.MessageLocalization
    /* static members */
    object MessageLocalization {
      
      @JSGlobal("Validation.MessageLocalization")
      @js.native
      val ^ : js.Any = js.native
      
      inline def GetValidationMessage(validator: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetValidationMessage")(validator.asInstanceOf[js.Any]).asInstanceOf[String]
      
      @JSGlobal("Validation.MessageLocalization.ValidationMessages")
      @js.native
      def ValidationMessages: Contains = js.native
      inline def ValidationMessages_=(x: Contains): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ValidationMessages")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Validation.MessageLocalization.customMsg")
      @js.native
      def customMsg: String = js.native
      inline def customMsg_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customMsg")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Validation.MessageLocalization.defaultMessages")
      @js.native
      def defaultMessages: Contains = js.native
      inline def defaultMessages_=(x: Contains): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMessages")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Validation.ValidationFailure")
    @js.native
    open class ValidationFailure protected ()
      extends typingsJapgolly.businessRulesEngine.mod.ValidationFailure {
      def this(Error: IError, IsAsync: Boolean) = this()
    }
    
    @JSGlobal("Validation.ValidationResult")
    @js.native
    open class ValidationResult protected ()
      extends typingsJapgolly.businessRulesEngine.mod.ValidationResult {
      def this(Name: String) = this()
    }
  }
}
