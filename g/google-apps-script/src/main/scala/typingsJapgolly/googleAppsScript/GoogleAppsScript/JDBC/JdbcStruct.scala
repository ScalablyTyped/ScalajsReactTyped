package typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Struct. For documentation of this class, see java.sql.Struct
  * .
  */
trait JdbcStruct extends StObject {
  
  def getAttributes(): js.Array[Any]
  
  def getSQLTypeName(): String
}
object JdbcStruct {
  
  inline def apply(getAttributes: CallbackTo[js.Array[Any]], getSQLTypeName: CallbackTo[String]): JdbcStruct = {
    val __obj = js.Dynamic.literal(getAttributes = getAttributes.toJsFn, getSQLTypeName = getSQLTypeName.toJsFn)
    __obj.asInstanceOf[JdbcStruct]
  }
  
  extension [Self <: JdbcStruct](x: Self) {
    
    inline def setGetAttributes(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getAttributes", value.toJsFn)
    
    inline def setGetSQLTypeName(value: CallbackTo[String]): Self = StObject.set(x, "getSQLTypeName", value.toJsFn)
  }
}
