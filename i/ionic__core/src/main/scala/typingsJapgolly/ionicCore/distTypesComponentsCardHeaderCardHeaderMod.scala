package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsCardHeaderCardHeaderMod {
  
  @JSImport("@ionic/core/dist/types/components/card-header/card-header", "CardHeader")
  @js.native
  open class CardHeader ()
    extends StObject
       with ComponentInterface {
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("render")
    def render_MCardHeader(): Any = js.native
    
    /**
      * If `true`, the card header will be translucent.
      * Only applies when the mode is `"ios"` and the device supports
      * [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
      */
    var translucent: Boolean = js.native
  }
}
