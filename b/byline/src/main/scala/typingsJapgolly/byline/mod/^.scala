package typingsJapgolly.byline.mod

import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("byline", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var LineStream: LineStreamCreatable = js.native
  def apply(): LineStream = js.native
  def apply(stream: ReadableStream): LineStream = js.native
  def apply(stream: ReadableStream, options: LineStreamOptions): LineStream = js.native
}

