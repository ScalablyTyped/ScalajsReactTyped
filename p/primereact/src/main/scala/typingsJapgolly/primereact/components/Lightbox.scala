package typingsJapgolly.primereact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.lightboxMod.LightboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Lightbox {
  def apply(
    className: String = null,
    easing: String = null,
    effectDuration: String = null,
    id: String = null,
    images: js.Array[_] = null,
    style: js.Object = null,
    target: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    LightboxProps, 
    typingsJapgolly.primereact.primereactLightboxMod.Lightbox, 
    Unit, 
    LightboxProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (effectDuration != null) __obj.updateDynamic("effectDuration")(effectDuration.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.lightboxMod.LightboxProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactLightboxMod.Lightbox](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.lightboxMod.LightboxProps])(children: _*)
  }
  @JSImport("primereact/lightbox", "Lightbox")
  @js.native
  object componentImport extends js.Object
  
}

