package typingsJapgolly.winrtUwp.Windows.Storage

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IOutputStream
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.InputStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a unified interface to the compression features included in Windows that frees developers from responsibility for managing block sizes, compression parameters, and other details that the native compression API requires. */
object Compression {
  
  @js.native
  sealed trait CompressAlgorithm extends StObject
  /** Identifies a compression algorithm to use when creating an instance of a compressor. */
  @JSGlobal("Windows.Storage.Compression.CompressAlgorithm")
  @js.native
  object CompressAlgorithm extends StObject {
    
    /** This value represents an invalid compression algorithm. It is useful primarily for error checking. */
    @js.native
    sealed trait invalidAlgorithm
      extends StObject
         with CompressAlgorithm
    
    /** The compressor will use the LZMS compression algorithm. */
    @js.native
    sealed trait lzms
      extends StObject
         with CompressAlgorithm
    
    /** The compressor will use the MSZIP compression algorithm. */
    @js.native
    sealed trait mszip
      extends StObject
         with CompressAlgorithm
    
    /** This value represents an algorithm that passes data through with no compression. It is useful primarily for testing. */
    @js.native
    sealed trait nullAlgorithm
      extends StObject
         with CompressAlgorithm
    
    /** The compressor will use the XPRESS compression algorithm. */
    @js.native
    sealed trait xpress
      extends StObject
         with CompressAlgorithm
    
    /** The compressor will use the XPRESS compression algorithm with Huffman encoding. */
    @js.native
    sealed trait xpressHuff
      extends StObject
         with CompressAlgorithm
  }
  
  /** A compressor takes information written to a stream and compresses it using a compression algorithm. */
  trait Compressor extends StObject {
    
    /** Closes a Compressor object and synchronously discards any information in buffers. This will close the underlying stream as well unless the Compressor.Detach method has been used to detach the stream from the object. Subsequent calls on a closed object, except for Compressor.Close, will fail. */
    def close(): Unit
    
    /**
      * Detaches the underlying stream from the Compressor object so that the object can be closed using the Compressor.Close method without also closing the underlying stream.
      * @return The stream of information.
      */
    def detachStream(): IOutputStream
    
    /**
      * Finishes writing the compression stream.
      * @return The asynchronous operation.
      */
    def finishAsync(): IPromiseWithIAsyncOperation[Boolean]
    
    /**
      * Flushes the compression stream asynchronously.
      * @return The asynchronous operation.
      */
    def flushAsync(): IPromiseWithIAsyncOperation[Boolean]
    
    /**
      * Writes information to the compression stream asynchronously.
      * @param buffer The buffer that contains the information to be written to the stream.
      * @return The asynchronous operation.
      */
    def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double]
  }
  object Compressor {
    
    inline def apply(
      close: Callback,
      detachStream: CallbackTo[IOutputStream],
      finishAsync: CallbackTo[IPromiseWithIAsyncOperation[Boolean]],
      flushAsync: CallbackTo[IPromiseWithIAsyncOperation[Boolean]],
      writeAsync: IBuffer => IPromiseWithIAsyncOperationWithProgress[Double, Double]
    ): Compressor = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, detachStream = detachStream.toJsFn, finishAsync = finishAsync.toJsFn, flushAsync = flushAsync.toJsFn, writeAsync = js.Any.fromFunction1(writeAsync))
      __obj.asInstanceOf[Compressor]
    }
    
    extension [Self <: Compressor](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setDetachStream(value: CallbackTo[IOutputStream]): Self = StObject.set(x, "detachStream", value.toJsFn)
      
      inline def setFinishAsync(value: CallbackTo[IPromiseWithIAsyncOperation[Boolean]]): Self = StObject.set(x, "finishAsync", value.toJsFn)
      
      inline def setFlushAsync(value: CallbackTo[IPromiseWithIAsyncOperation[Boolean]]): Self = StObject.set(x, "flushAsync", value.toJsFn)
      
      inline def setWriteAsync(value: IBuffer => IPromiseWithIAsyncOperationWithProgress[Double, Double]): Self = StObject.set(x, "writeAsync", js.Any.fromFunction1(value))
    }
  }
  
  /** A decompressor takes a stream compressed by a compressor and decompresses it. */
  trait Decompressor extends StObject {
    
    /** Closes a Decompressor object and synchronously discards any information in buffers. This will close the underlying stream as well unless the Decompressor.Detach method has been used to detach the stream from the object. Subsequent calls on a closed object, except Decompressor.Close, will fail. */
    def close(): Unit
    
    /**
      * Detaches the underlying stream from the Decompressor object so that the object can be closed using the Decompressor.Close method without also closing the underlying stream.
      * @return The stream of information.
      */
    def detachStream(): IInputStream
    
    /**
      * Reads from the compression stream asynchronously.
      * @param buffer The buffer that contains the information to be read from the stream.
      * @param count The number of bytes to read.
      * @param options Read options
      * @return The asynchronous operation.
      */
    def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
  }
  object Decompressor {
    
    inline def apply(
      close: Callback,
      detachStream: CallbackTo[IInputStream],
      readAsync: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
    ): Decompressor = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, detachStream = detachStream.toJsFn, readAsync = js.Any.fromFunction3(readAsync))
      __obj.asInstanceOf[Decompressor]
    }
    
    extension [Self <: Decompressor](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setDetachStream(value: CallbackTo[IInputStream]): Self = StObject.set(x, "detachStream", value.toJsFn)
      
      inline def setReadAsync(
        value: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
      ): Self = StObject.set(x, "readAsync", js.Any.fromFunction3(value))
    }
  }
}
