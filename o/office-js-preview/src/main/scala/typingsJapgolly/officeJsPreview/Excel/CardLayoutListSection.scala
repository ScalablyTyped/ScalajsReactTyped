package typingsJapgolly.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a section of a card that is arranged as a list in card view.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait CardLayoutListSection
  extends StObject
     with CardLayoutSectionStandardProperties
     with CardLayoutSection {
  
  /**
    * Represents the type of layout for this section.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var layout: typingsJapgolly.officeJsPreview.officeJsPreviewStrings.List
}
object CardLayoutListSection {
  
  inline def apply(properties: js.Array[String]): CardLayoutListSection = {
    val __obj = js.Dynamic.literal(layout = "List", properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardLayoutListSection]
  }
  
  extension [Self <: CardLayoutListSection](x: Self) {
    
    inline def setLayout(value: typingsJapgolly.officeJsPreview.officeJsPreviewStrings.List): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
