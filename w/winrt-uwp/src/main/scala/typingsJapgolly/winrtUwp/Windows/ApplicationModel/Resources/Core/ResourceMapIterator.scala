package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Resources.Core

import typingsJapgolly.winrtUwp.AnonItemsIKeyValuePair
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports iteration over a ResourceMap . */
@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapIterator")
@js.native
abstract class ResourceMapIterator () extends js.Object {
  /** Gets the current item in the ResourceMap . */
  var current: IKeyValuePair[String, NamedResource] = js.native
  /** Gets a value that indicates whether there is a current item, or whether the iterator is at the end of the ResourceMap . */
  var hasCurrent: Boolean = js.native
  /**
    * Returns all the items in the ResourceMap .
    */
  def getMany(): AnonItemsIKeyValuePair = js.native
  /**
    * Moves the iterator forward to the next item and returns HasCurrent .
    * @return TRUE if the iterator refers to a valid item that is in the map, and otherwise FALSE.
    */
  def moveNext(): Boolean = js.native
}

