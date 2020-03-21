package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.imagePickerIndexNativeMod.ImagePickerNativeProps
import typingsJapgolly.antdMobileRn.imagePickerStyleIndexNativeMod.IImagePickerStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ImagePicker {
  def apply(
    files: js.Array[js.Object] = null,
    onAddImageClick: js.UndefOr[Callback] = js.undefined,
    onChange: (/* files */ js.Array[js.Object], /* operationType */ String, /* index */ js.UndefOr[Double]) => Callback = null,
    onFail: /* msg */ String => Callback = null,
    onImageClick: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]]) => Callback = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    styles: IImagePickerStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ImagePickerNativeProps, 
    typingsJapgolly.antdMobileRn.mod.ImagePicker, 
    Unit, 
    ImagePickerNativeProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    onAddImageClick.foreach(p => __obj.updateDynamic("onAddImageClick")(p.toJsFn))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3((t0: /* files */ js.Array[js.Object], t1: /* operationType */ java.lang.String, t2: /* index */ js.UndefOr[scala.Double]) => onChange(t0, t1, t2).runNow()))
    if (onFail != null) __obj.updateDynamic("onFail")(js.Any.fromFunction1((t0: /* msg */ java.lang.String) => onFail(t0).runNow()))
    if (onImageClick != null) __obj.updateDynamic("onImageClick")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[scala.Double], t1: /* files */ js.UndefOr[js.Array[js.Object]]) => onImageClick(t0, t1).runNow()))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.imagePickerIndexNativeMod.ImagePickerNativeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.mod.ImagePicker](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.imagePickerIndexNativeMod.ImagePickerNativeProps])(children: _*)
  }
  @JSImport("antd-mobile-rn", "ImagePicker")
  @js.native
  object componentImport extends js.Object
  
}

