package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsCheckboxCheckboxInterfaceMod.CheckboxChangeEventDetail
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.mod.StyleEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsCheckboxCheckboxMod {
  
  @JSImport("@ionic/core/dist/types/components/checkbox/checkbox", "Checkbox")
  @js.native
  open class Checkbox ()
    extends StObject
       with ComponentInterface {
    
    /**
      * If `true`, the checkbox is selected.
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
    def componentWillLoad_MCheckbox(): Unit = js.native
    
    /**
      * If `true`, the user cannot interact with the checkbox.
      */
    var disabled: Boolean = js.native
    
    def disabledChanged(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var emitStyle: Any = js.native
    
    /* private */ var focusEl: Any = js.native
    
    /**
      * If `true`, the checkbox will visually appear as indeterminate.
      */
    var indeterminate: Boolean = js.native
    
    /* private */ var inputId: Any = js.native
    
    /**
      * Emitted when the checkbox loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the checked property has changed.
      */
    var ionChange: EventEmitter[CheckboxChangeEventDetail[Any]] = js.native
    
    /**
      * Emitted when the checkbox has focus.
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
    
    /* private */ var onBlur: Any = js.native
    
    /* private */ var onClick: Any = js.native
    
    /* private */ var onFocus: Any = js.native
    
    @JSName("render")
    def render_MCheckbox(): Any = js.native
    
    /* private */ var setFocus: Any = js.native
    
    /**
      * The value of the checkbox does not mean if it's checked or not, use the `checked`
      * property for that.
      *
      * The value of a checkbox is analogous to the value of an `<input type="checkbox">`,
      * it's only used when the checkbox participates in a native `<form>`.
      */
    var value: Any | Null = js.native
  }
}
