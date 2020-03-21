package typingsJapgolly.nodeForge.mod.util

import typingsJapgolly.nodeForge.mod.Base64
import typingsJapgolly.nodeForge.mod.Bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "util.encode64")
@js.native
object encode64 extends js.Object {
  def apply(bytes: Bytes): Base64 = js.native
  def apply(bytes: Bytes, maxline: Double): Base64 = js.native
}

