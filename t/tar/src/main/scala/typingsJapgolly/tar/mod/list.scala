package typingsJapgolly.tar.mod

import typingsJapgolly.node.streamMod.Writable
import typingsJapgolly.tar.ListOptionsFileOptionssyn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tar", "list")
@js.native
object list extends js.Object {
  def apply(): Writable = js.native
  def apply(options: ListOptionsFileOptionssyn): Unit = js.native
  def apply(options: ListOptionsFileOptionssyn, fileList: js.Array[String]): Unit = js.native
  def apply(options: ListOptions): Writable = js.native
  def apply(options: ListOptions, fileList: js.Array[String]): Writable = js.native
  def apply(
    options: ListOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Writable = js.native
}

