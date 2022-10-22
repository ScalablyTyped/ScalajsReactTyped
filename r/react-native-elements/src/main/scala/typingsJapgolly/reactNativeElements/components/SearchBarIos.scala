package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.ActivityIndicatorProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.anon.Name
import typingsJapgolly.reactNativeElements.anon.PartialThemePropsSearchBaTheme
import typingsJapgolly.reactNativeElements.anon.PartialTouchableOpacityPr
import typingsJapgolly.reactNativeElements.anon.RecursivePartialFullTheme
import typingsJapgolly.reactNativeElements.anon.TypeofComponent
import typingsJapgolly.reactNativeElements.distConfigThemeMod.Theme
import typingsJapgolly.reactNativeElements.distIconsIconMod.IconNode
import typingsJapgolly.reactNativeElements.distSearchbarSearchBarIosMod.SearchBarIosProps
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.android
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.default
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.ios
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchBarIos {
  
  inline def apply(
    cancelButtonTitle: String,
    clearIcon: Name,
    onBlur: CallbackTo[Any],
    onCancel: CallbackTo[Any],
    onChangeText: CallbackTo[Any],
    onClear: CallbackTo[Any],
    onFocus: CallbackTo[Any],
    platform: default | ios | android,
    searchIcon: Name,
    showCancel: Boolean,
    showLoading: Boolean,
    value: String
  ): Builder = {
    val __props = js.Dynamic.literal(cancelButtonTitle = cancelButtonTitle.asInstanceOf[js.Any], clearIcon = clearIcon.asInstanceOf[js.Any], onBlur = onBlur.toJsFn, onCancel = onCancel.toJsFn, onChangeText = onChangeText.toJsFn, onClear = onClear.toJsFn, onFocus = onFocus.toJsFn, platform = platform.asInstanceOf[js.Any], searchIcon = searchIcon.asInstanceOf[js.Any], showCancel = showCancel.asInstanceOf[js.Any], showLoading = showLoading.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SearchBarIosProps & PartialThemePropsSearchBaTheme]))
  }
  
  @JSImport("react-native-elements/dist/searchbar/SearchBar-ios", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeElements.distSearchbarSearchBarIosMod.default] {
    
    inline def InputComponent(
      value: TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          Component[js.Object, js.Object]
        ])
    ): this.type = set("InputComponent", value.asInstanceOf[js.Any])
    
    inline def cancelButtonProps(value: PartialTouchableOpacityPr): this.type = set("cancelButtonProps", value.asInstanceOf[js.Any])
    
    inline def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def containerStyleNull: this.type = set("containerStyle", null)
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def disabledInputStyle(value: StyleProp[TextStyle]): this.type = set("disabledInputStyle", value.asInstanceOf[js.Any])
    
    inline def disabledInputStyleNull: this.type = set("disabledInputStyle", null)
    
    inline def errorMessage(value: String): this.type = set("errorMessage", value.asInstanceOf[js.Any])
    
    inline def errorProps(value: js.Object): this.type = set("errorProps", value.asInstanceOf[js.Any])
    
    inline def errorStyle(value: StyleProp[TextStyle]): this.type = set("errorStyle", value.asInstanceOf[js.Any])
    
    inline def errorStyleNull: this.type = set("errorStyle", null)
    
    inline def inputContainerStyle(value: StyleProp[ViewStyle]): this.type = set("inputContainerStyle", value.asInstanceOf[js.Any])
    
    inline def inputContainerStyleNull: this.type = set("inputContainerStyle", null)
    
    inline def inputStyle(value: StyleProp[TextStyle]): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    
    inline def inputStyleNull: this.type = set("inputStyle", null)
    
    inline def label(value: String | Node): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelProps(value: js.Object): this.type = set("labelProps", value.asInstanceOf[js.Any])
    
    inline def labelStyle(value: StyleProp[TextStyle]): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    
    inline def labelStyleNull: this.type = set("labelStyle", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def leftIcon(value: IconNode): this.type = set("leftIcon", value.asInstanceOf[js.Any])
    
    inline def leftIconContainerStyle(value: StyleProp[ViewStyle]): this.type = set("leftIconContainerStyle", value.asInstanceOf[js.Any])
    
    inline def leftIconContainerStyleNull: this.type = set("leftIconContainerStyle", null)
    
    inline def leftIconVdomElement(value: VdomElement): this.type = set("leftIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def loadingProps(value: ActivityIndicatorProps): this.type = set("loadingProps", value.asInstanceOf[js.Any])
    
    inline def renderErrorMessage(value: Boolean): this.type = set("renderErrorMessage", value.asInstanceOf[js.Any])
    
    inline def replaceTheme(value: /* updates */ RecursivePartialFullTheme => Callback): this.type = set("replaceTheme", js.Any.fromFunction1((t0: /* updates */ RecursivePartialFullTheme) => value(t0).runNow()))
    
    inline def rightIcon(value: IconNode): this.type = set("rightIcon", value.asInstanceOf[js.Any])
    
    inline def rightIconContainerStyle(value: StyleProp[ViewStyle]): this.type = set("rightIconContainerStyle", value.asInstanceOf[js.Any])
    
    inline def rightIconContainerStyleNull: this.type = set("rightIconContainerStyle", null)
    
    inline def rightIconVdomElement(value: VdomElement): this.type = set("rightIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def theme(value: Theme[SearchBarIosProps]): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def updateTheme(value: /* updates */ RecursivePartialFullTheme => Callback): this.type = set("updateTheme", js.Any.fromFunction1((t0: /* updates */ RecursivePartialFullTheme) => value(t0).runNow()))
  }
  
  def withProps(p: SearchBarIosProps & PartialThemePropsSearchBaTheme): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
