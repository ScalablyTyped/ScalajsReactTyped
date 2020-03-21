package typingsJapgolly.serialport.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.serialport.serialportStrings.ascii
import typingsJapgolly.serialport.serialportStrings.base64
import typingsJapgolly.serialport.serialportStrings.binary
import typingsJapgolly.serialport.serialportStrings.hex
import typingsJapgolly.serialport.serialportStrings.ucs2
import typingsJapgolly.serialport.serialportStrings.utf16le
import typingsJapgolly.serialport.serialportStrings.utf8
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerialPort extends Duplex {
  val baudRate: Double = js.native
  val binding: BaseBinding = js.native
  val isOpen: Boolean = js.native
  val path: String = js.native
  def close(): Unit = js.native
  def close(callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
  def drain(): Unit = js.native
  def drain(callback: ErrorCallback): Unit = js.native
  def flush(): Unit = js.native
  def flush(callback: ErrorCallback): Unit = js.native
  def get(): Unit = js.native
  def get(callback: ModemBitsCallback): Unit = js.native
  def open(): Unit = js.native
  def open(callback: ErrorCallback): Unit = js.native
  def set(options: SetOptions): Unit = js.native
  def set(options: SetOptions, callback: ErrorCallback): Unit = js.native
  def update(options: UpdateOptions): Unit = js.native
  def update(options: UpdateOptions, callback: ErrorCallback): Unit = js.native
  def write(buffer: String | js.Array[Double] | Buffer): Boolean = js.native
  def write(
    buffer: String | js.Array[Double] | Buffer,
    encoding: ascii | utf8 | utf16le | ucs2 | base64 | binary | hex
  ): Boolean = js.native
  def write(
    buffer: String | js.Array[Double] | Buffer,
    encoding: ascii | utf8 | utf16le | ucs2 | base64 | binary | hex,
    callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  def write(data: String): Boolean = js.native
  def write(
    data: String,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  def write(data: js.Array[Double]): Boolean = js.native
  def write(
    data: js.Array[Double],
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
  def write(data: Buffer): Boolean = js.native
  def write(
    data: Buffer,
    callback: js.Function2[/* error */ js.UndefOr[Error | Null], /* bytesWritten */ Double, Unit]
  ): Boolean = js.native
}

