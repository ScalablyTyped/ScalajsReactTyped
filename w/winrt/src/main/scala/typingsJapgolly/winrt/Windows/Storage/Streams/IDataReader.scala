package typingsJapgolly.winrt.Windows.Storage.Streams

import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataReader extends js.Object {
  var byteOrder: ByteOrder = js.native
  var inputStreamOptions: InputStreamOptions = js.native
  var unconsumedBufferLength: Double = js.native
  var unicodeEncoding: UnicodeEncoding = js.native
  def detachBuffer(): IBuffer = js.native
  def detachStream(): IInputStream = js.native
  def loadAsync(count: Double): DataReaderLoadOperation = js.native
  def readBoolean(): Boolean = js.native
  def readBuffer(length: Double): IBuffer = js.native
  def readByte(): Double = js.native
  def readBytes(value: js.Array[Double]): Unit = js.native
  def readBytes(value: Uint8Array): Unit = js.native
  def readDateTime(): js.Date = js.native
  def readDouble(): Double = js.native
  def readGuid(): String = js.native
  def readInt16(): Double = js.native
  def readInt32(): Double = js.native
  def readInt64(): Double = js.native
  def readSingle(): Double = js.native
  def readString(codeUnitCount: Double): String = js.native
  def readTimeSpan(): Double = js.native
  def readUInt16(): Double = js.native
  def readUInt32(): Double = js.native
  def readUInt64(): Double = js.native
}

