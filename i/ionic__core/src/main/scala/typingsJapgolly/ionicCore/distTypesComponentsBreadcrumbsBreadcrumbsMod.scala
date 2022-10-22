package typingsJapgolly.ionicCore

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsBreadcrumbBreadcrumbInterfaceMod.BreadcrumbCollapsedClickEventDetail
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsBreadcrumbsBreadcrumbsMod {
  
  @JSImport("@ionic/core/dist/types/components/breadcrumbs/breadcrumbs", "Breadcrumbs")
  @js.native
  open class Breadcrumbs ()
    extends StObject
       with ComponentInterface {
    
    var activeChanged: Boolean = js.native
    
    /* private */ var breadcrumbsInit: Any = js.native
    
    var collapsed: Boolean = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MBreadcrumbs(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var getBreadcrumbs: Any = js.native
    
    /**
      * Emitted when the collapsed indicator is clicked on.
      */
    var ionCollapsedClick: EventEmitter[BreadcrumbCollapsedClickEventDetail] = js.native
    
    /**
      * The number of breadcrumbs to show after the collapsed indicator.
      * If `itemsBeforeCollapse` + `itemsAfterCollapse` is greater than `maxItems`,
      * the breadcrumbs will not be collapsed.
      */
    var itemsAfterCollapse: Double = js.native
    
    /**
      * The number of breadcrumbs to show before the collapsed indicator.
      * If `itemsBeforeCollapse` + `itemsAfterCollapse` is greater than `maxItems`,
      * the breadcrumbs will not be collapsed.
      */
    var itemsBeforeCollapse: Double = js.native
    
    /**
      * The maximum number of breadcrumbs to show before collapsing.
      */
    var maxItems: js.UndefOr[Double] = js.native
    
    def maxItemsChanged(): Unit = js.native
    
    def onCollapsedClick(ev: CustomEvent): Unit = js.native
    
    @JSName("render")
    def render_MBreadcrumbs(): Any = js.native
    
    /* private */ var resetActiveBreadcrumb: Any = js.native
    
    /* private */ var setBreadcrumbSeparator: Any = js.native
    
    /* private */ var setMaxItems: Any = js.native
  }
}
