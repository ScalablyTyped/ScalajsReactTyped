package typingsJapgolly.fullcalendarCommon.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<NowTimerProps, NowTimerState> * / any */ trait NowTimer extends StObject {
  
  /* private */ var clearTimeout: Any
  
  def componentDidMount(): Unit
  
  def componentDidUpdate(prevProps: NowTimerProps): Unit
  
  def componentWillUnmount(): Unit
  
  /* private */ var computeTiming: Any
  
  var context: ViewContext
  
  var initialNowDate: js.Date
  
  var initialNowQueriedMs: Double
  
  def render(): Any
  
  /* private */ var setTimeout: Any
  
  var timeoutId: Any
}
object NowTimer {
  
  inline def apply(
    clearTimeout: Any,
    componentDidMount: Callback,
    componentDidUpdate: NowTimerProps => Callback,
    componentWillUnmount: Callback,
    computeTiming: Any,
    context: ViewContext,
    initialNowDate: js.Date,
    initialNowQueriedMs: Double,
    render: CallbackTo[Any],
    setTimeout: Any,
    timeoutId: Any
  ): NowTimer = {
    val __obj = js.Dynamic.literal(clearTimeout = clearTimeout.asInstanceOf[js.Any], componentDidMount = componentDidMount.toJsFn, componentDidUpdate = js.Any.fromFunction1((t0: NowTimerProps) => componentDidUpdate(t0).runNow()), componentWillUnmount = componentWillUnmount.toJsFn, computeTiming = computeTiming.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], initialNowDate = initialNowDate.asInstanceOf[js.Any], initialNowQueriedMs = initialNowQueriedMs.asInstanceOf[js.Any], render = render.toJsFn, setTimeout = setTimeout.asInstanceOf[js.Any], timeoutId = timeoutId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NowTimer]
  }
  
  extension [Self <: NowTimer](x: Self) {
    
    inline def setClearTimeout(value: Any): Self = StObject.set(x, "clearTimeout", value.asInstanceOf[js.Any])
    
    inline def setComponentDidMount(value: Callback): Self = StObject.set(x, "componentDidMount", value.toJsFn)
    
    inline def setComponentDidUpdate(value: NowTimerProps => Callback): Self = StObject.set(x, "componentDidUpdate", js.Any.fromFunction1((t0: NowTimerProps) => value(t0).runNow()))
    
    inline def setComponentWillUnmount(value: Callback): Self = StObject.set(x, "componentWillUnmount", value.toJsFn)
    
    inline def setComputeTiming(value: Any): Self = StObject.set(x, "computeTiming", value.asInstanceOf[js.Any])
    
    inline def setContext(value: ViewContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setInitialNowDate(value: js.Date): Self = StObject.set(x, "initialNowDate", value.asInstanceOf[js.Any])
    
    inline def setInitialNowQueriedMs(value: Double): Self = StObject.set(x, "initialNowQueriedMs", value.asInstanceOf[js.Any])
    
    inline def setRender(value: CallbackTo[Any]): Self = StObject.set(x, "render", value.toJsFn)
    
    inline def setSetTimeout(value: Any): Self = StObject.set(x, "setTimeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutId(value: Any): Self = StObject.set(x, "timeoutId", value.asInstanceOf[js.Any])
  }
}
