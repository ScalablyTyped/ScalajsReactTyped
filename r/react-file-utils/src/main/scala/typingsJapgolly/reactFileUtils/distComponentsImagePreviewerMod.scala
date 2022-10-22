package typingsJapgolly.reactFileUtils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.File
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactFileUtils.distTypesMod.ImageUpload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsImagePreviewerMod {
  
  @JSImport("react-file-utils/dist/components/ImagePreviewer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ImagePreviewer(hasMultipleDisabledImageUploadsHandleRemoveHandleRetryHandleFiles: ImagePreviewerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ImagePreviewer")(hasMultipleDisabledImageUploadsHandleRemoveHandleRetryHandleFiles.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type CustomMouseEvent = js.Function2[/* id */ String, /* event */ ReactMouseEventFrom[HTMLButtonElement], Unit]
  
  trait ImagePreviewerProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** A callback to call with newly selected files. If this is not provided no
      * `ThumbnailPlaceholder` will be displayed.
      */
    var handleFiles: js.UndefOr[js.Function1[/* files */ js.Array[File], Unit]] = js.undefined
    
    /** A callback to call when the remove icon is clicked */
    var handleRemove: js.UndefOr[CustomMouseEvent] = js.undefined
    
    /** A callback to call when the retry icon is clicked */
    var handleRetry: js.UndefOr[CustomMouseEvent] = js.undefined
    
    /** The list of image uploads that should be displayed */
    var imageUploads: js.UndefOr[js.Array[ImageUpload]] = js.undefined
    
    /** Allow drag 'n' drop (or selection from the file dialog) of multiple files */
    var multiple: js.UndefOr[Boolean] = js.undefined
  }
  object ImagePreviewerProps {
    
    inline def apply(): ImagePreviewerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImagePreviewerProps]
    }
    
    extension [Self <: ImagePreviewerProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHandleFiles(value: /* files */ js.Array[File] => Callback): Self = StObject.set(x, "handleFiles", js.Any.fromFunction1((t0: /* files */ js.Array[File]) => value(t0).runNow()))
      
      inline def setHandleFilesUndefined: Self = StObject.set(x, "handleFiles", js.undefined)
      
      inline def setHandleRemove(value: (/* id */ String, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): Self = StObject.set(x, "handleRemove", js.Any.fromFunction2((t0: /* id */ String, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
      
      inline def setHandleRemoveUndefined: Self = StObject.set(x, "handleRemove", js.undefined)
      
      inline def setHandleRetry(value: (/* id */ String, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): Self = StObject.set(x, "handleRetry", js.Any.fromFunction2((t0: /* id */ String, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
      
      inline def setHandleRetryUndefined: Self = StObject.set(x, "handleRetry", js.undefined)
      
      inline def setImageUploads(value: js.Array[ImageUpload]): Self = StObject.set(x, "imageUploads", value.asInstanceOf[js.Any])
      
      inline def setImageUploadsUndefined: Self = StObject.set(x, "imageUploads", js.undefined)
      
      inline def setImageUploadsVarargs(value: ImageUpload*): Self = StObject.set(x, "imageUploads", js.Array(value*))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    }
  }
}
