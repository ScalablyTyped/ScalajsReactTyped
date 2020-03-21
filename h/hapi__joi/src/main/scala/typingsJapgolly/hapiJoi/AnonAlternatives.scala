package typingsJapgolly.hapiJoi

import typingsJapgolly.hapiJoi.mod.AlternativesSchema
import typingsJapgolly.hapiJoi.mod.AnySchema
import typingsJapgolly.hapiJoi.mod.ArraySchema
import typingsJapgolly.hapiJoi.mod.BinarySchema
import typingsJapgolly.hapiJoi.mod.BooleanSchema
import typingsJapgolly.hapiJoi.mod.DateSchema
import typingsJapgolly.hapiJoi.mod.FunctionSchema
import typingsJapgolly.hapiJoi.mod.LinkSchema
import typingsJapgolly.hapiJoi.mod.NumberSchema
import typingsJapgolly.hapiJoi.mod.ObjectSchema
import typingsJapgolly.hapiJoi.mod.StringSchema
import typingsJapgolly.hapiJoi.mod.SymbolSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlternatives extends js.Object {
  var alternatives: AlternativesSchema
  var any: AnySchema
  var array: ArraySchema
  var binary: BinarySchema
  var boolean: BooleanSchema
  var date: DateSchema
  var function: FunctionSchema
  var link: LinkSchema
  var number: NumberSchema
  var `object`: ObjectSchema[_]
  var string: StringSchema
  var symbol: SymbolSchema
}

object AnonAlternatives {
  @scala.inline
  def apply(
    alternatives: AlternativesSchema,
    any: AnySchema,
    array: ArraySchema,
    binary: BinarySchema,
    boolean: BooleanSchema,
    date: DateSchema,
    function: FunctionSchema,
    link: LinkSchema,
    number: NumberSchema,
    `object`: ObjectSchema[_],
    string: StringSchema,
    symbol: SymbolSchema
  ): AnonAlternatives = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlternatives]
  }
}

