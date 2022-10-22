package typingsJapgolly.officeJsPreview.Word.Interfaces

import typingsJapgolly.officeJsPreview.Word.BorderType
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashDotStroked
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dashed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashedSmall
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dot2Dashed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DotDashed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dotted
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Double
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DoubleWave
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Mixed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.None
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Single
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThickThinLarge
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThickThinMed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThickThinSmall
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThinThickLarge
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThinThickMed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThinThickSmall
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThinThickThinLarge
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThinThickThinMed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThinThickThinSmall
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeDEmboss
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeDEngrave
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Triple
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Wave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TableBorder object, for use in `tableBorder.set({ ... })`. */
trait TableBorderUpdateData extends StObject {
  
  /**
    * Gets or sets the table border color.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the type of the table border.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[
    BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave
  ] = js.undefined
  
  /**
    * Gets or sets the width, in points, of the table border. Not applicable to table border types that have fixed widths.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}
object TableBorderUpdateData {
  
  inline def apply(): TableBorderUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderUpdateData]
  }
  
  extension [Self <: TableBorderUpdateData](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setType(
      value: BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: scala.Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
