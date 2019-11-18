package typingsJapgolly.coreDashJs

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolConstructor extends js.Object {
  /**
    * Non-standard. Use simple mode for core-js symbols. See https://github.com/zloirock/core-js/#caveats-when-using-symbol-polyfill
    */
  def useSimple(): Unit
  /**
    * Non-standard. Use setter mode for core-js symbols. See https://github.com/zloirock/core-js/#caveats-when-using-symbol-polyfill
    */
  def userSetter(): Unit
}

object SymbolConstructor {
  @scala.inline
  def apply(useSimple: Callback, userSetter: Callback): SymbolConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("useSimple")(useSimple.toJsFn)
    __obj.updateDynamic("userSetter")(userSetter.toJsFn)
    __obj.asInstanceOf[SymbolConstructor]
  }
}

