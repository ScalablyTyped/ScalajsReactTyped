package typingsJapgolly.websql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 4.5 Database query results
  * The insertId attribute must return the row ID of the row that the SQLResultSet
  * object's SQL statement inserted into the database, if the statement inserted a row.
  * If the statement inserted multiple rows, the ID of the last row must be the one returned.
  * If the statement did not insert a row, then the attribute must instead raise an INVALID_ACCESS_ERR exception.
  *
  * The rowsAffected attribute must return the number of rows that were changed by the SQL statement.
  * If the statement did not affected any rows, then the attribute must return zero.
  * For "SELECT" statements, this returns zero (querying the database doesn't affect any rows).
  *
  * The rows attribute must return a SQLResultSetRowList representing the rows returned,
  * in the order returned by the database. The same object must be returned each time.
  * If no rows were returned, then the object will be empty (its length will be zero)
  */
trait SQLResultSet extends StObject {
  
  var insertId: Double
  
  var rows: SQLResultSetRowList
  
  var rowsAffected: Double
}
object SQLResultSet {
  
  inline def apply(insertId: Double, rows: SQLResultSetRowList, rowsAffected: Double): SQLResultSet = {
    val __obj = js.Dynamic.literal(insertId = insertId.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLResultSet]
  }
  
  extension [Self <: SQLResultSet](x: Self) {
    
    inline def setInsertId(value: Double): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
    
    inline def setRows(value: SQLResultSetRowList): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsAffected(value: Double): Self = StObject.set(x, "rowsAffected", value.asInstanceOf[js.Any])
  }
}
