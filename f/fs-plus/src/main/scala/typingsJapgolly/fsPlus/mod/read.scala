package typingsJapgolly.fsPlus.mod

import typingsJapgolly.node.AnonBufferBytesRead
import typingsJapgolly.node.AnonBufferDataViewBytesReadNumber
import typingsJapgolly.node.AnonBufferFloat32ArrayBytesReadNumber
import typingsJapgolly.node.AnonBufferFloat64ArrayBytesReadNumber
import typingsJapgolly.node.AnonBufferInt16ArrayBytesReadNumber
import typingsJapgolly.node.AnonBufferInt32ArrayBytesReadNumber
import typingsJapgolly.node.AnonBufferInt8ArrayBytesReadNumber
import typingsJapgolly.node.AnonBufferUint16Array
import typingsJapgolly.node.AnonBytesRead
import typingsJapgolly.node.AnonBytesReadNumber
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.std.DataView
import typingsJapgolly.std.Float32Array
import typingsJapgolly.std.Float64Array
import typingsJapgolly.std.Int16Array
import typingsJapgolly.std.Int32Array
import typingsJapgolly.std.Int8Array
import typingsJapgolly.std.Uint16Array
import typingsJapgolly.std.Uint32Array
import typingsJapgolly.std.Uint8Array
import typingsJapgolly.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-plus", "read")
@js.native
object read extends js.Object {
  def apply(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Float32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Float32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Float64Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Float64Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint32Array, 
      Unit
    ]
  ): Unit = js.native
  /**
    * Asynchronously reads data from the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param buffer The buffer that the data will be written to.
    * @param offset The offset in the buffer at which to start writing.
    * @param length The number of bytes to read.
    * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
    */
  def apply(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: DataView, offset: Double, length: Double): js.Promise[AnonBufferDataViewBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: DataView, offset: Double, length: Double, position: Double): js.Promise[AnonBufferDataViewBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Float32Array, offset: Double, length: Double): js.Promise[AnonBufferFloat32ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Float32Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferFloat32ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Float64Array, offset: Double, length: Double): js.Promise[AnonBufferFloat64ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Float64Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferFloat64ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Int16Array, offset: Double, length: Double): js.Promise[AnonBufferInt16ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Int16Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferInt16ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Int32Array, offset: Double, length: Double): js.Promise[AnonBufferInt32ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Int32Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferInt32ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Int8Array, offset: Double, length: Double): js.Promise[AnonBufferInt8ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Int8Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferInt8ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint16Array, offset: Double, length: Double): js.Promise[AnonBufferUint16Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint16Array, offset: Double, length: Double, position: Double): js.Promise[AnonBufferUint16Array] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint32Array, offset: Double, length: Double): js.Promise[AnonBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint32Array, offset: Double, length: Double, position: Double): js.Promise[AnonBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint8Array, offset: Double, length: Double): js.Promise[AnonBytesRead] = js.native
  /**
    * @param fd A file descriptor.
    * @param buffer The buffer that the data will be written to.
    * @param offset The offset in the buffer at which to start writing.
    * @param length The number of bytes to read.
    * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
    */
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): js.Promise[AnonBytesRead] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double): js.Promise[AnonBufferBytesRead] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double, position: Double): js.Promise[AnonBufferBytesRead] = js.native
}

