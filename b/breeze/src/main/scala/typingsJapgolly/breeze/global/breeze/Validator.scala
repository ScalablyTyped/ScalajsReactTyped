package typingsJapgolly.breeze.global.breeze

import typingsJapgolly.breeze.anon.Expression
import typingsJapgolly.breeze.anon.MaxLength
import typingsJapgolly.breeze.anon.MessageTemplate
import typingsJapgolly.breeze.anon.MinLength
import typingsJapgolly.breeze.breeze.ValidatorFunction
import typingsJapgolly.breeze.breeze.ValidatorFunctionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.Validator")
@js.native
open class Validator protected ()
  extends StObject
     with typingsJapgolly.breeze.breeze.Validator {
  def this(name: String, validatorFn: ValidatorFunction) = this()
  def this(name: String, validatorFn: ValidatorFunction, context: Any) = this()
}
/* static members */
object Validator {
  
  @JSGlobal("breeze.Validator")
  @js.native
  val ^ : js.Any = js.native
  
  inline def bool(): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")().asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  /** integer between 0 and 255 inclusive */
  inline def byte(): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("byte")().asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  inline def byte(context: MessageTemplate): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("byte")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  /** Returns a credit card number validator that performs a Luhn algorithm checksum test for plausability */
  inline def creditCard(): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("creditCard")().asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  inline def creditCard(context: MessageTemplate): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("creditCard")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  inline def date(): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  /** Validators number, double, and single are all the same */
  inline def double(): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("double")().asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  inline def double(context: MessageTemplate): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("double")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  /** Returns a ISO 8601 duration string Validator. */
  inline def duration(): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("duration")().asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  /** Returns the email address validator */
  inline def emailAddress(): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("emailAddress")().asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  inline def emailAddress(context: MessageTemplate): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("emailAddress")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  /** Creates a validator instance from a JSON object or an array of instances from an array of JSON objects. */
  inline def fromJSON(json: String): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  inline def guid(): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("guid")().asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  inline def int16(): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("int16")().asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  inline def int16(context: MessageTemplate): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("int16")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  inline def int32(): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("int32")().asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  inline def int32(context: MessageTemplate): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("int32")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  inline def int64(): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("int64")().asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  inline def int64(context: MessageTemplate): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("int64")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  /** Same as int64 */
  inline def integer(): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("integer")().asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  inline def integer(context: MessageTemplate): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("integer")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  /** Creates a regular expression validator with a fixed expression. */
  inline def makeRegExpValidator(validatorName: String, expression: js.RegExp, defaultMessage: String): typingsJapgolly.breeze.breeze.Validator = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRegExpValidator")(validatorName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], defaultMessage.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  inline def makeRegExpValidator(validatorName: String, expression: js.RegExp, defaultMessage: String, context: Any): typingsJapgolly.breeze.breeze.Validator = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRegExpValidator")(validatorName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], defaultMessage.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  inline def maxLength(context: MaxLength): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("maxLength")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  /** Map of standard error message templates keyed by validator name.*/
  @JSGlobal("breeze.Validator.messageTemplates")
  @js.native
  def messageTemplates: Any = js.native
  inline def messageTemplates_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messageTemplates")(x.asInstanceOf[js.Any])
  
  /** Always returns true */
  inline def none(): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("none")().asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  /** Validators number, double, and single are all the same */
  inline def number(): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  inline def number(context: MessageTemplate): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  /** Returns the phone validator, which handles prefix, country code, area code, and local number, with [-/. ] break characters. */
  inline def phone(): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("phone")().asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  inline def phone(context: MessageTemplate): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("phone")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  /** Register a validator instance so that any deserialized metadata can reference it. */
  inline def register(validator: typingsJapgolly.breeze.breeze.Validator): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(validator.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Register a validator factory so that any deserialized metadata can reference it.  */
  inline def registerFactory(fn: js.Function1[/* context */ js.UndefOr[ValidatorFunctionContext], this.type], name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFactory")(fn.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Returns a regular expression validator; the expression must be specified in the context parameter */
  inline def regularExpression(context: Expression): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("regularExpression")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  inline def required(): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("required")().asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  inline def required(context: MessageTemplate): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("required")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  /** Validators number, double, and single are all the same */
  inline def single(): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("single")().asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  inline def single(context: MessageTemplate): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("single")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  inline def string(): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  inline def stringLength(context: MinLength): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("stringLength")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  
  /** Returns the URL (protocol required) validator */
  inline def url(): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("url")().asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
  inline def url(context: MessageTemplate): typingsJapgolly.breeze.breeze.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Validator]
}
