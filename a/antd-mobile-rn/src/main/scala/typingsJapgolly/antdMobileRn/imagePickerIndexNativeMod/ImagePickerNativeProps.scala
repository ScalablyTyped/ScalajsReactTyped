package typingsJapgolly.antdMobileRn.imagePickerIndexNativeMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antdMobileRn.imagePickerPropsTypeMod.ImagePickerPropTypes
import typingsJapgolly.antdMobileRn.imagePickerStyleIndexNativeMod.IImagePickerStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePickerNativeProps extends ImagePickerPropTypes {
  @JSName("styles")
  var styles_ImagePickerNativeProps: js.UndefOr[IImagePickerStyle] = js.undefined
}

object ImagePickerNativeProps {
  @scala.inline
  def apply(
    files: js.Array[js.Object] = null,
    onAddImageClick: js.UndefOr[Callback] = js.undefined,
    onChange: (/* files */ js.Array[js.Object], /* operationType */ String, /* index */ js.UndefOr[Double]) => Callback = null,
    onFail: /* msg */ String => Callback = null,
    onImageClick: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]]) => Callback = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    styles: IImagePickerStyle = null
  ): ImagePickerNativeProps = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    onAddImageClick.foreach(p => __obj.updateDynamic("onAddImageClick")(p.toJsFn))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3((t0: /* files */ js.Array[js.Object], t1: /* operationType */ java.lang.String, t2: /* index */ js.UndefOr[scala.Double]) => onChange(t0, t1, t2).runNow()))
    if (onFail != null) __obj.updateDynamic("onFail")(js.Any.fromFunction1((t0: /* msg */ java.lang.String) => onFail(t0).runNow()))
    if (onImageClick != null) __obj.updateDynamic("onImageClick")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[scala.Double], t1: /* files */ js.UndefOr[js.Array[js.Object]]) => onImageClick(t0, t1).runNow()))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePickerNativeProps]
  }
}

