package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentRow[K]
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var currentRow: typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]
  
  var previousCurrentRow: typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]
}
object CurrentRow {
  
  inline def apply[K](
    currentRow: typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K],
    previousCurrentRow: typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]
  ): CurrentRow[K] = {
    val __obj = js.Dynamic.literal(currentRow = currentRow.asInstanceOf[js.Any], previousCurrentRow = previousCurrentRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentRow[K]]
  }
  
  extension [Self <: CurrentRow[?], K](x: Self & CurrentRow[K]) {
    
    inline def setCurrentRow(value: typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]): Self = StObject.set(x, "currentRow", value.asInstanceOf[js.Any])
    
    inline def setPreviousCurrentRow(value: typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K]): Self = StObject.set(x, "previousCurrentRow", value.asInstanceOf[js.Any])
  }
}
