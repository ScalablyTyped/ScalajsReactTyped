package typingsJapgolly.materialList

import typingsJapgolly.materialBase.foundationMod.default
import typingsJapgolly.materialList.adapterMod.MDCListAdapter
import typingsJapgolly.materialList.constantsMod.Index
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/list/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCListFoundation protected () extends default[MDCListFoundation] {
    def this(adapter: MDCListAdapter) = this()
    def focusFirstElement(): Double = js.native
    def focusLastElement(): Double = js.native
    /**
      * Focuses the next element on the list.
      */
    def focusNextElement(index: Double): Double = js.native
    /**
      * Focuses the previous element on the list.
      */
    def focusPrevElement(index: Double): Double = js.native
    def getSelectedIndex(): Index = js.native
    /**
      * Click handler for the list.
      */
    def handleClick(index: Double, toggleCheckbox: Boolean): Unit = js.native
    /**
      * Focus in handler for the list items.
      */
    def handleFocusIn(evt: Event_, listItemIndex: Double): Unit = js.native
    /**
      * Focus out handler for the list items.
      */
    def handleFocusOut(evt: Event_, listItemIndex: Double): Unit = js.native
    /**
      * Key handler for the list.
      */
    def handleKeydown(evt: Event_, isRootListItem: Boolean, listItemIndex: Double): Unit = js.native
    def layout(): Unit = js.native
    def setSelectedIndex(index: Index): Unit = js.native
    /**
      * Sets the isSingleSelectionList_ private variable.
      */
    def setSingleSelection(value: Boolean): Unit = js.native
    /**
      * Sets the useActivatedClass_ private variable.
      */
    def setUseActivatedClass(useActivated: Boolean): Unit = js.native
    /**
      * Sets the isVertical_ private variable.
      */
    def setVerticalOrientation(value: Boolean): Unit = js.native
    /**
      * Sets the private wrapFocus_ variable.
      */
    def setWrapFocus(value: Boolean): Unit = js.native
  }
  
  val ELEMENTS_KEY_ALLOWED_IN: js.Array[String] = js.native
  /* static members */
  @js.native
  object MDCListFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialList.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCListAdapter = js.native
    val strings: typingsJapgolly.materialList.constantsMod.strings = js.native
  }
  
}

