package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.libImagePickerCameraRollPickerMod.CameraRollPickerProps
import typingsJapgolly.antDesignReactNative.libImagePickerImageRollMod.ImageRollProps
import typingsJapgolly.antDesignReactNative.libImagePickerImageRollMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImageRoll {
  
  inline def apply(onCancel: Callback, onSelected: js.Object => Callback): Builder = {
    val __props = js.Dynamic.literal(onCancel = onCancel.toJsFn, onSelected = js.Any.fromFunction1((t0: js.Object) => onSelected(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[ImageRollProps]))
  }
  
  @JSImport("@ant-design/react-native/lib/image-picker/ImageRoll", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def cameraPickerProps(value: CameraRollPickerProps): this.type = set("cameraPickerProps", value.asInstanceOf[js.Any])
    
    inline def cancelText(value: VdomNode): this.type = set("cancelText", value.rawNode.asInstanceOf[js.Any])
    
    inline def cancelTextNull: this.type = set("cancelText", null)
    
    inline def cancelTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("cancelText", js.Array(value*))
    
    inline def cancelTextVdomElement(value: VdomElement): this.type = set("cancelText", value.rawElement.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: ImageRollProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
