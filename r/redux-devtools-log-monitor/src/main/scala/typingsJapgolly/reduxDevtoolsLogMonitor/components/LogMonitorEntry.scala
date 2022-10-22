package typingsJapgolly.reduxDevtoolsLogMonitor.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.base16.mod.Base16Theme
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxDevtoolsLogMonitor.libLogMonitorEntryMod.Props
import typingsJapgolly.reduxDevtoolsLogMonitor.libLogMonitorEntryMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LogMonitorEntry {
  
  inline def apply[S, A /* <: Action[Any] */](
    action: A,
    actionId: Double,
    collapsed: Boolean,
    expandActionRoot: Boolean,
    expandStateRoot: Boolean,
    inFuture: Boolean,
    markStateDiff: Boolean,
    onActionClick: Double => Callback,
    onActionShiftClick: Double => Callback,
    select: Any => Any,
    selected: Boolean,
    state: S,
    theme: Base16Theme
  ): Builder[S, A] = {
    val __props = js.Dynamic.literal(action = action.asInstanceOf[js.Any], actionId = actionId.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], expandActionRoot = expandActionRoot.asInstanceOf[js.Any], expandStateRoot = expandStateRoot.asInstanceOf[js.Any], inFuture = inFuture.asInstanceOf[js.Any], markStateDiff = markStateDiff.asInstanceOf[js.Any], onActionClick = js.Any.fromFunction1((t0: Double) => onActionClick(t0).runNow()), onActionShiftClick = js.Any.fromFunction1((t0: Double) => onActionShiftClick(t0).runNow()), select = js.Any.fromFunction1(select), selected = selected.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    new Builder[S, A](js.Array(this.component, __props.asInstanceOf[Props[S, A]]))
  }
  
  @JSImport("redux-devtools-log-monitor/lib/LogMonitorEntry", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[S, A /* <: Action[Any] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[S, A]] {
    
    inline def error(value: String): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def previousState(value: S): this.type = set("previousState", value.asInstanceOf[js.Any])
  }
  
  def withProps[S, A /* <: Action[Any] */](p: Props[S, A]): Builder[S, A] = new Builder[S, A](js.Array(this.component, p.asInstanceOf[js.Any]))
}
