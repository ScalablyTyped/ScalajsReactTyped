package typingsJapgolly.ionicCore

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsTabBarTabBarInterfaceMod.TabButtonClickEventDetail
import typingsJapgolly.ionicCore.distTypesComponentsTabBarTabBarInterfaceMod.TabButtonLayout
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.distTypesUtilsElementInterfaceMod.AnchorInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsTabButtonTabButtonMod {
  
  @JSImport("@ionic/core/dist/types/components/tab-button/tab-button", "TabButton")
  @js.native
  open class TabButton ()
    extends StObject
       with ComponentInterface
       with AnchorInterface {
    
    @JSName("componentWillLoad")
    def componentWillLoad_MTabButton(): Unit = js.native
    
    /**
      * If `true`, the user cannot interact with the tab button.
      */
    var disabled: Boolean = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ def hasIcon: Any = js.native
    
    /* private */ def hasLabel: Any = js.native
    
    /**
      * Emitted when the tab bar is clicked
      * @internal
      */
    var ionTabButtonClick: EventEmitter[TabButtonClickEventDetail] = js.native
    
    /**
      * Set the layout of the text and icon in the tab bar.
      * It defaults to `'icon-top'`.
      */
    var layout: js.UndefOr[TabButtonLayout] = js.native
    
    /* private */ var onClick: Any = js.native
    
    /* private */ var onKeyUp: Any = js.native
    
    def onTabBarChanged(ev: CustomEvent): Unit = js.native
    
    @JSName("render")
    def render_MTabButton(): Any = js.native
    
    /* private */ var selectTab: Any = js.native
    
    /**
      * The selected tab component
      */
    var selected: Boolean = js.native
    
    /**
      * A tab id must be provided for each `ion-tab`. It's used internally to reference
      * the selected tab or by the router to switch between them.
      */
    var tab: js.UndefOr[String] = js.native
    
    /* private */ def tabIndex: Any = js.native
  }
}
