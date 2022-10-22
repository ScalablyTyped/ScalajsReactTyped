package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cell extends StObject {
  
  var cell: none | single | multiple
  
  var row: none | single | multiple
}
object Cell {
  
  inline def apply(cell: none | single | multiple, row: none | single | multiple): Cell = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
  
  extension [Self <: Cell](x: Self) {
    
    inline def setCell(value: none | single | multiple): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setRow(value: none | single | multiple): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
