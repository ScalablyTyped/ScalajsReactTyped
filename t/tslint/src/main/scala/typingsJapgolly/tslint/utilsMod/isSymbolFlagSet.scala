package typingsJapgolly.tslint.utilsMod

import typingsJapgolly.typescript.mod.Symbol
import typingsJapgolly.typescript.mod.SymbolFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/utils", "isSymbolFlagSet")
@js.native
object isSymbolFlagSet extends js.Object {
  def apply(symbol: Symbol, flagToCheck: SymbolFlags): Boolean = js.native
}

