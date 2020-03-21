package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.scaleInChildMod.ScaleInChildProps
import typingsJapgolly.materialUi.scaleInChildMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScaleInChild {
  def apply(
    enterDelay: Int | Double = null,
    maxScale: Int | Double = null,
    minScale: Int | Double = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ScaleInChildProps, default, Unit, ScaleInChildProps] = {
    val __obj = js.Dynamic.literal()
  
      if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.scaleInChildMod.ScaleInChildProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.scaleInChildMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.scaleInChildMod.ScaleInChildProps])(children: _*)
  }
  @JSImport("material-ui/internal/ScaleInChild", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

