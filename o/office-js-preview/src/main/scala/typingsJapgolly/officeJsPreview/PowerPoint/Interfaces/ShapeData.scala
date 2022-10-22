package typingsJapgolly.officeJsPreview.PowerPoint.Interfaces

import typingsJapgolly.officeJsPreview.PowerPoint.ShapeType
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.GeometricShape
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Group
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Image
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Line
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Unsupported
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `shape.toJSON()`. */
trait ShapeData extends StObject {
  
  /**
    * Specifies the height, in points, of the shape. Throws an `InvalidArgument` exception when set with a negative value.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the unique ID of the shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The distance, in points, from the left side of the shape to the left side of the slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the name of this shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The distance, in points, from the top edge of the shape to the top edge of the slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var top: js.UndefOr[Double] = js.undefined
  
  /**
    * Returns the type of this shape. See {@link PowerPoint.ShapeType} for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var `type`: js.UndefOr[ShapeType | Unsupported | Image | GeometricShape | Group | Line] = js.undefined
  
  /**
    * Specifies the width, in points, of the shape. Throws an `InvalidArgument` exception when set with a negative value.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ShapeData {
  
  inline def apply(): ShapeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeData]
  }
  
  extension [Self <: ShapeData](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setType(value: ShapeType | Unsupported | Image | GeometricShape | Group | Line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
