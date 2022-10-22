package typingsJapgolly.handsontable

import typingsJapgolly.handsontable.anon.Col
import typingsJapgolly.handsontable.anon.Key
import typingsJapgolly.handsontable.anon.PhysicalIndex
import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsFiltersFiltersMod {
  
  @JSImport("handsontable/plugins/filters/filters", "Filters")
  @js.native
  open class Filters protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def addCondition(column: Double, name: String, args: js.Array[Any]): Unit = js.native
    def addCondition(column: Double, name: String, args: js.Array[Any], operationId: OperationType): Unit = js.native
    
    def clearConditions(): Unit = js.native
    def clearConditions(column: Double): Unit = js.native
    
    var conditionCollection: typingsJapgolly.handsontable.pluginsFiltersConditionCollectionMod.default = js.native
    
    var conditionUpdateObserver: typingsJapgolly.handsontable.pluginsFiltersConditionUpdateObserverMod.default = js.native
    
    def filter(): Unit = js.native
    
    def getDataMapAtColumn(): js.Array[CellLikeData] = js.native
    def getDataMapAtColumn(column: Double): js.Array[CellLikeData] = js.native
    
    def getSelectedColumn(): PhysicalIndex | Null = js.native
    
    def isEnabled(): Boolean = js.native
    
    def removeConditions(column: Double): Unit = js.native
  }
  
  trait CellLikeData extends StObject {
    
    var meta: Col
    
    var value: String
  }
  object CellLikeData {
    
    inline def apply(meta: Col, value: String): CellLikeData = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellLikeData]
    }
    
    extension [Self <: CellLikeData](x: Self) {
      
      inline def setMeta(value: Col): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColumnConditions extends StObject {
    
    var column: Double
    
    var conditions: js.Array[ConditionId]
    
    var operation: OperationType
  }
  object ColumnConditions {
    
    inline def apply(column: Double, conditions: js.Array[ConditionId], operation: OperationType): ColumnConditions = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnConditions]
    }
    
    extension [Self <: ColumnConditions](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setConditions(value: js.Array[ConditionId]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsVarargs(value: ConditionId*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setOperation(value: OperationType): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConditionId extends StObject {
    
    var args: js.Array[Any]
    
    var command: js.UndefOr[Key] = js.undefined
    
    var name: js.UndefOr[ConditionName] = js.undefined
  }
  object ConditionId {
    
    inline def apply(args: js.Array[Any]): ConditionId = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConditionId]
    }
    
    extension [Self <: ConditionId](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCommand(value: Key): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      inline def setName(value: ConditionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type ConditionName = _ConditionName
  
  type OperationType = _OperationType
  
  type Settings = Boolean
  
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
  trait _ConditionName extends StObject
  object _ConditionName {
    
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
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.handsontable.handsontableStrings.conjunction
    - typingsJapgolly.handsontable.handsontableStrings.disjunction
  */
  trait _OperationType extends StObject
  object _OperationType {
    
    inline def conjunction: typingsJapgolly.handsontable.handsontableStrings.conjunction = "conjunction".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.conjunction]
    
    inline def disjunction: typingsJapgolly.handsontable.handsontableStrings.disjunction = "disjunction".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.disjunction]
  }
}
