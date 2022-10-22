package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the access to a container of database queries. */
trait XQueriesSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the container of queries.
    *
    * The single elements of the container support the {@link Query} service.
    * @returns the queries belonging to database connection at which the {@link XQueriesSupplier} interface is exposed.
    */
  val Queries: XNameAccess
  
  /**
    * returns the container of queries.
    *
    * The single elements of the container support the {@link Query} service.
    * @returns the queries belonging to database connection at which the {@link XQueriesSupplier} interface is exposed.
    */
  def getQueries(): XNameAccess
}
object XQueriesSupplier {
  
  inline def apply(
    Queries: XNameAccess,
    acquire: Callback,
    getQueries: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XQueriesSupplier = {
    val __obj = js.Dynamic.literal(Queries = Queries.asInstanceOf[js.Any], acquire = acquire.toJsFn, getQueries = getQueries.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XQueriesSupplier]
  }
  
  extension [Self <: XQueriesSupplier](x: Self) {
    
    inline def setGetQueries(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getQueries", value.toJsFn)
    
    inline def setQueries(value: XNameAccess): Self = StObject.set(x, "Queries", value.asInstanceOf[js.Any])
  }
}
