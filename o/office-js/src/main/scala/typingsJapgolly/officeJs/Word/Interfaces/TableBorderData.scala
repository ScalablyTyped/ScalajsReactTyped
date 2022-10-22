package typingsJapgolly.officeJs.Word.Interfaces

import typingsJapgolly.officeJs.Word.BorderType
import typingsJapgolly.officeJs.officeJsStrings.DashDotStroked
import typingsJapgolly.officeJs.officeJsStrings.Dashed
import typingsJapgolly.officeJs.officeJsStrings.DashedSmall
import typingsJapgolly.officeJs.officeJsStrings.Dot2Dashed
import typingsJapgolly.officeJs.officeJsStrings.DotDashed
import typingsJapgolly.officeJs.officeJsStrings.Dotted
import typingsJapgolly.officeJs.officeJsStrings.Double
import typingsJapgolly.officeJs.officeJsStrings.DoubleWave
import typingsJapgolly.officeJs.officeJsStrings.Mixed
import typingsJapgolly.officeJs.officeJsStrings.None
import typingsJapgolly.officeJs.officeJsStrings.Single
import typingsJapgolly.officeJs.officeJsStrings.ThickThinLarge
import typingsJapgolly.officeJs.officeJsStrings.ThickThinMed
import typingsJapgolly.officeJs.officeJsStrings.ThickThinSmall
import typingsJapgolly.officeJs.officeJsStrings.ThinThickLarge
import typingsJapgolly.officeJs.officeJsStrings.ThinThickMed
import typingsJapgolly.officeJs.officeJsStrings.ThinThickSmall
import typingsJapgolly.officeJs.officeJsStrings.ThinThickThinLarge
import typingsJapgolly.officeJs.officeJsStrings.ThinThickThinMed
import typingsJapgolly.officeJs.officeJsStrings.ThinThickThinSmall
import typingsJapgolly.officeJs.officeJsStrings.ThreeDEmboss
import typingsJapgolly.officeJs.officeJsStrings.ThreeDEngrave
import typingsJapgolly.officeJs.officeJsStrings.Triple
import typingsJapgolly.officeJs.officeJsStrings.Wave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `tableBorder.toJSON()`. */
trait TableBorderData extends StObject {
  
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
object TableBorderData {
  
  inline def apply(): TableBorderData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderData]
  }
  
  extension [Self <: TableBorderData](x: Self) {
    
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
