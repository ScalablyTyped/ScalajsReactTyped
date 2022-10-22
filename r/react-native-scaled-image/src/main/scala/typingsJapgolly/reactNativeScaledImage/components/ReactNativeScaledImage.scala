package typingsJapgolly.reactNativeScaledImage.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNativeScaledImage.mod.ScaledImageProps
import typingsJapgolly.reactNativeScaledImage.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeScaledImage {
  
  inline def apply(source: ImageSourcePropType): Builder = {
    val __props = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ScaledImageProps]))
  }
  
  @JSImport("react-native-scaled-image", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ImageStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ScaledImageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
