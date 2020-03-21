package typingsJapgolly.materialMenu

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialMenu.adapterMod.MDCMenuAdapter
import typingsJapgolly.materialMenu.foundationMod.AnchorMargin
import typingsJapgolly.materialMenu.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/menu", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCMenu ()
    extends typingsJapgolly.materialBase.componentMod.default[MDCMenuAdapter, default] {
    /**
      * Return the items within the menu. Note that this only contains the set of elements within
      * the items container that are proper list items, and not supplemental / presentational DOM
      * elements.
      */
    val items: js.Array[Element] = js.native
    var open: Boolean = js.native
    var quickOpen: Boolean = js.native
    var rememberSelection: Boolean = js.native
    var selectedItemIndex: Double = js.native
    /**
      * Return the item within the menu that is selected.
      */
    def getOptionByIndex(index: Double): Element | Null = js.native
    def hide(): Unit = js.native
    /**
      * @param corner Default anchor corner alignment of top-left menu corner.
      */
    def setAnchorCorner(corner: Double): Unit = js.native
    def setAnchorMargin(margin: AnchorMargin): Unit = js.native
    def show(): Unit = js.native
    def show(options: Anon0): Unit = js.native
  }
  
  @js.native
  class MDCMenuFoundation () extends default
  
  /* static members */
  @js.native
  object MDCMenu extends js.Object {
    def attachTo(root: Element): MDCMenu = js.native
  }
  
  /* static members */
  @js.native
  object MDCMenuFoundation extends js.Object {
    val Corner: typingsJapgolly.materialMenu.constantsMod.Corner = js.native
    val cssClasses: typingsJapgolly.materialMenu.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCMenuAdapter = js.native
    val numbers: typingsJapgolly.materialMenu.constantsMod.numbers = js.native
    val strings: typingsJapgolly.materialMenu.constantsMod.strings = js.native
  }
  
}

