package typingsJapgolly.catalog.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.catalog.PartialTheme
import typingsJapgolly.catalog.mod.Config
import typingsJapgolly.catalog.mod.ConfigPageOrGroup
import typingsJapgolly.catalog.mod.ConfigResponsiveSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Catalog {
  def apply(
    pages: js.Array[ConfigPageOrGroup],
    title: String,
    basePath: String = null,
    imports: StringDictionary[js.Any] = null,
    logoSrc: String = null,
    responsiveSizes: js.Array[ConfigResponsiveSize] = null,
    scripts: js.Array[String] = null,
    styles: js.Array[String] = null,
    theme: PartialTheme = null,
    useBrowserHistory: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Config, typingsJapgolly.catalog.mod.Catalog, Unit, Config] = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
      if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (logoSrc != null) __obj.updateDynamic("logoSrc")(logoSrc.asInstanceOf[js.Any])
    if (responsiveSizes != null) __obj.updateDynamic("responsiveSizes")(responsiveSizes.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(useBrowserHistory)) __obj.updateDynamic("useBrowserHistory")(useBrowserHistory.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.catalog.mod.Config, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.catalog.mod.Catalog](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.catalog.mod.Config])(children: _*)
  }
  @JSImport("catalog", "Catalog")
  @js.native
  object componentImport extends js.Object
  
}

