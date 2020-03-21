package typingsJapgolly.jszip.mod

import org.scalajs.dom.raw.Blob
import typingsJapgolly.jszip.jszipStrings.array
import typingsJapgolly.jszip.jszipStrings.arraybuffer
import typingsJapgolly.jszip.jszipStrings.base64
import typingsJapgolly.jszip.jszipStrings.binarystring
import typingsJapgolly.jszip.jszipStrings.blob
import typingsJapgolly.jszip.jszipStrings.nodebuffer
import typingsJapgolly.jszip.jszipStrings.nodestream
import typingsJapgolly.jszip.jszipStrings.string
import typingsJapgolly.jszip.jszipStrings.text
import typingsJapgolly.jszip.jszipStrings.uint8array
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSZipObject extends js.Object {
  var comment: String = js.native
  var date: js.Date = js.native
  var dir: Boolean = js.native
  /** The UNIX permissions of the file, if any. */
  var dosPermissions: Double | Null = js.native
  var name: String = js.native
  var options: JSZipObjectOptions = js.native
  /** The UNIX permissions of the file, if any. */
  var unixPermissions: Double | String | Null = js.native
  @JSName("async")
  def async_array(`type`: array): js.Promise[js.Array[Double]] = js.native
  @JSName("async")
  def async_array(`type`: array, onUpdate: OnUpdateCallback): js.Promise[js.Array[Double]] = js.native
  @JSName("async")
  def async_arraybuffer(`type`: arraybuffer): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  @JSName("async")
  def async_arraybuffer(`type`: arraybuffer, onUpdate: OnUpdateCallback): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  /**
    * Prepare the content in the asked type.
    * @param type the type of the result.
    * @param onUpdate a function to call on each internal update.
    * @return Promise the promise of the result.
    */
  @JSName("async")
  def async_base64(`type`: base64): js.Promise[String] = js.native
  @JSName("async")
  def async_base64(`type`: base64, onUpdate: OnUpdateCallback): js.Promise[String] = js.native
  @JSName("async")
  def async_binarystring(`type`: binarystring): js.Promise[String] = js.native
  @JSName("async")
  def async_binarystring(`type`: binarystring, onUpdate: OnUpdateCallback): js.Promise[String] = js.native
  @JSName("async")
  def async_blob(`type`: blob): js.Promise[Blob] = js.native
  @JSName("async")
  def async_blob(`type`: blob, onUpdate: OnUpdateCallback): js.Promise[Blob] = js.native
  @JSName("async")
  def async_nodebuffer(`type`: nodebuffer): js.Promise[Buffer] = js.native
  @JSName("async")
  def async_nodebuffer(`type`: nodebuffer, onUpdate: OnUpdateCallback): js.Promise[Buffer] = js.native
  @JSName("async")
  def async_string(`type`: string): js.Promise[String] = js.native
  @JSName("async")
  def async_string(`type`: string, onUpdate: OnUpdateCallback): js.Promise[String] = js.native
  @JSName("async")
  def async_text(`type`: text): js.Promise[String] = js.native
  @JSName("async")
  def async_text(`type`: text, onUpdate: OnUpdateCallback): js.Promise[String] = js.native
  @JSName("async")
  def async_uint8array(`type`: uint8array): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
  @JSName("async")
  def async_uint8array(`type`: uint8array, onUpdate: OnUpdateCallback): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
  def nodeStream(): ReadableStream = js.native
  @JSName("nodeStream")
  def nodeStream_nodestream(`type`: nodestream): ReadableStream = js.native
  @JSName("nodeStream")
  def nodeStream_nodestream(`type`: nodestream, onUpdate: OnUpdateCallback): ReadableStream = js.native
}

