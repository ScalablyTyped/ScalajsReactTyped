package typingsJapgolly.breeze.breeze

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Predicate extends StObject {
  
  def and(predicates: Predicate*): Predicate
  def and(predicates: js.Array[Predicate]): Predicate
  // for any/all clauses
  def and(property: String, filterop: String, property2: String, filterop2: String, value: Any): Predicate
  def and(
    property: String,
    filterop: FilterQueryOpSymbol,
    property2: String,
    filterop2: FilterQueryOpSymbol,
    value: Any
  ): Predicate
  def and(property: String, operator: String, value: Any): Predicate
  def and(property: String, operator: String, value: Any, valueIsLiteral: Boolean): Predicate
  def and(property: String, operator: FilterQueryOpSymbol, value: Any): Predicate
  def and(property: String, operator: FilterQueryOpSymbol, value: Any, valueIsLiteral: Boolean): Predicate
  @JSName("and")
  var and_Original: PredicateMethod
  
  def not(): Predicate
  
  def or(predicates: Predicate*): Predicate
  def or(predicates: js.Array[Predicate]): Predicate
  // for any/all clauses
  def or(property: String, filterop: String, property2: String, filterop2: String, value: Any): Predicate
  def or(
    property: String,
    filterop: FilterQueryOpSymbol,
    property2: String,
    filterop2: FilterQueryOpSymbol,
    value: Any
  ): Predicate
  def or(property: String, operator: String, value: Any): Predicate
  def or(property: String, operator: String, value: Any, valueIsLiteral: Boolean): Predicate
  def or(property: String, operator: FilterQueryOpSymbol, value: Any): Predicate
  def or(property: String, operator: FilterQueryOpSymbol, value: Any, valueIsLiteral: Boolean): Predicate
  @JSName("or")
  var or_Original: PredicateMethod
  
  def toFunction(): js.Function
  
  def toJSON(): String
  
  def toODataFragment(context: js.Object): String
  
  def validate(entityType: EntityType): Unit
  
  def visit(context: js.Object, visitor: PredicateVisitor): Any
}
object Predicate {
  
  inline def apply(
    and: PredicateMethod,
    not: CallbackTo[Predicate],
    or: PredicateMethod,
    toFunction: CallbackTo[js.Function],
    toJSON: CallbackTo[String],
    toODataFragment: js.Object => String,
    validate: EntityType => Callback,
    visit: (js.Object, PredicateVisitor) => Any
  ): Predicate = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], not = not.toJsFn, or = or.asInstanceOf[js.Any], toFunction = toFunction.toJsFn, toJSON = toJSON.toJsFn, toODataFragment = js.Any.fromFunction1(toODataFragment), validate = js.Any.fromFunction1((t0: EntityType) => validate(t0).runNow()), visit = js.Any.fromFunction2(visit))
    __obj.asInstanceOf[Predicate]
  }
  
  extension [Self <: Predicate](x: Self) {
    
    inline def setAnd(value: PredicateMethod): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setNot(value: CallbackTo[Predicate]): Self = StObject.set(x, "not", value.toJsFn)
    
    inline def setOr(value: PredicateMethod): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    
    inline def setToFunction(value: CallbackTo[js.Function]): Self = StObject.set(x, "toFunction", value.toJsFn)
    
    inline def setToJSON(value: CallbackTo[String]): Self = StObject.set(x, "toJSON", value.toJsFn)
    
    inline def setToODataFragment(value: js.Object => String): Self = StObject.set(x, "toODataFragment", js.Any.fromFunction1(value))
    
    inline def setValidate(value: EntityType => Callback): Self = StObject.set(x, "validate", js.Any.fromFunction1((t0: EntityType) => value(t0).runNow()))
    
    inline def setVisit(value: (js.Object, PredicateVisitor) => Any): Self = StObject.set(x, "visit", js.Any.fromFunction2(value))
  }
}
