package typingsJapgolly.ionicCore

import org.scalajs.dom.UIEvent
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSelectElement
import typingsJapgolly.ionicCore.distTypesComponentsSelectSelectInterfaceMod.SelectChangeEventDetail
import typingsJapgolly.ionicCore.distTypesComponentsSelectSelectInterfaceMod.SelectCompareFn
import typingsJapgolly.ionicCore.distTypesComponentsSelectSelectInterfaceMod.SelectInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.mod.StyleEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsSelectSelectMod {
  
  @JSImport("@ionic/core/dist/types/components/select/select", "Select")
  @js.native
  open class Select ()
    extends StObject
       with ComponentInterface {
    
    /**
      * The text to display on the cancel button.
      */
    var cancelText: String = js.native
    
    /* private */ def childOpts: Any = js.native
    
    /**
      * Close the select interface.
      */
    /* private */ var close: Any = js.native
    
    /**
      * A property name or function used to compare object values
      */
    var compareWith: js.UndefOr[String | SelectCompareFn | Null] = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MSelect(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MSelect(): js.Promise[Unit] = js.native
    
    /* private */ var createActionSheetButtons: Any = js.native
    
    /* private */ var createAlertInputs: Any = js.native
    
    /* private */ var createOverlay: Any = js.native
    
    /* private */ var createPopoverOptions: Any = js.native
    
    /* private */ var didInit: Any = js.native
    
    /**
      * If `true`, the user cannot interact with the select.
      */
    var disabled: Boolean = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MSelect(): Unit = js.native
    
    var el: HTMLIonSelectElement = js.native
    
    /* private */ var emitStyle: Any = js.native
    
    /* private */ var focusEl: Any = js.native
    
    /* private */ var getLabel: Any = js.native
    
    /* private */ var getText: Any = js.native
    
    /* private */ var hasValue: Any = js.native
    
    /* private */ var inputId: Any = js.native
    
    /**
      * The interface the select should use: `action-sheet`, `popover` or `alert`.
      */
    var interface: SelectInterface = js.native
    
    /**
      * Any additional options that the `alert`, `action-sheet` or `popover` interface
      * can take. See the [ion-alert docs](./alert), the
      * [ion-action-sheet docs](./action-sheet) and the
      * [ion-popover docs](./popover) for the
      * create options for each interface.
      *
      * Note: `interfaceOptions` will not override `inputs` or `buttons` with the `alert` interface.
      */
    var interfaceOptions: Any = js.native
    
    /**
      * Emitted when the select loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the selection is cancelled.
      */
    var ionCancel: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the value has changed.
      */
    var ionChange: EventEmitter[SelectChangeEventDetail[Any]] = js.native
    
    /**
      * Emitted when the overlay is dismissed.
      */
    var ionDismiss: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the select has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    
    var isExpanded: Boolean = js.native
    
    /**
      * If `true`, the select can accept multiple values.
      */
    var multiple: Boolean = js.native
    
    /* private */ var mutationO: Any = js.native
    
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    
    /**
      * The text to display on the ok button.
      */
    var okText: String = js.native
    
    /* private */ var onBlur: Any = js.native
    
    /* private */ var onClick: Any = js.native
    
    /* private */ var onFocus: Any = js.native
    
    /**
      * Open the select overlay. The overlay is either an alert, action sheet, or popover,
      * depending on the `interface` property on the `ion-select`.
      *
      * @param event The user interface event that called the open.
      */
    def open(): js.Promise[Any] = js.native
    def open(event: UIEvent): js.Promise[Any] = js.native
    
    /* private */ var openActionSheet: Any = js.native
    
    /* private */ var openAlert: Any = js.native
    
    /* private */ var openPopover: Any = js.native
    
    /* private */ var overlay: Any = js.native
    
    /**
      * The text to display when the select is empty.
      */
    var placeholder: js.UndefOr[String] = js.native
    
    @JSName("render")
    def render_MSelect(): Any = js.native
    
    /**
      * The text to display instead of the selected option's value.
      */
    var selectedText: js.UndefOr[String | Null] = js.native
    
    /* private */ var setFocus: Any = js.native
    
    def styleChanged(): Unit = js.native
    
    /* private */ var updateOverlayOptions: Any = js.native
    
    /**
      * the value of the select.
      */
    var value: js.UndefOr[Any | Null] = js.native
    
    def valueChanged(): Unit = js.native
  }
}
