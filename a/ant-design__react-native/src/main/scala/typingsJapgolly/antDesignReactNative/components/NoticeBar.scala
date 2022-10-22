package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.closable
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.link
import typingsJapgolly.antDesignReactNative.libNoticeBarMarqueeMod.MarqueeProps
import typingsJapgolly.antDesignReactNative.libNoticeBarMod.NoticeNativeProps
import typingsJapgolly.antDesignReactNative.libNoticeBarStyleMod.NoticeBarStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NoticeBar {
  
  @JSImport("@ant-design/react-native", "NoticeBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignReactNative.mod.NoticeBar] {
    
    inline def action(value: VdomElement): this.type = set("action", value.rawElement.asInstanceOf[js.Any])
    
    inline def icon(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def marqueeProps(value: MarqueeProps): this.type = set("marqueeProps", value.asInstanceOf[js.Any])
    
    inline def mode(value: closable | link): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: Partial[NoticeBarStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NoticeBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NoticeNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
