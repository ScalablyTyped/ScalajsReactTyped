package typingsJapgolly.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeveloperMetadataLocation extends StObject {
  
  var dimensionRange: DimensionRange
  
  var locationType: DeveloperMetadataLocationType
  
  var sheetId: Double
  
  var spreadsheet: Boolean
}
object DeveloperMetadataLocation {
  
  inline def apply(
    dimensionRange: DimensionRange,
    locationType: DeveloperMetadataLocationType,
    sheetId: Double,
    spreadsheet: Boolean
  ): DeveloperMetadataLocation = {
    val __obj = js.Dynamic.literal(dimensionRange = dimensionRange.asInstanceOf[js.Any], locationType = locationType.asInstanceOf[js.Any], sheetId = sheetId.asInstanceOf[js.Any], spreadsheet = spreadsheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeveloperMetadataLocation]
  }
  
  extension [Self <: DeveloperMetadataLocation](x: Self) {
    
    inline def setDimensionRange(value: DimensionRange): Self = StObject.set(x, "dimensionRange", value.asInstanceOf[js.Any])
    
    inline def setLocationType(value: DeveloperMetadataLocationType): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheet(value: Boolean): Self = StObject.set(x, "spreadsheet", value.asInstanceOf[js.Any])
  }
}
