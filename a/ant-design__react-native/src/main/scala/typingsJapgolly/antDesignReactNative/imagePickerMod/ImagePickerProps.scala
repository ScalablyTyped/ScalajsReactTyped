package typingsJapgolly.antDesignReactNative.imagePickerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.cameraRollPickerMod.CameraRollPickerProps
import typingsJapgolly.antDesignReactNative.imagePickerPropsTypeMod.ImagePickerPropTypes
import typingsJapgolly.antDesignReactNative.imageRollMod.ImageRollTexts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles because var conflicts: styles. Inlined  */ trait ImagePickerProps
  extends ImagePickerPropTypes
     with ImageRollTexts {
  var cameraPickerProps: js.UndefOr[CameraRollPickerProps] = js.undefined
}

object ImagePickerProps {
  @scala.inline
  def apply(
    cameraPickerProps: CameraRollPickerProps = null,
    cancelText: VdomNode = null,
    files: js.Array[js.Object] = null,
    onAddImageClick: js.UndefOr[Callback] = js.undefined,
    onChange: (/* files */ js.Array[js.Object], /* operationType */ String, /* index */ js.UndefOr[Double]) => Callback = null,
    onFail: /* msg */ String => Callback = null,
    onImageClick: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]]) => Callback = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    styles: js.Object = null,
    title: VdomNode = null
  ): ImagePickerProps = {
    val __obj = js.Dynamic.literal()
    if (cameraPickerProps != null) __obj.updateDynamic("cameraPickerProps")(cameraPickerProps.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.rawNode.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    onAddImageClick.foreach(p => __obj.updateDynamic("onAddImageClick")(p.toJsFn))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3((t0: /* files */ js.Array[js.Object], t1: /* operationType */ java.lang.String, t2: /* index */ js.UndefOr[scala.Double]) => onChange(t0, t1, t2).runNow()))
    if (onFail != null) __obj.updateDynamic("onFail")(js.Any.fromFunction1((t0: /* msg */ java.lang.String) => onFail(t0).runNow()))
    if (onImageClick != null) __obj.updateDynamic("onImageClick")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[scala.Double], t1: /* files */ js.UndefOr[js.Array[js.Object]]) => onImageClick(t0, t1).runNow()))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePickerProps]
  }
}

