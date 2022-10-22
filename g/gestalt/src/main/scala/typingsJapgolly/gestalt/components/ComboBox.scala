package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.anon.EventFocusEvent
import typingsJapgolly.gestalt.anon.EventKeyboardEvent
import typingsJapgolly.gestalt.anon.EventValue
import typingsJapgolly.gestalt.anon.Item
import typingsJapgolly.gestalt.anon.Value
import typingsJapgolly.gestalt.gestaltStrings.hidden
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.visible
import typingsJapgolly.gestalt.mod.ComboBoxItemType
import typingsJapgolly.gestalt.mod.ComboBoxProps
import typingsJapgolly.gestalt.mod.Indexable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ComboBox {
  
  inline def apply(
    accessibilityClearButtonLabel: String,
    id: String,
    label: String,
    noResultText: String,
    options: js.Array[ComboBoxItemType]
  ): Builder = {
    val __props = js.Dynamic.literal(accessibilityClearButtonLabel = accessibilityClearButtonLabel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], noResultText = noResultText.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ComboBoxProps]))
  }
  
  @JSImport("gestalt", "ComboBox")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def errorMessage(value: String): this.type = set("errorMessage", value.asInstanceOf[js.Any])
    
    inline def helperText(value: String): this.type = set("helperText", value.asInstanceOf[js.Any])
    
    inline def inputValue(value: String): this.type = set("inputValue", value.asInstanceOf[js.Any])
    
    inline def labelDisplay(value: visible | hidden): this.type = set("labelDisplay", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* args */ EventValue => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* args */ EventValue) => value(t0).runNow()))
    
    inline def onChange(value: /* args */ Value => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* args */ Value) => value(t0).runNow()))
    
    inline def onClear(value: Callback): this.type = set("onClear", value.toJsFn)
    
    inline def onFocus(value: /* args */ EventFocusEvent => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* args */ EventFocusEvent) => value(t0).runNow()))
    
    inline def onKeyDown(value: /* args */ EventKeyboardEvent => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: /* args */ EventKeyboardEvent) => value(t0).runNow()))
    
    inline def onSelect(value: /* args */ Item => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* args */ Item) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def selectedOption(value: ComboBoxItemType): this.type = set("selectedOption", value.asInstanceOf[js.Any])
    
    inline def size(value: md | lg): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def tags(value: js.Array[Element]): this.type = set("tags", value.asInstanceOf[js.Any])
    
    inline def tagsVarargs(value: Element*): this.type = set("tags", js.Array(value*))
    
    inline def zIndex(value: Indexable): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ComboBoxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
