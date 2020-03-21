package typingsJapgolly.reactNativeSortableList.mod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNativeSortableList.AnonAnimated
import typingsJapgolly.reactNativeSortableList.AnonKey
import typingsJapgolly.reactNativeSortableList.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableList[T, K]
  extends Component[SortableListProps[T, K], js.Object, js.Any] {
  /**
    * scrolls by a given y offset, either immediately or with a smooth animation
    */
  def scrollBy(hasDxDyAnimated: AnonAnimated): Unit = js.native
  /**
    * scrolls to a given y offset, either immediately or with a smooth animation
    */
  def scrollTo(hasXYAnimated: AnonX): Unit = js.native
  /**
    * scrolls to a given row key, either immediately or with a smooth animation
    */
  def scrollToRowKey(hasKeyAnimated: AnonKey[K]): Unit = js.native
}

