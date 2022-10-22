package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides for access to a container of indexes, typically used for a table definition object. */
trait XIndexesSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the container of indexes.
    * @returns the indexes
    */
  val Indexes: XNameAccess
  
  /**
    * returns the container of indexes.
    * @returns the indexes
    */
  def getIndexes(): XNameAccess
}
object XIndexesSupplier {
  
  inline def apply(
    Indexes: XNameAccess,
    acquire: Callback,
    getIndexes: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XIndexesSupplier = {
    val __obj = js.Dynamic.literal(Indexes = Indexes.asInstanceOf[js.Any], acquire = acquire.toJsFn, getIndexes = getIndexes.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XIndexesSupplier]
  }
  
  extension [Self <: XIndexesSupplier](x: Self) {
    
    inline def setGetIndexes(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getIndexes", value.toJsFn)
    
    inline def setIndexes(value: XNameAccess): Self = StObject.set(x, "Indexes", value.asInstanceOf[js.Any])
  }
}
