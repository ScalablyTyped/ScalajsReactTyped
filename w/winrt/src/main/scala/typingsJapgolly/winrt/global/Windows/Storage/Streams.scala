package typingsJapgolly.winrt.global.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.AsyncStatus
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import typingsJapgolly.winrt.Windows.Storage.Streams.InputStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Streams {
  
  @JSGlobal("Windows.Storage.Streams.Buffer")
  @js.native
  open class Buffer protected ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Streams.Buffer {
    def this(capacity: Double) = this()
    
    /* CompleteClass */
    var capacity: Double = js.native
    
    /* CompleteClass */
    var length: Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Streams.ByteOrder")
  @js.native
  object ByteOrder extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.Streams.ByteOrder & Double] = js.native
    
    /* 1 */ val bigEndian: typingsJapgolly.winrt.Windows.Storage.Streams.ByteOrder.bigEndian & Double = js.native
    
    /* 0 */ val littleEndian: typingsJapgolly.winrt.Windows.Storage.Streams.ByteOrder.littleEndian & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Streams.DataReader")
  @js.native
  open class DataReader protected ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Streams.DataReader {
    def this(inputStream: IInputStream) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
  }
  /* static members */
  object DataReader {
    
    @JSGlobal("Windows.Storage.Streams.DataReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromBuffer(buffer: IBuffer): typingsJapgolly.winrt.Windows.Storage.Streams.DataReader = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Storage.Streams.DataReader]
  }
  
  @JSGlobal("Windows.Storage.Streams.DataReaderLoadOperation")
  @js.native
  open class DataReaderLoadOperation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Streams.DataReaderLoadOperation {
    
    /* InferMemberOverrides */
    override def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var errorCode: Double = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  @JSGlobal("Windows.Storage.Streams.DataWriter")
  @js.native
  open class DataWriter ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Streams.DataWriter {
    def this(outputStream: IOutputStream) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
  }
  
  @JSGlobal("Windows.Storage.Streams.DataWriterStoreOperation")
  @js.native
  open class DataWriterStoreOperation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Streams.DataWriterStoreOperation {
    
    /* InferMemberOverrides */
    override def cancel(): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var errorCode: Double = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  @JSGlobal("Windows.Storage.Streams.FileInputStream")
  @js.native
  open class FileInputStream ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Streams.FileInputStream {
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
  }
  
  @JSGlobal("Windows.Storage.Streams.FileOutputStream")
  @js.native
  open class FileOutputStream ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Streams.FileOutputStream {
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def flushAsync(): IAsyncOperation[Boolean] = js.native
    
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @JSGlobal("Windows.Storage.Streams.FileRandomAccessStream")
  @js.native
  open class FileRandomAccessStream ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Streams.FileRandomAccessStream {
    
    /* CompleteClass */
    var canRead: Boolean = js.native
    
    /* CompleteClass */
    var canWrite: Boolean = js.native
    
    /* CompleteClass */
    override def cloneStream(): IRandomAccessStream = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def flushAsync(): IAsyncOperation[Boolean] = js.native
    
    /* CompleteClass */
    override def getInputStreamAt(position: Double): IInputStream = js.native
    
    /* CompleteClass */
    override def getOutputStreamAt(position: Double): IOutputStream = js.native
    
    /* CompleteClass */
    var position: Double = js.native
    
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
    
    /* CompleteClass */
    override def seek(position: Double): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @JSGlobal("Windows.Storage.Streams.InMemoryRandomAccessStream")
  @js.native
  open class InMemoryRandomAccessStream ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Streams.InMemoryRandomAccessStream {
    
    /* CompleteClass */
    var canRead: Boolean = js.native
    
    /* CompleteClass */
    var canWrite: Boolean = js.native
    
    /* CompleteClass */
    override def cloneStream(): IRandomAccessStream = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def flushAsync(): IAsyncOperation[Boolean] = js.native
    
    /* CompleteClass */
    override def getInputStreamAt(position: Double): IInputStream = js.native
    
    /* CompleteClass */
    override def getOutputStreamAt(position: Double): IOutputStream = js.native
    
    /* CompleteClass */
    var position: Double = js.native
    
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
    
    /* CompleteClass */
    override def seek(position: Double): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @JSGlobal("Windows.Storage.Streams.InputStreamOptions")
  @js.native
  object InputStreamOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.Streams.InputStreamOptions & Double] = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.Storage.Streams.InputStreamOptions.none & Double = js.native
    
    /* 1 */ val partial: typingsJapgolly.winrt.Windows.Storage.Streams.InputStreamOptions.partial & Double = js.native
    
    /* 2 */ val readAhead: typingsJapgolly.winrt.Windows.Storage.Streams.InputStreamOptions.readAhead & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Streams.InputStreamOverStream")
  @js.native
  open class InputStreamOverStream ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Streams.InputStreamOverStream {
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
  }
  
  @JSGlobal("Windows.Storage.Streams.OutputStreamOverStream")
  @js.native
  open class OutputStreamOverStream ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Streams.OutputStreamOverStream {
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def flushAsync(): IAsyncOperation[Boolean] = js.native
    
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @JSGlobal("Windows.Storage.Streams.RandomAccessStream")
  @js.native
  open class RandomAccessStream ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Streams.RandomAccessStream
  /* static members */
  object RandomAccessStream {
    
    @JSGlobal("Windows.Storage.Streams.RandomAccessStream")
    @js.native
    val ^ : js.Any = js.native
    
    inline def copyAndCloseAsync(source: IInputStream, destination: IOutputStream): IAsyncOperationWithProgress[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAndCloseAsync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperationWithProgress[Double, Double]]
    
    inline def copyAsync(source: IInputStream, destination: IOutputStream): IAsyncOperationWithProgress[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAsync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperationWithProgress[Double, Double]]
    inline def copyAsync(source: IInputStream, destination: IOutputStream, bytesToCopy: Double): IAsyncOperationWithProgress[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAsync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], bytesToCopy.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperationWithProgress[Double, Double]]
  }
  
  @JSGlobal("Windows.Storage.Streams.RandomAccessStreamOverStream")
  @js.native
  open class RandomAccessStreamOverStream ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Streams.RandomAccessStreamOverStream {
    
    /* CompleteClass */
    var canRead: Boolean = js.native
    
    /* CompleteClass */
    var canWrite: Boolean = js.native
    
    /* CompleteClass */
    override def cloneStream(): IRandomAccessStream = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def flushAsync(): IAsyncOperation[Boolean] = js.native
    
    /* CompleteClass */
    override def getInputStreamAt(position: Double): IInputStream = js.native
    
    /* CompleteClass */
    override def getOutputStreamAt(position: Double): IOutputStream = js.native
    
    /* CompleteClass */
    var position: Double = js.native
    
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
    
    /* CompleteClass */
    override def seek(position: Double): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference")
  @js.native
  open class RandomAccessStreamReference ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Streams.RandomAccessStreamReference {
    
    /* CompleteClass */
    override def openReadAsync(): IAsyncOperation[IRandomAccessStreamWithContentType] = js.native
  }
  /* static members */
  object RandomAccessStreamReference {
    
    @JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createFromFile(file: IStorageFile): typingsJapgolly.winrt.Windows.Storage.Streams.RandomAccessStreamReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromFile")(file.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Storage.Streams.RandomAccessStreamReference]
    
    inline def createFromStream(stream: IRandomAccessStream): typingsJapgolly.winrt.Windows.Storage.Streams.RandomAccessStreamReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Storage.Streams.RandomAccessStreamReference]
    
    inline def createFromUri(uri: Uri): typingsJapgolly.winrt.Windows.Storage.Streams.RandomAccessStreamReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromUri")(uri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Storage.Streams.RandomAccessStreamReference]
  }
  
  @JSGlobal("Windows.Storage.Streams.UnicodeEncoding")
  @js.native
  object UnicodeEncoding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.Streams.UnicodeEncoding & Double] = js.native
    
    /* 2 */ val utf16BE: typingsJapgolly.winrt.Windows.Storage.Streams.UnicodeEncoding.utf16BE & Double = js.native
    
    /* 1 */ val utf16LE: typingsJapgolly.winrt.Windows.Storage.Streams.UnicodeEncoding.utf16LE & Double = js.native
    
    /* 0 */ val utf8: typingsJapgolly.winrt.Windows.Storage.Streams.UnicodeEncoding.utf8 & Double = js.native
  }
}
