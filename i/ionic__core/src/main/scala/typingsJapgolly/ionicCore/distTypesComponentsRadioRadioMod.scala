package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRadioElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.mod.StyleEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsRadioRadioMod {
  
  @JSImport("@ionic/core/dist/types/components/radio/radio", "Radio")
  @js.native
  open class Radio ()
    extends StObject
       with ComponentInterface {
    
    /**
      * The tabindex of the radio button.
      * @internal
      */
    var buttonTabindex: Double = js.native
    
    /**
      * If `true`, the radio is selected.
      */
    var checked: Boolean = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MRadio(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MRadio(): Unit = js.native
    
    /**
      * If `true`, the user cannot interact with the radio.
      */
    var disabled: Boolean = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MRadio(): Unit = js.native
    
    var el: HTMLIonRadioElement = js.native
    
    def emitStyle(): Unit = js.native
    
    /* private */ var inputId: Any = js.native
    
    /**
      * Emitted when the radio button loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the radio button has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    
    /* private */ var nativeInput: Any = js.native
    
    /* private */ var onBlur: Any = js.native
    
    /* private */ var onClick: Any = js.native
    
    /* private */ var onFocus: Any = js.native
    
    /* private */ var radioGroup: Any = js.native
    
    @JSName("render")
    def render_MRadio(): Any = js.native
    
    /** @internal */
    def setButtonTabindex(value: Double): js.Promise[Unit] = js.native
    
    /** @internal */
    def setFocus(ev: Any): js.Promise[Unit] = js.native
    
    /* private */ var updateState: Any = js.native
    
    /**
      * the value of the radio.
      */
    var value: js.UndefOr[Any | Null] = js.native
  }
}
