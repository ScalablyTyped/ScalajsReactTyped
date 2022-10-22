package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLSelectElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUiCore.anon.Name
import typingsJapgolly.materialUiCore.anon.Node
import typingsJapgolly.materialUiCore.anon.PartialMenuProps
import typingsJapgolly.materialUiCore.materialUiCoreStrings.filled
import typingsJapgolly.materialUiCore.materialUiCoreStrings.outlined
import typingsJapgolly.materialUiCore.materialUiCoreStrings.standard
import typingsJapgolly.materialUiCore.selectSelectInputMod.SelectInputProps
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectInput {
  
  inline def apply(autoWidth: Boolean, multiple: Boolean, native: Boolean): Builder = {
    val __props = js.Dynamic.literal(autoWidth = autoWidth.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectInputProps]))
  }
  
  @JSImport("@material-ui/core/Select/SelectInput", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def IconComponent(value: ElementType): this.type = set("IconComponent", value.asInstanceOf[js.Any])
    
    inline def MenuProps(value: PartialMenuProps): this.type = set("MenuProps", value.asInstanceOf[js.Any])
    
    inline def SelectDisplayProps(value: HTMLAttributes[HTMLDivElement]): this.type = set("SelectDisplayProps", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def inputRef(value: /* ref */ HTMLSelectElement | Node => Callback): this.type = set("inputRef", js.Any.fromFunction1((t0: /* ref */ HTMLSelectElement | Node) => value(t0).runNow()))
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: ReactFocusEventFrom[Any & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onChange(
      value: (/* event */ ReactEventFrom[Name & Element], /* child */ japgolly.scalajs.react.facade.React.Node) => Callback
    ): this.type = set("onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Name & Element], t1: /* child */ japgolly.scalajs.react.facade.React.Node) => (value(t0, t1)).runNow()))
    
    inline def onClose(value: /* event */ ReactEventFrom[js.Object & Element] => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[js.Object & Element]) => value(t0).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[Any & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onOpen(value: /* event */ ReactEventFrom[js.Object & Element] => Callback): this.type = set("onOpen", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[js.Object & Element]) => value(t0).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def renderValue(value: /* value */ js.UndefOr[Any] => japgolly.scalajs.react.facade.React.Node): this.type = set("renderValue", js.Any.fromFunction1(value))
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def variant(value: standard | outlined | filled): this.type = set("variant", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SelectInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
