package typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Savepoint. For documentation of this class, see java.sql.Savepoint
  * .
  */
trait JdbcSavepoint extends StObject {
  
  def getSavepointId(): Integer
  
  def getSavepointName(): String
}
object JdbcSavepoint {
  
  inline def apply(getSavepointId: CallbackTo[Integer], getSavepointName: CallbackTo[String]): JdbcSavepoint = {
    val __obj = js.Dynamic.literal(getSavepointId = getSavepointId.toJsFn, getSavepointName = getSavepointName.toJsFn)
    __obj.asInstanceOf[JdbcSavepoint]
  }
  
  extension [Self <: JdbcSavepoint](x: Self) {
    
    inline def setGetSavepointId(value: CallbackTo[Integer]): Self = StObject.set(x, "getSavepointId", value.toJsFn)
    
    inline def setGetSavepointName(value: CallbackTo[String]): Self = StObject.set(x, "getSavepointName", value.toJsFn)
  }
}
