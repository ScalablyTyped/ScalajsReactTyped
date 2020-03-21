package typingsJapgolly.exceljs.mod

import typingsJapgolly.exceljs.PartialXlsxWriteOptions
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Xlsx extends js.Object {
  /**
  	 * Create input stream for reading
  	 */
  def createInputStream(): EventEmitter = js.native
  /**
  	 * load from an array buffer
  	 * @param buffer
  	 */
  def load(buffer: scala.scalajs.js.typedarray.ArrayBuffer): js.Promise[Workbook] = js.native
  /**
  	 * read from a stream
  	 * @param stream
  	 */
  def read(stream: Stream): js.Promise[Workbook] = js.native
  /**
  	 * read from a file
  	 */
  def readFile(path: String): js.Promise[Workbook] = js.native
  /**
  	 * write to a stream
  	 */
  def write(stream: Stream): js.Promise[Unit] = js.native
  def write(stream: Stream, options: PartialXlsxWriteOptions): js.Promise[Unit] = js.native
  /**
  	 * write to a buffer
  	 */
  def writeBuffer(): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def writeBuffer(options: PartialXlsxWriteOptions): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  /**
  	 * write to a file
  	 */
  def writeFile(path: String): js.Promise[Unit] = js.native
  def writeFile(path: String, options: PartialXlsxWriteOptions): js.Promise[Unit] = js.native
}

