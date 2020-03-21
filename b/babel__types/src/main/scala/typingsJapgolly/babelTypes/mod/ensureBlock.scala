package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.AnonBody
import typingsJapgolly.std.Extract
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "ensureBlock")
@js.native
object ensureBlock extends js.Object {
  def apply(node: Extract[Node, AnonBody]): BlockStatement_ = js.native
  def apply[K /* <: String */](node: Extract[Node, Record[K, BlockStatement_ | Statement | Expression]], key: K): BlockStatement_ = js.native
}

