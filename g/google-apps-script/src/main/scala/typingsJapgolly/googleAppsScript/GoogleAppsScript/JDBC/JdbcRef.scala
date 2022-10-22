package typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Ref. For documentation of this class, see java.sql.Ref.
  */
trait JdbcRef extends StObject {
  
  def getBaseTypeName(): String
  
  def getObject(): Any
  
  def setObject(`object`: Any): Unit
}
object JdbcRef {
  
  inline def apply(getBaseTypeName: CallbackTo[String], getObject: CallbackTo[Any], setObject: Any => Callback): JdbcRef = {
    val __obj = js.Dynamic.literal(getBaseTypeName = getBaseTypeName.toJsFn, getObject = getObject.toJsFn, setObject = js.Any.fromFunction1((t0: Any) => setObject(t0).runNow()))
    __obj.asInstanceOf[JdbcRef]
  }
  
  extension [Self <: JdbcRef](x: Self) {
    
    inline def setGetBaseTypeName(value: CallbackTo[String]): Self = StObject.set(x, "getBaseTypeName", value.toJsFn)
    
    inline def setGetObject(value: CallbackTo[Any]): Self = StObject.set(x, "getObject", value.toJsFn)
    
    inline def setSetObject(value: Any => Callback): Self = StObject.set(x, "setObject", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
