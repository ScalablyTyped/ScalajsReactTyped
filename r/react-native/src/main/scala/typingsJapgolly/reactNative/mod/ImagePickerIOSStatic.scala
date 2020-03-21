package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePickerIOSStatic extends js.Object {
  def canRecordVideos(callback: js.Function1[/* value */ Boolean, Unit]): Unit
  def canUseCamera(callback: js.Function1[/* value */ Boolean, Unit]): Unit
  def openCameraDialog(
    config: OpenCameraDialogOptions,
    successCallback: js.Function1[/* args */ ImagePickerResult, Unit],
    cancelCallback: js.Function1[/* args */ js.Array[_], Unit]
  ): Unit
  def openSelectDialog(
    config: OpenSelectDialogOptions,
    successCallback: js.Function1[/* args */ ImagePickerResult, Unit],
    cancelCallback: js.Function1[/* args */ js.Array[_], Unit]
  ): Unit
}

object ImagePickerIOSStatic {
  @scala.inline
  def apply(
    canRecordVideos: js.Function1[/* value */ Boolean, Unit] => Callback,
    canUseCamera: js.Function1[/* value */ Boolean, Unit] => Callback,
    openCameraDialog: (OpenCameraDialogOptions, js.Function1[/* args */ ImagePickerResult, Unit], js.Function1[/* args */ js.Array[js.Any], Unit]) => Callback,
    openSelectDialog: (OpenSelectDialogOptions, js.Function1[/* args */ ImagePickerResult, Unit], js.Function1[/* args */ js.Array[js.Any], Unit]) => Callback
  ): ImagePickerIOSStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canRecordVideos")(js.Any.fromFunction1((t0: js.Function1[/* value */ scala.Boolean, scala.Unit]) => canRecordVideos(t0).runNow()))
    __obj.updateDynamic("canUseCamera")(js.Any.fromFunction1((t0: js.Function1[/* value */ scala.Boolean, scala.Unit]) => canUseCamera(t0).runNow()))
    __obj.updateDynamic("openCameraDialog")(js.Any.fromFunction3((t0: typingsJapgolly.reactNative.mod.OpenCameraDialogOptions, t1: js.Function1[/* args */ typingsJapgolly.reactNative.mod.ImagePickerResult, scala.Unit], t2: js.Function1[/* args */ js.Array[js.Any], scala.Unit]) => openCameraDialog(t0, t1, t2).runNow()))
    __obj.updateDynamic("openSelectDialog")(js.Any.fromFunction3((t0: typingsJapgolly.reactNative.mod.OpenSelectDialogOptions, t1: js.Function1[/* args */ typingsJapgolly.reactNative.mod.ImagePickerResult, scala.Unit], t2: js.Function1[/* args */ js.Array[js.Any], scala.Unit]) => openSelectDialog(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ImagePickerIOSStatic]
  }
}

