package typingsJapgolly.baseui

import typingsJapgolly.baseui.themesTypesMod.ColorTokens
import typingsJapgolly.baseui.themesTypesMod.SemanticColorTokens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themesDarkThemeColorSemanticTokensMod {
  
  @JSImport("baseui/themes/dark-theme/color-semantic-tokens", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): SemanticColorTokens = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[SemanticColorTokens]
  inline def default(foundation: ColorTokens): SemanticColorTokens = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(foundation.asInstanceOf[js.Any]).asInstanceOf[SemanticColorTokens]
}
