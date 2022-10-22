package typingsJapgolly.atlaskitTokens

import typingsJapgolly.atlaskitTokens.anon.Blanket
import typingsJapgolly.atlaskitTokens.atlaskitTokensStrings.value
import typingsJapgolly.atlaskitTokens.distTypesTypesMod.OmitDistributive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokensDefaultColorBackgroundMod {
  
  /* Inlined @atlaskit/tokens.@atlaskit/tokens/dist/types/types.AttributeSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/types.BackgroundColorTokenSchema<@atlaskit/tokens.@atlaskit/tokens/dist/types/palettes/palette.BaseToken>> */
  object default {
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/color/background", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@atlaskit/tokens/dist/types/tokens/default/color/background", "default.color")
    @js.native
    def color: OmitDistributive[Blanket, value] = js.native
    inline def color_=(x: OmitDistributive[Blanket, value]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
  }
}
