package typingsJapgolly.reactFilepond.mod

import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Note that this duplicates the JS File type declaration, but is necessary
// to avoid duplicating the name 'File' in this module
// see: https://developer.mozilla.org/en-US/docs/Web/API/File
// see: https://github.com/Microsoft/dtslint/issues/173
// see: https://stackoverflow.com/q/53876793/2517147
/* Inlined std.Blob & { readonly lastModified  :number,  readonly name  :string} */
@js.native
trait ActualFileObject extends js.Object {
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

