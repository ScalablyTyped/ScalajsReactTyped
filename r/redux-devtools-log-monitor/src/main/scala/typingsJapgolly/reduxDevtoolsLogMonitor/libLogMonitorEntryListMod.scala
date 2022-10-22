package typingsJapgolly.reduxDevtoolsLogMonitor

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.base16.mod.Base16Theme
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxDevtoolsInstrument.mod.PerformAction
import typingsJapgolly.reduxDevtoolsLogMonitor.anon.ActionsById
import typingsJapgolly.reduxDevtoolsLogMonitor.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLogMonitorEntryListMod {
  
  @JSImport("redux-devtools-log-monitor/lib/LogMonitorEntryList", JSImport.Default)
  @js.native
  open class default[S, A /* <: Action[Any] */] () extends LogMonitorEntryList[S, A]
  /* static members */
  object default {
    
    @JSImport("redux-devtools-log-monitor/lib/LogMonitorEntryList", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("redux-devtools-log-monitor/lib/LogMonitorEntryList", "default.propTypes")
    @js.native
    def propTypes: ActionsById = js.native
    inline def propTypes_=(x: ActionsById): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LogMonitorEntryList[S, A /* <: Action[Any] */]
    extends PureComponent[Props[S, A], js.Object, Any]
  
  trait Props[S, A /* <: Action[Any] */] extends StObject {
    
    var actionsById: NumberDictionary[PerformAction[A]]
    
    var computedStates: js.Array[Error[S]]
    
    var consecutiveToggleStartId: js.UndefOr[Double | Null] = js.undefined
    
    var currentStateIndex: Double
    
    var expandActionRoot: Boolean
    
    var expandStateRoot: Boolean
    
    var markStateDiff: Boolean
    
    def onActionClick(id: Double): Unit
    
    def onActionShiftClick(id: Double): Unit
    
    def select(state: S): Any
    
    var skippedActionIds: js.Array[Double]
    
    var stagedActionIds: js.Array[Double]
    
    var theme: Base16Theme
  }
  object Props {
    
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
    ): Props[S, A] = {
      val __obj = js.Dynamic.literal(actionsById = actionsById.asInstanceOf[js.Any], computedStates = computedStates.asInstanceOf[js.Any], currentStateIndex = currentStateIndex.asInstanceOf[js.Any], expandActionRoot = expandActionRoot.asInstanceOf[js.Any], expandStateRoot = expandStateRoot.asInstanceOf[js.Any], markStateDiff = markStateDiff.asInstanceOf[js.Any], onActionClick = js.Any.fromFunction1((t0: Double) => onActionClick(t0).runNow()), onActionShiftClick = js.Any.fromFunction1((t0: Double) => onActionShiftClick(t0).runNow()), select = js.Any.fromFunction1(select), skippedActionIds = skippedActionIds.asInstanceOf[js.Any], stagedActionIds = stagedActionIds.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[S, A]]
    }
    
    extension [Self <: Props[?, ?], S, A /* <: Action[Any] */](x: Self & (Props[S, A])) {
      
      inline def setActionsById(value: NumberDictionary[PerformAction[A]]): Self = StObject.set(x, "actionsById", value.asInstanceOf[js.Any])
      
      inline def setComputedStates(value: js.Array[Error[S]]): Self = StObject.set(x, "computedStates", value.asInstanceOf[js.Any])
      
      inline def setComputedStatesVarargs(value: Error[S]*): Self = StObject.set(x, "computedStates", js.Array(value*))
      
      inline def setConsecutiveToggleStartId(value: Double): Self = StObject.set(x, "consecutiveToggleStartId", value.asInstanceOf[js.Any])
      
      inline def setConsecutiveToggleStartIdNull: Self = StObject.set(x, "consecutiveToggleStartId", null)
      
      inline def setConsecutiveToggleStartIdUndefined: Self = StObject.set(x, "consecutiveToggleStartId", js.undefined)
      
      inline def setCurrentStateIndex(value: Double): Self = StObject.set(x, "currentStateIndex", value.asInstanceOf[js.Any])
      
      inline def setExpandActionRoot(value: Boolean): Self = StObject.set(x, "expandActionRoot", value.asInstanceOf[js.Any])
      
      inline def setExpandStateRoot(value: Boolean): Self = StObject.set(x, "expandStateRoot", value.asInstanceOf[js.Any])
      
      inline def setMarkStateDiff(value: Boolean): Self = StObject.set(x, "markStateDiff", value.asInstanceOf[js.Any])
      
      inline def setOnActionClick(value: Double => Callback): Self = StObject.set(x, "onActionClick", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setOnActionShiftClick(value: Double => Callback): Self = StObject.set(x, "onActionShiftClick", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSelect(value: S => Any): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSkippedActionIds(value: js.Array[Double]): Self = StObject.set(x, "skippedActionIds", value.asInstanceOf[js.Any])
      
      inline def setSkippedActionIdsVarargs(value: Double*): Self = StObject.set(x, "skippedActionIds", js.Array(value*))
      
      inline def setStagedActionIds(value: js.Array[Double]): Self = StObject.set(x, "stagedActionIds", value.asInstanceOf[js.Any])
      
      inline def setStagedActionIdsVarargs(value: Double*): Self = StObject.set(x, "stagedActionIds", js.Array(value*))
      
      inline def setTheme(value: Base16Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
