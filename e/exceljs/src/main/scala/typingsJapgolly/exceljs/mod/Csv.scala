package typingsJapgolly.exceljs.mod

import typingsJapgolly.exceljs.PartialCsvReadOptions
import typingsJapgolly.exceljs.PartialCsvWriteOptions
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Csv extends js.Object {
  /**
  	 * Create input stream for reading
  	 */
  def createInputStream(): EventEmitter = js.native
  /**
  	 * read from a stream
  	 */
  def read(stream: Stream): js.Promise[Worksheet] = js.native
  def read(stream: Stream, options: PartialCsvReadOptions): js.Promise[Worksheet] = js.native
  /**
  	 * read from a file
  	 */
  def readFile(path: String): js.Promise[Worksheet] = js.native
  def readFile(path: String, options: PartialCsvReadOptions): js.Promise[Worksheet] = js.native
  /**
  	 * write to a stream
  	 */
  def write(stream: Stream): js.Promise[Unit] = js.native
  def write(stream: Stream, options: PartialCsvWriteOptions): js.Promise[Unit] = js.native
  /**
  	 * write to a buffer
  	 */
  def writeBuffer(): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  /**
  	 * write to a file
  	 */
  def writeFile(path: String): js.Promise[Unit] = js.native
  def writeFile(path: String, options: PartialCsvWriteOptions): js.Promise[Unit] = js.native
}

