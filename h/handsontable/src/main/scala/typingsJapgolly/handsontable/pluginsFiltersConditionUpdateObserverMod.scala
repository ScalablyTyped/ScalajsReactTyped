package typingsJapgolly.handsontable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsFiltersConditionUpdateObserverMod {
  
  @JSImport("handsontable/plugins/filters/conditionUpdateObserver", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ConditionUpdateObserver {
    def this(
      hot: typingsJapgolly.handsontable.coreMod.default,
      conditionCollection: typingsJapgolly.handsontable.pluginsFiltersConditionCollectionMod.default
    ) = this()
    def this(
      hot: typingsJapgolly.handsontable.coreMod.default,
      conditionCollection: typingsJapgolly.handsontable.pluginsFiltersConditionCollectionMod.default,
      columnDataFactory: js.Function0[js.Array[Any]]
    ) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def flush(): Unit = js.native
    
    /* CompleteClass */
    override def groupChanges(): Unit = js.native
    
    /* CompleteClass */
    override def updateStatesAtColumn(column: Double, conditionArgsChange: Any): Unit = js.native
  }
  
  trait ConditionUpdateObserver extends StObject {
    
    def destroy(): Unit
    
    def flush(): Unit
    
    def groupChanges(): Unit
    
    def updateStatesAtColumn(column: Double, conditionArgsChange: Any): Unit
  }
  object ConditionUpdateObserver {
    
    inline def apply(
      destroy: Callback,
      flush: Callback,
      groupChanges: Callback,
      updateStatesAtColumn: (Double, Any) => Callback
    ): ConditionUpdateObserver = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, flush = flush.toJsFn, groupChanges = groupChanges.toJsFn, updateStatesAtColumn = js.Any.fromFunction2((t0: Double, t1: Any) => (updateStatesAtColumn(t0, t1)).runNow()))
      __obj.asInstanceOf[ConditionUpdateObserver]
    }
    
    extension [Self <: ConditionUpdateObserver](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
      
      inline def setGroupChanges(value: Callback): Self = StObject.set(x, "groupChanges", value.toJsFn)
      
      inline def setUpdateStatesAtColumn(value: (Double, Any) => Callback): Self = StObject.set(x, "updateStatesAtColumn", js.Any.fromFunction2((t0: Double, t1: Any) => (value(t0, t1)).runNow()))
    }
  }
}
