package typingsJapgolly.breeze.breeze.core

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnum extends js.Object {
  def contains(`object`: js.Any): Boolean
  def fromName(name: String): EnumSymbol
  def getNames(): js.Array[String]
  def getSymbols(): js.Array[EnumSymbol]
}

object IEnum {
  @scala.inline
  def apply(
    contains: js.Any => CallbackTo[Boolean],
    fromName: String => CallbackTo[EnumSymbol],
    getNames: CallbackTo[js.Array[String]],
    getSymbols: CallbackTo[js.Array[EnumSymbol]]
  ): IEnum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: js.Any) => contains(t0).runNow()))
    __obj.updateDynamic("fromName")(js.Any.fromFunction1((t0: java.lang.String) => fromName(t0).runNow()))
    __obj.updateDynamic("getNames")(getNames.toJsFn)
    __obj.updateDynamic("getSymbols")(getSymbols.toJsFn)
    __obj.asInstanceOf[IEnum]
  }
}

