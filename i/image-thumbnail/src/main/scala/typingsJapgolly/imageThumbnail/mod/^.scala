package typingsJapgolly.imageThumbnail.mod

import typingsJapgolly.imageThumbnail.AnonUri
import typingsJapgolly.imageThumbnail.responseTypebase64Options
import typingsJapgolly.imageThumbnail.responseTypebufferOptions
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-thumbnail", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(src: String): js.Promise[Buffer] = js.native
  def apply(src: String, options: responseTypebase64Options): js.Promise[String] = js.native
  def apply(src: String, options: responseTypebufferOptions): js.Promise[Buffer] = js.native
  def apply(src: AnonUri): js.Promise[Buffer] = js.native
  def apply(src: AnonUri, options: responseTypebase64Options): js.Promise[String] = js.native
  def apply(src: AnonUri, options: responseTypebufferOptions): js.Promise[Buffer] = js.native
  def apply(src: Buffer): js.Promise[Buffer] = js.native
  def apply(src: Buffer, options: responseTypebase64Options): js.Promise[String] = js.native
  def apply(src: Buffer, options: responseTypebufferOptions): js.Promise[Buffer] = js.native
  def apply(src: ReadStream): js.Promise[Buffer] = js.native
  def apply(src: ReadStream, options: responseTypebase64Options): js.Promise[String] = js.native
  def apply(src: ReadStream, options: responseTypebufferOptions): js.Promise[Buffer] = js.native
}

