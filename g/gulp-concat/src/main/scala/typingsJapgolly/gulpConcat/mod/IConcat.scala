package typingsJapgolly.gulpConcat.mod

import typingsJapgolly.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConcat extends js.Object {
  def apply(filename: String): ReadWriteStream = js.native
  def apply(filename: String, options: IOptions): ReadWriteStream = js.native
  def apply(options: IVinylOptions): ReadWriteStream = js.native
}

