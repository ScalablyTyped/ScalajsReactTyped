package typingsJapgolly.posterImage

import typingsJapgolly.std.Blob
import typingsJapgolly.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("poster-image", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(file: Blob): js.Promise[org.scalajs.dom.raw.Blob] = js.native
  def apply(file: File): js.Promise[org.scalajs.dom.raw.Blob] = js.native
}

