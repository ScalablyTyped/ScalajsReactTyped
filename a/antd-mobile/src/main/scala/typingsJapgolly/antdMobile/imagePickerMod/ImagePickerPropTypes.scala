package typingsJapgolly.antdMobile.imagePickerMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePickerPropTypes
  extends typingsJapgolly.antdMobile.imagePickerPropsTypeMod.ImagePickerPropTypes {
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
}

object ImagePickerPropTypes {
  @scala.inline
  def apply(
    accept: String = null,
    capture: js.Any = null,
    className: String = null,
    disableDelete: js.UndefOr[Boolean] = js.undefined,
    files: js.Array[js.Object] = null,
    length: Double | String = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onAddImageClick: js.UndefOr[Callback] = js.undefined,
    onChange: (/* files */ js.Array[js.Object], /* operationType */ String, /* index */ js.UndefOr[Double]) => Callback = null,
    onFail: /* msg */ String => Callback = null,
    onImageClick: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]]) => Callback = null,
    prefixCls: String = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null
  ): ImagePickerPropTypes = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDelete)) __obj.updateDynamic("disableDelete")(disableDelete.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    onAddImageClick.foreach(p => __obj.updateDynamic("onAddImageClick")(p.toJsFn))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3((t0: /* files */ js.Array[js.Object], t1: /* operationType */ java.lang.String, t2: /* index */ js.UndefOr[scala.Double]) => onChange(t0, t1, t2).runNow()))
    if (onFail != null) __obj.updateDynamic("onFail")(js.Any.fromFunction1((t0: /* msg */ java.lang.String) => onFail(t0).runNow()))
    if (onImageClick != null) __obj.updateDynamic("onImageClick")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[scala.Double], t1: /* files */ js.UndefOr[js.Array[js.Object]]) => onImageClick(t0, t1).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePickerPropTypes]
  }
}

