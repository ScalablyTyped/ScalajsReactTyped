package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.expandTransitionChildMod.ExpandTransitionChildProps
import typingsJapgolly.materialUi.expandTransitionChildMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ExpandTransitionChild {
  def apply(
    enterDelay: Int | Double = null,
    style: CSSProperties = null,
    transitionDelay: Int | Double = null,
    transitionDuration: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ExpandTransitionChildProps, default, Unit, ExpandTransitionChildProps] = {
    val __obj = js.Dynamic.literal()
  
      if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transitionDelay != null) __obj.updateDynamic("transitionDelay")(transitionDelay.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.expandTransitionChildMod.ExpandTransitionChildProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.expandTransitionChildMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.expandTransitionChildMod.ExpandTransitionChildProps])(children: _*)
  }
  @JSImport("material-ui/internal/ExpandTransitionChild", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

