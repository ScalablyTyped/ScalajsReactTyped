package typingsJapgolly.tar.mod

import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.tar.CreateOptionsFileOptionss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tar", "c")
@js.native
object c extends js.Object {
  def apply(
    options: CreateOptions with FileOptions,
    fileList: js.Array[String],
    callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
  def apply(options: CreateOptionsFileOptionss, fileList: js.Array[String]): Unit = js.native
  def apply(options: CreateOptions, fileList: js.Array[String]): Readable = js.native
}

