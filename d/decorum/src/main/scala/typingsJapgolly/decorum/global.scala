package typingsJapgolly.decorum

import typingsJapgolly.decorum.mod.IMessageHandlerMap
import typingsJapgolly.decorum.mod.IValidationResult
import typingsJapgolly.decorum.mod.MessageHandler
import typingsJapgolly.decorum.mod.ValidationDefinitions
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object decorum {
    
    @JSGlobal("decorum")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Alpha(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Alpha")().asInstanceOf[PropertyDecorator]
    inline def Alpha(message: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Alpha")(message.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
    inline def Alpha(message: MessageHandler[typingsJapgolly.decorum.mod.PatternValidator]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Alpha")(message.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
    
    inline def AlphaNumeric(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("AlphaNumeric")().asInstanceOf[PropertyDecorator]
    inline def AlphaNumeric(message: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("AlphaNumeric")(message.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
    inline def AlphaNumeric(message: MessageHandler[typingsJapgolly.decorum.mod.PatternValidator]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("AlphaNumeric")(message.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
    
    /* note: abstract class */ @JSGlobal("decorum.BaseValidator")
    @js.native
    open class BaseValidator protected ()
      extends typingsJapgolly.decorum.mod.BaseValidator {
      /**
        * Initializes the {BaseValidator}
        * @param validatorKey A unique "key" by which to identify this field validator i.e. length, maxlength,
        *     required. Should be a valid JS property name.
        * @param message A custom error message to return. Should be passed down from concrete class' constructors to
        *     enable customizing error messages.
        */
      def this(validatorKey: String, message: String) = this()
      def this(validatorKey: String, message: MessageHandler[Any]) = this()
    }
    
    @JSGlobal("decorum.CustomValidator")
    @js.native
    open class CustomValidator[TModel] protected ()
      extends typingsJapgolly.decorum.mod.CustomValidator[TModel] {
      def this(predicate: js.Function2[/* value */ Any, /* model */ TModel, Boolean], message: String) = this()
      def this(
        predicate: js.Function2[/* value */ Any, /* model */ TModel, Boolean],
        message: MessageHandler[typingsJapgolly.decorum.mod.CustomValidator[TModel]]
      ) = this()
    }
    
    inline def Email(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Email")().asInstanceOf[PropertyDecorator]
    inline def Email(message: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Email")(message.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
    inline def Email(message: MessageHandler[typingsJapgolly.decorum.mod.EmailValidator]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Email")(message.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
    
    @JSGlobal("decorum.EmailValidator")
    @js.native
    open class EmailValidator ()
      extends typingsJapgolly.decorum.mod.EmailValidator {
      def this(message: String) = this()
      def this(message: MessageHandler[typingsJapgolly.decorum.mod.EmailValidator]) = this()
    }
    /* static members */
    object EmailValidator {
      
      @JSGlobal("decorum.EmailValidator")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("decorum.EmailValidator.EmailRegex")
      @js.native
      def EmailRegex: js.RegExp = js.native
      inline def EmailRegex_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EmailRegex")(x.asInstanceOf[js.Any])
    }
    
    inline def FieldName(name: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("FieldName")(name.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
    
    @JSGlobal("decorum.FieldOptions")
    @js.native
    open class FieldOptions protected ()
      extends typingsJapgolly.decorum.mod.FieldOptions {
      def this(property: String) = this()
    }
    
    inline def Length(length: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Length")(length.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
    inline def Length(length: Double, message: String): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Length")(length.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
    inline def Length(length: Double, message: MessageHandler[typingsJapgolly.decorum.mod.LengthValidator]): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Length")(length.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
    
    @JSGlobal("decorum.LengthValidator")
    @js.native
    open class LengthValidator protected ()
      extends typingsJapgolly.decorum.mod.LengthValidator {
      def this(length: Double) = this()
      def this(length: Double, message: String) = this()
      def this(length: Double, message: MessageHandler[typingsJapgolly.decorum.mod.LengthValidator]) = this()
    }
    
    inline def MaxLength(maxLength: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("MaxLength")(maxLength.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
    inline def MaxLength(maxLength: Double, message: String): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("MaxLength")(maxLength.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
    inline def MaxLength(maxLength: Double, message: MessageHandler[typingsJapgolly.decorum.mod.MaxLengthValidator]): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("MaxLength")(maxLength.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
    
    @JSGlobal("decorum.MaxLengthValidator")
    @js.native
    open class MaxLengthValidator protected ()
      extends typingsJapgolly.decorum.mod.MaxLengthValidator {
      def this(maxLength: Double) = this()
      def this(maxLength: Double, message: String) = this()
      def this(maxLength: Double, message: MessageHandler[typingsJapgolly.decorum.mod.MaxLengthValidator]) = this()
    }
    
    @JSGlobal("decorum.MessageHandlers")
    @js.native
    def MessageHandlers: IMessageHandlerMap = js.native
    inline def MessageHandlers_=(x: IMessageHandlerMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MessageHandlers")(x.asInstanceOf[js.Any])
    
    inline def MinLength(minLength: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("MinLength")(minLength.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
    inline def MinLength(minLength: Double, message: String): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("MinLength")(minLength.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
    inline def MinLength(minLength: Double, message: MessageHandler[typingsJapgolly.decorum.mod.MinLengthValidator]): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("MinLength")(minLength.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
    
    @JSGlobal("decorum.MinLengthValidator")
    @js.native
    open class MinLengthValidator protected ()
      extends typingsJapgolly.decorum.mod.MinLengthValidator {
      def this(minLength: Double) = this()
      def this(minLength: Double, message: String) = this()
      def this(minLength: Double, message: MessageHandler[typingsJapgolly.decorum.mod.MinLengthValidator]) = this()
    }
    
    @JSGlobal("decorum.ModelValidator")
    @js.native
    open class ModelValidator protected ()
      extends typingsJapgolly.decorum.mod.ModelValidator {
      /**
        * Creates a new model validator.
        * @param model The model to validate. Should be a class that has a valid constructor function and prototype.
        */
      def this(model: Any) = this()
    }
    
    inline def Pattern(regex: js.RegExp): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Pattern")(regex.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
    inline def Pattern(regex: js.RegExp, message: String): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Pattern")(regex.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
    inline def Pattern(regex: js.RegExp, message: MessageHandler[typingsJapgolly.decorum.mod.PatternValidator]): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Pattern")(regex.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
    
    @JSGlobal("decorum.PatternValidator")
    @js.native
    open class PatternValidator protected ()
      extends typingsJapgolly.decorum.mod.PatternValidator {
      def this(pattern: js.RegExp) = this()
      def this(pattern: js.RegExp, message: String) = this()
      def this(pattern: js.RegExp, message: MessageHandler[typingsJapgolly.decorum.mod.PatternValidator]) = this()
    }
    
    inline def Required(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Required")().asInstanceOf[PropertyDecorator]
    inline def Required(message: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Required")(message.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
    inline def Required(message: MessageHandler[typingsJapgolly.decorum.mod.RequiredFieldValidator]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Required")(message.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
    
    @JSGlobal("decorum.RequiredFieldValidator")
    @js.native
    open class RequiredFieldValidator ()
      extends typingsJapgolly.decorum.mod.RequiredFieldValidator {
      def this(message: String) = this()
      def this(message: MessageHandler[typingsJapgolly.decorum.mod.RequiredFieldValidator]) = this()
    }
    
    inline def Validation[TModel](message: String, predicate: js.Function2[/* value */ Any, /* model */ TModel, Boolean]): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Validation")(message.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
    inline def Validation[TModel](
      message: MessageHandler[typingsJapgolly.decorum.mod.CustomValidator[TModel]],
      predicate: js.Function2[/* value */ Any, /* model */ TModel, Boolean]
    ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Validation")(message.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
    
    @JSGlobal("decorum.Validator")
    @js.native
    open class Validator ()
      extends typingsJapgolly.decorum.mod.Validator
    /* static members */
    object Validator {
      
      @JSGlobal("decorum.Validator")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Adds a validator to the given object prototype for the given property. Meant to be used inside of validation
        * decorators to inject the validation onto the object property.
        * @param targetPrototype A valid object prototype to add to.
        * @param property The property to add the validator for.
        * @param validator The validator to add.
        */
      inline def addValidator(targetPrototype: js.Object, property: String, validator: typingsJapgolly.decorum.mod.BaseValidator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addValidator")(targetPrototype.asInstanceOf[js.Any], property.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Decorates the passed class with model validations. Use this when you do not have access to ES7 decorators.
        * The object passed should be a valid class (ES6 class or ES5 function constructor).
        * @param objectType The class to decorate.
        * @param definitions One or more field validation definitions of the form { "fieldName": [ decorators ] }.
        */
      inline def decorate(objectType: Any, definitions: ValidationDefinitions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(objectType.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Creates a new model validator for the given model. Model should be a valid class that has a valid constructor
        * and a prototype.
        * @param model The model to create the validator for.
        * @returns {ModelValidator} An instance of {ModelValidator}
        */
      inline def `new`(model: Any): typingsJapgolly.decorum.mod.ModelValidator = ^.asInstanceOf[js.Dynamic].applyDynamic("new")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.decorum.mod.ModelValidator]
      
      /**
        * Creates an anonymous validator, immediately validates the model, and returns any validation errors on the
        * model as a result.
        * @param model The model to validate.
        */
      inline def validate(model: Any): IValidationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(model.asInstanceOf[js.Any]).asInstanceOf[IValidationResult]
    }
  }
}
