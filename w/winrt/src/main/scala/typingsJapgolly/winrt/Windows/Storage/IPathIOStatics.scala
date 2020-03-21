package typingsJapgolly.winrt.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrt.Windows.Storage.Streams.UnicodeEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPathIOStatics extends js.Object {
  def appendLinesAsync(absolutePath: String, lines: IIterable[String]): IAsyncAction = js.native
  def appendLinesAsync(absolutePath: String, lines: IIterable[String], encoding: UnicodeEncoding): IAsyncAction = js.native
  def appendTextAsync(absolutePath: String, contents: String): IAsyncAction = js.native
  def appendTextAsync(absolutePath: String, contents: String, encoding: UnicodeEncoding): IAsyncAction = js.native
  def readBufferAsync(absolutePath: String): IAsyncOperation[IBuffer] = js.native
  def readLinesAsync(absolutePath: String): IAsyncOperation[IVector[String]] = js.native
  def readLinesAsync(absolutePath: String, encoding: UnicodeEncoding): IAsyncOperation[IVector[String]] = js.native
  def readTextAsync(absolutePath: String): IAsyncOperation[String] = js.native
  def readTextAsync(absolutePath: String, encoding: UnicodeEncoding): IAsyncOperation[String] = js.native
  def writeBufferAsync(absolutePath: String, buffer: IBuffer): IAsyncAction = js.native
  def writeBytesAsync(absolutePath: String, buffer: scala.scalajs.js.typedarray.Uint8Array): IAsyncAction = js.native
  def writeLinesAsync(absolutePath: String, lines: IIterable[String]): IAsyncAction = js.native
  def writeLinesAsync(absolutePath: String, lines: IIterable[String], encoding: UnicodeEncoding): IAsyncAction = js.native
  def writeTextAsync(absolutePath: String, contents: String): IAsyncAction = js.native
  def writeTextAsync(absolutePath: String, contents: String, encoding: UnicodeEncoding): IAsyncAction = js.native
}

