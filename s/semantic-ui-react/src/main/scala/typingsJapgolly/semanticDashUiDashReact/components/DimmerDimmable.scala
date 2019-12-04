package typingsJapgolly.semanticDashUiDashReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesDimmerDimmerDimmableMod.DimmerDimmableProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesDimmerDimmerDimmableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DimmerDimmable {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    blurring: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    content: SemanticShorthandContent = null,
    dimmed: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DimmerDimmableProps, default, Unit, DimmerDimmableProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(blurring)) __obj.updateDynamic("blurring")(blurring.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(dimmed)) __obj.updateDynamic("dimmed")(dimmed.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesDimmerDimmerDimmableMod.DimmerDimmableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesDimmerDimmerDimmableMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesDimmerDimmerDimmableMod.DimmerDimmableProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dimmer/DimmerDimmable", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

