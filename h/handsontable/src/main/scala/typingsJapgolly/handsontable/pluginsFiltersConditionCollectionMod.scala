package typingsJapgolly.handsontable

import typingsJapgolly.handsontable.pluginsFiltersFiltersMod.CellLikeData
import typingsJapgolly.handsontable.pluginsFiltersFiltersMod.ConditionId
import typingsJapgolly.handsontable.pluginsFiltersFiltersMod.OperationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsFiltersConditionCollectionMod {
  
  @JSImport("handsontable/plugins/filters/conditionCollection", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ConditionCollection
  
  trait Condition extends StObject {
    
    var args: js.Array[Any]
    
    def func(dataRow: Any, values: js.Array[Any]): Boolean
    
    var name: ConditionName
  }
  object Condition {
    
    inline def apply(args: js.Array[Any], func: (Any, js.Array[Any]) => Boolean, name: ConditionName): Condition = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], func = js.Any.fromFunction2(func), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Condition]
    }
    
    extension [Self <: Condition](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setFunc(value: (Any, js.Array[Any]) => Boolean): Self = StObject.set(x, "func", js.Any.fromFunction2(value))
      
      inline def setName(value: ConditionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConditionCollection extends StObject {
    
    def addCondition(column: Double, conditionDefinition: ConditionId): Unit = js.native
    def addCondition(column: Double, conditionDefinition: ConditionId, operation: Unit, position: Double): Unit = js.native
    def addCondition(column: Double, conditionDefinition: ConditionId, operation: OperationType): Unit = js.native
    def addCondition(column: Double, conditionDefinition: ConditionId, operation: OperationType, position: Double): Unit = js.native
    
    def clean(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def exportAllConditions(): js.Array[ConditionId] = js.native
    
    def getColumnStackPosition(column: Double): Double | Unit = js.native
    
    def getConditions(column: Double): js.Array[Condition] = js.native
    
    def getFilteredColumns(): js.Array[Double] = js.native
    
    def getOperation(column: Double): Unit | OperationType = js.native
    
    def hasConditions(column: Double, name: String): Boolean = js.native
    
    def importAllConditions(conditions: js.Array[ConditionId]): Unit = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isMatch(value: CellLikeData, column: Double): Boolean = js.native
    
    def isMatchInConditions(conditions: js.Array[Condition], value: CellLikeData): Boolean = js.native
    def isMatchInConditions(conditions: js.Array[Condition], value: CellLikeData, operationType: OperationType): Boolean = js.native
    
    def removeConditions(column: Double): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.handsontable.handsontableStrings.begins_with
    - typingsJapgolly.handsontable.handsontableStrings.between
    - typingsJapgolly.handsontable.handsontableStrings.by_value
    - typingsJapgolly.handsontable.handsontableStrings.contains
    - typingsJapgolly.handsontable.handsontableStrings.empty
    - typingsJapgolly.handsontable.handsontableStrings.ends_with
    - typingsJapgolly.handsontable.handsontableStrings.eq
    - typingsJapgolly.handsontable.handsontableStrings.gt
    - typingsJapgolly.handsontable.handsontableStrings.gte
    - typingsJapgolly.handsontable.handsontableStrings.lt
    - typingsJapgolly.handsontable.handsontableStrings.lte
    - typingsJapgolly.handsontable.handsontableStrings.not_between
    - typingsJapgolly.handsontable.handsontableStrings.not_contains
    - typingsJapgolly.handsontable.handsontableStrings.not_empty
    - typingsJapgolly.handsontable.handsontableStrings.neq
  */
  trait ConditionName extends StObject
  object ConditionName {
    
    inline def begins_with: typingsJapgolly.handsontable.handsontableStrings.begins_with = "begins_with".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.begins_with]
    
    inline def between: typingsJapgolly.handsontable.handsontableStrings.between = "between".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.between]
    
    inline def by_value: typingsJapgolly.handsontable.handsontableStrings.by_value = "by_value".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.by_value]
    
    inline def contains: typingsJapgolly.handsontable.handsontableStrings.contains = "contains".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.contains]
    
    inline def empty: typingsJapgolly.handsontable.handsontableStrings.empty = "empty".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.empty]
    
    inline def ends_with: typingsJapgolly.handsontable.handsontableStrings.ends_with = "ends_with".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.ends_with]
    
    inline def eq: typingsJapgolly.handsontable.handsontableStrings.eq = "eq".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.eq]
    
    inline def gt: typingsJapgolly.handsontable.handsontableStrings.gt = "gt".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.gt]
    
    inline def gte: typingsJapgolly.handsontable.handsontableStrings.gte = "gte".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.gte]
    
    inline def lt: typingsJapgolly.handsontable.handsontableStrings.lt = "lt".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.lt]
    
    inline def lte: typingsJapgolly.handsontable.handsontableStrings.lte = "lte".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.lte]
    
    inline def neq: typingsJapgolly.handsontable.handsontableStrings.neq = "neq".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.neq]
    
    inline def not_between: typingsJapgolly.handsontable.handsontableStrings.not_between = "not_between".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.not_between]
    
    inline def not_contains: typingsJapgolly.handsontable.handsontableStrings.not_contains = "not_contains".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.not_contains]
    
    inline def not_empty: typingsJapgolly.handsontable.handsontableStrings.not_empty = "not_empty".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.not_empty]
  }
}
