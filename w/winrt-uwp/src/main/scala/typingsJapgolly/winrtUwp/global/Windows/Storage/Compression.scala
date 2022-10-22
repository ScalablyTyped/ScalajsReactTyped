package typingsJapgolly.winrtUwp.global.Windows.Storage

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsJapgolly.winrtUwp.Windows.Storage.Compression.CompressAlgorithm
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IOutputStream
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.InputStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a unified interface to the compression features included in Windows that frees developers from responsibility for managing block sizes, compression parameters, and other details that the native compression API requires. */
object Compression {
  
  /** Identifies a compression algorithm to use when creating an instance of a compressor. */
  @JSGlobal("Windows.Storage.Compression.CompressAlgorithm")
  @js.native
  object CompressAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Storage.Compression.CompressAlgorithm & Double] = js.native
    
    /* 0 */ val invalidAlgorithm: typingsJapgolly.winrtUwp.Windows.Storage.Compression.CompressAlgorithm.invalidAlgorithm & Double = js.native
    
    /* 5 */ val lzms: typingsJapgolly.winrtUwp.Windows.Storage.Compression.CompressAlgorithm.lzms & Double = js.native
    
    /* 2 */ val mszip: typingsJapgolly.winrtUwp.Windows.Storage.Compression.CompressAlgorithm.mszip & Double = js.native
    
    /* 1 */ val nullAlgorithm: typingsJapgolly.winrtUwp.Windows.Storage.Compression.CompressAlgorithm.nullAlgorithm & Double = js.native
    
    /* 3 */ val xpress: typingsJapgolly.winrtUwp.Windows.Storage.Compression.CompressAlgorithm.xpress & Double = js.native
    
    /* 4 */ val xpressHuff: typingsJapgolly.winrtUwp.Windows.Storage.Compression.CompressAlgorithm.xpressHuff & Double = js.native
  }
  
  /** A compressor takes information written to a stream and compresses it using a compression algorithm. */
  @JSGlobal("Windows.Storage.Compression.Compressor")
  @js.native
  open class Compressor protected ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Storage.Compression.Compressor {
    /**
      * Creates an instance of a compressor.
      * @param underlyingStream The stream of compressed information to be written by the compressor.
      */
    def this(underlyingStream: IOutputStream) = this()
    /**
      * Creates an instance of a compressor.
      * @param underlyingStream The stream of compressed information to be written by the compressor.
      * @param algorithm The compression algorithm used by the compressor to write underlyingStream.
      * @param blockSize Size in bytes of the intermediate buffer used by the compression algorithm. A value of 0 specifies that the compression algorithm will use its default block size. Valid non-zero values for this parameter are 32Kb to 64Mb.
      */
    def this(underlyingStream: IOutputStream, algorithm: CompressAlgorithm, blockSize: Double) = this()
    
    /** Closes a Compressor object and synchronously discards any information in buffers. This will close the underlying stream as well unless the Compressor.Detach method has been used to detach the stream from the object. Subsequent calls on a closed object, except for Compressor.Close, will fail. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Detaches the underlying stream from the Compressor object so that the object can be closed using the Compressor.Close method without also closing the underlying stream.
      * @return The stream of information.
      */
    /* CompleteClass */
    override def detachStream(): IOutputStream = js.native
    
    /**
      * Finishes writing the compression stream.
      * @return The asynchronous operation.
      */
    /* CompleteClass */
    override def finishAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
    
    /**
      * Flushes the compression stream asynchronously.
      * @return The asynchronous operation.
      */
    /* CompleteClass */
    override def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
    
    /**
      * Writes information to the compression stream asynchronously.
      * @param buffer The buffer that contains the information to be written to the stream.
      * @return The asynchronous operation.
      */
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  /** A decompressor takes a stream compressed by a compressor and decompresses it. */
  @JSGlobal("Windows.Storage.Compression.Decompressor")
  @js.native
  open class Decompressor protected ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Storage.Compression.Decompressor {
    /**
      * This method creates an instance of a decompressor.
      * @param underlyingStream The stream of compressed information to be read and decompressed by the decompressor.
      */
    def this(underlyingStream: IInputStream) = this()
    
    /** Closes a Decompressor object and synchronously discards any information in buffers. This will close the underlying stream as well unless the Decompressor.Detach method has been used to detach the stream from the object. Subsequent calls on a closed object, except Decompressor.Close, will fail. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Detaches the underlying stream from the Decompressor object so that the object can be closed using the Decompressor.Close method without also closing the underlying stream.
      * @return The stream of information.
      */
    /* CompleteClass */
    override def detachStream(): IInputStream = js.native
    
    /**
      * Reads from the compression stream asynchronously.
      * @param buffer The buffer that contains the information to be read from the stream.
      * @param count The number of bytes to read.
      * @param options Read options
      * @return The asynchronous operation.
      */
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  }
}
