package typingsJapgolly.jestUtil

import typingsJapgolly.node.NodeJS.Global
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-util/build/setGlobal", JSImport.Namespace)
@js.native
object setGlobalMod extends js.Object {
  def default(globalToMutate: Global, key: String, value: js.Any): Unit = js.native
  def default(globalToMutate: Window_, key: String, value: js.Any): Unit = js.native
}

