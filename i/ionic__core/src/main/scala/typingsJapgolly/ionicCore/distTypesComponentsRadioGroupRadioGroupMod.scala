package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsRadioGroupRadioGroupInterfaceMod.RadioGroupChangeEventDetail
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsRadioGroupRadioGroupMod {
  
  @JSImport("@ionic/core/dist/types/components/radio-group/radio-group", "RadioGroup")
  @js.native
  open class RadioGroup ()
    extends StObject
       with ComponentInterface {
    
    /**
      * If `true`, the radios can be deselected.
      */
    var allowEmptySelection: Boolean = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MRadioGroup(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MRadioGroup(): js.Promise[Unit] = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var getRadios: Any = js.native
    
    /* private */ var inputId: Any = js.native
    
    /**
      * Emitted when the value has changed.
      */
    var ionChange: EventEmitter[RadioGroupChangeEventDetail[Any]] = js.native
    
    /* private */ var label: Any = js.native
    
    /* private */ var labelId: Any = js.native
    
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    
    /* private */ var onClick: Any = js.native
    
    def onKeydown(ev: Any): Unit = js.native
    
    @JSName("render")
    def render_MRadioGroup(): Any = js.native
    
    /* private */ var setRadioTabindex: Any = js.native
    
    /**
      * the value of the radio group.
      */
    var value: js.UndefOr[Any | Null] = js.native
    
    def valueChanged(): Unit = js.native
    def valueChanged(value: Any): Unit = js.native
  }
}
