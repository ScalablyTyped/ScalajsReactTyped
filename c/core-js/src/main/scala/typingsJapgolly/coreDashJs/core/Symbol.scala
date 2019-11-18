package typingsJapgolly.coreDashJs.core

import typingsJapgolly.coreDashJs.SymbolConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("core.Symbol")
@js.native
object Symbol extends SymbolConstructor {
  /**
    * Non-standard. Use simple mode for core-js symbols. See https://github.com/zloirock/core-js/#caveats-when-using-symbol-polyfill
    */
  /* CompleteClass */
  override def useSimple(): Unit = js.native
  /**
    * Non-standard. Use setter mode for core-js symbols. See https://github.com/zloirock/core-js/#caveats-when-using-symbol-polyfill
    */
  /* CompleteClass */
  override def userSetter(): Unit = js.native
}

