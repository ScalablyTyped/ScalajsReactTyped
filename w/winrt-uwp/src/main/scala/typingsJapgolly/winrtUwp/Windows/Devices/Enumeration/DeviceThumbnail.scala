package typingsJapgolly.winrtUwp.Windows.Devices.Enumeration

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IOutputStream
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the thumbnail image for a device. */
@JSGlobal("Windows.Devices.Enumeration.DeviceThumbnail")
@js.native
abstract class DeviceThumbnail () extends js.Object {
  /** Gets a value that indicates whether the stream can be read from. */
  var canRead: Boolean = js.native
  /** Gets a value that indicates whether the stream can be written to. */
  var canWrite: Boolean = js.native
  /** Returns the content type of the thumbnail image. */
  var contentType: String = js.native
  /** Gets the byte offset of the stream. */
  var position: Double = js.native
  /** Gets or sets the size of the device thumbnail image. */
  var size: Double = js.native
  /**
    * Creates a new instance of a IRandomAccessStream over the same resource as the current stream.
    * @return The new stream. The initial, internal position of the stream is 0.
    */
  def cloneStream(): IRandomAccessStream = js.native
  /** Closes the current stream and releases system resources. */
  def close(): Unit = js.native
  /**
    * Flushes data asynchronously in a sequential stream.
    * @return The stream flush operation.
    */
  def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Returns a pointer to an input stream starting at the specified location.
    * @param position The position in the input stream.
    * @return A pointer to an input stream.
    */
  def getInputStreamAt(position: Double): IInputStream = js.native
  /**
    * Returns a pointer to an output stream starting at the specified location.
    * @param position The position in the output stream.
    * @return A pointer to an output stream.
    */
  def getOutputStreamAt(position: Double): IOutputStream = js.native
  /**
    * Returns an asynchronous byte reader object.
    * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
    * @param count The number of bytes to read.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  /**
    * Sets the position of the stream to the specified value.
    * @param position The new position of the stream.
    */
  def seek(position: Double): Unit = js.native
  /**
    * Writes data asynchronously in a sequential stream.
    * @param buffer The buffer into which the asynchronous writer operation writes.
    * @return The byte writer operation.
    */
  def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}

