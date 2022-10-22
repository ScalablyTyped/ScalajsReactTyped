package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.anon.Tab
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonTabElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonTabsElement
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.NavOutlet
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouteWrite
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsTabsTabsMod {
  
  @JSImport("@ionic/core/dist/types/components/tabs/tabs", "Tabs")
  @js.native
  open class Tabs ()
    extends StObject
       with NavOutlet {
    
    def componentWillLoad(): js.Promise[Unit] = js.native
    
    def componentWillRender(): Unit = js.native
    
    var el: HTMLIonTabsElement = js.native
    
    /**
      * Get the currently selected tab.
      */
    def getSelected(): js.Promise[js.UndefOr[String]] = js.native
    
    /**
      * Get a specific tab by the value of its `tab` property or an element reference.
      *
      * @param tab The tab instance to select. If passed a string, it should be the value of the tab's `tab` property.
      */
    def getTab(tab: String): js.Promise[js.UndefOr[HTMLIonTabElement]] = js.native
    def getTab(tab: HTMLIonTabElement): js.Promise[js.UndefOr[HTMLIonTabElement]] = js.native
    
    /**
      * Emitted when the navigation will load a component.
      * @internal
      */
    var ionNavWillLoad: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the navigation has finished transitioning to a new component.
      */
    var ionTabsDidChange: EventEmitter[Tab] = js.native
    
    /**
      * Emitted when the navigation is about to transition to a new component.
      */
    var ionTabsWillChange: EventEmitter[Tab] = js.native
    
    /* private */ var leavingTab: Any = js.native
    
    /* private */ var notifyRouter: Any = js.native
    
    /* private */ var onTabClicked: Any = js.native
    
    def render(): Any = js.native
    
    /**
      * Select a tab by the value of its `tab` property or an element reference.
      *
      * @param tab The tab instance to select. If passed a string, it should be the value of the tab's `tab` property.
      */
    def select(tab: String): js.Promise[Boolean] = js.native
    def select(tab: HTMLIonTabElement): js.Promise[Boolean] = js.native
    
    var selectedTab: js.UndefOr[HTMLIonTabElement] = js.native
    
    /* private */ var setActive: Any = js.native
    
    /** @internal */
    def setRouteId(id: String): js.Promise[RouteWrite] = js.native
    
    /* private */ var shouldSwitch: Any = js.native
    
    /* private */ var tabSwitch: Any = js.native
    
    /* private */ def tabs: Any = js.native
    
    /* private */ var transitioning: Any = js.native
    
    /** @internal */
    var useRouter: Boolean = js.native
  }
}
