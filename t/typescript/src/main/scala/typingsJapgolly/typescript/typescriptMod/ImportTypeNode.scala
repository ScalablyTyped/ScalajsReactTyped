package typingsJapgolly.typescript.typescriptMod

import typingsJapgolly.typescript.typescriptMod.SyntaxKind.ImportType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportTypeNode extends NodeWithTypeArguments {
  var argument: TypeNode = js.native
  var isTypeOf: js.UndefOr[Boolean] = js.native
  @JSName("kind")
  var kind_ImportTypeNode: ImportType = js.native
  var qualifier: js.UndefOr[EntityName] = js.native
}

