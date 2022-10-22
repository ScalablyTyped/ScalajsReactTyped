package typingsJapgolly.atlaskitTokens

import typingsJapgolly.atlaskitTokens.anon.Shadow
import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.attributes
import typingsJapgolly.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensAtlassianLightElevationShadowMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.ValueSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.ShadowTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/palette.BaseToken>> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-light/elevation/shadow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/atlassian-light/elevation/shadow", "default.elevation")
    @js.native
    def elevation: OmitDistributive[Shadow, attributes] = js.native
    inline def elevation_=(x: OmitDistributive[Shadow, attributes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elevation")(x.asInstanceOf[js.Any])
  }
}
