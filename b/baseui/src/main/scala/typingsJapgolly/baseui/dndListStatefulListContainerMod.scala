package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.baseui.anon.ItemsArray
import typingsJapgolly.baseui.anon.NewState
import typingsJapgolly.baseui.anon.OldIndex
import typingsJapgolly.baseui.anon.OmitListPropschildren
import typingsJapgolly.baseui.dndListTypesMod.ListOverrides
import typingsJapgolly.baseui.dndListTypesMod.State
import typingsJapgolly.baseui.dndListTypesMod.StateChangeType
import typingsJapgolly.baseui.dndListTypesMod.StateReducer
import typingsJapgolly.baseui.dndListTypesMod.StatefulComponentContainerProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dndListStatefulListContainerMod {
  
  @JSImport("baseui/dnd-list/stateful-list-container", JSImport.Default)
  @js.native
  open class default () extends StatefulListContainer
  object default {
    
    /* static member */
    /* Inlined std.Partial<baseui.baseui/dnd-list/types.StatefulComponentContainerProps> */
    object defaultProps {
      
      @JSImport("baseui/dnd-list/stateful-list-container", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/dnd-list/stateful-list-container", "default.defaultProps.children")
      @js.native
      def children: js.UndefOr[js.Function1[/* props */ OmitListPropschildren, Node]] = js.native
      inline def children_=(x: js.UndefOr[js.Function1[/* props */ OmitListPropschildren, Node]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/dnd-list/stateful-list-container", "default.defaultProps.initialState")
      @js.native
      def initialState: js.UndefOr[State] = js.native
      inline def initialState_=(x: js.UndefOr[State]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialState")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/dnd-list/stateful-list-container", "default.defaultProps.onChange")
      @js.native
      def onChange: js.UndefOr[js.Function1[/* params */ NewState, Any]] = js.native
      inline def onChange_=(x: js.UndefOr[js.Function1[/* params */ NewState, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/dnd-list/stateful-list-container", "default.defaultProps.overrides")
      @js.native
      def overrides: js.UndefOr[ListOverrides] = js.native
      inline def overrides_=(x: js.UndefOr[ListOverrides]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/dnd-list/stateful-list-container", "default.defaultProps.removable")
      @js.native
      def removable: js.UndefOr[Boolean] = js.native
      
      @JSImport("baseui/dnd-list/stateful-list-container", "default.defaultProps.removableByMove")
      @js.native
      def removableByMove: js.UndefOr[Boolean] = js.native
      inline def removableByMove_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removableByMove")(x.asInstanceOf[js.Any])
      
      inline def removable_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removable")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/dnd-list/stateful-list-container", "default.defaultProps.stateReducer")
      @js.native
      def stateReducer: js.UndefOr[StateReducer] = js.native
      inline def stateReducer_=(x: js.UndefOr[StateReducer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StatefulListContainer extends Component[StatefulComponentContainerProps, State, Any] {
    
    def internalSetState(`type`: StateChangeType, changes: State): Unit = js.native
    
    def onChange(hasOldIndexNewIndexTargetRect: OldIndex): Unit = js.native
    
    @JSName("state")
    var state_StatefulListContainer: ItemsArray = js.native
  }
}
