package typingsJapgolly.winrtUwp.Windows.Storage.Streams

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reads data from an input stream. */
trait DataReader extends StObject {
  
  /** Gets or sets the byte order of the data in the input stream. */
  var byteOrder: ByteOrder
  
  /** Closes the current stream and releases system resources. */
  def close(): Unit
  
  /**
    * Detaches the buffer that is associated with the data reader.
    * @return The detached buffer.
    */
  def detachBuffer(): IBuffer
  
  /**
    * Detaches the stream that is associated with the data reader.
    * @return The detached stream.
    */
  def detachStream(): IInputStream
  
  /** Gets or sets the read options for the input stream. */
  var inputStreamOptions: InputStreamOptions
  
  /**
    * Loads data from the input stream.
    * @param count The count of bytes to load into the intermediate buffer.
    * @return The asynchronous load data request.
    */
  def loadAsync(count: Double): IPromiseWithOperation[Any, DataReaderLoadOperation]
  
  /**
    * Reads a Boolean value from the input stream.
    * @return The value.
    */
  def readBoolean(): Boolean
  
  /**
    * Reads a buffer from the input stream.
    * @param length The length of the buffer, in bytes.
    * @return The buffer.
    */
  def readBuffer(length: Double): IBuffer
  
  /**
    * Reads a byte value from the input stream.
    * @return The value.
    */
  def readByte(): Double
  
  /**
    * Reads an array of byte values from the input stream.
    * @return The array that receives the byte values.
    */
  def readBytes(): js.Array[Double]
  
  /**
    * Reads a date and time value from the input stream.
    * @return The value.
    */
  def readDateTime(): js.Date
  
  /**
    * Reads a floating-point value from the input stream.
    * @return The value.
    */
  def readDouble(): Double
  
  /**
    * Reads a GUID value from the input stream.
    * @return The value.
    */
  def readGuid(): String
  
  /**
    * Reads a 16-bit integer value from the input stream.
    * @return The value.
    */
  def readInt16(): Double
  
  /**
    * Reads a 32-bit integer value from the input stream.
    * @return The value.
    */
  def readInt32(): Double
  
  /**
    * Reads a 64-bit integer value from the input stream.
    * @return The value.
    */
  def readInt64(): Double
  
  /**
    * Reads a floating-point value from the input stream.
    * @return The value.
    */
  def readSingle(): Double
  
  /**
    * Reads a string value from the input stream.
    * @param codeUnitCount The length of the string.
    * @return The value.
    */
  def readString(codeUnitCount: Double): String
  
  /**
    * Reads a time-interval value from the input stream.
    * @return The value.
    */
  def readTimeSpan(): Double
  
  /**
    * Reads a 16-bit unsigned integer from the input stream.
    * @return The value.
    */
  def readUInt16(): Double
  
  /**
    * Reads a 32-bit unsigned integer from the input stream.
    * @return The value.
    */
  def readUInt32(): Double
  
  /**
    * Reads a 64-bit unsigned integer from the input stream.
    * @return The value.
    */
  def readUInt64(): Double
  
  /** Gets the size of the buffer that has not been read. */
  var unconsumedBufferLength: Double
  
  /** Gets or sets the Unicode character encoding for the input stream. */
  var unicodeEncoding: UnicodeEncoding
}
object DataReader {
  
  inline def apply(
    byteOrder: ByteOrder,
    close: Callback,
    detachBuffer: CallbackTo[IBuffer],
    detachStream: CallbackTo[IInputStream],
    inputStreamOptions: InputStreamOptions,
    loadAsync: Double => IPromiseWithOperation[Any, DataReaderLoadOperation],
    readBoolean: CallbackTo[Boolean],
    readBuffer: Double => IBuffer,
    readByte: CallbackTo[Double],
    readBytes: CallbackTo[js.Array[Double]],
    readDateTime: CallbackTo[js.Date],
    readDouble: CallbackTo[Double],
    readGuid: CallbackTo[String],
    readInt16: CallbackTo[Double],
    readInt32: CallbackTo[Double],
    readInt64: CallbackTo[Double],
    readSingle: CallbackTo[Double],
    readString: Double => String,
    readTimeSpan: CallbackTo[Double],
    readUInt16: CallbackTo[Double],
    readUInt32: CallbackTo[Double],
    readUInt64: CallbackTo[Double],
    unconsumedBufferLength: Double,
    unicodeEncoding: UnicodeEncoding
  ): DataReader = {
    val __obj = js.Dynamic.literal(byteOrder = byteOrder.asInstanceOf[js.Any], close = close.toJsFn, detachBuffer = detachBuffer.toJsFn, detachStream = detachStream.toJsFn, inputStreamOptions = inputStreamOptions.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction1(loadAsync), readBoolean = readBoolean.toJsFn, readBuffer = js.Any.fromFunction1(readBuffer), readByte = readByte.toJsFn, readBytes = readBytes.toJsFn, readDateTime = readDateTime.toJsFn, readDouble = readDouble.toJsFn, readGuid = readGuid.toJsFn, readInt16 = readInt16.toJsFn, readInt32 = readInt32.toJsFn, readInt64 = readInt64.toJsFn, readSingle = readSingle.toJsFn, readString = js.Any.fromFunction1(readString), readTimeSpan = readTimeSpan.toJsFn, readUInt16 = readUInt16.toJsFn, readUInt32 = readUInt32.toJsFn, readUInt64 = readUInt64.toJsFn, unconsumedBufferLength = unconsumedBufferLength.asInstanceOf[js.Any], unicodeEncoding = unicodeEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataReader]
  }
  
  extension [Self <: DataReader](x: Self) {
    
    inline def setByteOrder(value: ByteOrder): Self = StObject.set(x, "byteOrder", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setDetachBuffer(value: CallbackTo[IBuffer]): Self = StObject.set(x, "detachBuffer", value.toJsFn)
    
    inline def setDetachStream(value: CallbackTo[IInputStream]): Self = StObject.set(x, "detachStream", value.toJsFn)
    
    inline def setInputStreamOptions(value: InputStreamOptions): Self = StObject.set(x, "inputStreamOptions", value.asInstanceOf[js.Any])
    
    inline def setLoadAsync(value: Double => IPromiseWithOperation[Any, DataReaderLoadOperation]): Self = StObject.set(x, "loadAsync", js.Any.fromFunction1(value))
    
    inline def setReadBoolean(value: CallbackTo[Boolean]): Self = StObject.set(x, "readBoolean", value.toJsFn)
    
    inline def setReadBuffer(value: Double => IBuffer): Self = StObject.set(x, "readBuffer", js.Any.fromFunction1(value))
    
    inline def setReadByte(value: CallbackTo[Double]): Self = StObject.set(x, "readByte", value.toJsFn)
    
    inline def setReadBytes(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "readBytes", value.toJsFn)
    
    inline def setReadDateTime(value: CallbackTo[js.Date]): Self = StObject.set(x, "readDateTime", value.toJsFn)
    
    inline def setReadDouble(value: CallbackTo[Double]): Self = StObject.set(x, "readDouble", value.toJsFn)
    
    inline def setReadGuid(value: CallbackTo[String]): Self = StObject.set(x, "readGuid", value.toJsFn)
    
    inline def setReadInt16(value: CallbackTo[Double]): Self = StObject.set(x, "readInt16", value.toJsFn)
    
    inline def setReadInt32(value: CallbackTo[Double]): Self = StObject.set(x, "readInt32", value.toJsFn)
    
    inline def setReadInt64(value: CallbackTo[Double]): Self = StObject.set(x, "readInt64", value.toJsFn)
    
    inline def setReadSingle(value: CallbackTo[Double]): Self = StObject.set(x, "readSingle", value.toJsFn)
    
    inline def setReadString(value: Double => String): Self = StObject.set(x, "readString", js.Any.fromFunction1(value))
    
    inline def setReadTimeSpan(value: CallbackTo[Double]): Self = StObject.set(x, "readTimeSpan", value.toJsFn)
    
    inline def setReadUInt16(value: CallbackTo[Double]): Self = StObject.set(x, "readUInt16", value.toJsFn)
    
    inline def setReadUInt32(value: CallbackTo[Double]): Self = StObject.set(x, "readUInt32", value.toJsFn)
    
    inline def setReadUInt64(value: CallbackTo[Double]): Self = StObject.set(x, "readUInt64", value.toJsFn)
    
    inline def setUnconsumedBufferLength(value: Double): Self = StObject.set(x, "unconsumedBufferLength", value.asInstanceOf[js.Any])
    
    inline def setUnicodeEncoding(value: UnicodeEncoding): Self = StObject.set(x, "unicodeEncoding", value.asInstanceOf[js.Any])
  }
}
