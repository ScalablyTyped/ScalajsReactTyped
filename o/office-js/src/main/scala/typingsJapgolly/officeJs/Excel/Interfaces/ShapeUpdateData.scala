package typingsJapgolly.officeJs.Excel.Interfaces

import typingsJapgolly.officeJs.Excel.Placement
import typingsJapgolly.officeJs.officeJsStrings.Absolute
import typingsJapgolly.officeJs.officeJsStrings.OneCell
import typingsJapgolly.officeJs.officeJsStrings.TwoCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Shape object, for use in `shape.set({ ... })`. */
trait ShapeUpdateData extends StObject {
  
  /**
    * Specifies the alternative description text for a `Shape` object.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var altTextDescription: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the alternative title text for a `Shape` object.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var altTextTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Returns the fill formatting of this shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var fill: js.UndefOr[ShapeFillUpdateData] = js.undefined
  
  /**
    * Specifies the geometric shape type of this geometric shape. See `Excel.GeometricShapeType` for details. Returns `null` if the shape type is not "GeometricShape".
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var geometricShapeType: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 179, starting with typingsJapgolly.officeJs.Excel.GeometricShapeType, typingsJapgolly.officeJs.officeJsStrings.LineInverse, typingsJapgolly.officeJs.officeJsStrings.Triangle */ Any
  ] = js.undefined
  
  /**
    * Specifies the height, in points, of the shape.
    Throws an `InvalidArgument` exception when set with a negative value or zero as an input.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance, in points, from the left side of the shape to the left side of the worksheet.
    Throws an `InvalidArgument` exception when set with a negative value as an input.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * Returns the line formatting of this shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var lineFormat: js.UndefOr[ShapeLineFormatUpdateData] = js.undefined
  
  /**
    * Specifies if the aspect ratio of this shape is locked.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var lockAspectRatio: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the name of the shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Represents how the object is attached to the cells below it.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var placement: js.UndefOr[Placement | TwoCell | OneCell | Absolute] = js.undefined
  
  /**
    * Specifies the rotation, in degrees, of the shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance, in points, from the top edge of the shape to the top edge of the worksheet.
    Throws an `InvalidArgument` exception when set with a negative value as an input.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var top: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies if the shape is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the width, in points, of the shape.
    Throws an `InvalidArgument` exception when set with a negative value or zero as an input.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ShapeUpdateData {
  
  inline def apply(): ShapeUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeUpdateData]
  }
  
  extension [Self <: ShapeUpdateData](x: Self) {
    
    inline def setAltTextDescription(value: String): Self = StObject.set(x, "altTextDescription", value.asInstanceOf[js.Any])
    
    inline def setAltTextDescriptionUndefined: Self = StObject.set(x, "altTextDescription", js.undefined)
    
    inline def setAltTextTitle(value: String): Self = StObject.set(x, "altTextTitle", value.asInstanceOf[js.Any])
    
    inline def setAltTextTitleUndefined: Self = StObject.set(x, "altTextTitle", js.undefined)
    
    inline def setFill(value: ShapeFillUpdateData): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setGeometricShapeType(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 179, starting with typingsJapgolly.officeJs.Excel.GeometricShapeType, typingsJapgolly.officeJs.officeJsStrings.LineInverse, typingsJapgolly.officeJs.officeJsStrings.Triangle */ Any
    ): Self = StObject.set(x, "geometricShapeType", value.asInstanceOf[js.Any])
    
    inline def setGeometricShapeTypeUndefined: Self = StObject.set(x, "geometricShapeType", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLineFormat(value: ShapeLineFormatUpdateData): Self = StObject.set(x, "lineFormat", value.asInstanceOf[js.Any])
    
    inline def setLineFormatUndefined: Self = StObject.set(x, "lineFormat", js.undefined)
    
    inline def setLockAspectRatio(value: Boolean): Self = StObject.set(x, "lockAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setLockAspectRatioUndefined: Self = StObject.set(x, "lockAspectRatio", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlacement(value: Placement | TwoCell | OneCell | Absolute): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
