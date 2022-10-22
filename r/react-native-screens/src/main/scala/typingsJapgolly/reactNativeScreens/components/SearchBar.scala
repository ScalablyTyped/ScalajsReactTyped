package typingsJapgolly.reactNativeScreens.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.TargetedEvent
import typingsJapgolly.reactNative.mod.TextInputFocusEventData
import typingsJapgolly.reactNativeScreens.libTypescriptTypesMod.SearchBarProps
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.characters
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.email
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.none
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.number
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.phone
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.sentences
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.text
import typingsJapgolly.reactNativeScreens.reactNativeScreensStrings.words
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchBar {
  
  @JSImport("react-native-screens", "SearchBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def autoCapitalize(value: none | words | sentences | characters): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def barTintColor(value: String): this.type = set("barTintColor", value.asInstanceOf[js.Any])
    
    inline def cancelButtonText(value: String): this.type = set("cancelButtonText", value.asInstanceOf[js.Any])
    
    inline def disableBackButtonOverride(value: Boolean): this.type = set("disableBackButtonOverride", value.asInstanceOf[js.Any])
    
    inline def headerIconColor(value: String): this.type = set("headerIconColor", value.asInstanceOf[js.Any])
    
    inline def hideNavigationBar(value: Boolean): this.type = set("hideNavigationBar", value.asInstanceOf[js.Any])
    
    inline def hideWhenScrolling(value: Boolean): this.type = set("hideWhenScrolling", value.asInstanceOf[js.Any])
    
    inline def hintTextColor(value: String): this.type = set("hintTextColor", value.asInstanceOf[js.Any])
    
    inline def inputType(value: text | phone | number | email): this.type = set("inputType", value.asInstanceOf[js.Any])
    
    inline def obscureBackground(value: Boolean): this.type = set("obscureBackground", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TargetedEvent]) => value(t0).runNow()))
    
    inline def onCancelButtonPress(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Callback): this.type = set("onCancelButtonPress", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TargetedEvent]) => value(t0).runNow()))
    
    inline def onChangeText(value: /* e */ NativeSyntheticEvent[TextInputFocusEventData] => Callback): this.type = set("onChangeText", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TextInputFocusEventData]) => value(t0).runNow()))
    
    inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
    
    inline def onFocus(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TargetedEvent]) => value(t0).runNow()))
    
    inline def onOpen(value: Callback): this.type = set("onOpen", value.toJsFn)
    
    inline def onSearchButtonPress(value: /* e */ NativeSyntheticEvent[TextInputFocusEventData] => Callback): this.type = set("onSearchButtonPress", js.Any.fromFunction1((t0: /* e */ NativeSyntheticEvent[TextInputFocusEventData]) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def shouldShowHintSearchIcon(value: Boolean): this.type = set("shouldShowHintSearchIcon", value.asInstanceOf[js.Any])
    
    inline def textColor(value: String): this.type = set("textColor", value.asInstanceOf[js.Any])
    
    inline def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SearchBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SearchBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
