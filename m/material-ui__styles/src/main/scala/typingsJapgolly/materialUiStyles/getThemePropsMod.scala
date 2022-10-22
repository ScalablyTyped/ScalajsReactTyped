package typingsJapgolly.materialUiStyles

import typingsJapgolly.materialUiStyles.anon.NameProps
import typingsJapgolly.materialUiStyles.getThemePropsGetThemePropsMod.ThemeWithProps
import typingsJapgolly.materialUiStyles.getThemePropsGetThemePropsMod.ThemedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getThemePropsMod {
  
  @JSImport("@material-ui/styles/getThemeProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Theme /* <: ThemeWithProps[Any] */, Props, Name /* <: /* keyof any */ String */](params: NameProps[Props, Name, Theme]): Props & (ThemedProps[Theme, Name]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[Props & (ThemedProps[Theme, Name])]
}
