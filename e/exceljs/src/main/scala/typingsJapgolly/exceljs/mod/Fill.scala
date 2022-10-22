package typingsJapgolly.exceljs.mod

import typingsJapgolly.exceljs.anon.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.exceljs.mod.FillPattern
  - typingsJapgolly.exceljs.mod.FillGradientAngle
  - typingsJapgolly.exceljs.mod.FillGradientPath
*/
trait Fill extends StObject
object Fill {
  
  inline def FillGradientAngle(degree: Double, stops: js.Array[GradientStop]): typingsJapgolly.exceljs.mod.FillGradientAngle = {
    val __obj = js.Dynamic.literal(degree = degree.asInstanceOf[js.Any], gradient = "angle", stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("gradient")
    __obj.asInstanceOf[typingsJapgolly.exceljs.mod.FillGradientAngle]
  }
  
  inline def FillGradientPath(center: Left, stops: js.Array[GradientStop]): typingsJapgolly.exceljs.mod.FillGradientPath = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], gradient = "path", stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("gradient")
    __obj.asInstanceOf[typingsJapgolly.exceljs.mod.FillGradientPath]
  }
  
  inline def FillPattern(pattern: FillPatterns): typingsJapgolly.exceljs.mod.FillPattern = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern")
    __obj.asInstanceOf[typingsJapgolly.exceljs.mod.FillPattern]
  }
}
