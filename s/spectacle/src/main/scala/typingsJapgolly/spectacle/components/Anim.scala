package typingsJapgolly.spectacle.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.spectacle.mod.AnimProps
import typingsJapgolly.spectacle.mod.CSSProperties
import typingsJapgolly.spectacle.mod.easeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Anim {
  def apply(
    easing: easeType,
    fromStyle: CSSProperties | js.Array[CSSProperties],
    toStyle: CSSProperties | js.Array[CSSProperties],
    transitionDuration: Double,
    onAnim: (/* forwards */ js.UndefOr[Boolean], /* animIndex */ js.UndefOr[Double]) => Callback = null,
    order: Int | Double = null,
    route: js.Object = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AnimProps, typingsJapgolly.spectacle.mod.Anim, Unit, AnimProps] = {
    val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any], fromStyle = fromStyle.asInstanceOf[js.Any], toStyle = toStyle.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any])
  
      if (onAnim != null) __obj.updateDynamic("onAnim")(js.Any.fromFunction2((t0: /* forwards */ js.UndefOr[scala.Boolean], t1: /* animIndex */ js.UndefOr[scala.Double]) => onAnim(t0, t1).runNow()))
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.spectacle.mod.AnimProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.spectacle.mod.Anim](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.spectacle.mod.AnimProps])(children: _*)
  }
  @JSImport("spectacle", "Anim")
  @js.native
  object componentImport extends js.Object
  
}

