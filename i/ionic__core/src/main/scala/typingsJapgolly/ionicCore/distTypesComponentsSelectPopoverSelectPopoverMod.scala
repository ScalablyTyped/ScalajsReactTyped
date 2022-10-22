package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsSelectPopoverSelectPopoverInterfaceMod.SelectPopoverOption
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsSelectPopoverSelectPopoverMod {
  
  @JSImport("@ionic/core/dist/types/components/select-popover/select-popover", "SelectPopover")
  @js.native
  open class SelectPopover ()
    extends StObject
       with ComponentInterface {
    
    /**
      * When an option is selected we need to get the value(s)
      * of the selected option(s) and return it in the option
      * handler
      */
    /* private */ var callOptionHandler: Any = js.native
    
    /* private */ var findOptionFromEvent: Any = js.native
    
    /* private */ var getValues: Any = js.native
    
    /**
      * The header text of the popover
      */
    var header: js.UndefOr[String] = js.native
    
    /**
      * The text content of the popover body
      */
    var message: js.UndefOr[String] = js.native
    
    /**
      * If true, the select accepts multiple values
      */
    var multiple: js.UndefOr[Boolean] = js.native
    
    def onSelect(ev: Any): Unit = js.native
    
    /**
      * An array of options for the popover
      */
    var options: js.Array[SelectPopoverOption] = js.native
    
    /**
      * This is required when selecting a radio that is already
      * selected because it will not trigger the ionChange event
      * but we still want to close the popover
      */
    /* private */ var rbClick: Any = js.native
    
    def renderCheckboxOptions(options: js.Array[SelectPopoverOption]): js.Array[Any] = js.native
    
    def renderOptions(options: js.Array[SelectPopoverOption]): Any = js.native
    
    def renderRadioOptions(options: js.Array[SelectPopoverOption]): Any = js.native
    
    @JSName("render")
    def render_MSelectPopover(): Any = js.native
    
    /* private */ var setChecked: Any = js.native
    
    /**
      * The subheader text of the popover
      */
    var subHeader: js.UndefOr[String] = js.native
  }
}
