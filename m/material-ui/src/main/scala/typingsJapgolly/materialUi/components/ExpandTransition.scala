package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.expandTransitionMod.ExpandTransitionProps
import typingsJapgolly.materialUi.expandTransitionMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ExpandTransition {
  def apply(
    enterDelay: Int | Double = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    open: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    transitionDelay: Int | Double = null,
    transitionDuration: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ExpandTransitionProps, default, Unit, ExpandTransitionProps] = {
    val __obj = js.Dynamic.literal()
  
      if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transitionDelay != null) __obj.updateDynamic("transitionDelay")(transitionDelay.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.expandTransitionMod.ExpandTransitionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.expandTransitionMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.expandTransitionMod.ExpandTransitionProps])(children: _*)
  }
  @JSImport("material-ui/internal/ExpandTransition", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

