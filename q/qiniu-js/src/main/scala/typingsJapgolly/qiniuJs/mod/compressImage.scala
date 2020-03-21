package typingsJapgolly.qiniuJs.mod

import org.scalajs.dom.raw.Blob
import typingsJapgolly.qiniuJs.AnonDist
import typingsJapgolly.qiniuJs.PartialCompressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu-js", "compressImage")
@js.native
object compressImage extends js.Object {
  def apply(file: Blob, options: PartialCompressOptions): js.Promise[AnonDist] = js.native
}

