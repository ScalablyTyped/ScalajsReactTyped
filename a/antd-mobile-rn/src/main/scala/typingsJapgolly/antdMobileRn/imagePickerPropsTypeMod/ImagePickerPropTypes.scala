package typingsJapgolly.antdMobileRn.imagePickerPropsTypeMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePickerPropTypes extends js.Object {
  var files: js.UndefOr[js.Array[js.Object]] = js.undefined
  var onAddImageClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* files */ js.Array[js.Object], 
      /* operationType */ String, 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  var onFail: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  var onImageClick: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]], Unit]
  ] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var styles: js.UndefOr[js.Object] = js.undefined
}

object ImagePickerPropTypes {
  @scala.inline
  def apply(
    files: js.Array[js.Object] = null,
    onAddImageClick: js.UndefOr[Callback] = js.undefined,
    onChange: (/* files */ js.Array[js.Object], /* operationType */ String, /* index */ js.UndefOr[Double]) => Callback = null,
    onFail: /* msg */ String => Callback = null,
    onImageClick: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]]) => Callback = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    styles: js.Object = null
  ): ImagePickerPropTypes = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    onAddImageClick.foreach(p => __obj.updateDynamic("onAddImageClick")(p.toJsFn))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3((t0: /* files */ js.Array[js.Object], t1: /* operationType */ java.lang.String, t2: /* index */ js.UndefOr[scala.Double]) => onChange(t0, t1, t2).runNow()))
    if (onFail != null) __obj.updateDynamic("onFail")(js.Any.fromFunction1((t0: /* msg */ java.lang.String) => onFail(t0).runNow()))
    if (onImageClick != null) __obj.updateDynamic("onImageClick")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[scala.Double], t1: /* files */ js.UndefOr[js.Array[js.Object]]) => onImageClick(t0, t1).runNow()))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePickerPropTypes]
  }
}

