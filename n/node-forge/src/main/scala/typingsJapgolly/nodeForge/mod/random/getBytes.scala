package typingsJapgolly.nodeForge.mod.random

import typingsJapgolly.nodeForge.mod.Bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "random.getBytes")
@js.native
object getBytes extends js.Object {
  def apply(count: Double): Bytes = js.native
  def apply(count: Double, callback: js.Function1[/* bytes */ Bytes, _]): Bytes = js.native
}

