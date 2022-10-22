package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.SQLException
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides special information about the context where a {@link com.sun.star.sdbc.SQLException} occurred. As usual for SQLExceptions, several
  * SQLContext-objects may be chained, then the most recent context is appended to the list's tail.
  * @see com.sun.star.sdbc.XConnection.getWarnings
  * @see com.sun.star.sdbc.XResultSet.getWarnings
  * @see com.sun.star.sdbc.XStatement.getWarnings
  */
trait SQLContext
  extends StObject
     with SQLException {
  
  /**
    * provides special info about the details where a {@link com.sun.star.sdbc.SQLException} occurred. As usual for SQLExceptions, several
    * SQLContext-objects may be chained, then the most recent context is appended to the list's tail
    */
  var Details: String
}
object SQLContext {
  
  inline def apply(
    Context: XInterface,
    Details: String,
    ErrorCode: Double,
    Message: String,
    NextException: Any,
    SQLState: String
  ): SQLContext = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Details = Details.asInstanceOf[js.Any], ErrorCode = ErrorCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], NextException = NextException.asInstanceOf[js.Any], SQLState = SQLState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLContext]
  }
  
  extension [Self <: SQLContext](x: Self) {
    
    inline def setDetails(value: String): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
  }
}
