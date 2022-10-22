package typingsJapgolly.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `conditionalRangeFill.toJSON()`. */
trait ConditionalRangeFillData extends StObject {
  
  /**
    * HTML color code representing the color of the fill, in the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[String] = js.undefined
}
object ConditionalRangeFillData {
  
  inline def apply(): ConditionalRangeFillData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRangeFillData]
  }
  
  extension [Self <: ConditionalRangeFillData](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
