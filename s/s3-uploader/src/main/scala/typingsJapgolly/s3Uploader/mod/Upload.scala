package typingsJapgolly.s3Uploader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Upload extends js.Object {
  def upload(src: String): Unit = js.native
  def upload(src: String, opts: S3UploaderOptions): Unit = js.native
  def upload(
    src: String,
    opts: S3UploaderOptions,
    cb: js.Function3[/* err */ String, /* images */ js.Array[image], /* meta */ Meta, Unit]
  ): Unit = js.native
}

