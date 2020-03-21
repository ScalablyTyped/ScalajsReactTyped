package typingsJapgolly.download.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("download", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(url: String): js.Promise[Buffer] with WritableStream with ReadableStream = js.native
  def apply(url: String, destination: String): js.Promise[Buffer] with WritableStream with ReadableStream = js.native
  def apply(url: String, destination: String, options: DownloadOptions): js.Promise[Buffer] with WritableStream with ReadableStream = js.native
}

