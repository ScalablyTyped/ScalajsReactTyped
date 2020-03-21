package typingsJapgolly.ionicCore

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.mod.StyleEventDetail
import typingsJapgolly.ionicCore.segmentSegmentInterfaceMod.SegmentChangeEventDetail
import typingsJapgolly.ionicCore.stencilCoreMod.ComponentInterface
import typingsJapgolly.ionicCore.stencilCoreMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/segment/segment", JSImport.Namespace)
@js.native
object segmentMod extends js.Object {
  @js.native
  class Segment () extends ComponentInterface {
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    var didInit: js.Any = js.native
    /**
      * If `true`, the user cannot interact with the segment.
      */
    var disabled: Boolean = js.native
    var el: HTMLElement = js.native
    var emitStyle: js.Any = js.native
    var getButtons: js.Any = js.native
    /**
      * Emitted when the value property has changed.
      */
    var ionChange: EventEmitter[SegmentChangeEventDetail] = js.native
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    /**
      * If `true`, the segment buttons will overflow and the user can swipe to see them.
      */
    var scrollable: Boolean = js.native
    var updateButtons: js.Any = js.native
    /**
      * the value of the segment.
      */
    var value: js.UndefOr[String | Null] = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MSegment(): Unit = js.native
    @JSName("connectedCallback")
    def connectedCallback_MSegment(): Unit = js.native
    @JSName("render")
    def render_MSegment(): js.Any = js.native
    def segmentClick(ev: CustomEvent): Unit = js.native
    /* protected */ def valueChanged(): Unit = js.native
    /* protected */ def valueChanged(value: String): Unit = js.native
  }
  
}

