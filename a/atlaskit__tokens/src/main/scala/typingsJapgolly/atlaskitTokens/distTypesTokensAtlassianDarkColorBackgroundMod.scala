package typingsJapgolly.atlaskitTokens

import typingsJapgolly.atlaskitTokens.anon.Blanket
import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.attributes
import typingsJapgolly.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensAtlassianDarkColorBackgroundMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.ValueSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.BackgroundColorTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/palette.BaseToken>> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-dark/color/background", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-dark/color/background", "default.color")
    @js.native
    def color: OmitDistributive[Blanket, attributes] = js.native
    inline def color_=(x: OmitDistributive[Blanket, attributes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
  }
}
