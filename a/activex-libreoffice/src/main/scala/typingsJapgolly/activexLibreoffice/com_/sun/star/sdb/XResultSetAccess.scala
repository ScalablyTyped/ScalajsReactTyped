package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is the interface to create a {@link com.sun.star.sdbc.ResultSet} based on the object providing the interface. */
trait XResultSetAccess
  extends StObject
     with XInterface {
  
  /**
    * returns a new {@link com.sun.star.sdbc.ResultSet} based on the object.
    * @returns the new created {@link ResultSet} object
    */
  def createResultSet(): XResultSet
}
object XResultSetAccess {
  
  inline def apply(
    acquire: Callback,
    createResultSet: CallbackTo[XResultSet],
    queryInterface: `type` => Any,
    release: Callback
  ): XResultSetAccess = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createResultSet = createResultSet.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XResultSetAccess]
  }
  
  extension [Self <: XResultSetAccess](x: Self) {
    
    inline def setCreateResultSet(value: CallbackTo[XResultSet]): Self = StObject.set(x, "createResultSet", value.toJsFn)
  }
}
