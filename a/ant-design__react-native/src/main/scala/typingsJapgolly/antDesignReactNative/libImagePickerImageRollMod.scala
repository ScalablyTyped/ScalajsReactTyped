package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.anon.CameraPickerProps
import typingsJapgolly.antDesignReactNative.libImagePickerCameraRollPickerMod.CameraRollPickerProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libImagePickerImageRollMod {
  
  @JSImport("@ant-design/react-native/lib/image-picker/ImageRoll", JSImport.Default)
  @js.native
  open class default () extends ImageRoll
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/image-picker/ImageRoll", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/image-picker/ImageRoll", "default.defaultProps")
    @js.native
    def defaultProps: CameraPickerProps = js.native
    inline def defaultProps_=(x: CameraPickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ImageRoll extends Component[ImageRollProps, Any, Any] {
    
    def onSelected(images: js.Array[Any], _underscore: Any): Unit = js.native
  }
  
  trait ImageRollProps
    extends StObject
       with ImageRollTexts {
    
    var cameraPickerProps: js.UndefOr[CameraRollPickerProps] = js.undefined
    
    def onCancel(): Unit
    
    def onSelected(imgObj: js.Object): Unit
  }
  object ImageRollProps {
    
    inline def apply(onCancel: Callback, onSelected: js.Object => Callback): ImageRollProps = {
      val __obj = js.Dynamic.literal(onCancel = onCancel.toJsFn, onSelected = js.Any.fromFunction1((t0: js.Object) => onSelected(t0).runNow()))
      __obj.asInstanceOf[ImageRollProps]
    }
    
    extension [Self <: ImageRollProps](x: Self) {
      
      inline def setCameraPickerProps(value: CameraRollPickerProps): Self = StObject.set(x, "cameraPickerProps", value.asInstanceOf[js.Any])
      
      inline def setCameraPickerPropsUndefined: Self = StObject.set(x, "cameraPickerProps", js.undefined)
      
      inline def setOnCancel(value: Callback): Self = StObject.set(x, "onCancel", value.toJsFn)
      
      inline def setOnSelected(value: js.Object => Callback): Self = StObject.set(x, "onSelected", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    }
  }
  
  trait ImageRollTexts extends StObject {
    
    var cancelText: js.UndefOr[Node] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
  }
  object ImageRollTexts {
    
    inline def apply(): ImageRollTexts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageRollTexts]
    }
    
    extension [Self <: ImageRollTexts](x: Self) {
      
      inline def setCancelText(value: VdomNode): Self = StObject.set(x, "cancelText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCancelTextNull: Self = StObject.set(x, "cancelText", null)
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setCancelTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "cancelText", js.Array(value*))
      
      inline def setCancelTextVdomElement(value: VdomElement): Self = StObject.set(x, "cancelText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
