package typingsJapgolly.downshift.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.downshift.mod.A11yStatusMessageOptions
import typingsJapgolly.downshift.mod.ControllerStateAndHelpers
import typingsJapgolly.downshift.mod.DownshiftProps
import typingsJapgolly.downshift.mod.DownshiftState
import typingsJapgolly.downshift.mod.Environment
import typingsJapgolly.downshift.mod.StateChangeOptions
import typingsJapgolly.downshift.mod.default
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Downshift {
  
  inline def apply[Item](): Builder[Item] = {
    val __props = js.Dynamic.literal()
    new Builder[Item](js.Array(this.component, __props.asInstanceOf[DownshiftProps[Item]]))
  }
  
  @JSImport("downshift", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Item] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[Item]] {
    
    inline def children(value: /* options */ ControllerStateAndHelpers[Item] => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def defaultHighlightedIndex(value: Double): this.type = set("defaultHighlightedIndex", value.asInstanceOf[js.Any])
    
    inline def defaultHighlightedIndexNull: this.type = set("defaultHighlightedIndex", null)
    
    inline def defaultIsOpen(value: Boolean): this.type = set("defaultIsOpen", value.asInstanceOf[js.Any])
    
    inline def environment(value: Environment): this.type = set("environment", value.asInstanceOf[js.Any])
    
    inline def getA11yStatusMessage(value: /* options */ A11yStatusMessageOptions[Item] => String): this.type = set("getA11yStatusMessage", js.Any.fromFunction1(value))
    
    inline def getItemId(value: /* index */ js.UndefOr[Double] => String): this.type = set("getItemId", js.Any.fromFunction1(value))
    
    inline def highlightedIndex(value: Double): this.type = set("highlightedIndex", value.asInstanceOf[js.Any])
    
    inline def highlightedIndexNull: this.type = set("highlightedIndex", null)
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def initialHighlightedIndex(value: Double): this.type = set("initialHighlightedIndex", value.asInstanceOf[js.Any])
    
    inline def initialHighlightedIndexNull: this.type = set("initialHighlightedIndex", null)
    
    inline def initialInputValue(value: String): this.type = set("initialInputValue", value.asInstanceOf[js.Any])
    
    inline def initialIsOpen(value: Boolean): this.type = set("initialIsOpen", value.asInstanceOf[js.Any])
    
    inline def initialSelectedItem(value: Item): this.type = set("initialSelectedItem", value.asInstanceOf[js.Any])
    
    inline def inputId(value: String): this.type = set("inputId", value.asInstanceOf[js.Any])
    
    inline def inputValue(value: String): this.type = set("inputValue", value.asInstanceOf[js.Any])
    
    inline def inputValueNull: this.type = set("inputValue", null)
    
    inline def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    inline def itemCount(value: Double): this.type = set("itemCount", value.asInstanceOf[js.Any])
    
    inline def itemToString(value: /* item */ Item | Null => String): this.type = set("itemToString", js.Any.fromFunction1(value))
    
    inline def labelId(value: String): this.type = set("labelId", value.asInstanceOf[js.Any])
    
    inline def menuId(value: String): this.type = set("menuId", value.asInstanceOf[js.Any])
    
    inline def onChange(
      value: (/* selectedItem */ Item | Null, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Callback
    ): this.type = set("onChange", js.Any.fromFunction2((t0: /* selectedItem */ Item | Null, t1: /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => (value(t0, t1)).runNow()))
    
    inline def onInputValueChange(
      value: (/* inputValue */ String, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Callback
    ): this.type = set("onInputValueChange", js.Any.fromFunction2((t0: /* inputValue */ String, t1: /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => (value(t0, t1)).runNow()))
    
    inline def onOuterClick(value: /* stateAndHelpers */ ControllerStateAndHelpers[Item] => Callback): this.type = set("onOuterClick", js.Any.fromFunction1((t0: /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => value(t0).runNow()))
    
    inline def onSelect(
      value: (/* selectedItem */ Item | Null, /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Callback
    ): this.type = set("onSelect", js.Any.fromFunction2((t0: /* selectedItem */ Item | Null, t1: /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => (value(t0, t1)).runNow()))
    
    inline def onStateChange(
      value: (/* options */ StateChangeOptions[Item], /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Callback
    ): this.type = set("onStateChange", js.Any.fromFunction2((t0: /* options */ StateChangeOptions[Item], t1: /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => (value(t0, t1)).runNow()))
    
    inline def onUserAction(
      value: (/* options */ StateChangeOptions[Item], /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => Callback
    ): this.type = set("onUserAction", js.Any.fromFunction2((t0: /* options */ StateChangeOptions[Item], t1: /* stateAndHelpers */ ControllerStateAndHelpers[Item]) => (value(t0, t1)).runNow()))
    
    inline def scrollIntoView(value: (/* node */ HTMLElement, /* menuNode */ HTMLElement) => Callback): this.type = set("scrollIntoView", js.Any.fromFunction2((t0: /* node */ HTMLElement, t1: /* menuNode */ HTMLElement) => (value(t0, t1)).runNow()))
    
    inline def selectedItem(value: Item): this.type = set("selectedItem", value.asInstanceOf[js.Any])
    
    inline def selectedItemChanged(value: (Item, Item) => Boolean): this.type = set("selectedItemChanged", js.Any.fromFunction2(value))
    
    inline def selectedItemNull: this.type = set("selectedItem", null)
    
    inline def stateReducer(
      value: (/* state */ DownshiftState[Item], /* changes */ StateChangeOptions[Item]) => Partial[StateChangeOptions[Item]]
    ): this.type = set("stateReducer", js.Any.fromFunction2(value))
    
    inline def suppressRefError(value: Boolean): this.type = set("suppressRefError", value.asInstanceOf[js.Any])
  }
  
  implicit def make[Item](companion: Downshift.type): Builder[Item] = new Builder[Item](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[Item](p: DownshiftProps[Item]): Builder[Item] = new Builder[Item](js.Array(this.component, p.asInstanceOf[js.Any]))
}
