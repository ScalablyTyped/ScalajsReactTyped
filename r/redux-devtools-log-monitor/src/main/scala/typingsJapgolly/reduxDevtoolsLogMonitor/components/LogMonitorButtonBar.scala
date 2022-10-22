package typingsJapgolly.reduxDevtoolsLogMonitor.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.base16.mod.Base16Theme
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxDevtoolsInstrument.mod.LiftedAction
import typingsJapgolly.reduxDevtoolsLogMonitor.libActionsMod.LogMonitorAction
import typingsJapgolly.reduxDevtoolsLogMonitor.libLogMonitorButtonBarMod.Props
import typingsJapgolly.reduxDevtoolsLogMonitor.libLogMonitorButtonBarMod.default
import typingsJapgolly.reduxDevtoolsLogMonitor.libReducersMod.LogMonitorState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LogMonitorButtonBar {
  
  inline def apply[S, A /* <: Action[Any] */](
    dispatch: LogMonitorAction | (LiftedAction[S, A, LogMonitorState]) => LogMonitorAction | (LiftedAction[S, A, LogMonitorState]),
    hasSkippedActions: Boolean,
    hasStates: Boolean,
    theme: Base16Theme
  ): Builder[S, A] = {
    val __props = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), hasSkippedActions = hasSkippedActions.asInstanceOf[js.Any], hasStates = hasStates.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    new Builder[S, A](js.Array(this.component, __props.asInstanceOf[Props[S, A]]))
  }
  
  @JSImport("redux-devtools-log-monitor/lib/LogMonitorButtonBar", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[S, A /* <: Action[Any] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[S, A]]
  
  def withProps[S, A /* <: Action[Any] */](p: Props[S, A]): Builder[S, A] = new Builder[S, A](js.Array(this.component, p.asInstanceOf[js.Any]))
}
