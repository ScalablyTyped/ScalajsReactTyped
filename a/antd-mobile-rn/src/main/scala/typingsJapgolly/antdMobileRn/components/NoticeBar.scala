package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.closable
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.link
import typingsJapgolly.antdMobileRn.libNoticeBarIndexDotnativeMod.NoticeNativeProps
import typingsJapgolly.antdMobileRn.libNoticeBarMarqueeDotnativeMod.MarqueeProps
import typingsJapgolly.antdMobileRn.libNoticeBarStyleIndexDotnativeMod.INoticeBarStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NoticeBar {
  
  @JSImport("antd-mobile-rn", "NoticeBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antdMobileRn.mod.NoticeBar] {
    
    inline def action(value: VdomElement): this.type = set("action", value.rawElement.asInstanceOf[js.Any])
    
    inline def icon(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def marqueeProps(value: MarqueeProps): this.type = set("marqueeProps", value.asInstanceOf[js.Any])
    
    inline def mode(value: closable | link): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def onClick(value: Callback): this.type = set("onClick", value.toJsFn)
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: INoticeBarStyle): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NoticeBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NoticeNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
