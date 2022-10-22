package typingsJapgolly.electron.Electron

import japgolly.scalajs.react.Callback
import typingsJapgolly.electron.electronStrings.background
import typingsJapgolly.electron.electronStrings.fixed
import typingsJapgolly.electron.electronStrings.free
import typingsJapgolly.electron.electronStrings.none
import typingsJapgolly.electron.electronStrings.outline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchBarScrubberConstructorOptions extends StObject {
  
  /**
    * Defaults to `true`.
    */
  var continuous: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Called when the user taps any item.
    */
  var highlight: js.UndefOr[js.Function1[/* highlightedIndex */ Double, Unit]] = js.undefined
  
  /**
    * An array of items to place in this scrubber.
    */
  var items: js.Array[ScrubberItem]
  
  /**
    * Can be `fixed` or `free`. The default is `free`.
    */
  var mode: js.UndefOr[fixed | free] = js.undefined
  
  /**
    * Selected overlay item style. Can be `background`, `outline` or `none`. Defaults
    * to `none`.
    */
  var overlayStyle: js.UndefOr[background | outline | none] = js.undefined
  
  /**
    * Called when the user taps an item that was not the last tapped item.
    */
  var select: js.UndefOr[js.Function1[/* selectedIndex */ Double, Unit]] = js.undefined
  
  /**
    * Selected item style. Can be `background`, `outline` or `none`. Defaults to
    * `none`.
    */
  var selectedStyle: js.UndefOr[background | outline | none] = js.undefined
  
  /**
    * Whether to show arrow buttons. Defaults to `false` and is only shown if `items`
    * is non-empty.
    */
  var showArrowButtons: js.UndefOr[Boolean] = js.undefined
}
object TouchBarScrubberConstructorOptions {
  
  inline def apply(items: js.Array[ScrubberItem]): TouchBarScrubberConstructorOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarScrubberConstructorOptions]
  }
  
  extension [Self <: TouchBarScrubberConstructorOptions](x: Self) {
    
    inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    inline def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
    
    inline def setHighlight(value: /* highlightedIndex */ Double => Callback): Self = StObject.set(x, "highlight", js.Any.fromFunction1((t0: /* highlightedIndex */ Double) => value(t0).runNow()))
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    inline def setItems(value: js.Array[ScrubberItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ScrubberItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMode(value: fixed | free): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOverlayStyle(value: background | outline | none): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
    
    inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
    
    inline def setSelect(value: /* selectedIndex */ Double => Callback): Self = StObject.set(x, "select", js.Any.fromFunction1((t0: /* selectedIndex */ Double) => value(t0).runNow()))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSelectedStyle(value: background | outline | none): Self = StObject.set(x, "selectedStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectedStyleUndefined: Self = StObject.set(x, "selectedStyle", js.undefined)
    
    inline def setShowArrowButtons(value: Boolean): Self = StObject.set(x, "showArrowButtons", value.asInstanceOf[js.Any])
    
    inline def setShowArrowButtonsUndefined: Self = StObject.set(x, "showArrowButtons", js.undefined)
  }
}
