package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls an image picker texture and UI. Can be accessed through Texture.control on an Image Picker texture. For more information, see the Image Picker Texture guide. */
trait ImagePickerTextureProvider
  extends StObject
     with TextureProvider {
  
  /** If enabled, the image picker UI will be shown automatically when the Lens starts. */
  var autoShowImagePicker: Boolean
  
  /** Hides the image picker UI. */
  def hideImagePicker(): Unit
  
  /** Binds a callback function for when the user selects or changes an image from the picker. */
  def setImageChangedCallback(callback: js.Function0[Unit]): Unit
  
  /** Shows the image picker UI. */
  def showImagePicker(): Unit
}
object ImagePickerTextureProvider {
  
  inline def apply(
    autoShowImagePicker: Boolean,
    getAspect: CallbackTo[Double],
    getHeight: CallbackTo[Double],
    getTypeName: CallbackTo[String],
    getWidth: CallbackTo[Double],
    hideImagePicker: Callback,
    isOfType: String => Boolean,
    setImageChangedCallback: js.Function0[Unit] => Callback,
    showImagePicker: Callback
  ): ImagePickerTextureProvider = {
    val __obj = js.Dynamic.literal(autoShowImagePicker = autoShowImagePicker.asInstanceOf[js.Any], getAspect = getAspect.toJsFn, getHeight = getHeight.toJsFn, getTypeName = getTypeName.toJsFn, getWidth = getWidth.toJsFn, hideImagePicker = hideImagePicker.toJsFn, isOfType = js.Any.fromFunction1(isOfType), setImageChangedCallback = js.Any.fromFunction1((t0: js.Function0[Unit]) => setImageChangedCallback(t0).runNow()), showImagePicker = showImagePicker.toJsFn)
    __obj.asInstanceOf[ImagePickerTextureProvider]
  }
  
  extension [Self <: ImagePickerTextureProvider](x: Self) {
    
    inline def setAutoShowImagePicker(value: Boolean): Self = StObject.set(x, "autoShowImagePicker", value.asInstanceOf[js.Any])
    
    inline def setHideImagePicker(value: Callback): Self = StObject.set(x, "hideImagePicker", value.toJsFn)
    
    inline def setSetImageChangedCallback(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "setImageChangedCallback", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setShowImagePicker(value: Callback): Self = StObject.set(x, "showImagePicker", value.toJsFn)
  }
}
