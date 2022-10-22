package typingsJapgolly.reduxDevtoolsLogMonitor

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.base16.mod.Base16Theme
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.redux.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLogMonitorEntryMod {
  
  @JSImport("redux-devtools-log-monitor/lib/LogMonitorEntry", JSImport.Default)
  @js.native
  open class default[S, A /* <: Action[Any] */] () extends LogMonitorEntry[S, A]
  /* static members */
  object default {
    
    @JSImport("redux-devtools-log-monitor/lib/LogMonitorEntry", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("redux-devtools-log-monitor/lib/LogMonitorEntry", "default.propTypes")
    @js.native
    def propTypes: typingsJapgolly.reduxDevtoolsLogMonitor.anon.Action = js.native
    inline def propTypes_=(x: typingsJapgolly.reduxDevtoolsLogMonitor.anon.Action): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LogMonitorEntry[S, A /* <: Action[Any] */]
    extends PureComponent[Props[S, A], js.Object, Any] {
    
    var handleActionClick: MouseEventHandler[HTMLDivElement] = js.native
    
    def printState(state: S): Element = js.native
    def printState(state: S, error: String): Element = js.native
    
    def shouldExpandNode(keyPath: js.Array[String | Double], data: Any, level: Double): Boolean = js.native
  }
  
  trait Props[S, A /* <: Action[Any] */] extends StObject {
    
    var action: A
    
    var actionId: Double
    
    var collapsed: Boolean
    
    var error: js.UndefOr[String] = js.undefined
    
    var expandActionRoot: Boolean
    
    var expandStateRoot: Boolean
    
    var inFuture: Boolean
    
    var markStateDiff: Boolean
    
    def onActionClick(id: Double): Unit
    
    def onActionShiftClick(id: Double): Unit
    
    var previousState: js.UndefOr[S] = js.undefined
    
    def select(state: Any): Any
    
    var selected: Boolean
    
    var state: S
    
    var theme: Base16Theme
  }
  object Props {
    
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
    ): Props[S, A] = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], actionId = actionId.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], expandActionRoot = expandActionRoot.asInstanceOf[js.Any], expandStateRoot = expandStateRoot.asInstanceOf[js.Any], inFuture = inFuture.asInstanceOf[js.Any], markStateDiff = markStateDiff.asInstanceOf[js.Any], onActionClick = js.Any.fromFunction1((t0: Double) => onActionClick(t0).runNow()), onActionShiftClick = js.Any.fromFunction1((t0: Double) => onActionShiftClick(t0).runNow()), select = js.Any.fromFunction1(select), selected = selected.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[S, A]]
    }
    
    extension [Self <: Props[?, ?], S, A /* <: Action[Any] */](x: Self & (Props[S, A])) {
      
      inline def setAction(value: A): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionId(value: Double): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExpandActionRoot(value: Boolean): Self = StObject.set(x, "expandActionRoot", value.asInstanceOf[js.Any])
      
      inline def setExpandStateRoot(value: Boolean): Self = StObject.set(x, "expandStateRoot", value.asInstanceOf[js.Any])
      
      inline def setInFuture(value: Boolean): Self = StObject.set(x, "inFuture", value.asInstanceOf[js.Any])
      
      inline def setMarkStateDiff(value: Boolean): Self = StObject.set(x, "markStateDiff", value.asInstanceOf[js.Any])
      
      inline def setOnActionClick(value: Double => Callback): Self = StObject.set(x, "onActionClick", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setOnActionShiftClick(value: Double => Callback): Self = StObject.set(x, "onActionShiftClick", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setPreviousState(value: S): Self = StObject.set(x, "previousState", value.asInstanceOf[js.Any])
      
      inline def setPreviousStateUndefined: Self = StObject.set(x, "previousState", js.undefined)
      
      inline def setSelect(value: Any => Any): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setState(value: S): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Base16Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
