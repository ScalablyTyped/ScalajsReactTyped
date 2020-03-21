package typingsJapgolly.yazl.mod

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.bufferMod.Buffer
import typingsJapgolly.yazl.PartialDirectoryOptions
import typingsJapgolly.yazl.PartialOptions
import typingsJapgolly.yazl.PartialReadStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yazl", "ZipFile")
@js.native
class ZipFile () extends js.Object {
  var outputStream: ReadableStream = js.native
  def addBuffer(buffer: Buffer, metadataPath: String): Unit = js.native
  def addBuffer(buffer: Buffer, metadataPath: String, options: PartialOptions): Unit = js.native
  def addEmptyDirectory(metadataPath: String): Unit = js.native
  def addEmptyDirectory(metadataPath: String, options: PartialDirectoryOptions): Unit = js.native
  def addFile(realPath: String, metadataPath: String): Unit = js.native
  def addFile(realPath: String, metadataPath: String, options: PartialOptions): Unit = js.native
  def addReadStream(input: ReadableStream, metadataPath: String): Unit = js.native
  def addReadStream(input: ReadableStream, metadataPath: String, options: PartialReadStreamOptions): Unit = js.native
  def dateToDosDateTime(jsDate: js.Date): DosDateTime = js.native
  def end(): Unit = js.native
  def end(options: EndOptions): Unit = js.native
  def end(options: EndOptions, finalSizeCallback: js.Function0[Unit]): Unit = js.native
}

