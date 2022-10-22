package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.libImagePickerCameraRollPickerMod.CameraRollPickerProps
import typingsJapgolly.antDesignReactNative.libImagePickerMod.ImagePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImagePicker {
  
  @JSImport("@ant-design/react-native", "ImagePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignReactNative.mod.ImagePicker] {
    
    inline def cameraPickerProps(value: CameraRollPickerProps): this.type = set("cameraPickerProps", value.asInstanceOf[js.Any])
    
    inline def cancelText(value: VdomNode): this.type = set("cancelText", value.rawNode.asInstanceOf[js.Any])
    
    inline def cancelTextNull: this.type = set("cancelText", null)
    
    inline def cancelTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("cancelText", js.Array(value*))
    
    inline def cancelTextVdomElement(value: VdomElement): this.type = set("cancelText", value.rawElement.asInstanceOf[js.Any])
    
    inline def files(value: js.Array[js.Object]): this.type = set("files", value.asInstanceOf[js.Any])
    
    inline def filesVarargs(value: js.Object*): this.type = set("files", js.Array(value*))
    
    inline def onAddImageClick(value: Callback): this.type = set("onAddImageClick", value.toJsFn)
    
    inline def onChange(
      value: (/* files */ js.Array[js.Object], /* operationType */ String, /* index */ js.UndefOr[Double]) => Callback
    ): this.type = set("onChange", js.Any.fromFunction3((t0: /* files */ js.Array[js.Object], t1: /* operationType */ String, t2: /* index */ js.UndefOr[Double]) => (value(t0, t1, t2)).runNow()))
    
    inline def onFail(value: /* msg */ String => Callback): this.type = set("onFail", js.Any.fromFunction1((t0: /* msg */ String) => value(t0).runNow()))
    
    inline def onImageClick(value: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]]) => Callback): this.type = set("onImageClick", js.Any.fromFunction2((t0: /* index */ js.UndefOr[Double], t1: /* files */ js.UndefOr[js.Array[js.Object]]) => (value(t0, t1)).runNow()))
    
    inline def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    inline def styles(value: js.Object): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ImagePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ImagePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
