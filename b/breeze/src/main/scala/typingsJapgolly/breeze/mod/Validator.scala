package typingsJapgolly.breeze.mod

import typingsJapgolly.breeze.AnonExpression
import typingsJapgolly.breeze.AnonMaxLength
import typingsJapgolly.breeze.AnonMessageTemplate
import typingsJapgolly.breeze.AnonMinLength
import typingsJapgolly.breeze.breeze.ValidatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "Validator")
@js.native
class Validator protected ()
  extends typingsJapgolly.breeze.breeze.Validator {
  def this(name: String, validatorFn: ValidatorFunction) = this()
  def this(name: String, validatorFn: ValidatorFunction, context: js.Any) = this()
}

/* static members */
@JSImport("breeze", "Validator")
@js.native
object Validator extends js.Object {
  /** Map of standard error message templates keyed by validator name.*/
  var messageTemplates: js.Any = js.native
  def bool(): typingsJapgolly.breeze.breeze.Validator = js.native
  /** integer between 0 and 255 inclusive */
  def byte(): typingsJapgolly.breeze.breeze.Validator = js.native
  def byte(context: AnonMessageTemplate): typingsJapgolly.breeze.breeze.Validator = js.native
  /** Returns a credit card number validator that performs a Luhn algorithm checksum test for plausability */
  def creditCard(): typingsJapgolly.breeze.breeze.Validator = js.native
  def creditCard(context: AnonMessageTemplate): typingsJapgolly.breeze.breeze.Validator = js.native
  def date(): typingsJapgolly.breeze.breeze.Validator = js.native
  /** Validators number, double, and single are all the same */
  def double(): typingsJapgolly.breeze.breeze.Validator = js.native
  def double(context: AnonMessageTemplate): typingsJapgolly.breeze.breeze.Validator = js.native
  /** Returns a ISO 8601 duration string Validator. */
  def duration(): typingsJapgolly.breeze.breeze.Validator = js.native
  /** Returns the email address validator */
  def emailAddress(): typingsJapgolly.breeze.breeze.Validator = js.native
  def emailAddress(context: AnonMessageTemplate): typingsJapgolly.breeze.breeze.Validator = js.native
  /** Creates a validator instance from a JSON object or an array of instances from an array of JSON objects. */
  def fromJSON(json: String): typingsJapgolly.breeze.breeze.Validator = js.native
  def guid(): typingsJapgolly.breeze.breeze.Validator = js.native
  def int16(): typingsJapgolly.breeze.breeze.Validator = js.native
  def int16(context: AnonMessageTemplate): typingsJapgolly.breeze.breeze.Validator = js.native
  def int32(): typingsJapgolly.breeze.breeze.Validator = js.native
  def int32(context: AnonMessageTemplate): typingsJapgolly.breeze.breeze.Validator = js.native
  def int64(): typingsJapgolly.breeze.breeze.Validator = js.native
  def int64(context: AnonMessageTemplate): typingsJapgolly.breeze.breeze.Validator = js.native
  /** Same as int64 */
  def integer(): typingsJapgolly.breeze.breeze.Validator = js.native
  def integer(context: AnonMessageTemplate): typingsJapgolly.breeze.breeze.Validator = js.native
  /** Creates a regular expression validator with a fixed expression. */
  def makeRegExpValidator(validatorName: String, expression: js.RegExp, defaultMessage: String): typingsJapgolly.breeze.breeze.Validator = js.native
  def makeRegExpValidator(validatorName: String, expression: js.RegExp, defaultMessage: String, context: js.Any): typingsJapgolly.breeze.breeze.Validator = js.native
  def maxLength(context: AnonMaxLength): typingsJapgolly.breeze.breeze.Validator = js.native
  /** Always returns true */
  def none(): typingsJapgolly.breeze.breeze.Validator = js.native
  /** Validators number, double, and single are all the same */
  def number(): typingsJapgolly.breeze.breeze.Validator = js.native
  def number(context: AnonMessageTemplate): typingsJapgolly.breeze.breeze.Validator = js.native
  /** Returns the phone validator, which handles prefix, country code, area code, and local number, with [-/. ] break characters. */
  def phone(): typingsJapgolly.breeze.breeze.Validator = js.native
  def phone(context: AnonMessageTemplate): typingsJapgolly.breeze.breeze.Validator = js.native
  /** Register a validator instance so that any deserialized metadata can reference it. */
  def register(validator: typingsJapgolly.breeze.breeze.Validator): Unit = js.native
  /** Register a validator factory so that any deserialized metadata can reference it.  */
  def registerFactory(fn: js.Function0[this.type], name: String): Unit = js.native
  /** Returns a regular expression validator; the expression must be specified in the context parameter */
  def regularExpression(context: AnonExpression): typingsJapgolly.breeze.breeze.Validator = js.native
  def required(): typingsJapgolly.breeze.breeze.Validator = js.native
  def required(context: AnonMessageTemplate): typingsJapgolly.breeze.breeze.Validator = js.native
  /** Validators number, double, and single are all the same */
  def single(): typingsJapgolly.breeze.breeze.Validator = js.native
  def single(context: AnonMessageTemplate): typingsJapgolly.breeze.breeze.Validator = js.native
  def string(): typingsJapgolly.breeze.breeze.Validator = js.native
  def stringLength(context: AnonMinLength): typingsJapgolly.breeze.breeze.Validator = js.native
  /** Returns the URL (protocol required) validator */
  def url(): typingsJapgolly.breeze.breeze.Validator = js.native
  def url(context: AnonMessageTemplate): typingsJapgolly.breeze.breeze.Validator = js.native
}

