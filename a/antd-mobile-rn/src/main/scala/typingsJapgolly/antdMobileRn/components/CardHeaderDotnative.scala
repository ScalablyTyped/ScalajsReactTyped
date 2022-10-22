package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.libCardCardHeaderDotnativeMod.CardHeaderProps
import typingsJapgolly.antdMobileRn.libCardCardHeaderDotnativeMod.default
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardHeaderDotnative {
  
  @JSImport("antd-mobile-rn/lib/card/CardHeader.native", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def extra(value: VdomNode): this.type = set("extra", value.rawNode.asInstanceOf[js.Any])
    
    inline def extraNull: this.type = set("extra", null)
    
    inline def extraVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("extra", js.Array(value*))
    
    inline def extraVdomElement(value: VdomElement): this.type = set("extra", value.rawElement.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: Any): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def thumb(value: VdomNode): this.type = set("thumb", value.rawNode.asInstanceOf[js.Any])
    
    inline def thumbNull: this.type = set("thumb", null)
    
    inline def thumbStyle(value: StyleProp[ImageStyle]): this.type = set("thumbStyle", value.asInstanceOf[js.Any])
    
    inline def thumbStyleNull: this.type = set("thumbStyle", null)
    
    inline def thumbVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("thumb", js.Array(value*))
    
    inline def thumbVdomElement(value: VdomElement): this.type = set("thumb", value.rawElement.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CardHeaderDotnative.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
