package typingsJapgolly.breeze.mod

import typingsJapgolly.breeze.AnonDataType
import typingsJapgolly.breeze.breeze.IRecursiveArray
import typingsJapgolly.breeze.breeze.PredicateMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "Predicate")
@js.native
class Predicate ()
  extends typingsJapgolly.breeze.breeze.Predicate {
  def this(anArray: IRecursiveArray[
        String | Double | typingsJapgolly.breeze.breeze.FilterQueryOpSymbol | typingsJapgolly.breeze.breeze.Predicate
      ]) = this()
    // for any/all clauses
  def this(passthru: String) = this()
  def this(predicate: typingsJapgolly.breeze.breeze.Predicate) = this()
  def this(property: String, operator: String, value: js.Any) = this()
  def this(property: String, operator: String, value: AnonDataType) = this()
  def this(property: String, operator: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol, value: js.Any) = this()
  def this(property: String, operator: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol, value: AnonDataType) = this()
    // for any/all clauses
  def this(property: String, filterop: String, property2: String, filterop2: String, value: js.Any) = this()
  def this(
    property: String,
    filterop: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any
  ) = this()
}

/* static members */
@JSImport("breeze", "Predicate")
@js.native
object Predicate extends js.Object {
  @JSName("and")
  var and_Original: PredicateMethod = js.native
  @JSName("create")
  var create_Original: PredicateMethod = js.native
  @JSName("or")
  var or_Original: PredicateMethod = js.native
  def and(predicates: typingsJapgolly.breeze.breeze.Predicate*): typingsJapgolly.breeze.breeze.Predicate = js.native
  def and(predicates: js.Array[typingsJapgolly.breeze.breeze.Predicate]): typingsJapgolly.breeze.breeze.Predicate = js.native
    // for any/all clauses
  def and(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): typingsJapgolly.breeze.breeze.Predicate = js.native
  def and(
    property: String,
    filterop: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any
  ): typingsJapgolly.breeze.breeze.Predicate = js.native
  def and(property: String, operator: String, value: js.Any): typingsJapgolly.breeze.breeze.Predicate = js.native
  def and(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): typingsJapgolly.breeze.breeze.Predicate = js.native
  def and(property: String, operator: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol, value: js.Any): typingsJapgolly.breeze.breeze.Predicate = js.native
  def and(
    property: String,
    operator: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: Boolean
  ): typingsJapgolly.breeze.breeze.Predicate = js.native
  def create(predicates: typingsJapgolly.breeze.breeze.Predicate*): typingsJapgolly.breeze.breeze.Predicate = js.native
  def create(predicates: js.Array[typingsJapgolly.breeze.breeze.Predicate]): typingsJapgolly.breeze.breeze.Predicate = js.native
    // for any/all clauses
  def create(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): typingsJapgolly.breeze.breeze.Predicate = js.native
  def create(
    property: String,
    filterop: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any
  ): typingsJapgolly.breeze.breeze.Predicate = js.native
  def create(property: String, operator: String, value: js.Any): typingsJapgolly.breeze.breeze.Predicate = js.native
  def create(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): typingsJapgolly.breeze.breeze.Predicate = js.native
  def create(property: String, operator: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol, value: js.Any): typingsJapgolly.breeze.breeze.Predicate = js.native
  def create(
    property: String,
    operator: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: Boolean
  ): typingsJapgolly.breeze.breeze.Predicate = js.native
  def isPredicate(o: js.Any): Boolean = js.native
  def not(predicate: typingsJapgolly.breeze.breeze.Predicate): typingsJapgolly.breeze.breeze.Predicate = js.native
  def or(predicates: typingsJapgolly.breeze.breeze.Predicate*): typingsJapgolly.breeze.breeze.Predicate = js.native
  def or(predicates: js.Array[typingsJapgolly.breeze.breeze.Predicate]): typingsJapgolly.breeze.breeze.Predicate = js.native
    // for any/all clauses
  def or(property: String, filterop: String, property2: String, filterop2: String, value: js.Any): typingsJapgolly.breeze.breeze.Predicate = js.native
  def or(
    property: String,
    filterop: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    property2: String,
    filterop2: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any
  ): typingsJapgolly.breeze.breeze.Predicate = js.native
  def or(property: String, operator: String, value: js.Any): typingsJapgolly.breeze.breeze.Predicate = js.native
  def or(property: String, operator: String, value: js.Any, valueIsLiteral: Boolean): typingsJapgolly.breeze.breeze.Predicate = js.native
  def or(property: String, operator: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol, value: js.Any): typingsJapgolly.breeze.breeze.Predicate = js.native
  def or(
    property: String,
    operator: typingsJapgolly.breeze.breeze.FilterQueryOpSymbol,
    value: js.Any,
    valueIsLiteral: Boolean
  ): typingsJapgolly.breeze.breeze.Predicate = js.native
}

