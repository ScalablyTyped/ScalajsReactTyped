package typingsJapgolly.nginstackWebFramework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridAggregateBarMod {
  
  inline def apply(grid: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(grid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/grid/AggregateBar", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with AggregateBar {
    def this(grid: Any) = this()
    
    /* CompleteClass */
    override def add(aggr: Any): Unit = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    var count: Double = js.native
    
    /* private */ /* CompleteClass */
    var fReadOnly: Any = js.native
    
    /* CompleteClass */
    override def getChanges(): String = js.native
    
    /* private */ /* CompleteClass */
    var getReadOnly: Any = js.native
    
    /* CompleteClass */
    var grid: Any = js.native
    
    /* CompleteClass */
    override def resetLastSentValues(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var setReadOnly: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/grid/AggregateBar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AggregateBar extends StObject {
    
    def add(aggr: Any): Unit
    
    def clear(): Unit
    
    var count: Double
    
    /* private */ var fReadOnly: Any
    
    def getChanges(): String
    
    /* private */ var getReadOnly: Any
    
    var grid: Any
    
    def resetLastSentValues(): Unit
    
    /* private */ var setReadOnly: Any
  }
  object AggregateBar {
    
    inline def apply(
      add: Any => Callback,
      clear: Callback,
      count: Double,
      fReadOnly: Any,
      getChanges: CallbackTo[String],
      getReadOnly: Any,
      grid: Any,
      resetLastSentValues: Callback,
      setReadOnly: Any
    ): AggregateBar = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: Any) => add(t0).runNow()), clear = clear.toJsFn, count = count.asInstanceOf[js.Any], fReadOnly = fReadOnly.asInstanceOf[js.Any], getChanges = getChanges.toJsFn, getReadOnly = getReadOnly.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], resetLastSentValues = resetLastSentValues.toJsFn, setReadOnly = setReadOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[AggregateBar]
    }
    
    extension [Self <: AggregateBar](x: Self) {
      
      inline def setAdd(value: Any => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setFReadOnly(value: Any): Self = StObject.set(x, "fReadOnly", value.asInstanceOf[js.Any])
      
      inline def setGetChanges(value: CallbackTo[String]): Self = StObject.set(x, "getChanges", value.toJsFn)
      
      inline def setGetReadOnly(value: Any): Self = StObject.set(x, "getReadOnly", value.asInstanceOf[js.Any])
      
      inline def setGrid(value: Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setResetLastSentValues(value: Callback): Self = StObject.set(x, "resetLastSentValues", value.toJsFn)
      
      inline def setSetReadOnly(value: Any): Self = StObject.set(x, "setReadOnly", value.asInstanceOf[js.Any])
    }
  }
}
