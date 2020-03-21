package typingsJapgolly.tslint.mod

import typingsJapgolly.typescript.mod.Declaration
import typingsJapgolly.typescript.mod.ModifierFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "isCombinedModifierFlagSet")
@js.native
object isCombinedModifierFlagSet extends js.Object {
  def apply(node: Declaration, flagToCheck: ModifierFlags): Boolean = js.native
}

