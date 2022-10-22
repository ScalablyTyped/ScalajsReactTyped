package typingsJapgolly.reactNativeFlipCard.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeFlipCard.mod.FlipCardProps
import typingsJapgolly.reactNativeFlipCard.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeFlipCard {
  
  @JSImport("react-native-flip-card", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def alignHeight(value: Boolean): this.type = set("alignHeight", value.asInstanceOf[js.Any])
    
    inline def alignWidth(value: Boolean): this.type = set("alignWidth", value.asInstanceOf[js.Any])
    
    inline def children(value: js.Array[Node]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenVarargs(value: Node*): this.type = set("children", js.Array(value*))
    
    inline def clickable(value: Boolean): this.type = set("clickable", value.asInstanceOf[js.Any])
    
    inline def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
    
    inline def flipHorizontal(value: Boolean): this.type = set("flipHorizontal", value.asInstanceOf[js.Any])
    
    inline def flipVertical(value: Boolean): this.type = set("flipVertical", value.asInstanceOf[js.Any])
    
    inline def friction(value: Double): this.type = set("friction", value.asInstanceOf[js.Any])
    
    inline def onFlipEnd(value: Callback): this.type = set("onFlipEnd", value.toJsFn)
    
    inline def onFlipStart(value: Callback): this.type = set("onFlipStart", value.toJsFn)
    
    inline def perspective(value: Double): this.type = set("perspective", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def useNativeDriver(value: Boolean): this.type = set("useNativeDriver", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeFlipCard.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FlipCardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
