package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonTabElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.mod.ComponentRef
import typingsJapgolly.ionicCore.mod.FrameworkDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsTabTabMod {
  
  @JSImport("@ionic/core/dist/types/components/tab/tab", "Tab")
  @js.native
  open class Tab ()
    extends StObject
       with ComponentInterface {
    
    /** @internal */
    var active: Boolean = js.native
    
    def changeActive(isActive: Boolean): Unit = js.native
    
    /**
      * The component to display inside of the tab.
      */
    var component: js.UndefOr[ComponentRef] = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MTab(): js.Promise[Unit] = js.native
    
    /** @internal */
    var delegate: js.UndefOr[FrameworkDelegate] = js.native
    
    var el: HTMLIonTabElement = js.native
    
    /* private */ var loaded: Any = js.native
    
    /* private */ var prepareLazyLoaded: Any = js.native
    
    @JSName("render")
    def render_MTab(): Any = js.native
    
    /** Set the active component for the tab */
    def setActive(): js.Promise[Unit] = js.native
    
    /**
      * A tab id must be provided for each `ion-tab`. It's used internally to reference
      * the selected tab or by the router to switch between them.
      */
    var tab: String = js.native
  }
}
