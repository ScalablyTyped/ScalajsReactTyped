package typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Byte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC RowId. For documentation of this class, see java.sql.RowId
  * .
  */
trait JdbcRowId extends StObject {
  
  def getBytes(): js.Array[Byte]
}
object JdbcRowId {
  
  inline def apply(getBytes: CallbackTo[js.Array[Byte]]): JdbcRowId = {
    val __obj = js.Dynamic.literal(getBytes = getBytes.toJsFn)
    __obj.asInstanceOf[JdbcRowId]
  }
  
  extension [Self <: JdbcRowId](x: Self) {
    
    inline def setGetBytes(value: CallbackTo[js.Array[Byte]]): Self = StObject.set(x, "getBytes", value.toJsFn)
  }
}
