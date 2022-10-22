package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.libImagePickerCameraRollPickerMod.CameraRollPickerProps
import typingsJapgolly.antDesignReactNative.libImagePickerCameraRollPickerMod.default
import typingsJapgolly.reactNative.mod.CameraRollAssetType
import typingsJapgolly.reactNative.mod.CameraRollGroupType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CameraRollPicker {
  
  inline def apply(first: Double, imageMargin: Double, imagesPerRow: Double, maximum: Double): Builder = {
    val __props = js.Dynamic.literal(first = first.asInstanceOf[js.Any], imageMargin = imageMargin.asInstanceOf[js.Any], imagesPerRow = imagesPerRow.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CameraRollPickerProps]))
  }
  
  @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def after(value: String): this.type = set("after", value.asInstanceOf[js.Any])
    
    inline def assetType(value: CameraRollAssetType): this.type = set("assetType", value.asInstanceOf[js.Any])
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def callback(value: /* repeated */ Any => Any): this.type = set("callback", js.Any.fromFunction1(value))
    
    inline def containerWidth(value: Double): this.type = set("containerWidth", value.asInstanceOf[js.Any])
    
    inline def groupName(value: String): this.type = set("groupName", value.asInstanceOf[js.Any])
    
    inline def groupTypes(value: CameraRollGroupType): this.type = set("groupTypes", value.asInstanceOf[js.Any])
    
    inline def mimeTypes(value: js.Array[String]): this.type = set("mimeTypes", value.asInstanceOf[js.Any])
    
    inline def mimeTypesVarargs(value: String*): this.type = set("mimeTypes", js.Array(value*))
    
    inline def selectSingleItem(value: Boolean): this.type = set("selectSingleItem", value.asInstanceOf[js.Any])
    
    inline def selected(value: js.Array[Any]): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def selectedMarker(value: VdomElement): this.type = set("selectedMarker", value.rawElement.asInstanceOf[js.Any])
    
    inline def selectedVarargs(value: Any*): this.type = set("selected", js.Array(value*))
  }
  
  def withProps(p: CameraRollPickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
