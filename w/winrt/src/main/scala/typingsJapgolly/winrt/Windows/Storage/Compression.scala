package typingsJapgolly.winrt.Windows.Storage

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream
import typingsJapgolly.winrt.Windows.Storage.Streams.InputStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Compression {
  
  @js.native
  sealed trait CompressAlgorithm extends StObject
  @JSGlobal("Windows.Storage.Compression.CompressAlgorithm")
  @js.native
  object CompressAlgorithm extends StObject {
    
    @js.native
    sealed trait invalidAlgorithm
      extends StObject
         with CompressAlgorithm
    
    @js.native
    sealed trait lzms
      extends StObject
         with CompressAlgorithm
    
    @js.native
    sealed trait mszip
      extends StObject
         with CompressAlgorithm
    
    @js.native
    sealed trait nullAlgorithm
      extends StObject
         with CompressAlgorithm
    
    @js.native
    sealed trait xpress
      extends StObject
         with CompressAlgorithm
    
    @js.native
    sealed trait xpressHuff
      extends StObject
         with CompressAlgorithm
  }
  
  trait Compressor
    extends StObject
       with ICompressor {
    
    def dispose(): Unit
  }
  object Compressor {
    
    inline def apply(
      close: Callback,
      detachStream: CallbackTo[IOutputStream],
      dispose: Callback,
      finishAsync: CallbackTo[IAsyncOperation[Boolean]],
      flushAsync: CallbackTo[IAsyncOperation[Boolean]],
      writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
    ): Compressor = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, detachStream = detachStream.toJsFn, dispose = dispose.toJsFn, finishAsync = finishAsync.toJsFn, flushAsync = flushAsync.toJsFn, writeAsync = js.Any.fromFunction1(writeAsync))
      __obj.asInstanceOf[Compressor]
    }
    
    extension [Self <: Compressor](x: Self) {
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    }
  }
  
  trait Decompressor
    extends StObject
       with IDecompressor {
    
    def dispose(): Unit
  }
  object Decompressor {
    
    inline def apply(
      close: Callback,
      detachStream: CallbackTo[IInputStream],
      dispose: Callback,
      readAsync: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double]
    ): Decompressor = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, detachStream = detachStream.toJsFn, dispose = dispose.toJsFn, readAsync = js.Any.fromFunction3(readAsync))
      __obj.asInstanceOf[Decompressor]
    }
    
    extension [Self <: Decompressor](x: Self) {
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    }
  }
  
  trait ICompressor
    extends StObject
       with IOutputStream {
    
    def detachStream(): IOutputStream
    
    def finishAsync(): IAsyncOperation[Boolean]
  }
  object ICompressor {
    
    inline def apply(
      close: Callback,
      detachStream: CallbackTo[IOutputStream],
      finishAsync: CallbackTo[IAsyncOperation[Boolean]],
      flushAsync: CallbackTo[IAsyncOperation[Boolean]],
      writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
    ): ICompressor = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, detachStream = detachStream.toJsFn, finishAsync = finishAsync.toJsFn, flushAsync = flushAsync.toJsFn, writeAsync = js.Any.fromFunction1(writeAsync))
      __obj.asInstanceOf[ICompressor]
    }
    
    extension [Self <: ICompressor](x: Self) {
      
      inline def setDetachStream(value: CallbackTo[IOutputStream]): Self = StObject.set(x, "detachStream", value.toJsFn)
      
      inline def setFinishAsync(value: CallbackTo[IAsyncOperation[Boolean]]): Self = StObject.set(x, "finishAsync", value.toJsFn)
    }
  }
  
  trait ICompressorFactory extends StObject {
    
    def createCompressor(underlyingStream: IOutputStream): Compressor
    
    def createCompressorEx(underlyingStream: IOutputStream, algorithm: CompressAlgorithm, blockSize: Double): Compressor
  }
  object ICompressorFactory {
    
    inline def apply(
      createCompressor: IOutputStream => Compressor,
      createCompressorEx: (IOutputStream, CompressAlgorithm, Double) => Compressor
    ): ICompressorFactory = {
      val __obj = js.Dynamic.literal(createCompressor = js.Any.fromFunction1(createCompressor), createCompressorEx = js.Any.fromFunction3(createCompressorEx))
      __obj.asInstanceOf[ICompressorFactory]
    }
    
    extension [Self <: ICompressorFactory](x: Self) {
      
      inline def setCreateCompressor(value: IOutputStream => Compressor): Self = StObject.set(x, "createCompressor", js.Any.fromFunction1(value))
      
      inline def setCreateCompressorEx(value: (IOutputStream, CompressAlgorithm, Double) => Compressor): Self = StObject.set(x, "createCompressorEx", js.Any.fromFunction3(value))
    }
  }
  
  trait IDecompressor
    extends StObject
       with IInputStream {
    
    def detachStream(): IInputStream
  }
  object IDecompressor {
    
    inline def apply(
      close: Callback,
      detachStream: CallbackTo[IInputStream],
      readAsync: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double]
    ): IDecompressor = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, detachStream = detachStream.toJsFn, readAsync = js.Any.fromFunction3(readAsync))
      __obj.asInstanceOf[IDecompressor]
    }
    
    extension [Self <: IDecompressor](x: Self) {
      
      inline def setDetachStream(value: CallbackTo[IInputStream]): Self = StObject.set(x, "detachStream", value.toJsFn)
    }
  }
  
  trait IDecompressorFactory extends StObject {
    
    def createDecompressor(underlyingStream: IInputStream): Decompressor
  }
  object IDecompressorFactory {
    
    inline def apply(createDecompressor: IInputStream => Decompressor): IDecompressorFactory = {
      val __obj = js.Dynamic.literal(createDecompressor = js.Any.fromFunction1(createDecompressor))
      __obj.asInstanceOf[IDecompressorFactory]
    }
    
    extension [Self <: IDecompressorFactory](x: Self) {
      
      inline def setCreateDecompressor(value: IInputStream => Decompressor): Self = StObject.set(x, "createDecompressor", js.Any.fromFunction1(value))
    }
  }
}
