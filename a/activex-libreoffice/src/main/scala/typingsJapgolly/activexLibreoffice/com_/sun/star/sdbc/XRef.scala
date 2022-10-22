package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the reference to a SQL structured type value in the database. A Ref can be saved to persistent storage. A Ref is dereferenced by passing it as a
  * parameter to a SQL statement and executing the statement.
  */
trait XRef
  extends StObject
     with XInterface {
  
  /**
    * gets the fully-qualified SQL structured type name of the referenced item.
    * @returns the base type name
    * @throws SQLException if a database access error occurs.
    */
  val BaseTypeName: String
  
  /**
    * gets the fully-qualified SQL structured type name of the referenced item.
    * @returns the base type name
    * @throws SQLException if a database access error occurs.
    */
  def getBaseTypeName(): String
}
object XRef {
  
  inline def apply(
    BaseTypeName: String,
    acquire: Callback,
    getBaseTypeName: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XRef = {
    val __obj = js.Dynamic.literal(BaseTypeName = BaseTypeName.asInstanceOf[js.Any], acquire = acquire.toJsFn, getBaseTypeName = getBaseTypeName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XRef]
  }
  
  extension [Self <: XRef](x: Self) {
    
    inline def setBaseTypeName(value: String): Self = StObject.set(x, "BaseTypeName", value.asInstanceOf[js.Any])
    
    inline def setGetBaseTypeName(value: CallbackTo[String]): Self = StObject.set(x, "getBaseTypeName", value.toJsFn)
  }
}
