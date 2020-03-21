package typingsJapgolly.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ionicCore.pickerInterfaceMod.PickerColumn
import typingsJapgolly.ionicCore.stencilCoreMod.ComponentInterface
import typingsJapgolly.ionicCore.stencilCoreMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/picker-column/picker-column", JSImport.Namespace)
@js.native
object pickerColumnMod extends js.Object {
  @js.native
  class PickerColumnCmp () extends ComponentInterface {
    var bounceFrom: js.Any = js.native
    /** Picker column data */
    var col: PickerColumn = js.native
    var decelerate: js.Any = js.native
    var el: HTMLElement = js.native
    var emitColChange: js.Any = js.native
    var gesture: js.UndefOr[js.Any] = js.native
    var indexForY: js.Any = js.native
    /**
      * Emitted when the selected value has changed
      * @internal
      */
    var ionPickerColChange: EventEmitter[PickerColumn] = js.native
    var lastIndex: js.UndefOr[js.Any] = js.native
    var maxY: js.Any = js.native
    var minY: js.Any = js.native
    var noAnimate: js.Any = js.native
    var onEnd: js.Any = js.native
    var onMove: js.Any = js.native
    var onStart: js.Any = js.native
    var optHeight: js.Any = js.native
    var optsEl: js.UndefOr[js.Any] = js.native
    var rafId: js.Any = js.native
    var refresh: js.Any = js.native
    var rotateFactor: js.Any = js.native
    var scaleFactor: js.Any = js.native
    var setSelected: js.Any = js.native
    var tmrId: js.Any = js.native
    var update: js.Any = js.native
    var velocity: js.Any = js.native
    var y: js.Any = js.native
    /* protected */ def colChanged(): Unit = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MPickerColumnCmp(): Unit = js.native
    @JSName("connectedCallback")
    def connectedCallback_MPickerColumnCmp(): js.Promise[Unit] = js.native
    @JSName("disconnectedCallback")
    def disconnectedCallback_MPickerColumnCmp(): Unit = js.native
    @JSName("render")
    def render_MPickerColumnCmp(): js.Any = js.native
  }
  
}

