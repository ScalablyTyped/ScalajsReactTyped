package typingsJapgolly.styledComponents.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.styledComponents.styledComponentsMod.ServerStyleSheet
import typingsJapgolly.styledComponents.styledComponentsMod.StyleSheetManagerProps
import typingsJapgolly.styledComponents.styledComponentsMod.StylisPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StyleSheetManager {
  def apply(
    disableCSSOMInjection: js.UndefOr[Boolean] = js.undefined,
    disableVendorPrefixes: js.UndefOr[Boolean] = js.undefined,
    sheet: ServerStyleSheet = null,
    stylisPlugins: js.Array[StylisPlugin] = null,
    target: HTMLElement = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    StyleSheetManagerProps, 
    typingsJapgolly.styledComponents.styledComponentsMod.StyleSheetManager, 
    Unit, 
    StyleSheetManagerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(disableCSSOMInjection)) __obj.updateDynamic("disableCSSOMInjection")(disableCSSOMInjection.asInstanceOf[js.Any])
    if (!js.isUndefined(disableVendorPrefixes)) __obj.updateDynamic("disableVendorPrefixes")(disableVendorPrefixes.asInstanceOf[js.Any])
    if (sheet != null) __obj.updateDynamic("sheet")(sheet.asInstanceOf[js.Any])
    if (stylisPlugins != null) __obj.updateDynamic("stylisPlugins")(stylisPlugins.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.styledComponents.styledComponentsMod.StyleSheetManagerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.styledComponents.styledComponentsMod.StyleSheetManager](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.styledComponents.styledComponentsMod.StyleSheetManagerProps])(children: _*)
  }
  @JSImport("styled-components", "StyleSheetManager")
  @js.native
  object componentImport extends js.Object
  
}

