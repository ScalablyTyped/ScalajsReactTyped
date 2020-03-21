package typingsJapgolly.officeUiFabricReact.detailsListTypesMod

import typingsJapgolly.officeUiFabricReact.listTypesMod.IList
import typingsJapgolly.officeUiFabricReact.listTypesMod.ScrollToMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsList extends IList {
  /**
    * Scroll to and focus the item at the given index. focusIndex will call scrollToIndex on the specified index.
    *
    * @param index - Index of item to scroll to
    * @param forceIntoFirstElement - If true, focus will be set to the first focusable child element of the item rather
    *  than the item itself.
    * @param measureItem - Optional callback to measure the height of an individual item
    * @param scrollToMode - Optional setting to determine where in the window the item should be scrolled to when focused.
    */
  def focusIndex(index: Double): Unit = js.native
  def focusIndex(index: Double, forceIntoFirstElement: Boolean): Unit = js.native
  def focusIndex(
    index: Double,
    forceIntoFirstElement: Boolean,
    measureItem: js.Function1[/* itemIndex */ Double, Double]
  ): Unit = js.native
  def focusIndex(
    index: Double,
    forceIntoFirstElement: Boolean,
    measureItem: js.Function1[/* itemIndex */ Double, Double],
    scrollToMode: ScrollToMode
  ): Unit = js.native
}

