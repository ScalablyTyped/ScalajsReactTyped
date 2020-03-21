package typingsJapgolly.babelTypes.mod

import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "getBindingIdentifiers")
@js.native
object getBindingIdentifiers extends js.Object {
  def apply(node: Node): Record[String, Identifier_] = js.native
  def apply(node: Node, duplicates: Boolean): Record[String, Identifier_ | js.Array[Identifier_]] = js.native
  def apply(node: Node, duplicates: Boolean, outerOnly: Boolean): Record[String, Identifier_ | js.Array[Identifier_]] = js.native
}

