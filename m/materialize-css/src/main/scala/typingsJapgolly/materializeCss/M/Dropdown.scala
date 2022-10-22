package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dropdown
  extends StObject
     with Component[DropdownOptions] {
  
  /**
    * Close dropdown
    */
  def close(): Unit
  
  /**
    * The DOM element of the dropdown
    */
  var dropdownEl: Element
  
  /**
    * The index of the item focused
    */
  var focusedIndex: Double
  
  /**
    * ID of the dropdown element
    */
  var id: String
  
  /**
    * If the dropdown is open
    */
  var isOpen: Boolean
  
  /**
    * If the dropdown content is scrollable
    */
  var isScrollable: Boolean
  
  /**
    * Open dropdown
    */
  def open(): Unit
  
  /**
    * While dropdown is open, you can recalculate its dimensions if its contents have changed
    */
  def recalculateDimensions(): Unit
}
object Dropdown {
  
  inline def apply(
    close: Callback,
    destroy: Callback,
    dropdownEl: Element,
    el: Element,
    focusedIndex: Double,
    id: String,
    isOpen: Boolean,
    isScrollable: Boolean,
    open: Callback,
    options: DropdownOptions,
    recalculateDimensions: Callback
  ): Dropdown = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, destroy = destroy.toJsFn, dropdownEl = dropdownEl.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], focusedIndex = focusedIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isScrollable = isScrollable.asInstanceOf[js.Any], open = open.toJsFn, options = options.asInstanceOf[js.Any], recalculateDimensions = recalculateDimensions.toJsFn)
    __obj.asInstanceOf[Dropdown]
  }
  
  extension [Self <: Dropdown](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setDropdownEl(value: Element): Self = StObject.set(x, "dropdownEl", value.asInstanceOf[js.Any])
    
    inline def setFocusedIndex(value: Double): Self = StObject.set(x, "focusedIndex", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsScrollable(value: Boolean): Self = StObject.set(x, "isScrollable", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
    
    inline def setRecalculateDimensions(value: Callback): Self = StObject.set(x, "recalculateDimensions", value.toJsFn)
  }
}
