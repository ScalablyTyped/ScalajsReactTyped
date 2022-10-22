package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls the face image picker texture resource. Can be accessed through Texture.control on a Face Image Picker texture. For more information, see the Face Image Picker Texture guide. */
trait FaceImagePickerTextureProvider
  extends StObject
     with ImagePickerTextureProvider {
  
  /** If enabled, the selected image will be cropped to only show the face region. */
  var cropToFace: Boolean
  
  /** The FaceTextureProvider used to provide the face texture. */
  var faceControl: FaceTextureProvider
}
object FaceImagePickerTextureProvider {
  
  inline def apply(
    autoShowImagePicker: Boolean,
    cropToFace: Boolean,
    faceControl: FaceTextureProvider,
    getAspect: CallbackTo[Double],
    getHeight: CallbackTo[Double],
    getTypeName: CallbackTo[String],
    getWidth: CallbackTo[Double],
    hideImagePicker: Callback,
    isOfType: String => Boolean,
    setImageChangedCallback: js.Function0[Unit] => Callback,
    showImagePicker: Callback
  ): FaceImagePickerTextureProvider = {
    val __obj = js.Dynamic.literal(autoShowImagePicker = autoShowImagePicker.asInstanceOf[js.Any], cropToFace = cropToFace.asInstanceOf[js.Any], faceControl = faceControl.asInstanceOf[js.Any], getAspect = getAspect.toJsFn, getHeight = getHeight.toJsFn, getTypeName = getTypeName.toJsFn, getWidth = getWidth.toJsFn, hideImagePicker = hideImagePicker.toJsFn, isOfType = js.Any.fromFunction1(isOfType), setImageChangedCallback = js.Any.fromFunction1((t0: js.Function0[Unit]) => setImageChangedCallback(t0).runNow()), showImagePicker = showImagePicker.toJsFn)
    __obj.asInstanceOf[FaceImagePickerTextureProvider]
  }
  
  extension [Self <: FaceImagePickerTextureProvider](x: Self) {
    
    inline def setCropToFace(value: Boolean): Self = StObject.set(x, "cropToFace", value.asInstanceOf[js.Any])
    
    inline def setFaceControl(value: FaceTextureProvider): Self = StObject.set(x, "faceControl", value.asInstanceOf[js.Any])
  }
}
