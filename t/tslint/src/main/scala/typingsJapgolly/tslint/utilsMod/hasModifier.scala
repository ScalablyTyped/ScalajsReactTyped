package typingsJapgolly.tslint.utilsMod

import typingsJapgolly.typescript.mod.ModifiersArray
import typingsJapgolly.typescript.mod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/utils", "hasModifier")
@js.native
object hasModifier extends js.Object {
  def apply(modifierKinds: SyntaxKind*): Boolean = js.native
  def apply(modifiers: ModifiersArray, modifierKinds: SyntaxKind*): Boolean = js.native
}

