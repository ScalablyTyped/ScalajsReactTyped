package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.CloseListbox
import typingsJapgolly.baseui.anon.IsSelectedOption
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.mini
import typingsJapgolly.baseui.comboboxTypesMod.ComboboxOverrides
import typingsJapgolly.baseui.comboboxTypesMod.ComboboxProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Combobox {
  
  inline def apply[Option](
    mapOptionToString: Option => String,
    onChange: (String, js.UndefOr[Option]) => Any,
    options: js.Array[Option],
    value: String
  ): Builder[Option] = {
    val __props = js.Dynamic.literal(mapOptionToString = js.Any.fromFunction1(mapOptionToString), onChange = js.Any.fromFunction2(onChange), options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder[Option](js.Array(this.component, __props.asInstanceOf[ComboboxProps[Option]]))
  }
  
  @JSImport("baseui/combobox", "Combobox")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Option] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def autocomplete(value: Boolean): this.type = set("autocomplete", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inputRef(value: Ref[HTMLElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    inline def inputRefFunction1(value: HTMLElement | Null => Callback): this.type = set("inputRef", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
    
    inline def inputRefNull: this.type = set("inputRef", null)
    
    inline def listBoxLabel(value: String): this.type = set("listBoxLabel", value.asInstanceOf[js.Any])
    
    inline def mapOptionToNode(value: ComponentType[IsSelectedOption[Option]]): this.type = set("mapOptionToNode", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* a */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    inline def onFocus(value: /* a */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    inline def onSubmit(value: /* a */ CloseListbox => Any): this.type = set("onSubmit", js.Any.fromFunction1(value))
    
    inline def overrides(value: ComboboxOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def positive(value: Boolean): this.type = set("positive", value.asInstanceOf[js.Any])
    
    inline def size(value: mini | default_ | compact | large_): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps[Option](p: ComboboxProps[Option]): Builder[Option] = new Builder[Option](js.Array(this.component, p.asInstanceOf[js.Any]))
}
