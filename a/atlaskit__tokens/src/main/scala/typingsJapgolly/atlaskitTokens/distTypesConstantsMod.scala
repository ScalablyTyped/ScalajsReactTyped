package typingsJapgolly.atlaskitTokens

import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.`legacy-dark`
import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.`legacy-light`
import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.dark
import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConstantsMod {
  
  @JSImport("@atlaskit/tokens/dist/types/constants", "CSS_PREFIX")
  @js.native
  val CSS_PREFIX: /* "ds" */ String = js.native
  
  @JSImport("@atlaskit/tokens/dist/types/constants", "CSS_VAR_FULL")
  @js.native
  val CSS_VAR_FULL: js.Array[String] = js.native
  
  @JSImport("@atlaskit/tokens/dist/types/constants", "DEFAULT_THEME")
  @js.native
  val DEFAULT_THEME: /* "light" */ String = js.native
  
  @JSImport("@atlaskit/tokens/dist/types/constants", "THEMES")
  @js.native
  val THEMES: js.Tuple4[light, dark, `legacy-light`, `legacy-dark`] = js.native
  
  @JSImport("@atlaskit/tokens/dist/types/constants", "THEME_DATA_ATTRIBUTE")
  @js.native
  val THEME_DATA_ATTRIBUTE: /* "data-theme" */ String = js.native
  
  object THEME_NAME_MAP {
    
    @JSImport("@atlaskit/tokens/dist/types/constants", "THEME_NAME_MAP")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/constants", "THEME_NAME_MAP.atlassian-dark")
    @js.native
    def atlassianDark: String = js.native
    
    inline def atlassianDark_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-dark")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/tokens/dist/types/constants", "THEME_NAME_MAP.atlassian-legacy-dark")
    @js.native
    def atlassianLegacyDark: String = js.native
    
    inline def atlassianLegacyDark_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-legacy-dark")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/tokens/dist/types/constants", "THEME_NAME_MAP.atlassian-legacy-light")
    @js.native
    def atlassianLegacyLight: String = js.native
    
    inline def atlassianLegacyLight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-legacy-light")(x.asInstanceOf[js.Any])
    
    @JSImport("@atlaskit/tokens/dist/types/constants", "THEME_NAME_MAP.atlassian-light")
    @js.native
    def atlassianLight: String = js.native
    
    inline def atlassianLight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("atlassian-light")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@atlaskit/tokens/dist/types/constants", "TOKEN_NOT_FOUND_CSS_VAR")
  @js.native
  val TOKEN_NOT_FOUND_CSS_VAR: String = js.native
}
