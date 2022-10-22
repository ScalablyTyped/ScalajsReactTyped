package typingsJapgolly.reactWidgets.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactWidgets.anon.DataKey
import typingsJapgolly.reactWidgets.esmDropdownListInputMod.Props
import typingsJapgolly.reactWidgets.esmTypesMod.DataItem
import typingsJapgolly.reactWidgets.esmTypesMod.WidgetHandle
import typingsJapgolly.reactWidgets.reactWidgetsStrings.off
import typingsJapgolly.reactWidgets.reactWidgetsStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownListInput {
  
  inline def apply(
    dataKeyAccessor: /* item */ DataItem => DataItem,
    onAutofill: Boolean => Callback,
    onAutofillChange: ReactEventFrom[HTMLInputElement] => Callback,
    textAccessor: /* item */ DataItem => String,
    value: Any
  ): Builder = {
    val __props = js.Dynamic.literal(dataKeyAccessor = js.Any.fromFunction1(dataKeyAccessor), onAutofill = js.Any.fromFunction1((t0: Boolean) => onAutofill(t0).runNow()), onAutofillChange = js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement]) => onAutofillChange(t0).runNow()), textAccessor = js.Any.fromFunction1(textAccessor), value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props[Any] & RefAttributes[WidgetHandle]]))
  }
  
  @JSImport("react-widgets/esm/DropdownListInput", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[WidgetHandle] {
    
    inline def allowSearch(value: Boolean): this.type = set("allowSearch", value.asInstanceOf[js.Any])
    
    inline def autoComplete(value: on | off): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onSearch(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onSearch", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def renderValue(value: DataKey[Any] => Node): this.type = set("renderValue", js.Any.fromFunction1(value))
    
    inline def searchTerm(value: String): this.type = set("searchTerm", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props[Any] & RefAttributes[WidgetHandle]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
