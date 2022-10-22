package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrimWhitespaceResponse extends StObject {
  
  /** The number of cells that were trimmed of whitespace. */
  var cellsChangedCount: js.UndefOr[Double] = js.undefined
}
object TrimWhitespaceResponse {
  
  inline def apply(): TrimWhitespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrimWhitespaceResponse]
  }
  
  extension [Self <: TrimWhitespaceResponse](x: Self) {
    
    inline def setCellsChangedCount(value: Double): Self = StObject.set(x, "cellsChangedCount", value.asInstanceOf[js.Any])
    
    inline def setCellsChangedCountUndefined: Self = StObject.set(x, "cellsChangedCount", js.undefined)
  }
}
