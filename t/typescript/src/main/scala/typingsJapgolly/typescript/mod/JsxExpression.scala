package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsxExpression
  extends Expression
     with JsxChild {
  var dotDotDotToken: js.UndefOr[Token[typingsJapgolly.typescript.mod.SyntaxKind.DotDotDotToken]] = js.native
  var expression: js.UndefOr[Expression] = js.native
  @JSName("kind")
  var kind_JsxExpression: typingsJapgolly.typescript.mod.SyntaxKind.JsxExpression = js.native
  @JSName("parent")
  var parent_JsxExpression: JsxElement | JsxAttributeLike = js.native
}

