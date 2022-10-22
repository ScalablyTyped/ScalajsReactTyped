package typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC SQLXML. For documentation of this class, see java.sql.SQLXML
  * .
  */
trait JdbcSQLXML extends StObject {
  
  def free(): Unit
  
  def getString(): String
  
  def setString(value: String): Unit
}
object JdbcSQLXML {
  
  inline def apply(free: Callback, getString: CallbackTo[String], setString: String => Callback): JdbcSQLXML = {
    val __obj = js.Dynamic.literal(free = free.toJsFn, getString = getString.toJsFn, setString = js.Any.fromFunction1((t0: String) => setString(t0).runNow()))
    __obj.asInstanceOf[JdbcSQLXML]
  }
  
  extension [Self <: JdbcSQLXML](x: Self) {
    
    inline def setFree(value: Callback): Self = StObject.set(x, "free", value.toJsFn)
    
    inline def setGetString(value: CallbackTo[String]): Self = StObject.set(x, "getString", value.toJsFn)
    
    inline def setSetString(value: String => Callback): Self = StObject.set(x, "setString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
