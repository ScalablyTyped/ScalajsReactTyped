package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsPickerPickerInterfaceMod.PickerColumn
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsPickerColumnPickerColumnMod {
  
  @JSImport("@ionic/core/dist/types/components/picker-column/picker-column", "PickerColumnCmp")
  @js.native
  open class PickerColumnCmp ()
    extends StObject
       with ComponentInterface {
    
    /* private */ var bounceFrom: Any = js.native
    
    /** Picker column data */
    var col: PickerColumn = js.native
    
    /* protected */ def colChanged(): Unit = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MPickerColumnCmp(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MPickerColumnCmp(): js.Promise[Unit] = js.native
    
    /* private */ var decelerate: Any = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MPickerColumnCmp(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var emitColChange: Any = js.native
    
    /* private */ var gesture: Any = js.native
    
    /* private */ var indexForY: Any = js.native
    
    /**
      * Emitted when the selected value has changed
      * @internal
      */
    var ionPickerColChange: EventEmitter[PickerColumn] = js.native
    
    /* private */ var lastIndex: Any = js.native
    
    /* private */ var maxY: Any = js.native
    
    /* private */ var minY: Any = js.native
    
    /* private */ var noAnimate: Any = js.native
    
    /* private */ var onEnd: Any = js.native
    
    /* private */ var onMove: Any = js.native
    
    /* private */ var onStart: Any = js.native
    
    /* private */ var optHeight: Any = js.native
    
    /* private */ var optsEl: Any = js.native
    
    /* private */ var rafId: Any = js.native
    
    /* private */ var refresh: Any = js.native
    
    @JSName("render")
    def render_MPickerColumnCmp(): Any = js.native
    
    /* private */ var rotateFactor: Any = js.native
    
    /* private */ var scaleFactor: Any = js.native
    
    /* private */ var setSelected: Any = js.native
    
    /* private */ var tmrId: Any = js.native
    
    /* private */ var update: Any = js.native
    
    /* private */ var velocity: Any = js.native
    
    /* private */ var y: Any = js.native
  }
}
