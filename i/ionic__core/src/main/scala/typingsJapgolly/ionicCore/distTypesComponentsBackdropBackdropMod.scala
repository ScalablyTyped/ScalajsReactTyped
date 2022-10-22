package typingsJapgolly.ionicCore

import org.scalajs.dom.TouchEvent
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsBackdropBackdropMod {
  
  @JSImport("@ionic/core/dist/types/components/backdrop/backdrop", "Backdrop")
  @js.native
  open class Backdrop ()
    extends StObject
       with ComponentInterface {
    
    /* private */ var blocker: Any = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MBackdrop(): Unit = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MBackdrop(): Unit = js.native
    
    /* private */ var emitTap: Any = js.native
    
    /**
      * Emitted when the backdrop is tapped.
      */
    var ionBackdropTap: EventEmitter[Unit] = js.native
    
    /* protected */ def onMouseDown(ev: TouchEvent): Unit = js.native
    
    @JSName("render")
    def render_MBackdrop(): Any = js.native
    
    /**
      * If `true`, the backdrop will stop propagation on tap.
      */
    var stopPropagation: Boolean = js.native
    
    /**
      * If `true`, the backdrop will can be clicked and will emit the `ionBackdropTap` event.
      */
    var tappable: Boolean = js.native
    
    /**
      * If `true`, the backdrop will be visible.
      */
    var visible: Boolean = js.native
  }
}
