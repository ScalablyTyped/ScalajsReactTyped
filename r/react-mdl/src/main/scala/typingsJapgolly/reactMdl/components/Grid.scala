package typingsJapgolly.reactMdl.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactMdl.mod.CustomRenderedComponent
import typingsJapgolly.reactMdl.mod.GridProps
import typingsJapgolly.reactMdl.mod.ShadowedComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Grid {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    CustomRenderedComponent: CustomRenderedComponent = null,
    ShadowedComponent: ShadowedComponent = null,
    noSpacing: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GridProps, typingsJapgolly.reactMdl.mod.Grid, Unit, GridProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (CustomRenderedComponent != null) js.Dynamic.global.Object.assign(__obj, CustomRenderedComponent)
    if (ShadowedComponent != null) js.Dynamic.global.Object.assign(__obj, ShadowedComponent)
    if (!js.isUndefined(noSpacing)) __obj.updateDynamic("noSpacing")(noSpacing.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMdl.mod.GridProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMdl.mod.Grid](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMdl.mod.GridProps])(children: _*)
  }
  @JSImport("react-mdl", "Grid")
  @js.native
  object componentImport extends js.Object
  
}

