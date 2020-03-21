package typingsJapgolly.ionicCore

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ionicCore.elementInterfaceMod.AnchorInterface
import typingsJapgolly.ionicCore.stencilCoreMod.ComponentInterface
import typingsJapgolly.ionicCore.stencilCoreMod.EventEmitter
import typingsJapgolly.ionicCore.tabBarInterfaceMod.TabButtonClickEventDetail
import typingsJapgolly.ionicCore.tabBarInterfaceMod.TabButtonLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/tab-button/tab-button", JSImport.Namespace)
@js.native
object tabButtonMod extends js.Object {
  @js.native
  class TabButton ()
    extends ComponentInterface
       with AnchorInterface {
    /**
      * If `true`, the user cannot interact with the tab button.
      */
    var disabled: Boolean = js.native
    var el: HTMLElement = js.native
    val hasIcon: js.Any = js.native
    val hasLabel: js.Any = js.native
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
    var onClick: js.Any = js.native
    var onKeyUp: js.Any = js.native
    var selectTab: js.Any = js.native
    /**
      * The selected tab component
      */
    var selected: Boolean = js.native
    /**
      * A tab id must be provided for each `ion-tab`. It's used internally to reference
      * the selected tab or by the router to switch between them.
      */
    var tab: js.UndefOr[String] = js.native
    val tabIndex: js.Any = js.native
    @JSName("componentWillLoad")
    def componentWillLoad_MTabButton(): Unit = js.native
    def onTabBarChanged(ev: CustomEvent): Unit = js.native
    @JSName("render")
    def render_MTabButton(): js.Any = js.native
  }
  
}

