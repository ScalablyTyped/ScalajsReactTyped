package typingsJapgolly.semanticDashUiDashReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsGridGridColumnMod.GridColumnProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsGridGridColumnMod.GridOnlyProp
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticFLOATS
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticTEXTALIGNMENTS
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticWIDTHS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GridColumn {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    className: String = null,
    color: SemanticCOLORS = null,
    computer: SemanticWIDTHS = null,
    floated: SemanticFLOATS = null,
    largeScreen: SemanticWIDTHS = null,
    mobile: SemanticWIDTHS = null,
    only: GridOnlyProp = null,
    stretched: js.UndefOr[Boolean] = js.undefined,
    tablet: SemanticWIDTHS = null,
    textAlign: SemanticTEXTALIGNMENTS = null,
    verticalAlign: SemanticVERTICALALIGNMENTS = null,
    widescreen: SemanticWIDTHS = null,
    width: SemanticWIDTHS = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    GridColumnProps, 
    MountedWithRawType[GridColumnProps, js.Object, RawMounted[GridColumnProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (computer != null) __obj.updateDynamic("computer")(computer.asInstanceOf[js.Any])
    if (floated != null) __obj.updateDynamic("floated")(floated.asInstanceOf[js.Any])
    if (largeScreen != null) __obj.updateDynamic("largeScreen")(largeScreen.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (!js.isUndefined(stretched)) __obj.updateDynamic("stretched")(stretched.asInstanceOf[js.Any])
    if (tablet != null) __obj.updateDynamic("tablet")(tablet.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (widescreen != null) __obj.updateDynamic("widescreen")(widescreen.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsGridGridColumnMod.GridColumnProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsGridGridColumnMod.GridColumnProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/collections/Grid/GridColumn", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

