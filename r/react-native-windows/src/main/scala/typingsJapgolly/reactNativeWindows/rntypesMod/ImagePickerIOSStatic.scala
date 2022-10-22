package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagePickerIOSStatic extends StObject {
  
  def canRecordVideos(callback: js.Function1[/* value */ Boolean, Unit]): Unit
  
  def canUseCamera(callback: js.Function1[/* value */ Boolean, Unit]): Unit
  
  def openCameraDialog(
    config: OpenCameraDialogOptions,
    successCallback: js.Function1[/* args */ ImagePickerResult, Unit],
    cancelCallback: js.Function1[/* args */ js.Array[Any], Unit]
  ): Unit
  
  def openSelectDialog(
    config: OpenSelectDialogOptions,
    successCallback: js.Function1[/* args */ ImagePickerResult, Unit],
    cancelCallback: js.Function1[/* args */ js.Array[Any], Unit]
  ): Unit
}
object ImagePickerIOSStatic {
  
  inline def apply(
    canRecordVideos: js.Function1[/* value */ Boolean, Unit] => Callback,
    canUseCamera: js.Function1[/* value */ Boolean, Unit] => Callback,
    openCameraDialog: (OpenCameraDialogOptions, js.Function1[/* args */ ImagePickerResult, Unit], js.Function1[/* args */ js.Array[Any], Unit]) => Callback,
    openSelectDialog: (OpenSelectDialogOptions, js.Function1[/* args */ ImagePickerResult, Unit], js.Function1[/* args */ js.Array[Any], Unit]) => Callback
  ): ImagePickerIOSStatic = {
    val __obj = js.Dynamic.literal(canRecordVideos = js.Any.fromFunction1((t0: js.Function1[/* value */ Boolean, Unit]) => canRecordVideos(t0).runNow()), canUseCamera = js.Any.fromFunction1((t0: js.Function1[/* value */ Boolean, Unit]) => canUseCamera(t0).runNow()), openCameraDialog = js.Any.fromFunction3((t0: OpenCameraDialogOptions, t1: js.Function1[/* args */ ImagePickerResult, Unit], t2: js.Function1[/* args */ js.Array[Any], Unit]) => (openCameraDialog(t0, t1, t2)).runNow()), openSelectDialog = js.Any.fromFunction3((t0: OpenSelectDialogOptions, t1: js.Function1[/* args */ ImagePickerResult, Unit], t2: js.Function1[/* args */ js.Array[Any], Unit]) => (openSelectDialog(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[ImagePickerIOSStatic]
  }
  
  extension [Self <: ImagePickerIOSStatic](x: Self) {
    
    inline def setCanRecordVideos(value: js.Function1[/* value */ Boolean, Unit] => Callback): Self = StObject.set(x, "canRecordVideos", js.Any.fromFunction1((t0: js.Function1[/* value */ Boolean, Unit]) => value(t0).runNow()))
    
    inline def setCanUseCamera(value: js.Function1[/* value */ Boolean, Unit] => Callback): Self = StObject.set(x, "canUseCamera", js.Any.fromFunction1((t0: js.Function1[/* value */ Boolean, Unit]) => value(t0).runNow()))
    
    inline def setOpenCameraDialog(
      value: (OpenCameraDialogOptions, js.Function1[/* args */ ImagePickerResult, Unit], js.Function1[/* args */ js.Array[Any], Unit]) => Callback
    ): Self = StObject.set(x, "openCameraDialog", js.Any.fromFunction3((t0: OpenCameraDialogOptions, t1: js.Function1[/* args */ ImagePickerResult, Unit], t2: js.Function1[/* args */ js.Array[Any], Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOpenSelectDialog(
      value: (OpenSelectDialogOptions, js.Function1[/* args */ ImagePickerResult, Unit], js.Function1[/* args */ js.Array[Any], Unit]) => Callback
    ): Self = StObject.set(x, "openSelectDialog", js.Any.fromFunction3((t0: OpenSelectDialogOptions, t1: js.Function1[/* args */ ImagePickerResult, Unit], t2: js.Function1[/* args */ js.Array[Any], Unit]) => (value(t0, t1, t2)).runNow()))
  }
}
