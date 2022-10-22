package typingsJapgolly.reduxDevtoolsLogMonitor

import typingsJapgolly.base16.mod.Base16Theme
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxDevtoolsInstrument.mod.LiftedAction
import typingsJapgolly.reduxDevtoolsLogMonitor.anon.Dispatch
import typingsJapgolly.reduxDevtoolsLogMonitor.libActionsMod.LogMonitorAction
import typingsJapgolly.reduxDevtoolsLogMonitor.libReducersMod.LogMonitorState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLogMonitorButtonBarMod {
  
  @JSImport("redux-devtools-log-monitor/lib/LogMonitorButtonBar", JSImport.Default)
  @js.native
  open class default[S, A /* <: Action[Any] */] () extends LogMonitorButtonBar[S, A]
  /* static members */
  object default {
    
    @JSImport("redux-devtools-log-monitor/lib/LogMonitorButtonBar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("redux-devtools-log-monitor/lib/LogMonitorButtonBar", "default.propTypes")
    @js.native
    def propTypes: Dispatch = js.native
    inline def propTypes_=(x: Dispatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LogMonitorButtonBar[S, A /* <: Action[Any] */]
    extends PureComponent[Props[S, A], js.Object, Any] {
    
    def handleCommit(): Unit = js.native
    
    def handleReset(): Unit = js.native
    
    def handleRollback(): Unit = js.native
    
    def handleSweep(): Unit = js.native
  }
  
  trait Props[S, A /* <: Action[Any] */] extends StObject {
    
    var dispatch: typingsJapgolly.redux.mod.Dispatch[LogMonitorAction | (LiftedAction[S, A, LogMonitorState])]
    
    var hasSkippedActions: Boolean
    
    var hasStates: Boolean
    
    var theme: Base16Theme
  }
  object Props {
    
    inline def apply[S, A /* <: Action[Any] */](
      dispatch: LogMonitorAction | (LiftedAction[S, A, LogMonitorState]) => LogMonitorAction | (LiftedAction[S, A, LogMonitorState]),
      hasSkippedActions: Boolean,
      hasStates: Boolean,
      theme: Base16Theme
    ): Props[S, A] = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), hasSkippedActions = hasSkippedActions.asInstanceOf[js.Any], hasStates = hasStates.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[S, A]]
    }
    
    extension [Self <: Props[?, ?], S, A /* <: Action[Any] */](x: Self & (Props[S, A])) {
      
      inline def setDispatch(
        value: LogMonitorAction | (LiftedAction[S, A, LogMonitorState]) => LogMonitorAction | (LiftedAction[S, A, LogMonitorState])
      ): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setHasSkippedActions(value: Boolean): Self = StObject.set(x, "hasSkippedActions", value.asInstanceOf[js.Any])
      
      inline def setHasStates(value: Boolean): Self = StObject.set(x, "hasStates", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Base16Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
