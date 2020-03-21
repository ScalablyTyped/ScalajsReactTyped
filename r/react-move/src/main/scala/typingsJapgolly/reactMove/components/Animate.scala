package typingsJapgolly.reactMove.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactMove.animateMod.IAnimateProps
import typingsJapgolly.reactMove.animateMod.default
import typingsJapgolly.reactMove.mod.HashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Animate {
  def apply(
    start: js.Any,
    enter: js.Any = null,
    interpolation: (/* begValue */ js.UndefOr[js.Any], /* endValue */ js.UndefOr[js.Any], /* attr */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => CallbackTo[js.Function1[/* t */ Double, js.Any]] = null,
    leave: js.Any = null,
    show: js.UndefOr[Boolean] = js.undefined,
    update: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: HashMap => CallbackTo[Element]
  ): UnmountedWithRoot[IAnimateProps, default, Unit, IAnimateProps] = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactMove.mod.HashMap) => children(t0).runNow()))
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (interpolation != null) __obj.updateDynamic("interpolation")(js.Any.fromFunction4((t0: /* begValue */ js.UndefOr[js.Any], t1: /* endValue */ js.UndefOr[js.Any], t2: /* attr */ js.UndefOr[java.lang.String], t3: /* namespace */ js.UndefOr[java.lang.String]) => interpolation(t0, t1, t2, t3).runNow()))
    if (leave != null) __obj.updateDynamic("leave")(leave.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMove.animateMod.IAnimateProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactMove.animateMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMove.animateMod.IAnimateProps])
  }
  @JSImport("react-move/Animate", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

