package typingsJapgolly.atMaterialDashUiCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atMaterialDashUiCore.cssBaselineCssBaselineMod.CssBaselineProps
import typingsJapgolly.atMaterialDashUiCore.cssBaselineMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CssBaseline {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CssBaselineProps, default, Unit, CssBaselineProps] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atMaterialDashUiCore.cssBaselineCssBaselineMod.CssBaselineProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atMaterialDashUiCore.cssBaselineMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atMaterialDashUiCore.cssBaselineCssBaselineMod.CssBaselineProps])(children: _*)
  }
  @JSImport("@material-ui/core/CssBaseline", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

