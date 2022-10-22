package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.mod.Side
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsItemOptionsItemOptionsMod {
  
  @JSImport("@ionic/core/dist/types/components/item-options/item-options", "ItemOptions")
  @js.native
  open class ItemOptions ()
    extends StObject
       with ComponentInterface {
    
    var el: HTMLElement = js.native
    
    /** @internal */
    def fireSwipeEvent(): js.Promise[Unit] = js.native
    
    /**
      * Emitted when the item has been fully swiped.
      */
    var ionSwipe: EventEmitter[Any] = js.native
    
    @JSName("render")
    def render_MItemOptions(): Any = js.native
    
    /**
      * The side the option button should be on. Possible values: `"start"` and `"end"`. If you have multiple `ion-item-options`, a side must be provided for each.
      *
      */
    var side: Side = js.native
  }
}
