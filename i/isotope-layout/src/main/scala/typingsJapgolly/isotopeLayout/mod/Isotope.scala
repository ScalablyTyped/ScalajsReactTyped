package typingsJapgolly.isotopeLayout.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Isotope extends js.Object {
  /**
    * Adds item elements to the Isotope instance. addItems does not lay out items like appended, prepended, or insert.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def addItems(elements: Elements): Unit
  /**
    * Adds and lays out newly appended item elements to the end of the layout.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def appended(elements: Elements): Unit
  /**
    * Filters, sorts, and lays out items. arrange is the principle method of Isotope. It is the default method with jQuery .isotope(). Pass in options to apply filtering and sorting.
    * @param options All options are optional, but itemSelector is recommended. Layout modes have their own separate options.
    */
  def arrange(options: IsotopeOptions): Unit
  /**
    * Removes the Isotope functionality completely. destroy will return the element back to its pre-initialized state.
    */
  def destroy(): Unit
  /**
    * Returns an array of filtered item elements in current sorted order.
    */
  def getFilteredItemElements(): js.Array[Element]
  /**
    * Returns an array of all item elements in the Isotope instance.
    */
  def getItemElements(): js.Array[Element]
  /**
    * Hide items.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def hideItemElements(elements: Elements): Unit
  /**
    * Appends elements into container element, adds elements as items, and arranges items with filtering and sorting.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def insert(elements: Elements): Unit
  /**
    * Lays out all item elements. layout is useful when an item has changed size, and all items need to be laid out again. layout does not apply filtering or sorting.
    */
  def layout(): Unit
  /**
    * Lays out specified items.
    * @param elements Array of Isotope.Items
    * @param isStill Disables transitions
    */
  def layoutItems(elements: js.Array[HTMLElement], isStill: Boolean): Unit
  /**
    * Adds and lays out newly prepended item elements at the beginning of layout.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def prepended(elements: Elements): Unit
  /**
    * Recollects all item elements.
    * For frameworks like Angular and React, reloadItems may be useful to apply changes to the DOM to Isotope.
    */
  def reloadItems(): Unit
  /**
    * Removes elements from the Isotope instance and DOM.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def remove(elements: Elements): Unit
  /**
    * Reveals hidden items.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def revealItemElements(elements: Elements): Unit
  /**
    * Shuffles items in a random order.
    */
  def shuffle(): Unit
  /**
    * Stamps elements in the layout. Isotope will lay out item elements around stamped elements.
    * Stamping is only supported by some layout modes: masonry, packery and masonryhorizontal.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def stamp(elements: Elements): Unit
  /**
    * Un-stamps elements in the layout, so that Isotope will no longer layout item elements around them.
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def unstamp(elements: Elements): Unit
  /**
    * Updates sort data
    * @param elements Element, jQuery Object, NodeList, or Array of Elements
    */
  def updateSortData(elements: Elements): Unit
}

object Isotope {
  @scala.inline
  def apply(
    addItems: Elements => Callback,
    appended: Elements => Callback,
    arrange: IsotopeOptions => Callback,
    destroy: Callback,
    getFilteredItemElements: CallbackTo[js.Array[Element]],
    getItemElements: CallbackTo[js.Array[Element]],
    hideItemElements: Elements => Callback,
    insert: Elements => Callback,
    layout: Callback,
    layoutItems: (js.Array[HTMLElement], Boolean) => Callback,
    prepended: Elements => Callback,
    reloadItems: Callback,
    remove: Elements => Callback,
    revealItemElements: Elements => Callback,
    shuffle: Callback,
    stamp: Elements => Callback,
    unstamp: Elements => Callback,
    updateSortData: Elements => Callback
  ): Isotope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addItems")(js.Any.fromFunction1((t0: typingsJapgolly.isotopeLayout.mod.Elements) => addItems(t0).runNow()))
    __obj.updateDynamic("appended")(js.Any.fromFunction1((t0: typingsJapgolly.isotopeLayout.mod.Elements) => appended(t0).runNow()))
    __obj.updateDynamic("arrange")(js.Any.fromFunction1((t0: typingsJapgolly.isotopeLayout.mod.IsotopeOptions) => arrange(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getFilteredItemElements")(getFilteredItemElements.toJsFn)
    __obj.updateDynamic("getItemElements")(getItemElements.toJsFn)
    __obj.updateDynamic("hideItemElements")(js.Any.fromFunction1((t0: typingsJapgolly.isotopeLayout.mod.Elements) => hideItemElements(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.isotopeLayout.mod.Elements) => insert(t0).runNow()))
    __obj.updateDynamic("layout")(layout.toJsFn)
    __obj.updateDynamic("layoutItems")(js.Any.fromFunction2((t0: js.Array[org.scalajs.dom.raw.HTMLElement], t1: scala.Boolean) => layoutItems(t0, t1).runNow()))
    __obj.updateDynamic("prepended")(js.Any.fromFunction1((t0: typingsJapgolly.isotopeLayout.mod.Elements) => prepended(t0).runNow()))
    __obj.updateDynamic("reloadItems")(reloadItems.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.isotopeLayout.mod.Elements) => remove(t0).runNow()))
    __obj.updateDynamic("revealItemElements")(js.Any.fromFunction1((t0: typingsJapgolly.isotopeLayout.mod.Elements) => revealItemElements(t0).runNow()))
    __obj.updateDynamic("shuffle")(shuffle.toJsFn)
    __obj.updateDynamic("stamp")(js.Any.fromFunction1((t0: typingsJapgolly.isotopeLayout.mod.Elements) => stamp(t0).runNow()))
    __obj.updateDynamic("unstamp")(js.Any.fromFunction1((t0: typingsJapgolly.isotopeLayout.mod.Elements) => unstamp(t0).runNow()))
    __obj.updateDynamic("updateSortData")(js.Any.fromFunction1((t0: typingsJapgolly.isotopeLayout.mod.Elements) => updateSortData(t0).runNow()))
    __obj.asInstanceOf[Isotope]
  }
}

