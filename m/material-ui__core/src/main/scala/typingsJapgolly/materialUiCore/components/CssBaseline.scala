package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUiCore.cssBaselineCssBaselineMod.CssBaselineProps
import typingsJapgolly.materialUiCore.cssBaselineMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CssBaseline {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CssBaselineProps, default, Unit, CssBaselineProps] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUiCore.cssBaselineCssBaselineMod.CssBaselineProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUiCore.cssBaselineMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUiCore.cssBaselineCssBaselineMod.CssBaselineProps])(children: _*)
  }
  @JSImport("@material-ui/core/CssBaseline", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

