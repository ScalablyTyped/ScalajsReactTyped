package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageEditorStatic extends StObject {
  
  /**
    * Crop the image specified by the URI param. If URI points to a remote
    * image, it will be downloaded automatically. If the image cannot be
    * loaded/downloaded, the failure callback will be called.
    *
    * If the cropping process is successful, the resultant cropped image
    * will be stored in the ImageStore, and the URI returned in the success
    * callback will point to the image in the store. Remember to delete the
    * cropped image from the ImageStore when you are done with it.
    */
  def cropImage(
    uri: String,
    cropData: ImageCropData,
    success: js.Function1[/* uri */ String, Unit],
    failure: js.Function1[/* error */ js.Object, Unit]
  ): Unit
}
object ImageEditorStatic {
  
  inline def apply(
    cropImage: (String, ImageCropData, js.Function1[/* uri */ String, Unit], js.Function1[/* error */ js.Object, Unit]) => Callback
  ): ImageEditorStatic = {
    val __obj = js.Dynamic.literal(cropImage = js.Any.fromFunction4((t0: String, t1: ImageCropData, t2: js.Function1[/* uri */ String, Unit], t3: js.Function1[/* error */ js.Object, Unit]) => (cropImage(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[ImageEditorStatic]
  }
  
  extension [Self <: ImageEditorStatic](x: Self) {
    
    inline def setCropImage(
      value: (String, ImageCropData, js.Function1[/* uri */ String, Unit], js.Function1[/* error */ js.Object, Unit]) => Callback
    ): Self = StObject.set(x, "cropImage", js.Any.fromFunction4((t0: String, t1: ImageCropData, t2: js.Function1[/* uri */ String, Unit], t3: js.Function1[/* error */ js.Object, Unit]) => (value(t0, t1, t2, t3)).runNow()))
  }
}
