package typingsJapgolly.gulpWatch

import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.raw.Blob
import typingsJapgolly.gulpWatch.gulpWatchStrings.add
import typingsJapgolly.gulpWatch.gulpWatchStrings.change
import typingsJapgolly.gulpWatch.gulpWatchStrings.unlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.File & {  event  :'add' | 'change' | 'unlink'} */
@js.native
trait Fileeventaddchangeunlink extends js.Object {
  var event: add | change | unlink = js.native
  val lastModified: Double = js.native
  val name: String = js.native
  val size: Double = js.native
  val `type`: String = js.native
  def arrayBuffer(): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def slice(): Blob = js.native
  def slice(start: Double): Blob = js.native
  def slice(start: Double, end: Double): Blob = js.native
  def slice(start: Double, end: Double, contentType: String): Blob = js.native
  def stream(): ReadableStream[_] = js.native
  def text(): js.Promise[String] = js.native
}

