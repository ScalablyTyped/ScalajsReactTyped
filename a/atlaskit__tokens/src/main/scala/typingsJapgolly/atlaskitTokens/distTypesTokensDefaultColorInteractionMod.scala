package typingsJapgolly.atlaskitTokens

import typingsJapgolly.atlaskitTokens.anon.Interaction
import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.value
import typingsJapgolly.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensDefaultColorInteractionMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.AttributeSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.InteractionColorTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/palette.BaseToken>> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/color/interaction", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/color/interaction", "default.color")
    @js.native
    def color: OmitDistributive[Interaction, value] = js.native
    inline def color_=(x: OmitDistributive[Interaction, value]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
  }
}
