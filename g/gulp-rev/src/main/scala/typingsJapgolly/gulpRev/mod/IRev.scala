package typingsJapgolly.gulpRev.mod

import typingsJapgolly.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRev extends js.Object {
  def apply(): ReadWriteStream = js.native
  def manifest(): ReadWriteStream = js.native
  def manifest(options: IOptions): ReadWriteStream = js.native
  def manifest(path: String): ReadWriteStream = js.native
  def manifest(path: String, options: IOptions): ReadWriteStream = js.native
}

