package typingsJapgolly.reactJsonView.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactJsonView.mod.CollapsedFieldProps
import typingsJapgolly.reactJsonView.mod.InteractionProps
import typingsJapgolly.reactJsonView.mod.OnCopyProps
import typingsJapgolly.reactJsonView.mod.OnSelectProps
import typingsJapgolly.reactJsonView.mod.ReactJsonViewProps
import typingsJapgolly.reactJsonView.mod.ThemeKeys
import typingsJapgolly.reactJsonView.mod.ThemeObject
import typingsJapgolly.reactJsonView.mod.TypeDefaultValue
import typingsJapgolly.reactJsonView.reactJsonViewBooleans.`false`
import typingsJapgolly.reactJsonView.reactJsonViewStrings.circle
import typingsJapgolly.reactJsonView.reactJsonViewStrings.square
import typingsJapgolly.reactJsonView.reactJsonViewStrings.triangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactJsonView {
  
  inline def apply(src: js.Object): Builder = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactJsonViewProps]))
  }
  
  @JSImport("react-json-view", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def collapseStringsAfterLength(value: Double | `false`): this.type = set("collapseStringsAfterLength", value.asInstanceOf[js.Any])
    
    inline def collapsed(value: Boolean | Double): this.type = set("collapsed", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: TypeDefaultValue | js.Array[TypeDefaultValue]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueNull: this.type = set("defaultValue", null)
    
    inline def defaultValueVarargs(value: TypeDefaultValue*): this.type = set("defaultValue", js.Array(value*))
    
    inline def displayDataTypes(value: Boolean): this.type = set("displayDataTypes", value.asInstanceOf[js.Any])
    
    inline def displayObjectSize(value: Boolean): this.type = set("displayObjectSize", value.asInstanceOf[js.Any])
    
    inline def enableClipboard(value: Boolean | (js.Function1[/* copy */ OnCopyProps, Unit])): this.type = set("enableClipboard", value.asInstanceOf[js.Any])
    
    inline def enableClipboardFunction1(value: /* copy */ OnCopyProps => Callback): this.type = set("enableClipboard", js.Any.fromFunction1((t0: /* copy */ OnCopyProps) => value(t0).runNow()))
    
    inline def groupArraysAfterLength(value: Double): this.type = set("groupArraysAfterLength", value.asInstanceOf[js.Any])
    
    inline def iconStyle(value: circle | triangle | square): this.type = set("iconStyle", value.asInstanceOf[js.Any])
    
    inline def indentWidth(value: Double): this.type = set("indentWidth", value.asInstanceOf[js.Any])
    
    inline def name(value: String | `false`): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def nameNull: this.type = set("name", null)
    
    inline def onAdd(value: (js.Function1[/* add */ InteractionProps, `false` | Any]) | `false`): this.type = set("onAdd", value.asInstanceOf[js.Any])
    
    inline def onAddFunction1(value: /* add */ InteractionProps => `false` | Any): this.type = set("onAdd", js.Any.fromFunction1(value))
    
    inline def onDelete(value: (js.Function1[/* del */ InteractionProps, `false` | Any]) | `false`): this.type = set("onDelete", value.asInstanceOf[js.Any])
    
    inline def onDeleteFunction1(value: /* del */ InteractionProps => `false` | Any): this.type = set("onDelete", js.Any.fromFunction1(value))
    
    inline def onEdit(value: (js.Function1[/* edit */ InteractionProps, `false` | Any]) | `false`): this.type = set("onEdit", value.asInstanceOf[js.Any])
    
    inline def onEditFunction1(value: /* edit */ InteractionProps => `false` | Any): this.type = set("onEdit", js.Any.fromFunction1(value))
    
    inline def onSelect(value: (js.Function1[/* select */ OnSelectProps, Unit]) | `false`): this.type = set("onSelect", value.asInstanceOf[js.Any])
    
    inline def onSelectFunction1(value: /* select */ OnSelectProps => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* select */ OnSelectProps) => value(t0).runNow()))
    
    inline def quotesOnKeys(value: Boolean): this.type = set("quotesOnKeys", value.asInstanceOf[js.Any])
    
    inline def shouldCollapse(value: `false` | (js.Function1[/* field */ CollapsedFieldProps, Boolean])): this.type = set("shouldCollapse", value.asInstanceOf[js.Any])
    
    inline def shouldCollapseFunction1(value: /* field */ CollapsedFieldProps => Boolean): this.type = set("shouldCollapse", js.Any.fromFunction1(value))
    
    inline def sortKeys(value: Boolean): this.type = set("sortKeys", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def theme(value: ThemeKeys | ThemeObject): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def validationMessage(value: String): this.type = set("validationMessage", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactJsonViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
