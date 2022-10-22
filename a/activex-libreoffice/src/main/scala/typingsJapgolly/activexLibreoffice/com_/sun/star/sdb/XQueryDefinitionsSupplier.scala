package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the access to a container of database command definitions. */
trait XQueryDefinitionsSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the container of commands.
    * @returns the query definitions
    */
  val QueryDefinitions: XNameAccess
  
  /**
    * returns the container of commands.
    * @returns the query definitions
    */
  def getQueryDefinitions(): XNameAccess
}
object XQueryDefinitionsSupplier {
  
  inline def apply(
    QueryDefinitions: XNameAccess,
    acquire: Callback,
    getQueryDefinitions: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XQueryDefinitionsSupplier = {
    val __obj = js.Dynamic.literal(QueryDefinitions = QueryDefinitions.asInstanceOf[js.Any], acquire = acquire.toJsFn, getQueryDefinitions = getQueryDefinitions.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XQueryDefinitionsSupplier]
  }
  
  extension [Self <: XQueryDefinitionsSupplier](x: Self) {
    
    inline def setGetQueryDefinitions(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getQueryDefinitions", value.toJsFn)
    
    inline def setQueryDefinitions(value: XNameAccess): Self = StObject.set(x, "QueryDefinitions", value.asInstanceOf[js.Any])
  }
}
