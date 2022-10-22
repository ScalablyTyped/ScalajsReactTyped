package typingsJapgolly.reactNativeModalFilterPicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.FlatListProps
import typingsJapgolly.reactNative.mod.KeyboardAvoidingView
import typingsJapgolly.reactNative.mod.ModalProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeModalFilterPicker.mod.ModalFilterPickerOption
import typingsJapgolly.reactNativeModalFilterPicker.mod.ModalFilterPickerProps
import typingsJapgolly.reactNativeModalFilterPicker.mod.default
import typingsJapgolly.reactNativeModalFilterPicker.reactNativeModalFilterPickerStrings.always
import typingsJapgolly.reactNativeModalFilterPicker.reactNativeModalFilterPickerStrings.handle
import typingsJapgolly.reactNativeModalFilterPicker.reactNativeModalFilterPickerStrings.never
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeModalFilterPicker {
  
  inline def apply[T /* <: ModalFilterPickerOption */](onCancel: Callback, onSelect: String => Callback, options: js.Array[T]): Builder[T] = {
    val __props = js.Dynamic.literal(onCancel = onCancel.toJsFn, onSelect = js.Any.fromFunction1((t0: String) => onSelect(t0).runNow()), options = options.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ModalFilterPickerProps[T]]))
  }
  
  @JSImport("react-native-modal-filter-picker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: ModalFilterPickerOption */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[T]] {
    
    inline def androidUnderlineColor(value: String): this.type = set("androidUnderlineColor", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def cancelButtonStyle(value: StyleProp[ViewStyle]): this.type = set("cancelButtonStyle", value.asInstanceOf[js.Any])
    
    inline def cancelButtonStyleNull: this.type = set("cancelButtonStyle", null)
    
    inline def cancelButtonText(value: String): this.type = set("cancelButtonText", value.asInstanceOf[js.Any])
    
    inline def cancelButtonTextStyle(value: StyleProp[TextStyle]): this.type = set("cancelButtonTextStyle", value.asInstanceOf[js.Any])
    
    inline def cancelButtonTextStyleNull: this.type = set("cancelButtonTextStyle", null)
    
    inline def cancelContainerStyle(value: StyleProp[ViewStyle]): this.type = set("cancelContainerStyle", value.asInstanceOf[js.Any])
    
    inline def cancelContainerStyleNull: this.type = set("cancelContainerStyle", null)
    
    inline def filterTextInputContainerStyle(value: StyleProp[ViewStyle]): this.type = set("filterTextInputContainerStyle", value.asInstanceOf[js.Any])
    
    inline def filterTextInputContainerStyleNull: this.type = set("filterTextInputContainerStyle", null)
    
    inline def filterTextInputStyle(value: StyleProp[TextStyle]): this.type = set("filterTextInputStyle", value.asInstanceOf[js.Any])
    
    inline def filterTextInputStyleNull: this.type = set("filterTextInputStyle", null)
    
    inline def flatListProps(value: Partial[FlatListProps[T]]): this.type = set("flatListProps", value.asInstanceOf[js.Any])
    
    inline def keyboardShouldPersistTaps(value: never | always | handle): this.type = set("keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    
    inline def listContainerStyle(value: StyleProp[ViewStyle]): this.type = set("listContainerStyle", value.asInstanceOf[js.Any])
    
    inline def listContainerStyleNull: this.type = set("listContainerStyle", null)
    
    inline def modal(value: ModalProps): this.type = set("modal", value.asInstanceOf[js.Any])
    
    inline def noResultsText(value: String): this.type = set("noResultsText", value.asInstanceOf[js.Any])
    
    inline def optionTextStyle(value: StyleProp[TextStyle]): this.type = set("optionTextStyle", value.asInstanceOf[js.Any])
    
    inline def optionTextStyleNull: this.type = set("optionTextStyle", null)
    
    inline def overlayStyle(value: StyleProp[KeyboardAvoidingView | ViewStyle]): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    
    inline def overlayStyleNull: this.type = set("overlayStyle", null)
    
    inline def placeholderText(value: String): this.type = set("placeholderText", value.asInstanceOf[js.Any])
    
    inline def placeholderTextColor(value: String): this.type = set("placeholderTextColor", value.asInstanceOf[js.Any])
    
    inline def renderCancelButton(value: CallbackTo[Element]): this.type = set("renderCancelButton", value.toJsFn)
    
    inline def renderList(value: CallbackTo[Element]): this.type = set("renderList", value.toJsFn)
    
    inline def renderOption(value: (T, /* isSelected */ Boolean) => Element): this.type = set("renderOption", js.Any.fromFunction2(value))
    
    inline def selectedOption(value: String): this.type = set("selectedOption", value.asInstanceOf[js.Any])
    
    inline def selectedOptionTextStyle(value: StyleProp[TextStyle]): this.type = set("selectedOptionTextStyle", value.asInstanceOf[js.Any])
    
    inline def selectedOptionTextStyleNull: this.type = set("selectedOptionTextStyle", null)
    
    inline def showFilter(value: Boolean): this.type = set("showFilter", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleTextStyle(value: StyleProp[TextStyle]): this.type = set("titleTextStyle", value.asInstanceOf[js.Any])
    
    inline def titleTextStyleNull: this.type = set("titleTextStyle", null)
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: ModalFilterPickerOption */](p: ModalFilterPickerProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
