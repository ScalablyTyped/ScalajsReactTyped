package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object filesystem {
  /**
    * This interface is the callback used to look up DirectoryEntry objects.
    */
  type DirectoryEntryCallback = js.Function1[/* entry */ typingsJapgolly.filesystem.DirectoryEntry, scala.Unit]
  /**
    * When readEntries() succeeds, the following callback is made.
    */
  type EntriesCallback = js.Function1[/* entries */ js.Array[typingsJapgolly.filesystem.Entry], scala.Unit]
  /**
    * This interface is the callback used to look up Entry objects.
    */
  type EntryCallback = js.Function1[/* entry */ typingsJapgolly.filesystem.Entry, scala.Unit]
  /**
    * When an error occurs, the following callback is made.
    */
  type ErrorCallback = js.Function1[/* err */ org.scalajs.dom.raw.DOMError, scala.Unit]
  /**
    * This interface is the callback used to obtain a File.
    */
  type FileCallback = js.Function1[/* file */ org.scalajs.dom.raw.File, scala.Unit]
  /**
    * This interface is the callback used to look up FileEntry objects.
    */
  type FileEntryCallback = js.Function1[/* entry */ typingsJapgolly.filesystem.FileEntry, scala.Unit]
  /**
    * When requestFileSystem() succeeds, the following callback is made.
    */
  type FileSystemCallback = js.Function1[/* filesystem */ typingsJapgolly.filesystem.FileSystem, scala.Unit]
  /**
    * This interface is the callback used to create a FileWriter.
    */
  type FileWriterCallback = js.Function1[/* fileWriter */ typingsJapgolly.filewriter.FileWriter, scala.Unit]
  /**
    * This interface is the callback used to look up file and directory metadata.
    */
  type MetadataCallback = js.Function1[/* metadata */ typingsJapgolly.filesystem.Metadata, scala.Unit]
  /**
    * This interface is the generic callback used to indicate success of an asynchronous method.
    */
  type VoidCallback = js.Function0[scala.Unit]
}
