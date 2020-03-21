package typingsJapgolly.mjmlReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.mjmlReact.AnonSrc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlTrackingPixel {
  def apply(
    src: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AnonSrc, typingsJapgolly.mjmlReact.extensionsMod.MjmlTrackingPixel, Unit, AnonSrc] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.mjmlReact.AnonSrc, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.mjmlReact.extensionsMod.MjmlTrackingPixel](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mjmlReact.AnonSrc])(children: _*)
  }
  @JSImport("mjml-react/extensions", "MjmlTrackingPixel")
  @js.native
  object componentImport extends js.Object
  
}

