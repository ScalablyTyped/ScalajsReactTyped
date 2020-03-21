package typingsJapgolly.unistUtilIs

import typingsJapgolly.unist.mod.Node
import typingsJapgolly.unistUtilIs.mod.Test
import typingsJapgolly.unistUtilIs.mod.TestFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unist-util-is/convert", JSImport.Namespace)
@js.native
object convertMod extends js.Object {
  def apply[T /* <: Node */](test: Test[T]): TestFunction[T] = js.native
}

