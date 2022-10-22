package typingsJapgolly.reactAutocomplete.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactAutocomplete.mod.Props
import typingsJapgolly.reactAutocomplete.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactAutocomplete {
  
  inline def apply(
    getItemValue: Any => String,
    items: js.Array[Any],
    renderItem: (Any, Boolean, js.UndefOr[CSSProperties]) => Node,
    value: Any
  ): Builder = {
    val __props = js.Dynamic.literal(getItemValue = js.Any.fromFunction1(getItemValue), items = items.asInstanceOf[js.Any], renderItem = js.Any.fromFunction3(renderItem), value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-autocomplete", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def autoHighlight(value: Boolean): this.type = set("autoHighlight", value.asInstanceOf[js.Any])
    
    inline def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    
    inline def inputProps(value: HTMLProps[HTMLInputElement]): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    inline def isItemSelectable(value: /* item */ Any => Boolean): this.type = set("isItemSelectable", js.Any.fromFunction1(value))
    
    inline def menuStyle(value: CSSProperties): this.type = set("menuStyle", value.asInstanceOf[js.Any])
    
    inline def onChange(value: (/* e */ ReactEventFrom[HTMLInputElement], /* value */ String) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* e */ ReactEventFrom[HTMLInputElement], t1: /* value */ String) => (value(t0, t1)).runNow()))
    
    inline def onMenuVisibilityChange(value: /* isOpen */ Boolean => Callback): this.type = set("onMenuVisibilityChange", js.Any.fromFunction1((t0: /* isOpen */ Boolean) => value(t0).runNow()))
    
    inline def onSelect(value: (/* value */ String, /* item */ Any) => Callback): this.type = set("onSelect", js.Any.fromFunction2((t0: /* value */ String, t1: /* item */ Any) => (value(t0, t1)).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def renderInput(value: /* props */ HTMLProps[HTMLInputElement] => Node): this.type = set("renderInput", js.Any.fromFunction1(value))
    
    inline def renderMenu(value: (/* items */ js.Array[Node], /* value */ String, /* styles */ CSSProperties) => Node): this.type = set("renderMenu", js.Any.fromFunction3(value))
    
    inline def selectOnBlur(value: Boolean): this.type = set("selectOnBlur", value.asInstanceOf[js.Any])
    
    inline def shouldItemRender(value: (/* item */ Any, /* value */ String) => Boolean): this.type = set("shouldItemRender", js.Any.fromFunction2(value))
    
    inline def sortItems(value: (/* a */ Any, /* b */ Any, /* value */ String) => Double): this.type = set("sortItems", js.Any.fromFunction3(value))
    
    inline def wrapperProps(value: HTMLProps[HTMLDivElement]): this.type = set("wrapperProps", value.asInstanceOf[js.Any])
    
    inline def wrapperStyle(value: CSSProperties): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
