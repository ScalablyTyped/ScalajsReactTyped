package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonPickerColumnInternalElement
import typingsJapgolly.ionicCore.distTypesComponentsPickerColumnInternalPickerColumnInternalInterfacesMod.PickerColumnItem
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsPickerColumnInternalPickerColumnInternalMod {
  
  @JSImport("@ionic/core/dist/types/components/picker-column-internal/picker-column-internal", "PickerColumnInternal")
  @js.native
  open class PickerColumnInternal ()
    extends StObject
       with ComponentInterface {
    
    def activeItem: HTMLElement | Null = js.native
    
    /* private */ var centerPickerItemInView: Any = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentDidRender")
    def componentDidRender_MPickerColumnInternal(): Unit = js.native
    
    /**
      * Only setup scroll listeners
      * when the picker is visible, otherwise
      * the container will have a scroll
      * height of 0px.
      */
    @JSName("componentWillLoad")
    def componentWillLoad_MPickerColumnInternal(): Unit = js.native
    
    /* private */ var destroyScrollListener: Any = js.native
    
    var el: HTMLIonPickerColumnInternalElement = js.native
    
    /**
      * When the column scrolls, the component
      * needs to determine which item is centered
      * in the view and will emit an ionChange with
      * the item object.
      */
    /* private */ var initializeScrollListener: Any = js.native
    
    /**
      * When ionInputModeChange is emitted, each column
      * needs to check if it is the one being made available
      * for text entry.
      */
    /* private */ var inputModeChange: Any = js.native
    
    /**
      * Emitted when the value has changed.
      */
    var ionChange: EventEmitter[PickerColumnItem] = js.native
    
    var isActive: Boolean = js.native
    
    /* private */ var isColumnVisible: Any = js.native
    
    /* private */ var isScrolling: Any = js.native
    
    /**
      * A list of options to be displayed in the picker
      */
    var items: js.Array[PickerColumnItem] = js.native
    
    def itemsChange(currentItems: js.Array[PickerColumnItem], previousItems: js.Array[PickerColumnItem]): Unit = js.native
    
    /**
      * If `true`, tapping the picker will
      * reveal a number input keyboard that lets
      * the user type in values for each picker
      * column. This is useful when working
      * with time pickers.
      *
      * @internal
      */
    var numericInput: Boolean = js.native
    
    @JSName("render")
    def render_MPickerColumnInternal(): Any = js.native
    
    /** @internal  */
    def scrollActiveItemIntoView(): js.Promise[Unit] = js.native
    
    /* private */ var scrollEndCallback: Any = js.native
    
    /**
      * Setting isActive will cause a re-render.
      * As a result, we do not want to cause the
      * re-render mid scroll as this will cause
      * the picker column to jump back to
      * whatever value was selected at the
      * start of the scroll interaction.
      */
    /* private */ var setInputModeActive: Any = js.native
    
    /**
      * Sets the value prop and fires the ionChange event.
      * This is used when we need to fire ionChange from
      * user-generated events that cannot be caught with normal
      * input/change event listeners.
      * @internal
      */
    def setValue(): js.Promise[Unit] = js.native
    def setValue(value: String): js.Promise[Unit] = js.native
    def setValue(value: Double): js.Promise[Unit] = js.native
    
    /**
      * The selected option in the picker.
      */
    var value: js.UndefOr[String | Double] = js.native
    
    def valueChange(): Unit = js.native
  }
}
