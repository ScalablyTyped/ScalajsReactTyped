package typingsJapgolly.figma.mod.global

import typingsJapgolly.figma.figmaStrings.JPG
import typingsJapgolly.figma.figmaStrings.PNG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.figma.mod.global.ExportSettingsImage
  - typingsJapgolly.figma.mod.global.ExportSettingsSVG
  - typingsJapgolly.figma.mod.global.ExportSettingsPDF
*/
trait ExportSettings extends StObject
object ExportSettings {
  
  inline def ExportSettingsImage(format: JPG | PNG): typingsJapgolly.figma.mod.global.ExportSettingsImage = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.figma.mod.global.ExportSettingsImage]
  }
  
  inline def ExportSettingsPDF(): typingsJapgolly.figma.mod.global.ExportSettingsPDF = {
    val __obj = js.Dynamic.literal(format = "PDF")
    __obj.asInstanceOf[typingsJapgolly.figma.mod.global.ExportSettingsPDF]
  }
  
  inline def ExportSettingsSVG(): typingsJapgolly.figma.mod.global.ExportSettingsSVG = {
    val __obj = js.Dynamic.literal(format = "SVG")
    __obj.asInstanceOf[typingsJapgolly.figma.mod.global.ExportSettingsSVG]
  }
}
