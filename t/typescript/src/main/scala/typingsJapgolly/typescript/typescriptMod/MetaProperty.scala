package typingsJapgolly.typescript.typescriptMod

import typingsJapgolly.typescript.typescriptMod.SyntaxKind.ImportKeyword
import typingsJapgolly.typescript.typescriptMod.SyntaxKind.NewKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaProperty extends PrimaryExpression {
  var keywordToken: NewKeyword | ImportKeyword = js.native
  @JSName("kind")
  var kind_MetaProperty: typingsJapgolly.typescript.typescriptMod.SyntaxKind.MetaProperty = js.native
  var name: Identifier = js.native
}

