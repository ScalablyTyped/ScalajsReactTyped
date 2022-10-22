package typingsJapgolly.antDesignReactNative

import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libImagePickerDemoBasicMod {
  
  @JSImport("@ant-design/react-native/lib/image-picker/demo/basic", JSImport.Default)
  @js.native
  open class default protected () extends ImagePickerExample {
    def this(props: Any) = this()
  }
  
  @js.native
  trait ImagePickerExample extends Component[Any, Any, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MImagePickerExample(): js.Promise[Unit] = js.native
    
    def handleFile2Change(files2: Any): Unit = js.native
    
    def handleFileChange(files: Any): Unit = js.native
    
    def requestCameraPermission(): js.Promise[Unit] = js.native
  }
}
