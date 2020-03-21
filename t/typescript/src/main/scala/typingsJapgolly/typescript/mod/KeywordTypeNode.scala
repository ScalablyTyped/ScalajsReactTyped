package typingsJapgolly.typescript.mod

import typingsJapgolly.typescript.mod.SyntaxKind.AnyKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.BigIntKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.BooleanKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.NeverKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.NullKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.NumberKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.ObjectKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.StringKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.SymbolKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.ThisKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.UndefinedKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.UnknownKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.VoidKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeywordTypeNode extends TypeNode {
  @JSName("kind")
  var kind_KeywordTypeNode: AnyKeyword | UnknownKeyword | NumberKeyword | BigIntKeyword | ObjectKeyword | BooleanKeyword | StringKeyword | SymbolKeyword | ThisKeyword | VoidKeyword | UndefinedKeyword | NullKeyword | NeverKeyword = js.native
}

