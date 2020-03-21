package typingsJapgolly.antDesignReactNative.imageRollMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.cameraRollPickerMod.CameraRollPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageRollProps extends ImageRollTexts {
  var cameraPickerProps: js.UndefOr[CameraRollPickerProps] = js.undefined
  def onCancel(): Unit
  def onSelected(imgObj: js.Object): Unit
}

object ImageRollProps {
  @scala.inline
  def apply(
    onCancel: Callback,
    onSelected: js.Object => Callback,
    cameraPickerProps: CameraRollPickerProps = null,
    cancelText: VdomNode = null,
    title: VdomNode = null
  ): ImageRollProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onCancel")(onCancel.toJsFn)
    __obj.updateDynamic("onSelected")(js.Any.fromFunction1((t0: js.Object) => onSelected(t0).runNow()))
    if (cameraPickerProps != null) __obj.updateDynamic("cameraPickerProps")(cameraPickerProps.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageRollProps]
  }
}

