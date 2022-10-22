package typingsJapgolly.reactNativeModalbox.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeModalbox.mod.ModalProps
import typingsJapgolly.reactNativeModalbox.mod.default
import typingsJapgolly.reactNativeModalbox.reactNativeModalboxStrings.bottom
import typingsJapgolly.reactNativeModalbox.reactNativeModalboxStrings.center
import typingsJapgolly.reactNativeModalbox.reactNativeModalboxStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeModalbox {
  
  @JSImport("react-native-modalbox", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    
    inline def backButtonClose(value: Boolean): this.type = set("backButtonClose", value.asInstanceOf[js.Any])
    
    inline def backdrop(value: Boolean): this.type = set("backdrop", value.asInstanceOf[js.Any])
    
    inline def backdropColor(value: String): this.type = set("backdropColor", value.asInstanceOf[js.Any])
    
    inline def backdropContent(value: VdomNode): this.type = set("backdropContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def backdropContentNull: this.type = set("backdropContent", null)
    
    inline def backdropContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("backdropContent", js.Array(value*))
    
    inline def backdropContentVdomElement(value: VdomElement): this.type = set("backdropContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def backdropOpacity(value: Double): this.type = set("backdropOpacity", value.asInstanceOf[js.Any])
    
    inline def backdropPressToClose(value: Boolean): this.type = set("backdropPressToClose", value.asInstanceOf[js.Any])
    
    inline def coverScreen(value: Boolean): this.type = set("coverScreen", value.asInstanceOf[js.Any])
    
    inline def entry(value: top | bottom | String): this.type = set("entry", value.asInstanceOf[js.Any])
    
    inline def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
    
    inline def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    inline def keyboardTopOffset(value: Double): this.type = set("keyboardTopOffset", value.asInstanceOf[js.Any])
    
    inline def onClosed(value: Callback): this.type = set("onClosed", value.toJsFn)
    
    inline def onClosingState(value: /* state */ Boolean => Callback): this.type = set("onClosingState", js.Any.fromFunction1((t0: /* state */ Boolean) => value(t0).runNow()))
    
    inline def onOpened(value: Callback): this.type = set("onOpened", value.toJsFn)
    
    inline def position(value: top | center | bottom | String): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def startOpen(value: Boolean): this.type = set("startOpen", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def swipeArea(value: Double): this.type = set("swipeArea", value.asInstanceOf[js.Any])
    
    inline def swipeThreshold(value: Double): this.type = set("swipeThreshold", value.asInstanceOf[js.Any])
    
    inline def swipeToClose(value: Boolean): this.type = set("swipeToClose", value.asInstanceOf[js.Any])
    
    inline def useNativeDriver(value: Boolean): this.type = set("useNativeDriver", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeModalbox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
