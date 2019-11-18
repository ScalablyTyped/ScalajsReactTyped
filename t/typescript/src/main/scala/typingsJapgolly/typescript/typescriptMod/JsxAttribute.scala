package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsxAttribute
  extends ObjectLiteralElement
     with HasInitializer
     with JsxAttributeLike
     with VariableLikeDeclaration {
  var initializer: js.UndefOr[StringLiteral | JsxExpression] = js.native
  @JSName("kind")
  var kind_JsxAttribute: typingsJapgolly.typescript.typescriptMod.SyntaxKind.JsxAttribute = js.native
  @JSName("name")
  var name_JsxAttribute: Identifier = js.native
  @JSName("parent")
  var parent_JsxAttribute: JsxAttributes = js.native
}

