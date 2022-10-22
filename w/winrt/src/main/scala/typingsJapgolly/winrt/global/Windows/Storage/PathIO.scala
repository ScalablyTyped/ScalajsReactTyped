package typingsJapgolly.winrt.global.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrt.Windows.Storage.Streams.UnicodeEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.PathIO")
@js.native
open class PathIO ()
  extends StObject
     with typingsJapgolly.winrt.Windows.Storage.PathIO
/* static members */
object PathIO {
  
  @JSGlobal("Windows.Storage.PathIO")
  @js.native
  val ^ : js.Any = js.native
  
  inline def appendLinesAsync(absolutePath: String, lines: IIterable[String]): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("appendLinesAsync")(absolutePath.asInstanceOf[js.Any], lines.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  inline def appendLinesAsync(absolutePath: String, lines: IIterable[String], encoding: UnicodeEncoding): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("appendLinesAsync")(absolutePath.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  
  inline def appendTextAsync(absolutePath: String, contents: String): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTextAsync")(absolutePath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  inline def appendTextAsync(absolutePath: String, contents: String, encoding: UnicodeEncoding): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTextAsync")(absolutePath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  
  inline def readBufferAsync(absolutePath: String): IAsyncOperation[IBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readBufferAsync")(absolutePath.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[IBuffer]]
  
  inline def readLinesAsync(absolutePath: String): IAsyncOperation[IVector[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readLinesAsync")(absolutePath.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[IVector[String]]]
  inline def readLinesAsync(absolutePath: String, encoding: UnicodeEncoding): IAsyncOperation[IVector[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readLinesAsync")(absolutePath.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[IVector[String]]]
  
  inline def readTextAsync(absolutePath: String): IAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readTextAsync")(absolutePath.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[String]]
  inline def readTextAsync(absolutePath: String, encoding: UnicodeEncoding): IAsyncOperation[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readTextAsync")(absolutePath.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[String]]
  
  inline def writeBufferAsync(absolutePath: String, buffer: IBuffer): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBufferAsync")(absolutePath.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  
  inline def writeBytesAsync(absolutePath: String, buffer: js.typedarray.Uint8Array): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBytesAsync")(absolutePath.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  
  inline def writeLinesAsync(absolutePath: String, lines: IIterable[String]): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeLinesAsync")(absolutePath.asInstanceOf[js.Any], lines.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  inline def writeLinesAsync(absolutePath: String, lines: IIterable[String], encoding: UnicodeEncoding): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeLinesAsync")(absolutePath.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  
  inline def writeTextAsync(absolutePath: String, contents: String): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTextAsync")(absolutePath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  inline def writeTextAsync(absolutePath: String, contents: String, encoding: UnicodeEncoding): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTextAsync")(absolutePath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
}
