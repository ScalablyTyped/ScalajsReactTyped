package typingsJapgolly.localforage

import org.scalajs.dom.raw.Blob
import typingsJapgolly.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalForageSerializer extends js.Object {
  def bufferToString(buffer: scala.scalajs.js.typedarray.ArrayBuffer): String = js.native
  def deserialize[T](value: String): T | scala.scalajs.js.typedarray.ArrayBuffer | Blob = js.native
  def serialize[T](value: T, callback: js.Function2[/* value */ String, /* error */ js.Any, Unit]): Unit = js.native
  def serialize[T](value: ArrayBuffer, callback: js.Function2[/* value */ String, /* error */ js.Any, Unit]): Unit = js.native
  def serialize[T](
    value: typingsJapgolly.std.Blob,
    callback: js.Function2[/* value */ String, /* error */ js.Any, Unit]
  ): Unit = js.native
  def stringToBuffer(serializedString: String): scala.scalajs.js.typedarray.ArrayBuffer = js.native
}

