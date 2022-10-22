package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsToggleToggleInterfaceMod.ToggleChangeEventDetail
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.mod.StyleEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsToggleToggleMod {
  
  @JSImport("@ionic/core/dist/types/components/toggle/toggle", "Toggle")
  @js.native
  open class Toggle ()
    extends StObject
       with ComponentInterface {
    
    var activated: Boolean = js.native
    
    /**
      * If `true`, the toggle is selected.
      */
    var checked: Boolean = js.native
    
    def checkedChanged(isChecked: Boolean): Unit = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MToggle(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MToggle(): js.Promise[Unit] = js.native
    
    /**
      * If `true`, the user cannot interact with the toggle.
      */
    var disabled: Boolean = js.native
    
    def disabledChanged(): Unit = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MToggle(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var emitStyle: Any = js.native
    
    /**
      * Enables the on/off accessibility switch labels within the toggle.
      */
    var enableOnOffLabels: js.UndefOr[Boolean] = js.native
    
    /* private */ var focusEl: Any = js.native
    
    /* private */ var gesture: Any = js.native
    
    /* private */ var getSwitchLabelIcon: Any = js.native
    
    /* private */ var getValue: Any = js.native
    
    /* private */ var inputId: Any = js.native
    
    /**
      * Emitted when the toggle loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the value property has changed.
      */
    var ionChange: EventEmitter[ToggleChangeEventDetail[Any]] = js.native
    
    /**
      * Emitted when the toggle has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    
    /* private */ var lastDrag: Any = js.native
    
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    
    /* private */ var onBlur: Any = js.native
    
    /* private */ var onClick: Any = js.native
    
    /* private */ var onEnd: Any = js.native
    
    /* private */ var onFocus: Any = js.native
    
    /* private */ var onMove: Any = js.native
    
    /* private */ var onStart: Any = js.native
    
    /* private */ var renderOnOffSwitchLabels: Any = js.native
    
    @JSName("render")
    def render_MToggle(): Any = js.native
    
    /* private */ var setFocus: Any = js.native
    
    /**
      * The value of the toggle does not mean if it's checked or not, use the `checked`
      * property for that.
      *
      * The value of a toggle is analogous to the value of a `<input type="checkbox">`,
      * it's only used when the toggle participates in a native `<form>`.
      */
    var value: js.UndefOr[String | Null] = js.native
  }
}
