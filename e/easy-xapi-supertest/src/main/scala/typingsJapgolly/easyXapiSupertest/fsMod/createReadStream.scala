package typingsJapgolly.easyXapiSupertest.fsMod

import typingsJapgolly.easyXapiSupertest.AnonBufferSize
import typingsJapgolly.easyXapiSupertest.AnonFd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "createReadStream")
@js.native
object createReadStream extends js.Object {
  def apply(path: String): ReadStream = js.native
  def apply(path: String, options: AnonBufferSize): ReadStream = js.native
  def apply(path: String, options: AnonFd): ReadStream = js.native
}

