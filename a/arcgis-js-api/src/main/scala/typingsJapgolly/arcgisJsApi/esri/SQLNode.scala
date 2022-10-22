package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.AND
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Asterisk
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.BETWEEN
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Equalssign
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Greaterthansign
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.GreaterthansignEqualssign
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.IN
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.IS
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ISNOT
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.LIKE
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Lessthansign
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.LessthansignEqualssign
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.LessthansignGreaterthansign
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.NOTBETWEEN
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.OR
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Plussign
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.Slash
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings._empty
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`-_`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`NOT IN`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`NOT LIKE`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.date
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.day
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.hour
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.minute
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.month
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.second
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.timestamp
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.year
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arcgisJsApi.esri.BinaryNode
  - typingsJapgolly.arcgisJsApi.esri.BoolNode
  - typingsJapgolly.arcgisJsApi.esri.ColumnNode
  - typingsJapgolly.arcgisJsApi.esri.CurrentTimeNode
  - typingsJapgolly.arcgisJsApi.esri.DateNode
  - typingsJapgolly.arcgisJsApi.esri.FunctionNode
  - typingsJapgolly.arcgisJsApi.esri.IntervalNode
  - typingsJapgolly.arcgisJsApi.esri.IntervalPeriodNode
  - typingsJapgolly.arcgisJsApi.esri.IntervalQualifierNode
  - typingsJapgolly.arcgisJsApi.esri.NullNode
  - typingsJapgolly.arcgisJsApi.esri.StringNode
  - typingsJapgolly.arcgisJsApi.esri.ListNode
  - typingsJapgolly.arcgisJsApi.esri.NumberNode
  - typingsJapgolly.arcgisJsApi.esri.SimpleCaseNode
  - typingsJapgolly.arcgisJsApi.esri.SearchedCaseNode
  - typingsJapgolly.arcgisJsApi.esri.TimeStampNode
  - typingsJapgolly.arcgisJsApi.esri.UnaryNode
  - typingsJapgolly.arcgisJsApi.esri.WhenNode
*/
trait SQLNode extends StObject
object SQLNode {
  
  inline def BinaryNode(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    left: SQLNode,
    operator: AND | OR | IS | ISNOT | IN | (`NOT IN`) | BETWEEN | NOTBETWEEN | LIKE | (`NOT LIKE`) | LessthansignGreaterthansign | Lessthansign | Greaterthansign | GreaterthansignEqualssign | LessthansignEqualssign | Equalssign | Asterisk | `-_` | Plussign | Slash,
    propertyIsEnumerable: PropertyKey => Boolean,
    right: SQLNode
  ): typingsJapgolly.arcgisJsApi.esri.BinaryNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("binary-expression")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.BinaryNode]
  }
  
  inline def BoolNode(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: Boolean
  ): typingsJapgolly.arcgisJsApi.esri.BoolNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.BoolNode]
  }
  
  inline def ColumnNode(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.ColumnNode = {
    val __obj = js.Dynamic.literal(column = "string", constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("column-reference")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.ColumnNode]
  }
  
  inline def CurrentTimeNode(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    mode: timestamp | date,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.CurrentTimeNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mode = mode.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("current-time")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CurrentTimeNode]
  }
  
  inline def DateNode(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: String
  ): typingsJapgolly.arcgisJsApi.esri.DateNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("date")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.DateNode]
  }
  
  inline def FunctionNode(
    args: ListNode,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.FunctionNode = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("function")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.FunctionNode]
  }
  
  inline def IntervalNode(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    op: Plussign | `-_` | _empty,
    propertyIsEnumerable: PropertyKey => Boolean,
    qualifier: IntervalQualifierNode | IntervalPeriodNode,
    value: StringNode
  ): typingsJapgolly.arcgisJsApi.esri.IntervalNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), op = op.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), qualifier = qualifier.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interval")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.IntervalNode]
  }
  
  inline def IntervalPeriodNode(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    period: day | month | hour | second | year | minute,
    precision: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.IntervalPeriodNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), period = period.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), secondary = "number")
    __obj.updateDynamic("type")("interval-period")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.IntervalPeriodNode]
  }
  
  inline def IntervalQualifierNode(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    period: day | month | hour | second | year | minute,
    precision: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.IntervalQualifierNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), period = period.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), secondary = "number")
    __obj.updateDynamic("type")("interval-qualifier")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.IntervalQualifierNode]
  }
  
  inline def ListNode(
    constructor: js.Function,
    expr: SQLNode,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.ListNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("expression-list")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.ListNode]
  }
  
  inline def NullNode(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: Any
  ): typingsJapgolly.arcgisJsApi.esri.NullNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("null")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.NullNode]
  }
  
  inline def NumberNode(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: Double
  ): typingsJapgolly.arcgisJsApi.esri.NumberNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.NumberNode]
  }
  
  inline def SearchedCaseNode(
    clauses: js.Array[WhenNode],
    constructor: js.Function,
    `else`: SQLNode,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.SearchedCaseNode = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], format = "searched", hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("else")(`else`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("case-expression")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.SearchedCaseNode]
  }
  
  inline def SimpleCaseNode(
    clauses: js.Array[WhenNode],
    constructor: js.Function,
    `else`: SQLNode,
    hasOwnProperty: PropertyKey => Boolean,
    operand: SQLNode,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.SimpleCaseNode = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], format = "simple", hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), operand = operand.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("else")(`else`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("case_expression")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.SimpleCaseNode]
  }
  
  inline def StringNode(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: String
  ): typingsJapgolly.arcgisJsApi.esri.StringNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.StringNode]
  }
  
  inline def TimeStampNode(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: String
  ): typingsJapgolly.arcgisJsApi.esri.TimeStampNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("timestamp")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.TimeStampNode]
  }
  
  inline def UnaryNode(
    constructor: js.Function,
    expr: SQLNode,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.UnaryNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("unary-expression")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.UnaryNode]
  }
  
  inline def WhenNode(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    operand: SQLNode,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: SQLNode
  ): typingsJapgolly.arcgisJsApi.esri.WhenNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), operand = operand.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("when-clause")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.WhenNode]
  }
}
