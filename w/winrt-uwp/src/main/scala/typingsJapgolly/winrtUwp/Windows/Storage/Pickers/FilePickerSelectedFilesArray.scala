package typingsJapgolly.winrtUwp.Windows.Storage.Pickers

import typingsJapgolly.std.Array
import typingsJapgolly.winrtUwp.AnonIndex
import typingsJapgolly.winrtUwp.AnonItemsStorageFile
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of storage files that the user has selected by using a file picker. */
@JSGlobal("Windows.Storage.Pickers.FilePickerSelectedFilesArray")
@js.native
abstract class FilePickerSelectedFilesArray () extends Array[StorageFile] {
  /** Gets the number of StorageFile objects in the collection. */
  var size: Double = js.native
  /**
    * Retrieves an iterator that iterates through the collection of StorageFile objects that represent selected files.
    * @return The iterator.
    */
  def first(): IIterator[StorageFile] = js.native
  /**
    * Returns the StorageFile object at the specified index in the collection.
    * @param index The zero-based index of the object to retrieve.
    * @return The object at the specified index.
    */
  def getAt(index: Double): StorageFile = js.native
  /**
    * Retrieves the StorageFile objects that start at the specified index in the collection.
    * @param startIndex The zero-based index of the start of the objects in the collection to return.
    */
  def getMany(startIndex: Double): AnonItemsStorageFile = js.native
  def indexOf(value: StorageFile, extra: js.Any*): AnonIndex = js.native
  /**
    * Retrieves the index of a specified StorageFile object in the collection.
    * @param value The object to find in the collection.
    */
  @JSName("indexOf")
  def indexOf_AnonIndex(value: StorageFile): AnonIndex = js.native
}

