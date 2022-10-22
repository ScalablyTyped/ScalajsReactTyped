package typingsJapgolly.baseui

import typingsJapgolly.baseui.themesTypesMod.ColorTokens
import typingsJapgolly.baseui.themesTypesMod.ComponentColorTokens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themesLightThemeColorComponentTokensMod {
  
  @JSImport("baseui/themes/light-theme/color-component-tokens", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): ComponentColorTokens = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ComponentColorTokens]
  inline def default(themePrimitives: ColorTokens): ComponentColorTokens = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(themePrimitives.asInstanceOf[js.Any]).asInstanceOf[ComponentColorTokens]
}
