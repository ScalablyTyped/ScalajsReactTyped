package typingsJapgolly.spectacle.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.spectacle.mod.CSSProperties
import typingsJapgolly.spectacle.mod.GoToActionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GoToAction {
  def apply(
    margin: Double | String = null,
    padding: Double | String = null,
    render: /* goToSlide */ js.UndefOr[js.Function1[/* slide */ Double | String, Unit]] => Callback = null,
    slide: Double | String = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GoToActionProps, typingsJapgolly.spectacle.mod.GoToAction, Unit, GoToActionProps] = {
    val __obj = js.Dynamic.literal()
  
      if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* goToSlide */ js.UndefOr[js.Function1[/* slide */ scala.Double | java.lang.String, scala.Unit]]) => render(t0).runNow()))
    if (slide != null) __obj.updateDynamic("slide")(slide.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.spectacle.mod.GoToActionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.spectacle.mod.GoToAction](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.spectacle.mod.GoToActionProps])(children: _*)
  }
  @JSImport("spectacle", "GoToAction")
  @js.native
  object componentImport extends js.Object
  
}

