package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libImagePickerImageRollDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/image-picker/ImageRoll.native", JSImport.Default)
  @js.native
  open class default () extends ImageRoll
  
  @js.native
  trait ImageRoll extends Component[ImageRollProps, Any, Any] {
    
    def onSelected(images: js.Array[Any], _underscore: Any): Unit = js.native
  }
  
  trait ImageRollProps extends StObject {
    
    def onCancel(): Unit
    
    def onSelected(imgObj: js.Object): Unit
  }
  object ImageRollProps {
    
    inline def apply(onCancel: Callback, onSelected: js.Object => Callback): ImageRollProps = {
      val __obj = js.Dynamic.literal(onCancel = onCancel.toJsFn, onSelected = js.Any.fromFunction1((t0: js.Object) => onSelected(t0).runNow()))
      __obj.asInstanceOf[ImageRollProps]
    }
    
    extension [Self <: ImageRollProps](x: Self) {
      
      inline def setOnCancel(value: Callback): Self = StObject.set(x, "onCancel", value.toJsFn)
      
      inline def setOnSelected(value: js.Object => Callback): Self = StObject.set(x, "onSelected", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    }
  }
}
