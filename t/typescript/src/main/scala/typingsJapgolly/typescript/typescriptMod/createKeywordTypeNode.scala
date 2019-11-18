package typingsJapgolly.typescript.typescriptMod

import typingsJapgolly.typescript.typescriptMod.SyntaxKind.AnyKeyword
import typingsJapgolly.typescript.typescriptMod.SyntaxKind.BigIntKeyword
import typingsJapgolly.typescript.typescriptMod.SyntaxKind.BooleanKeyword
import typingsJapgolly.typescript.typescriptMod.SyntaxKind.NeverKeyword
import typingsJapgolly.typescript.typescriptMod.SyntaxKind.NullKeyword
import typingsJapgolly.typescript.typescriptMod.SyntaxKind.NumberKeyword
import typingsJapgolly.typescript.typescriptMod.SyntaxKind.ObjectKeyword
import typingsJapgolly.typescript.typescriptMod.SyntaxKind.StringKeyword
import typingsJapgolly.typescript.typescriptMod.SyntaxKind.SymbolKeyword
import typingsJapgolly.typescript.typescriptMod.SyntaxKind.ThisKeyword
import typingsJapgolly.typescript.typescriptMod.SyntaxKind.UndefinedKeyword
import typingsJapgolly.typescript.typescriptMod.SyntaxKind.UnknownKeyword
import typingsJapgolly.typescript.typescriptMod.SyntaxKind.VoidKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createKeywordTypeNode")
@js.native
object createKeywordTypeNode extends js.Object {
  def apply(
    kind: AnyKeyword | UnknownKeyword | NumberKeyword | BigIntKeyword | ObjectKeyword | BooleanKeyword | StringKeyword | SymbolKeyword | ThisKeyword | VoidKeyword | UndefinedKeyword | NullKeyword | NeverKeyword
  ): KeywordTypeNode = js.native
}

