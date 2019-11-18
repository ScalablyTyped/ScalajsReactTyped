package typingsJapgolly.node.v8Mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("v8", "serialize")
@js.native
object serialize extends js.Object {
  /**
    * Uses a `DefaultSerializer` to serialize value into a buffer.
    * @experimental
    */
  def apply(value: js.Any): Buffer = js.native
}

