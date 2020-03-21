package typingsJapgolly.typescript.mod

import typingsJapgolly.typescript.mod.SyntaxKind.JSDocComment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSDoc extends Node {
  var comment: js.UndefOr[java.lang.String] = js.native
  @JSName("kind")
  var kind_JSDoc: JSDocComment = js.native
  @JSName("parent")
  var parent_JSDoc: HasJSDoc = js.native
  var tags: js.UndefOr[NodeArray[JSDocTag]] = js.native
}

