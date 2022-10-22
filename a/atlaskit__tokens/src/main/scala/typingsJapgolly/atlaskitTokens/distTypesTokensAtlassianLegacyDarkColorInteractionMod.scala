package typingsJapgolly.atlaskitTokens

import typingsJapgolly.atlaskitTokens.anon.InteractionHoveredPaintToken
import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.attributes
import typingsJapgolly.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensAtlassianLegacyDarkColorInteractionMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.ValueSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.InteractionColorTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/legacy-palette.BaseToken>> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-legacy-dark/color/interaction", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-legacy-dark/color/interaction", "default.color")
    @js.native
    def color: OmitDistributive[InteractionHoveredPaintToken, attributes] = js.native
    inline def color_=(x: OmitDistributive[InteractionHoveredPaintToken, attributes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
  }
}
