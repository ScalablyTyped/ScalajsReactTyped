package typingsJapgolly.winrtUwp.Windows.Graphics.Imaging

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a property set of BitmapTypedValue objects. */
@JSGlobal("Windows.Graphics.Imaging.BitmapPropertySet")
@js.native
/** Creates and initializes a new instance of the bitmap property set. */
class BitmapPropertySet () extends js.Object {
  /** Gets the number of items contained in the property set. */
  var size: Double = js.native
  /** Removes all items from the property set. */
  def clear(): Unit = js.native
  /**
    * Returns an iterator to enumerate the items in the property set.
    * @return The iterator. The current position of the iterator is index 0, or the end of the property set if the property set is empty.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  /**
    * Gets an immutable view of the property set.
    * @return The immutable view.
    */
  def getView(): IMapView[String, BitmapTypedValue] = js.native
  /**
    * Indicates whether the property set has an item with the specified key.
    * @param key The key.
    * @return True if the property set has an item with the specified key; otherwise, false.
    */
  def hasKey(key: String): Boolean = js.native
  /**
    * Adds an item to the property set.
    * @param key The key to insert.
    * @param value The value to insert.
    * @return True if the method replaces a value that already exists for the key; false if this is a new key.
    */
  def insert(key: String, value: BitmapTypedValue): Boolean = js.native
  /**
    * Retrieves the value for the specified key.
    * @param key The key.
    * @return The value, if an item with the specified key exists; otherwise, null.
    */
  def lookup(key: String): BitmapTypedValue = js.native
  /**
    * Removes a specific item from the BitmapPropertySet .
    * @param key The key of the item to remove.
    * @return true if the item was removed, otherwise false.
    */
  def remove(key: String): Boolean = js.native
  /**
    * Removes an item from the property set.
    * @param key The key.
    */
  @JSName("remove")
  def remove_Unit(key: String): Unit = js.native
}

