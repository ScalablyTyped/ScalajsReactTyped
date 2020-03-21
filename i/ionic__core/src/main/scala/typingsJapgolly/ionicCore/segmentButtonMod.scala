package typingsJapgolly.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ionicCore.elementInterfaceMod.ButtonInterface
import typingsJapgolly.ionicCore.ionicCoreStrings.button
import typingsJapgolly.ionicCore.ionicCoreStrings.reset
import typingsJapgolly.ionicCore.ionicCoreStrings.submit
import typingsJapgolly.ionicCore.segmentSegmentInterfaceMod.SegmentButtonLayout
import typingsJapgolly.ionicCore.stencilCoreMod.ComponentInterface
import typingsJapgolly.ionicCore.stencilCoreMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/segment-button/segment-button", JSImport.Namespace)
@js.native
object segmentButtonMod extends js.Object {
  @js.native
  class SegmentButton ()
    extends ComponentInterface
       with ButtonInterface {
    /**
      * If `true`, the segment button is selected.
      */
    var checked: Boolean = js.native
    /* CompleteClass */
    override var disabled: Boolean = js.native
    var el: HTMLElement = js.native
    val hasIcon: js.Any = js.native
    val hasLabel: js.Any = js.native
    /**
      * Emitted when the segment button is clicked.
      */
    var ionSelect: EventEmitter[Unit] = js.native
    /**
      * Set the layout of the text and icon in the segment.
      */
    var layout: js.UndefOr[SegmentButtonLayout] = js.native
    var onClick: js.Any = js.native
    /* CompleteClass */
    override var `type`: submit | reset | button = js.native
    /**
      * The value of the segment button.
      */
    var value: String = js.native
    def checkedChanged(checked: Boolean, prev: Boolean): Unit = js.native
    @JSName("render")
    def render_MSegmentButton(): js.Any = js.native
  }
  
}

