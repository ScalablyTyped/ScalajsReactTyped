package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.anon.Visible
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsSplitPaneSplitPaneMod {
  
  @JSImport("@ionic/core/dist/types/components/split-pane/split-pane", "SplitPane")
  @js.native
  open class SplitPane ()
    extends StObject
       with ComponentInterface {
    
    @JSName("connectedCallback")
    def connectedCallback_MSplitPane(): js.Promise[Unit] = js.native
    
    /**
      * The `id` of the main content. When using
      * a router this is typically `ion-router-outlet`.
      * When not using a router, this is typically
      * your main view's `ion-content`. This is not the
      * id of the `ion-content` inside of your `ion-menu`.
      */
    var contentId: js.UndefOr[String] = js.native
    
    /**
      * If `true`, the split pane will be hidden.
      */
    var disabled: Boolean = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MSplitPane(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /**
      * Expression to be called when the split-pane visibility has changed
      */
    var ionSplitPaneVisible: EventEmitter[Visible] = js.native
    
    /* private */ var isPane: Any = js.native
    
    @JSName("render")
    def render_MSplitPane(): Any = js.native
    
    /* private */ var rmL: Any = js.native
    
    /* private */ var styleChildren: Any = js.native
    
    /* protected */ def updateState(): Unit = js.native
    
    var visible: Boolean = js.native
    
    def visibleChanged(visible: Boolean): Unit = js.native
    
    /**
      * When the split-pane should be shown.
      * Can be a CSS media query expression, or a shortcut expression.
      * Can also be a boolean expression.
      */
    var when: String | Boolean = js.native
  }
}
