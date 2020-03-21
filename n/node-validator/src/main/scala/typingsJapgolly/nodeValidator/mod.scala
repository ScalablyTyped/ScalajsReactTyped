package typingsJapgolly.nodeValidator

import typingsJapgolly.nodeValidator.Validator.IsObjectValidator
import typingsJapgolly.nodeValidator.Validator.Validatable
import typingsJapgolly.nodeValidator.ValidatorOptions.IsDateOptions
import typingsJapgolly.nodeValidator.ValidatorOptions.IsNumberOptions
import typingsJapgolly.nodeValidator.ValidatorOptions.IsStringOptions
import typingsJapgolly.nodeValidator.ValidatorOptions.Options
import typingsJapgolly.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-validator", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def bodyValidator(validator: Validatable): js.Any = js.native
  def express(validator: Validatable): js.Any = js.native
  def expressParams(validator: Validatable): js.Any = js.native
  def expressQuery(validator: Validatable): js.Any = js.native
  def isAnyObject(): IsObjectValidator = js.native
  def isArray(): Validatable = js.native
  def isArray(validator: Validatable): Validatable = js.native
  def isArray(validator: Validatable, options: Options): Validatable = js.native
  def isBoolean(): Validatable = js.native
  def isDate(): Validatable = js.native
  def isDate(options: IsDateOptions): Validatable = js.native
  def isInteger(): Validatable = js.native
  def isInteger(options: IsNumberOptions): Validatable = js.native
  def isIsoDate(): Validatable = js.native
  def isIsoDate(options: IsDateOptions): Validatable = js.native
  def isIsoDateTime(): Validatable = js.native
  def isIsoDateTime(options: IsDateOptions): Validatable = js.native
  def isNumber(): Validatable = js.native
  def isNumber(options: IsNumberOptions): Validatable = js.native
  def isObject(): IsObjectValidator = js.native
  def isString(): Validatable = js.native
  def isString(options: IsStringOptions): Validatable = js.native
  def isStringOrNull(): Validatable = js.native
  def isStringOrNull(options: IsStringOptions): Validatable = js.native
  def paramsValidator(validator: Validatable): js.Any = js.native
  def queryValidator(validator: Validatable): js.Any = js.native
  def run(
    validator: Validatable,
    value: js.Any,
    callback: js.Function2[/* errorCount */ Number, /* errors */ js.Array[_], Unit]
  ): Unit = js.native
}

