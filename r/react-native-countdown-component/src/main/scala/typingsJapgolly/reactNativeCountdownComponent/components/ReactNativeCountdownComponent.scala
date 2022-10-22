package typingsJapgolly.reactNativeCountdownComponent.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeCountdownComponent.anon.D
import typingsJapgolly.reactNativeCountdownComponent.mod.CountDownProps
import typingsJapgolly.reactNativeCountdownComponent.mod.DigitType
import typingsJapgolly.reactNativeCountdownComponent.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeCountdownComponent {
  
  @JSImport("react-native-countdown-component", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def digitStyle(value: StyleProp[ViewStyle]): this.type = set("digitStyle", value.asInstanceOf[js.Any])
    
    inline def digitStyleNull: this.type = set("digitStyle", null)
    
    inline def digitTxtStyle(value: StyleProp[TextStyle]): this.type = set("digitTxtStyle", value.asInstanceOf[js.Any])
    
    inline def digitTxtStyleNull: this.type = set("digitTxtStyle", null)
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def idNull: this.type = set("id", null)
    
    inline def onChange(value: /* until */ Double => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* until */ Double) => value(t0).runNow()))
    
    inline def onFinish(value: Callback): this.type = set("onFinish", value.toJsFn)
    
    inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
    
    inline def running(value: Boolean): this.type = set("running", value.asInstanceOf[js.Any])
    
    inline def separatorStyle(value: StyleProp[TextStyle]): this.type = set("separatorStyle", value.asInstanceOf[js.Any])
    
    inline def separatorStyleNull: this.type = set("separatorStyle", null)
    
    inline def showSeparator(value: Boolean): this.type = set("showSeparator", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def timeLabelStyle(value: StyleProp[TextStyle]): this.type = set("timeLabelStyle", value.asInstanceOf[js.Any])
    
    inline def timeLabelStyleNull: this.type = set("timeLabelStyle", null)
    
    inline def timeLabels(value: D): this.type = set("timeLabels", value.asInstanceOf[js.Any])
    
    inline def timeToShow(value: js.Array[DigitType]): this.type = set("timeToShow", value.asInstanceOf[js.Any])
    
    inline def timeToShowVarargs(value: DigitType*): this.type = set("timeToShow", js.Array(value*))
    
    inline def until(value: Double): this.type = set("until", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeCountdownComponent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CountDownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
