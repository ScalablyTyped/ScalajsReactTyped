package typingsJapgolly.reactNativeRatings.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeRatings.distComponentsStarMod.StarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Star {
  
  @JSImport("react-native-ratings/dist/components/Star", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def fill(value: Boolean): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
    
    inline def position(value: Double): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def selectedColor(value: String): this.type = set("selectedColor", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def starImage(value: String): this.type = set("starImage", value.asInstanceOf[js.Any])
    
    inline def starSelectedInPosition(value: /* number */ Any => Callback): this.type = set("starSelectedInPosition", js.Any.fromFunction1((t0: /* number */ Any) => value(t0).runNow()))
    
    inline def starStyle(value: StyleProp[ViewStyle]): this.type = set("starStyle", value.asInstanceOf[js.Any])
    
    inline def starStyleNull: this.type = set("starStyle", null)
    
    inline def unSelectedColor(value: String): this.type = set("unSelectedColor", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Star.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
