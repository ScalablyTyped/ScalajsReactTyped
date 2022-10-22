package typingsJapgolly.reduxDevtoolsDockMonitor

import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxDevtoolsDockMonitor.anon.PartialDockMonitorState
import typingsJapgolly.reduxDevtoolsDockMonitor.libActionsMod.DockMonitorAction
import typingsJapgolly.reduxDevtoolsDockMonitor.libDockMonitorMod.DockMonitorProps
import typingsJapgolly.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.bottom
import typingsJapgolly.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.left
import typingsJapgolly.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.right
import typingsJapgolly.reduxDevtoolsDockMonitor.reduxDevtoolsDockMonitorStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReducersMod {
  
  @JSImport("redux-devtools-dock-monitor/lib/reducers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S, A /* <: Action[Any] */](props: DockMonitorProps[S, A], state: Unit, action: DockMonitorAction): DockMonitorState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[DockMonitorState]
  inline def default[S, A /* <: Action[Any] */](props: DockMonitorProps[S, A], state: PartialDockMonitorState, action: DockMonitorAction): DockMonitorState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[DockMonitorState]
  
  trait DockMonitorState extends StObject {
    
    var childMonitorIndex: Double
    
    var childMonitorStates: js.Array[Any]
    
    var isVisible: Boolean
    
    var position: left | top | right | bottom
    
    var size: Double
  }
  object DockMonitorState {
    
    inline def apply(
      childMonitorIndex: Double,
      childMonitorStates: js.Array[Any],
      isVisible: Boolean,
      position: left | top | right | bottom,
      size: Double
    ): DockMonitorState = {
      val __obj = js.Dynamic.literal(childMonitorIndex = childMonitorIndex.asInstanceOf[js.Any], childMonitorStates = childMonitorStates.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[DockMonitorState]
    }
    
    extension [Self <: DockMonitorState](x: Self) {
      
      inline def setChildMonitorIndex(value: Double): Self = StObject.set(x, "childMonitorIndex", value.asInstanceOf[js.Any])
      
      inline def setChildMonitorStates(value: js.Array[Any]): Self = StObject.set(x, "childMonitorStates", value.asInstanceOf[js.Any])
      
      inline def setChildMonitorStatesVarargs(value: Any*): Self = StObject.set(x, "childMonitorStates", js.Array(value*))
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: left | top | right | bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
