package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XRowSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * uses a row set as datasource.
  * @see XRowSetChangeBroadcaster
  */
trait XRowSetSupplier
  extends StObject
     with XInterface {
  
  /**
    * provides access to the data source.
    * @returns the {@link RowSet} object
    */
  var RowSet: XRowSet
  
  /**
    * provides access to the data source.
    * @returns the {@link RowSet} object
    */
  def getRowSet(): XRowSet
  
  /**
    * sets the data source.
    * @param xDataSource the {@link RowSet} object to set
    */
  def setRowSet(xDataSource: XRowSet): Unit
}
object XRowSetSupplier {
  
  inline def apply(
    RowSet: XRowSet,
    acquire: Callback,
    getRowSet: CallbackTo[XRowSet],
    queryInterface: `type` => Any,
    release: Callback,
    setRowSet: XRowSet => Callback
  ): XRowSetSupplier = {
    val __obj = js.Dynamic.literal(RowSet = RowSet.asInstanceOf[js.Any], acquire = acquire.toJsFn, getRowSet = getRowSet.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setRowSet = js.Any.fromFunction1((t0: XRowSet) => setRowSet(t0).runNow()))
    __obj.asInstanceOf[XRowSetSupplier]
  }
  
  extension [Self <: XRowSetSupplier](x: Self) {
    
    inline def setGetRowSet(value: CallbackTo[XRowSet]): Self = StObject.set(x, "getRowSet", value.toJsFn)
    
    inline def setRowSet(value: XRowSet): Self = StObject.set(x, "RowSet", value.asInstanceOf[js.Any])
    
    inline def setSetRowSet(value: XRowSet => Callback): Self = StObject.set(x, "setRowSet", js.Any.fromFunction1((t0: XRowSet) => value(t0).runNow()))
  }
}
