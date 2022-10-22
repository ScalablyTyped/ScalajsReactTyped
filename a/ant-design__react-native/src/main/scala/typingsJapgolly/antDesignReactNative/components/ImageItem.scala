package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.libImagePickerImageItemMod.ImageItemProps
import typingsJapgolly.antDesignReactNative.libImagePickerImageItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImageItem {
  
  inline def apply(imageMargin: Double, imagesPerRow: Double): Builder = {
    val __props = js.Dynamic.literal(imageMargin = imageMargin.asInstanceOf[js.Any], imagesPerRow = imagesPerRow.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ImageItemProps]))
  }
  
  @JSImport("@ant-design/react-native/lib/image-picker/ImageItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def containerWidth(value: Double): this.type = set("containerWidth", value.asInstanceOf[js.Any])
    
    inline def item(value: Any): this.type = set("item", value.asInstanceOf[js.Any])
    
    inline def onPress(value: /* repeated */ Any => Any): this.type = set("onPress", js.Any.fromFunction1(value))
    
    inline def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def selectedMarker(value: VdomElement): this.type = set("selectedMarker", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: ImageItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
