package typingsJapgolly.tslint.mod

import typingsJapgolly.typescript.mod.Symbol
import typingsJapgolly.typescript.mod.SymbolFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "isSymbolFlagSet")
@js.native
object isSymbolFlagSet extends js.Object {
  def apply(symbol: Symbol, flagToCheck: SymbolFlags): Boolean = js.native
}

