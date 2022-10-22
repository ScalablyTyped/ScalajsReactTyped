package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsItemDividerItemDividerMod {
  
  @JSImport("@ionic/core/dist/types/components/item-divider/item-divider", "ItemDivider")
  @js.native
  open class ItemDivider ()
    extends StObject
       with ComponentInterface {
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    var el: HTMLElement = js.native
    
    @JSName("render")
    def render_MItemDivider(): Any = js.native
    
    /**
      * When it's set to `true`, the item-divider will stay visible when it reaches the top
      * of the viewport until the next `ion-item-divider` replaces it.
      *
      * This feature relies in `position:sticky`:
      * https://caniuse.com/#feat=css-sticky
      */
    var sticky: Boolean = js.native
  }
}
