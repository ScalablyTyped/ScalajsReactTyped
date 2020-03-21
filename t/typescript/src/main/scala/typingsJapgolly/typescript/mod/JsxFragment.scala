package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsxFragment
  extends PrimaryExpression
     with JsxChild {
  var children: NodeArray[JsxChild] = js.native
  var closingFragment: JsxClosingFragment = js.native
  @JSName("kind")
  var kind_JsxFragment: typingsJapgolly.typescript.mod.SyntaxKind.JsxFragment = js.native
  var openingFragment: JsxOpeningFragment = js.native
}

