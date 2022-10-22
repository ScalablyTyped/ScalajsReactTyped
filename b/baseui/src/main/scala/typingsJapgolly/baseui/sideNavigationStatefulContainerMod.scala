package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.EventItem
import typingsJapgolly.baseui.sideNavigationTypesMod.State
import typingsJapgolly.baseui.sideNavigationTypesMod.StateReducer
import typingsJapgolly.baseui.sideNavigationTypesMod.StateType
import typingsJapgolly.baseui.sideNavigationTypesMod.StatefulContainerProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sideNavigationStatefulContainerMod {
  
  @JSImport("baseui/side-navigation/stateful-container", JSImport.Default)
  @js.native
  open class default () extends StatefulContainer
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/side-navigation/stateful-container", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      @JSImport("baseui/side-navigation/stateful-container", "default.defaultProps.stateReducer")
      @js.native
      def stateReducer: StateReducer = js.native
      inline def stateReducer_=(x: StateReducer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StatefulContainer extends Component[StatefulContainerProps, State, Any] {
    
    def internalSetState(`type`: StateType, item: Any): Unit = js.native
    
    def onChange(params: EventItem): Unit = js.native
  }
}
