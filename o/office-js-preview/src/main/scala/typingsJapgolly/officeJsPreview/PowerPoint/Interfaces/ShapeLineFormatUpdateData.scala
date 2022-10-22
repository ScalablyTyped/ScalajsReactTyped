package typingsJapgolly.officeJsPreview.PowerPoint.Interfaces

import typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineDashStyle
import typingsJapgolly.officeJsPreview.PowerPoint.ShapeLineStyle
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dash
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashDot
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashDotDot
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LongDash
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LongDashDot
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LongDashDotDot
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.RoundDot
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Single
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Solid
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.SquareDot
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.SystemDash
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.SystemDashDot
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.SystemDot
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThickBetweenThin
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThickThin
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThinThick
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThinThin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ShapeLineFormat object, for use in `shapeLineFormat.set({ ... })`. */
trait ShapeLineFormatUpdateData extends StObject {
  
  /**
    * Represents the line color in HTML color format, in the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the dash style of the line. Returns null when the line is not visible or there are inconsistent dash styles. See PowerPoint.ShapeLineDashStyle for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var dashStyle: js.UndefOr[
    ShapeLineDashStyle | Dash | DashDot | DashDotDot | LongDash | LongDashDot | RoundDot | Solid | SquareDot | LongDashDotDot | SystemDash | SystemDot | SystemDashDot
  ] = js.undefined
  
  /**
    * Represents the line style of the shape. Returns null when the line is not visible or there are inconsistent styles. See PowerPoint.ShapeLineStyle for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var style: js.UndefOr[ShapeLineStyle | Single | ThickBetweenThin | ThickThin | ThinThick | ThinThin] = js.undefined
  
  /**
    * Specifies the transparency percentage of the line as a value from 0.0 (opaque) through 1.0 (clear). Returns null when the shape has inconsistent transparencies.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var transparency: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies if the line formatting of a shape element is visible. Returns `null` when the shape has inconsistent visibilities.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the weight of the line, in points. Returns `null` when the line is not visible or there are inconsistent line weights.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var weight: js.UndefOr[Double] = js.undefined
}
object ShapeLineFormatUpdateData {
  
  inline def apply(): ShapeLineFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeLineFormatUpdateData]
  }
  
  extension [Self <: ShapeLineFormatUpdateData](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashStyle(
      value: ShapeLineDashStyle | Dash | DashDot | DashDotDot | LongDash | LongDashDot | RoundDot | Solid | SquareDot | LongDashDotDot | SystemDash | SystemDot | SystemDashDot
    ): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setStyle(value: ShapeLineStyle | Single | ThickBetweenThin | ThickThin | ThinThick | ThinThin): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTransparency(value: Double): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
    
    inline def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
