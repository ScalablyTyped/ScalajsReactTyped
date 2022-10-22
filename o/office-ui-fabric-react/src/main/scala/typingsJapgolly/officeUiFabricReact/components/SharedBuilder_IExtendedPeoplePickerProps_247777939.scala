package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.IFocusZoneProps
import typingsJapgolly.officeUiFabricReact.libComponentsExtendedPickerBaseExtendedPickerDottypesMod.IBaseExtendedPicker
import typingsJapgolly.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.IInputProps
import typingsJapgolly.std.PromiseLike
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_IExtendedPeoplePickerProps_247777939[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def componentRef(value: IRefObject[IBaseExtendedPicker[IPersonaProps]]): this.type = set("componentRef", value.asInstanceOf[js.Any])
  
  inline def componentRefFunction1(value: /* ref */ IBaseExtendedPicker[IPersonaProps] | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IBaseExtendedPicker[IPersonaProps] | Null) => value(t0).runNow()))
  
  inline def currentRenderedQueryString(value: String): this.type = set("currentRenderedQueryString", value.asInstanceOf[js.Any])
  
  inline def defaultSelectedItems(value: js.Array[IPersonaProps]): this.type = set("defaultSelectedItems", value.asInstanceOf[js.Any])
  
  inline def defaultSelectedItemsVarargs(value: IPersonaProps*): this.type = set("defaultSelectedItems", js.Array(value*))
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def focusZoneProps(value: IFocusZoneProps): this.type = set("focusZoneProps", value.asInstanceOf[js.Any])
  
  inline def headerComponent(value: VdomElement): this.type = set("headerComponent", value.rawElement.asInstanceOf[js.Any])
  
  inline def inputProps(value: IInputProps): this.type = set("inputProps", value.asInstanceOf[js.Any])
  
  inline def itemLimit(value: Double): this.type = set("itemLimit", value.asInstanceOf[js.Any])
  
  inline def onBlur(
    value: ReactFocusEventFrom[
      (HTMLInputElement | typingsJapgolly.officeUiFabricReact.libAutofillMod.Autofill) & Element
    ] => Callback
  ): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[
      (HTMLInputElement | typingsJapgolly.officeUiFabricReact.libAutofillMod.Autofill) & Element
    ]) => value(t0).runNow()))
  
  inline def onChange(value: /* items */ js.UndefOr[js.Array[IPersonaProps]] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* items */ js.UndefOr[js.Array[IPersonaProps]]) => value(t0).runNow()))
  
  inline def onFocus(
    value: ReactFocusEventFrom[
      (HTMLInputElement | typingsJapgolly.officeUiFabricReact.libAutofillMod.Autofill) & Element
    ] => Callback
  ): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[
      (HTMLInputElement | typingsJapgolly.officeUiFabricReact.libAutofillMod.Autofill) & Element
    ]) => value(t0).runNow()))
  
  inline def onItemAdded(value: IPersonaProps => Callback): this.type = set("onItemAdded", js.Any.fromFunction1((t0: IPersonaProps) => value(t0).runNow()))
  
  inline def onItemSelected(value: /* selectedItem */ js.UndefOr[IPersonaProps] => IPersonaProps | PromiseLike[IPersonaProps]): this.type = set("onItemSelected", js.Any.fromFunction1(value))
  
  inline def onItemsRemoved(value: /* removedItems */ js.Array[IPersonaProps] => Callback): this.type = set("onItemsRemoved", js.Any.fromFunction1((t0: /* removedItems */ js.Array[IPersonaProps]) => value(t0).runNow()))
  
  inline def onPaste(value: /* pastedText */ String => js.Array[IPersonaProps]): this.type = set("onPaste", js.Any.fromFunction1(value))
  
  inline def selectedItems(value: js.Array[IPersonaProps]): this.type = set("selectedItems", value.asInstanceOf[js.Any])
  
  inline def selectedItemsVarargs(value: IPersonaProps*): this.type = set("selectedItems", js.Array(value*))
  
  inline def suggestionItems(value: js.Array[IPersonaProps]): this.type = set("suggestionItems", value.asInstanceOf[js.Any])
  
  inline def suggestionItemsVarargs(value: IPersonaProps*): this.type = set("suggestionItems", js.Array(value*))
}
