package typingsJapgolly.fsExtraPromiseEs6.mod

import typingsJapgolly.fsExtraPromiseEs6.AnonAutoClose
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise-es6", "createReadStream")
@js.native
object createReadStream extends js.Object {
  def apply(path: String): ReadStream = js.native
  def apply(path: String, options: AnonAutoClose): ReadStream = js.native
  def apply(path: Buffer): ReadStream = js.native
  def apply(path: Buffer, options: AnonAutoClose): ReadStream = js.native
}

