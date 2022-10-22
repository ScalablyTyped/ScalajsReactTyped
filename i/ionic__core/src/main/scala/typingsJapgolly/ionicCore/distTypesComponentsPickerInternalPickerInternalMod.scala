package typingsJapgolly.ionicCore

import org.scalajs.dom.TouchEvent
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonPickerInternalElement
import typingsJapgolly.ionicCore.distTypesComponentsPickerInternalPickerInternalInterfacesMod.PickerInternalChangeEventDetail
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsPickerInternalPickerInternalMod {
  
  @JSImport("@ionic/core/dist/types/components/picker-internal/picker-internal", "PickerInternal")
  @js.native
  open class PickerInternal ()
    extends StObject
       with ComponentInterface {
    
    /* private */ var actionOnClick: Any = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MPickerInternal(): Unit = js.native
    
    /* private */ var destroyKeypressListener: Any = js.native
    
    var el: HTMLIonPickerInternalElement = js.native
    
    /**
      * Emit ionInputModeChange. Picker columns
      * listen for this event to determine whether
      * or not their column is "active" for text input.
      */
    /* private */ var emitInputModeChange: Any = js.native
    
    /**
      * Enters input mode to allow
      * for text entry of numeric values.
      * If on mobile, we focus a hidden input
      * field so that the on screen keyboard
      * is brought up. When tabbing using a
      * keyboard, picker columns receive an outline
      * to indicate they are focused. As a result,
      * we should not focus the hidden input as it
      * would cause the outline to go away, preventing
      * users from having any visual indication of which
      * column is focused.
      */
    /* private */ var enterInputMode: Any = js.native
    
    /* private */ var exitInputMode: Any = js.native
    
    /* private */ var highlightEl: Any = js.native
    
    /* private */ var inputEl: Any = js.native
    
    /* private */ var inputModeColumn: Any = js.native
    
    var ionInputModeChange: EventEmitter[PickerInternalChangeEventDetail] = js.native
    
    /* private */ var isInHighlightBounds: Any = js.native
    
    /**
      * On click we need to run an actionOnClick
      * function that has been set in onPointerDown
      * so that we enter/exit input mode correctly.
      */
    /* private */ var onClick: Any = js.native
    
    /**
      * When picker columns receive focus
      * the parent picker needs to determine
      * whether to enter/exit input mode.
      */
    /* private */ var onFocusIn: Any = js.native
    
    /**
      * If we are no longer focused
      * on a picker column, then we should
      * exit input mode. An exception is made
      * for the input in the picker since having
      * that focused means we are still in input mode.
      */
    /* private */ var onFocusOut: Any = js.native
    
    /**
      * Searches the value of the active column
      * to determine which value users are trying
      * to select
      */
    /* private */ var onInputChange: Any = js.native
    
    /* private */ var onKeyPress: Any = js.native
    
    /**
      * Clicking a column also focuses the column on
      * certain browsers, so we use onPointerDown
      * to tell the onFocusIn function that users
      * are trying to click the column rather than
      * focus the column using the keyboard. When the
      * user completes the click, the onClick function
      * runs and runs the actionOnClick callback.
      */
    /* private */ var onPointerDown: Any = js.native
    
    /**
      * When the picker is interacted with
      * we need to prevent touchstart so other
      * gestures do not fire. For example,
      * scrolling on the wheel picker
      * in ion-datetime should not cause
      * a card modal to swipe to close.
      */
    def preventTouchStartPropagation(ev: TouchEvent): Unit = js.native
    
    @JSName("render")
    def render_MPickerInternal(): Any = js.native
    
    /**
      * Searches a list of column items for a particular
      * value. This is currently used for numeric values.
      * The zeroBehavior can be set to account for leading
      * or trailing zeros when looking at the item text.
      */
    /* private */ var searchColumn: Any = js.native
    
    /* private */ var selectMultiColumn: Any = js.native
    
    /* private */ var selectSingleColumn: Any = js.native
    
    /* private */ var singleColumnSearchTimeout: Any = js.native
    
    /* private */ var useInputMode: Any = js.native
  }
}
