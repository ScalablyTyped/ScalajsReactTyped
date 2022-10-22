package typingsJapgolly.activexLibreoffice.com_.sun.star.rdf

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents the result of a SPARQL "SELECT" query.
  *
  * The result consists of:  1. a list of query variable names (column labels) 2. an iterator of query results (rows), each being a list of bindings for
  * the above variables Note that each query result retrieved via {@link com.sun.star.container.XEnumeration.nextElement()} has the type {@link XNode} [],
  * the length of the sequence being the same as the number of query variables.
  * @see XRepository.querySelect
  * @see XNode
  * @since OOo 3.0
  */
trait XQuerySelectResult
  extends StObject
     with XEnumeration {
  
  /** get the names of the query variables. */
  val BindingNames: SafeArray[String]
  
  /** get the names of the query variables. */
  def getBindingNames(): SafeArray[String]
}
object XQuerySelectResult {
  
  inline def apply(
    BindingNames: SafeArray[String],
    acquire: Callback,
    getBindingNames: CallbackTo[SafeArray[String]],
    hasMoreElements: CallbackTo[Boolean],
    nextElement: CallbackTo[Any],
    queryInterface: `type` => Any,
    release: Callback
  ): XQuerySelectResult = {
    val __obj = js.Dynamic.literal(BindingNames = BindingNames.asInstanceOf[js.Any], acquire = acquire.toJsFn, getBindingNames = getBindingNames.toJsFn, hasMoreElements = hasMoreElements.toJsFn, nextElement = nextElement.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XQuerySelectResult]
  }
  
  extension [Self <: XQuerySelectResult](x: Self) {
    
    inline def setBindingNames(value: SafeArray[String]): Self = StObject.set(x, "BindingNames", value.asInstanceOf[js.Any])
    
    inline def setGetBindingNames(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getBindingNames", value.toJsFn)
  }
}
