package typingsJapgolly.reactGravatar.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactGravatar.mod.DefaultImage
import typingsJapgolly.reactGravatar.mod.Props
import typingsJapgolly.reactGravatar.mod.Rating
import typingsJapgolly.reactGravatar.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactGravatar {
  def apply(
    className: String = null,
    default: DefaultImage = null,
    email: String = null,
    md5: String = null,
    protocol: String = null,
    rating: Rating = null,
    size: Int | Double = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, ^, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (md5 != null) __obj.updateDynamic("md5")(md5.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactGravatar.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactGravatar.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactGravatar.mod.Props])(children: _*)
  }
  @JSImport("react-gravatar", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

