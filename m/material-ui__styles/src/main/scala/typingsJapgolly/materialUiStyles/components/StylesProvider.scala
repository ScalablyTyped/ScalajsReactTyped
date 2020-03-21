package typingsJapgolly.materialUiStyles.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jss.mod.Jss
import typingsJapgolly.jss.mod.Rule
import typingsJapgolly.jss.mod.StyleSheet
import typingsJapgolly.materialUiStyles.stylesProviderMod.default
import typingsJapgolly.materialUiStyles.stylesProviderStylesProviderMod.StylesProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StylesProvider {
  def apply(
    disableGeneration: js.UndefOr[Boolean] = js.undefined,
    generateClassName: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => CallbackTo[String] = null,
    injectFirst: js.UndefOr[Boolean] = js.undefined,
    jss: Jss = null,
    sheetsCache: js.Object = null,
    sheetsManager: js.Object = null,
    sheetsRegistry: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[StylesProviderProps, default, Unit, StylesProviderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(disableGeneration)) __obj.updateDynamic("disableGeneration")(disableGeneration.asInstanceOf[js.Any])
    if (generateClassName != null) __obj.updateDynamic("generateClassName")(js.Any.fromFunction2((t0: /* rule */ typingsJapgolly.jss.mod.Rule, t1: /* sheet */ js.UndefOr[typingsJapgolly.jss.mod.StyleSheet[java.lang.String]]) => generateClassName(t0, t1).runNow()))
    if (!js.isUndefined(injectFirst)) __obj.updateDynamic("injectFirst")(injectFirst.asInstanceOf[js.Any])
    if (jss != null) __obj.updateDynamic("jss")(jss.asInstanceOf[js.Any])
    if (sheetsCache != null) __obj.updateDynamic("sheetsCache")(sheetsCache.asInstanceOf[js.Any])
    if (sheetsManager != null) __obj.updateDynamic("sheetsManager")(sheetsManager.asInstanceOf[js.Any])
    if (sheetsRegistry != null) __obj.updateDynamic("sheetsRegistry")(sheetsRegistry.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUiStyles.stylesProviderStylesProviderMod.StylesProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUiStyles.stylesProviderMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUiStyles.stylesProviderStylesProviderMod.StylesProviderProps])(children: _*)
  }
  @JSImport("@material-ui/styles/StylesProvider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

