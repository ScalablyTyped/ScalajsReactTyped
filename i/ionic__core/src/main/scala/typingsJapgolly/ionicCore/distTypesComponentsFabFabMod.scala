package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.ionicCoreStrings.bottom
import typingsJapgolly.ionicCore.ionicCoreStrings.center
import typingsJapgolly.ionicCore.ionicCoreStrings.end
import typingsJapgolly.ionicCore.ionicCoreStrings.start
import typingsJapgolly.ionicCore.ionicCoreStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsFabFabMod {
  
  @JSImport("@ionic/core/dist/types/components/fab/fab", "Fab")
  @js.native
  open class Fab ()
    extends StObject
       with ComponentInterface {
    
    /**
      * If `true`, both the `ion-fab-button` and all `ion-fab-list` inside `ion-fab` will become active.
      * That means `ion-fab-button` will become a `close` icon and `ion-fab-list` will become visible.
      */
    var activated: Boolean = js.native
    
    def activatedChanged(): Unit = js.native
    
    /**
      * Close an active FAB list container.
      */
    def close(): js.Promise[Unit] = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MFab(): Unit = js.native
    
    /**
      * If `true`, the fab will display on the edge of the header if
      * `vertical` is `"top"`, and on the edge of the footer if
      * it is `"bottom"`. Should be used with a `fixed` slot.
      */
    var edge: Boolean = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var getFab: Any = js.native
    
    /**
      * Where to align the fab horizontally in the viewport.
      */
    var horizontal: js.UndefOr[start | end | center] = js.native
    
    @JSName("render")
    def render_MFab(): Any = js.native
    
    /**
      * Opens/Closes the FAB list container.
      * @internal
      */
    def toggle(): js.Promise[Unit] = js.native
    
    /**
      * Where to align the fab vertically in the viewport.
      */
    var vertical: js.UndefOr[top | bottom | center] = js.native
  }
}
