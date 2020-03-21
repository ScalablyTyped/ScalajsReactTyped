package typingsJapgolly.spectacle.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.spectacle.mod.AppearProps
import typingsJapgolly.spectacle.mod.CSSProperties
import typingsJapgolly.spectacle.mod.easeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Appear {
  def apply(
    easing: easeType = null,
    endValue: js.Object = null,
    fid: String = null,
    order: Int | Double = null,
    startValue: js.Object = null,
    style: CSSProperties = null,
    transitionDuration: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AppearProps, typingsJapgolly.spectacle.mod.Appear, Unit, AppearProps] = {
    val __obj = js.Dynamic.literal()
  
      if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (fid != null) __obj.updateDynamic("fid")(fid.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.spectacle.mod.AppearProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.spectacle.mod.Appear](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.spectacle.mod.AppearProps])(children: _*)
  }
  @JSImport("spectacle", "Appear")
  @js.native
  object componentImport extends js.Object
  
}

