package typingsJapgolly.baseui

import typingsJapgolly.baseui.accordionTypesMod.OnChangeHandler
import typingsJapgolly.baseui.accordionTypesMod.PanelState
import typingsJapgolly.baseui.accordionTypesMod.PanelStateReducer
import typingsJapgolly.baseui.accordionTypesMod.StateChangeType
import typingsJapgolly.baseui.accordionTypesMod.StatefulPanelContainerProps
import typingsJapgolly.baseui.anon.ExpandedBoolean
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionStatefulPanelContainerMod {
  
  @JSImport("baseui/accordion/stateful-panel-container", JSImport.Default)
  @js.native
  open class default () extends StatefulPanelContainer
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/accordion/stateful-panel-container", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/accordion/stateful-panel-container", "default.defaultProps.initialState")
      @js.native
      def initialState: ExpandedBoolean = js.native
      inline def initialState_=(x: ExpandedBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialState")(x.asInstanceOf[js.Any])
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      @JSImport("baseui/accordion/stateful-panel-container", "default.defaultProps.stateReducer")
      @js.native
      def stateReducer: PanelStateReducer = js.native
      inline def stateReducer_=(x: PanelStateReducer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StatefulPanelContainer extends Component[StatefulPanelContainerProps, PanelState, Any] {
    
    def internalSetState(`type`: StateChangeType, changes: PanelState): Unit = js.native
    
    var onChange: OnChangeHandler = js.native
    
    @JSName("state")
    var state_StatefulPanelContainer: ExpandedBoolean = js.native
  }
}
