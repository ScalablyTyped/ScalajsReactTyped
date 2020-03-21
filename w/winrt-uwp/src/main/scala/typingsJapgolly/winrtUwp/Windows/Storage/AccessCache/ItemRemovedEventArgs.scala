package typingsJapgolly.winrtUwp.Windows.Storage.AccessCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about an ItemRemoved event. */
@JSGlobal("Windows.Storage.AccessCache.ItemRemovedEventArgs")
@js.native
abstract class ItemRemovedEventArgs () extends js.Object {
  /** Gets information about the StorageFile or StorageFolder that was removed from the StorageItemMostRecentlyUsedList . */
  var removedEntry: AccessListEntry = js.native
}

