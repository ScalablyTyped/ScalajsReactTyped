package typingsJapgolly.objection.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Castable extends js.Object {
  def as(alias: String): this.type
  def asArray(): this.type
  def castArray(): this.type
  def castBigInt(): this.type
  def castBool(): this.type
  def castDecimal(): this.type
  def castFloat(): this.type
  def castInt(): this.type
  def castJson(): this.type
  def castReal(): this.type
  def castText(): this.type
  def castTo(sqlType: String): this.type
  def castType(sqlType: String): this.type
}

object Castable {
  @scala.inline
  def apply(
    as: String => CallbackTo[Castable],
    asArray: CallbackTo[Castable],
    castArray: CallbackTo[Castable],
    castBigInt: CallbackTo[Castable],
    castBool: CallbackTo[Castable],
    castDecimal: CallbackTo[Castable],
    castFloat: CallbackTo[Castable],
    castInt: CallbackTo[Castable],
    castJson: CallbackTo[Castable],
    castReal: CallbackTo[Castable],
    castText: CallbackTo[Castable],
    castTo: String => CallbackTo[Castable],
    castType: String => CallbackTo[Castable]
  ): Castable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("as")(js.Any.fromFunction1((t0: java.lang.String) => as(t0).runNow()))
    __obj.updateDynamic("asArray")(asArray.toJsFn)
    __obj.updateDynamic("castArray")(castArray.toJsFn)
    __obj.updateDynamic("castBigInt")(castBigInt.toJsFn)
    __obj.updateDynamic("castBool")(castBool.toJsFn)
    __obj.updateDynamic("castDecimal")(castDecimal.toJsFn)
    __obj.updateDynamic("castFloat")(castFloat.toJsFn)
    __obj.updateDynamic("castInt")(castInt.toJsFn)
    __obj.updateDynamic("castJson")(castJson.toJsFn)
    __obj.updateDynamic("castReal")(castReal.toJsFn)
    __obj.updateDynamic("castText")(castText.toJsFn)
    __obj.updateDynamic("castTo")(js.Any.fromFunction1((t0: java.lang.String) => castTo(t0).runNow()))
    __obj.updateDynamic("castType")(js.Any.fromFunction1((t0: java.lang.String) => castType(t0).runNow()))
    __obj.asInstanceOf[Castable]
  }
}

