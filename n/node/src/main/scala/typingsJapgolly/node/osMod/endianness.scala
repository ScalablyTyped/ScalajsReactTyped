package typingsJapgolly.node.osMod

import typingsJapgolly.node.nodeStrings.BE
import typingsJapgolly.node.nodeStrings.LE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("os", "endianness")
@js.native
object endianness extends js.Object {
  def apply(): BE | LE = js.native
}

