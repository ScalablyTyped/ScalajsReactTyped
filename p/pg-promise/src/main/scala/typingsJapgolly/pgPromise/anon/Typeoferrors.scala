package typingsJapgolly.pgPromise.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.pgPromise.mod.errors.ParameterizedQueryError
import typingsJapgolly.pgPromise.mod.errors.PreparedStatementError
import typingsJapgolly.pgPromise.mod.errors.QueryFileError
import typingsJapgolly.pgPromise.mod.errors.QueryResultError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoferrors extends StObject {
  
  // ParameterizedQueryError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.ParameterizedQueryError.html
  var ParameterizedQueryError: Instantiable0[typingsJapgolly.pgPromise.mod.errors.ParameterizedQueryError]
  
  // PreparedStatementError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.PreparedStatementError.html
  var PreparedStatementError: Instantiable0[typingsJapgolly.pgPromise.mod.errors.PreparedStatementError]
  
  // QueryFileError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.QueryFileError.html
  var QueryFileError: Instantiable0[typingsJapgolly.pgPromise.mod.errors.QueryFileError]
  
  // QueryResultError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.QueryResultError.html
  var QueryResultError: Instantiable0[typingsJapgolly.pgPromise.mod.errors.QueryResultError]
}
object Typeoferrors {
  
  inline def apply(
    ParameterizedQueryError: Instantiable0[ParameterizedQueryError],
    PreparedStatementError: Instantiable0[PreparedStatementError],
    QueryFileError: Instantiable0[QueryFileError],
    QueryResultError: Instantiable0[QueryResultError]
  ): Typeoferrors = {
    val __obj = js.Dynamic.literal(ParameterizedQueryError = ParameterizedQueryError.asInstanceOf[js.Any], PreparedStatementError = PreparedStatementError.asInstanceOf[js.Any], QueryFileError = QueryFileError.asInstanceOf[js.Any], QueryResultError = QueryResultError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoferrors]
  }
  
  extension [Self <: Typeoferrors](x: Self) {
    
    inline def setParameterizedQueryError(value: Instantiable0[ParameterizedQueryError]): Self = StObject.set(x, "ParameterizedQueryError", value.asInstanceOf[js.Any])
    
    inline def setPreparedStatementError(value: Instantiable0[PreparedStatementError]): Self = StObject.set(x, "PreparedStatementError", value.asInstanceOf[js.Any])
    
    inline def setQueryFileError(value: Instantiable0[QueryFileError]): Self = StObject.set(x, "QueryFileError", value.asInstanceOf[js.Any])
    
    inline def setQueryResultError(value: Instantiable0[QueryResultError]): Self = StObject.set(x, "QueryResultError", value.asInstanceOf[js.Any])
  }
}
