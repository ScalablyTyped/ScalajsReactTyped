package typingsJapgolly.nextNprogress.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nextNprogress.PartialNProgressOptions
import typingsJapgolly.nextNprogress.componentMod.NProgressProps
import typingsJapgolly.nextNprogress.componentMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Component {
  def apply(
    color: String = null,
    options: PartialNProgressOptions = null,
    showAfterMs: Int | Double = null,
    spinner: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NProgressProps, default, Unit, NProgressProps] = {
    val __obj = js.Dynamic.literal()
  
      if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (showAfterMs != null) __obj.updateDynamic("showAfterMs")(showAfterMs.asInstanceOf[js.Any])
    if (!js.isUndefined(spinner)) __obj.updateDynamic("spinner")(spinner.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nextNprogress.componentMod.NProgressProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nextNprogress.componentMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nextNprogress.componentMod.NProgressProps])(children: _*)
  }
  @JSImport("next-nprogress/component", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

