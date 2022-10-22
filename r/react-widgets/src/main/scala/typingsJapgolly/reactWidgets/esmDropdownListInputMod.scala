package typingsJapgolly.reactWidgets

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactWidgets.anon.DataKey
import typingsJapgolly.reactWidgets.esmAccessorsMod.DataKeyAccessorFn
import typingsJapgolly.reactWidgets.esmAccessorsMod.TextAccessorFn
import typingsJapgolly.reactWidgets.esmTypesMod.DataItem
import typingsJapgolly.reactWidgets.esmTypesMod.RenderProp
import typingsJapgolly.reactWidgets.esmTypesMod.WidgetHandle
import typingsJapgolly.reactWidgets.reactWidgetsStrings.off
import typingsJapgolly.reactWidgets.reactWidgetsStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmDropdownListInputMod extends Shortcut {
  
  @JSImport("react-widgets/esm/DropdownListInput", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[Props[Any] & RefAttributes[WidgetHandle]] = js.native
  
  type DropdownInputHandle = WidgetHandle
  
  trait Props[TDataItem] extends StObject {
    
    var allowSearch: js.UndefOr[Boolean] = js.undefined
    
    var autoComplete: js.UndefOr[on | off] = js.undefined
    
    var dataKeyAccessor: DataKeyAccessorFn
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    def onAutofill(autofilling: Boolean): Unit
    
    def onAutofillChange(e: ReactEventFrom[HTMLInputElement]): Unit
    
    var onSearch: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var renderValue: js.UndefOr[RenderValueProp[TDataItem]] = js.undefined
    
    var searchTerm: js.UndefOr[String] = js.undefined
    
    var textAccessor: TextAccessorFn
    
    var value: TDataItem
  }
  object Props {
    
    inline def apply[TDataItem](
      dataKeyAccessor: /* item */ DataItem => DataItem,
      onAutofill: Boolean => Callback,
      onAutofillChange: ReactEventFrom[HTMLInputElement] => Callback,
      textAccessor: /* item */ DataItem => String,
      value: TDataItem
    ): Props[TDataItem] = {
      val __obj = js.Dynamic.literal(dataKeyAccessor = js.Any.fromFunction1(dataKeyAccessor), onAutofill = js.Any.fromFunction1((t0: Boolean) => onAutofill(t0).runNow()), onAutofillChange = js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement]) => onAutofillChange(t0).runNow()), textAccessor = js.Any.fromFunction1(textAccessor), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[TDataItem]]
    }
    
    extension [Self <: Props[?], TDataItem](x: Self & Props[TDataItem]) {
      
      inline def setAllowSearch(value: Boolean): Self = StObject.set(x, "allowSearch", value.asInstanceOf[js.Any])
      
      inline def setAllowSearchUndefined: Self = StObject.set(x, "allowSearch", js.undefined)
      
      inline def setAutoComplete(value: on | off): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setDataKeyAccessor(value: /* item */ DataItem => DataItem): Self = StObject.set(x, "dataKeyAccessor", js.Any.fromFunction1(value))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnAutofill(value: Boolean => Callback): Self = StObject.set(x, "onAutofill", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setOnAutofillChange(value: ReactEventFrom[HTMLInputElement] => Callback): Self = StObject.set(x, "onAutofillChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement]) => value(t0).runNow()))
      
      inline def setOnSearch(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onSearch", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRenderValue(value: DataKey[TDataItem] => Node): Self = StObject.set(x, "renderValue", js.Any.fromFunction1(value))
      
      inline def setRenderValueUndefined: Self = StObject.set(x, "renderValue", js.undefined)
      
      inline def setSearchTerm(value: String): Self = StObject.set(x, "searchTerm", value.asInstanceOf[js.Any])
      
      inline def setSearchTermUndefined: Self = StObject.set(x, "searchTerm", js.undefined)
      
      inline def setTextAccessor(value: /* item */ DataItem => String): Self = StObject.set(x, "textAccessor", js.Any.fromFunction1(value))
      
      inline def setValue(value: TDataItem): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type RenderValueProp[TDataItem] = RenderProp[DataKey[TDataItem]]
  
  type _To = ForwardRefExoticComponent[Props[Any] & RefAttributes[WidgetHandle]]
  
  /* This means you don't have to write `default`, but can instead just say `esmDropdownListInputMod.foo` */
  override def _to: ForwardRefExoticComponent[Props[Any] & RefAttributes[WidgetHandle]] = default
}
