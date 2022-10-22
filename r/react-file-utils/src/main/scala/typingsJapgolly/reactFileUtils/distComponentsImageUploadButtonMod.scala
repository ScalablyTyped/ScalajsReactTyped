package typingsJapgolly.reactFileUtils

import japgolly.scalajs.react.Callback
import org.scalajs.dom.File
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsImageUploadButtonMod {
  
  @JSImport("react-file-utils/dist/components/ImageUploadButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ImageUploadButton(hasMultipleDisabledHandleFilesChildrenResetOnChange: PropsWithChildren[ImageUploadButtonProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ImageUploadButton")(hasMultipleDisabledHandleFilesChildrenResetOnChange.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ImageUploadButtonProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    def handleFiles(files: js.Array[File]): Unit
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var resetOnChange: js.UndefOr[Boolean] = js.undefined
  }
  object ImageUploadButtonProps {
    
    inline def apply(handleFiles: js.Array[File] => Callback): ImageUploadButtonProps = {
      val __obj = js.Dynamic.literal(handleFiles = js.Any.fromFunction1((t0: js.Array[File]) => handleFiles(t0).runNow()))
      __obj.asInstanceOf[ImageUploadButtonProps]
    }
    
    extension [Self <: ImageUploadButtonProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHandleFiles(value: js.Array[File] => Callback): Self = StObject.set(x, "handleFiles", js.Any.fromFunction1((t0: js.Array[File]) => value(t0).runNow()))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setResetOnChange(value: Boolean): Self = StObject.set(x, "resetOnChange", value.asInstanceOf[js.Any])
      
      inline def setResetOnChangeUndefined: Self = StObject.set(x, "resetOnChange", js.undefined)
    }
  }
}
