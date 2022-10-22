package typingsJapgolly.breeze.mod

import typingsJapgolly.breeze.breeze.IRecursiveArray
import typingsJapgolly.breeze.breeze.PredicateMethod
import typingsJapgolly.breeze.breeze.PredicateVisitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "Predicate")
@js.native
open class Predicate ()
  extends StObject
     with typingsJapgolly.breeze.breeze.Predicate {
  def this(anArray: IRecursiveArray[
        String | Double | typingsJapgolly.breeze.breeze.FilterQueryOpSymbol | typingsJapgolly.breeze.breeze.Predicate
      ]) = this()
  // for any/all clauses
  def this(passthru: String) = this()
  def this(predicate: typingsJapgolly.breeze.breeze.Predicate) = this()
  def this(property: String, operator: String, value: Any) = this()
  def this(property: String, operator: String, value: typingsJapgolly.breeze.anon.DataType) = this()
  def this(property: String, operator: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol, value: Any) = this()
  def this(
    property: String,
    operator: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    value: typingsJapgolly.breeze.anon.DataType
  ) = this()
  // for any/all clauses
  def this(property: String, filterop: String, property2: String, filterop2: String, value: Any) = this()
  def this(
    property: String,
    filterop: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    value: Any
  ) = this()
  
  /* CompleteClass */
  override def and(predicates: typingsJapgolly.breeze.breeze.Predicate*): typingsJapgolly.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def and(predicates: js.Array[typingsJapgolly.breeze.breeze.Predicate]): typingsJapgolly.breeze.breeze.Predicate = js.native
  // for any/all clauses
  /* CompleteClass */
  override def and(property: String, filterop: String, property2: String, filterop2: String, value: Any): typingsJapgolly.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def and(
    property: String,
    filterop: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    value: Any
  ): typingsJapgolly.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def and(property: String, operator: String, value: Any): typingsJapgolly.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def and(property: String, operator: String, value: Any, valueIsLiteral: Boolean): typingsJapgolly.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def and(property: String, operator: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol, value: Any): typingsJapgolly.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def and(
    property: String,
    operator: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    value: Any,
    valueIsLiteral: Boolean
  ): typingsJapgolly.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  @JSName("and")
  var and_Original: PredicateMethod = js.native
  
  /* CompleteClass */
  override def not(): typingsJapgolly.breeze.breeze.Predicate = js.native
  
  /* CompleteClass */
  override def or(predicates: typingsJapgolly.breeze.breeze.Predicate*): typingsJapgolly.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def or(predicates: js.Array[typingsJapgolly.breeze.breeze.Predicate]): typingsJapgolly.breeze.breeze.Predicate = js.native
  // for any/all clauses
  /* CompleteClass */
  override def or(property: String, filterop: String, property2: String, filterop2: String, value: Any): typingsJapgolly.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def or(
    property: String,
    filterop: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    value: Any
  ): typingsJapgolly.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def or(property: String, operator: String, value: Any): typingsJapgolly.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def or(property: String, operator: String, value: Any, valueIsLiteral: Boolean): typingsJapgolly.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def or(property: String, operator: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol, value: Any): typingsJapgolly.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  override def or(
    property: String,
    operator: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    value: Any,
    valueIsLiteral: Boolean
  ): typingsJapgolly.breeze.breeze.Predicate = js.native
  /* CompleteClass */
  @JSName("or")
  var or_Original: PredicateMethod = js.native
  
  /* CompleteClass */
  override def toFunction(): js.Function = js.native
  
  /* CompleteClass */
  override def toJSON(): String = js.native
  
  /* CompleteClass */
  override def toODataFragment(context: js.Object): String = js.native
  
  /* CompleteClass */
  override def validate(entityType: typingsJapgolly.breeze.breeze.EntityType): Unit = js.native
  
  /* CompleteClass */
  override def visit(context: js.Object, visitor: PredicateVisitor): Any = js.native
}
/* static members */
object Predicate {
  
  @JSImport("breeze", "Predicate")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("breeze", "Predicate.and")
  @js.native
  def and: PredicateMethod = js.native
  inline def and(predicates: typingsJapgolly.breeze.breeze.Predicate*): typingsJapgolly.breeze.breeze.Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(predicates.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def and(predicates: js.Array[typingsJapgolly.breeze.breeze.Predicate]): typingsJapgolly.breeze.breeze.Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(predicates.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  // for any/all clauses
  inline def and(property: String, filterop: String, property2: String, filterop2: String, value: Any): typingsJapgolly.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(property.asInstanceOf[js.Any], filterop.asInstanceOf[js.Any], property2.asInstanceOf[js.Any], filterop2.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def and(
    property: String,
    filterop: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    value: Any
  ): typingsJapgolly.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(property.asInstanceOf[js.Any], filterop.asInstanceOf[js.Any], property2.asInstanceOf[js.Any], filterop2.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def and(property: String, operator: String, value: Any): typingsJapgolly.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def and(property: String, operator: String, value: Any, valueIsLiteral: Boolean): typingsJapgolly.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueIsLiteral.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def and(property: String, operator: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol, value: Any): typingsJapgolly.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def and(
    property: String,
    operator: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    value: Any,
    valueIsLiteral: Boolean
  ): typingsJapgolly.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueIsLiteral.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def and_=(x: PredicateMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("and")(x.asInstanceOf[js.Any])
  
  @JSImport("breeze", "Predicate.create")
  @js.native
  def create: PredicateMethod = js.native
  inline def create(predicates: typingsJapgolly.breeze.breeze.Predicate*): typingsJapgolly.breeze.breeze.Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(predicates.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def create(predicates: js.Array[typingsJapgolly.breeze.breeze.Predicate]): typingsJapgolly.breeze.breeze.Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(predicates.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  // for any/all clauses
  inline def create(property: String, filterop: String, property2: String, filterop2: String, value: Any): typingsJapgolly.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(property.asInstanceOf[js.Any], filterop.asInstanceOf[js.Any], property2.asInstanceOf[js.Any], filterop2.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def create(
    property: String,
    filterop: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    value: Any
  ): typingsJapgolly.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(property.asInstanceOf[js.Any], filterop.asInstanceOf[js.Any], property2.asInstanceOf[js.Any], filterop2.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def create(property: String, operator: String, value: Any): typingsJapgolly.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def create(property: String, operator: String, value: Any, valueIsLiteral: Boolean): typingsJapgolly.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueIsLiteral.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def create(property: String, operator: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol, value: Any): typingsJapgolly.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def create(
    property: String,
    operator: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    value: Any,
    valueIsLiteral: Boolean
  ): typingsJapgolly.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueIsLiteral.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def create_=(x: PredicateMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("create")(x.asInstanceOf[js.Any])
  
  inline def isPredicate(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPredicate")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def not(predicate: typingsJapgolly.breeze.breeze.Predicate): typingsJapgolly.breeze.breeze.Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(predicate.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  
  @JSImport("breeze", "Predicate.or")
  @js.native
  def or: PredicateMethod = js.native
  inline def or(predicates: typingsJapgolly.breeze.breeze.Predicate*): typingsJapgolly.breeze.breeze.Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(predicates.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def or(predicates: js.Array[typingsJapgolly.breeze.breeze.Predicate]): typingsJapgolly.breeze.breeze.Predicate = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(predicates.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  // for any/all clauses
  inline def or(property: String, filterop: String, property2: String, filterop2: String, value: Any): typingsJapgolly.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(property.asInstanceOf[js.Any], filterop.asInstanceOf[js.Any], property2.asInstanceOf[js.Any], filterop2.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def or(
    property: String,
    filterop: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    value: Any
  ): typingsJapgolly.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(property.asInstanceOf[js.Any], filterop.asInstanceOf[js.Any], property2.asInstanceOf[js.Any], filterop2.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def or(property: String, operator: String, value: Any): typingsJapgolly.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def or(property: String, operator: String, value: Any, valueIsLiteral: Boolean): typingsJapgolly.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueIsLiteral.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def or(property: String, operator: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol, value: Any): typingsJapgolly.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def or(
    property: String,
    operator: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    value: Any,
    valueIsLiteral: Boolean
  ): typingsJapgolly.breeze.breeze.Predicate = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(property.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueIsLiteral.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.Predicate]
  inline def or_=(x: PredicateMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("or")(x.asInstanceOf[js.Any])
}
