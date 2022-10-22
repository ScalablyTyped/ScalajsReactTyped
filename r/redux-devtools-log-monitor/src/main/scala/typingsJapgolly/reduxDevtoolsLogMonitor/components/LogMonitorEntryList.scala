package typingsJapgolly.reduxDevtoolsLogMonitor.components

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.base16.mod.Base16Theme
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxDevtoolsInstrument.mod.PerformAction
import typingsJapgolly.reduxDevtoolsLogMonitor.anon.Error
import typingsJapgolly.reduxDevtoolsLogMonitor.libLogMonitorEntryListMod.Props
import typingsJapgolly.reduxDevtoolsLogMonitor.libLogMonitorEntryListMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LogMonitorEntryList {
  
  inline def apply[S, A /* <: Action[Any] */](
    actionsById: NumberDictionary[PerformAction[A]],
    computedStates: js.Array[Error[S]],
    currentStateIndex: Double,
    expandActionRoot: Boolean,
    expandStateRoot: Boolean,
    markStateDiff: Boolean,
    onActionClick: Double => Callback,
    onActionShiftClick: Double => Callback,
    select: S => Any,
    skippedActionIds: js.Array[Double],
    stagedActionIds: js.Array[Double],
    theme: Base16Theme
  ): Builder[S, A] = {
    val __props = js.Dynamic.literal(actionsById = actionsById.asInstanceOf[js.Any], computedStates = computedStates.asInstanceOf[js.Any], currentStateIndex = currentStateIndex.asInstanceOf[js.Any], expandActionRoot = expandActionRoot.asInstanceOf[js.Any], expandStateRoot = expandStateRoot.asInstanceOf[js.Any], markStateDiff = markStateDiff.asInstanceOf[js.Any], onActionClick = js.Any.fromFunction1((t0: Double) => onActionClick(t0).runNow()), onActionShiftClick = js.Any.fromFunction1((t0: Double) => onActionShiftClick(t0).runNow()), select = js.Any.fromFunction1(select), skippedActionIds = skippedActionIds.asInstanceOf[js.Any], stagedActionIds = stagedActionIds.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    new Builder[S, A](js.Array(this.component, __props.asInstanceOf[Props[S, A]]))
  }
  
  @JSImport("redux-devtools-log-monitor/lib/LogMonitorEntryList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[S, A /* <: Action[Any] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[S, A]] {
    
    inline def consecutiveToggleStartId(value: Double): this.type = set("consecutiveToggleStartId", value.asInstanceOf[js.Any])
    
    inline def consecutiveToggleStartIdNull: this.type = set("consecutiveToggleStartId", null)
  }
  
  def withProps[S, A /* <: Action[Any] */](p: Props[S, A]): Builder[S, A] = new Builder[S, A](js.Array(this.component, p.asInstanceOf[js.Any]))
}
