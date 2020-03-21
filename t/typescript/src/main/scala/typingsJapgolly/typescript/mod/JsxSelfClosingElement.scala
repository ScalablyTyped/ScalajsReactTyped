package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsxSelfClosingElement
  extends PrimaryExpression
     with HasTypeArguments
     with JsxChild
     with JsxOpeningLikeElement {
  var attributes: JsxAttributes = js.native
  @JSName("kind")
  var kind_JsxSelfClosingElement: typingsJapgolly.typescript.mod.SyntaxKind.JsxSelfClosingElement = js.native
  var tagName: JsxTagNameExpression = js.native
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}

