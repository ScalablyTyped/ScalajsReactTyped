package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * should be implemented of objects which may report warnings or non critical errors.
  * @see com.sun.star.sdbc.SQLWarning
  */
trait XWarningsSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the first warning reported by calls on an object that supports the usage of warnings.
    *
    * **Note:** Subsequent warnings will be chained to this {@link com.sun.star.sdbc.SQLWarning} .
    * @returns the warnings
    * @throws SQLException if a database access error occurs.
    */
  val Warnings: Any
  
  /**
    * clears all warnings reported for the object implementing the interface. After a call to this method, the method {@link
    * com.sun.star.sdbc.XWarningsSupplier.getWarnings()} returns `VOID` until a new warning is reported for the object.
    * @throws SQLException if a database access error occurs.
    */
  def clearWarnings(): Unit
  
  /**
    * returns the first warning reported by calls on an object that supports the usage of warnings.
    *
    * **Note:** Subsequent warnings will be chained to this {@link com.sun.star.sdbc.SQLWarning} .
    * @returns the warnings
    * @throws SQLException if a database access error occurs.
    */
  def getWarnings(): Any
}
object XWarningsSupplier {
  
  inline def apply(
    Warnings: Any,
    acquire: Callback,
    clearWarnings: Callback,
    getWarnings: CallbackTo[Any],
    queryInterface: `type` => Any,
    release: Callback
  ): XWarningsSupplier = {
    val __obj = js.Dynamic.literal(Warnings = Warnings.asInstanceOf[js.Any], acquire = acquire.toJsFn, clearWarnings = clearWarnings.toJsFn, getWarnings = getWarnings.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XWarningsSupplier]
  }
  
  extension [Self <: XWarningsSupplier](x: Self) {
    
    inline def setClearWarnings(value: Callback): Self = StObject.set(x, "clearWarnings", value.toJsFn)
    
    inline def setGetWarnings(value: CallbackTo[Any]): Self = StObject.set(x, "getWarnings", value.toJsFn)
    
    inline def setWarnings(value: Any): Self = StObject.set(x, "Warnings", value.asInstanceOf[js.Any])
  }
}
