package typingsJapgolly.blueprintjsSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmComponentsFormsInputGroupMod.InputGroupProps2
import typingsJapgolly.blueprintjsPopover2.mod.Popover2
import typingsJapgolly.blueprintjsSelect.`libEsm@ExamplesFilmSelectMod`.FilmSelectProps
import typingsJapgolly.blueprintjsSelect.`libEsm@ExamplesFilmsMod`.Film
import typingsJapgolly.blueprintjsSelect.anon.PartialOmitPopover2PropsH
import typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.first
import typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.last
import typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.rank
import typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.title
import typingsJapgolly.blueprintjsSelect.blueprintjsSelectStrings.year
import typingsJapgolly.blueprintjsSelect.libEsmCommonItemListRendererMod.ItemListRendererProps
import typingsJapgolly.blueprintjsSelect.libEsmCommonListItemsUtilsMod.CreateNewItem
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FilmSelect {
  
  @JSImport("@blueprintjs/select/lib/esm/@/examples", "FilmSelect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def activeItem(value: Film | CreateNewItem): this.type = set("activeItem", value.asInstanceOf[js.Any])
    
    inline def activeItemNull: this.type = set("activeItem", null)
    
    inline def allowCreate(value: Boolean): this.type = set("allowCreate", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def createNewItemPosition(value: first | last): this.type = set("createNewItemPosition", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def fill(value: Boolean): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def filterable(value: Boolean): this.type = set("filterable", value.asInstanceOf[js.Any])
    
    inline def initialContent(value: VdomNode): this.type = set("initialContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def initialContentNull: this.type = set("initialContent", null)
    
    inline def initialContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("initialContent", js.Array(value*))
    
    inline def initialContentVdomElement(value: VdomElement): this.type = set("initialContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def inputProps(value: InputGroupProps2): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    inline def itemDisabled(value: title | year | rank | (js.Function2[/* item */ Film, /* index */ Double, Boolean])): this.type = set("itemDisabled", value.asInstanceOf[js.Any])
    
    inline def itemDisabledFunction2(value: (/* item */ Film, /* index */ Double) => Boolean): this.type = set("itemDisabled", js.Any.fromFunction2(value))
    
    inline def itemListPredicate(value: (/* query */ String, /* items */ js.Array[Film]) => js.Array[Film]): this.type = set("itemListPredicate", js.Any.fromFunction2(value))
    
    inline def itemListRenderer(
      value: /* itemListProps */ ItemListRendererProps[Film] => typingsJapgolly.react.mod.global.JSX.Element | Null
    ): this.type = set("itemListRenderer", js.Any.fromFunction1(value))
    
    inline def menuProps(value: HTMLAttributes[HTMLUListElement]): this.type = set("menuProps", value.asInstanceOf[js.Any])
    
    inline def onActiveItemChange(value: (/* activeItem */ Film | Null, /* isCreateNewItem */ Boolean) => Callback): this.type = set("onActiveItemChange", js.Any.fromFunction2((t0: /* activeItem */ Film | Null, t1: /* isCreateNewItem */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def onItemsPaste(value: /* items */ js.Array[Film] => Callback): this.type = set("onItemsPaste", js.Any.fromFunction1((t0: /* items */ js.Array[Film]) => value(t0).runNow()))
    
    inline def onQueryChange(value: (/* query */ String, /* event */ js.UndefOr[ReactEventFrom[HTMLInputElement]]) => Callback): this.type = set("onQueryChange", js.Any.fromFunction2((t0: /* query */ String, t1: /* event */ js.UndefOr[ReactEventFrom[HTMLInputElement]]) => (value(t0, t1)).runNow()))
    
    inline def popoverContentProps(value: HTMLAttributes[HTMLDivElement]): this.type = set("popoverContentProps", value.asInstanceOf[js.Any])
    
    inline def popoverProps(value: PartialOmitPopover2PropsH): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    
    inline def popoverRef(value: RefHandle[Popover2[HTMLProps[HTMLDivElement]]]): this.type = set("popoverRef", value.asInstanceOf[js.Any])
    
    inline def popoverTargetProps(value: HTMLAttributes[HTMLDivElement]): this.type = set("popoverTargetProps", value.asInstanceOf[js.Any])
    
    inline def query(value: String): this.type = set("query", value.asInstanceOf[js.Any])
    
    inline def resetOnClose(value: Boolean): this.type = set("resetOnClose", value.asInstanceOf[js.Any])
    
    inline def resetOnQuery(value: Boolean): this.type = set("resetOnQuery", value.asInstanceOf[js.Any])
    
    inline def resetOnSelect(value: Boolean): this.type = set("resetOnSelect", value.asInstanceOf[js.Any])
    
    inline def scrollToActiveItem(value: Boolean): this.type = set("scrollToActiveItem", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FilmSelect.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FilmSelectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
