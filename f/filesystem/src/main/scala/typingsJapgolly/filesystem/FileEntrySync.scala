package typingsJapgolly.filesystem

import org.scalajs.dom.raw.File
import typingsJapgolly.filewriter.FileWriterSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface represents a file on a file system.
  */
@js.native
trait FileEntrySync extends EntrySync {
  /**
    * Creates a new FileWriterSync associated with the file that this FileEntrySync represents.
    */
  def createWriter(): FileWriterSync = js.native
  /**
    * Returns a File that represents the current state of the file that this FileEntrySync represents.
    */
  def file(): File = js.native
}

