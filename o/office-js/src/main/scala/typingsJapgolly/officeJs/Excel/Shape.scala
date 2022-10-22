package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.Interfaces.ShapeData
import typingsJapgolly.officeJs.Excel.Interfaces.ShapeLoadOptions
import typingsJapgolly.officeJs.Excel.Interfaces.ShapeUpdateData
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.ClientResult
import typingsJapgolly.officeJs.OfficeExtension.EventHandlers
import typingsJapgolly.officeJs.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJs.anon.Expand
import typingsJapgolly.officeJs.officeJsStrings.Absolute
import typingsJapgolly.officeJs.officeJsStrings.BMP
import typingsJapgolly.officeJs.officeJsStrings.BringForward
import typingsJapgolly.officeJs.officeJsStrings.BringToFront
import typingsJapgolly.officeJs.officeJsStrings.CurrentSize
import typingsJapgolly.officeJs.officeJsStrings.GIF
import typingsJapgolly.officeJs.officeJsStrings.Group
import typingsJapgolly.officeJs.officeJsStrings.JPEG
import typingsJapgolly.officeJs.officeJsStrings.OneCell
import typingsJapgolly.officeJs.officeJsStrings.OriginalSize
import typingsJapgolly.officeJs.officeJsStrings.PNG
import typingsJapgolly.officeJs.officeJsStrings.SVG
import typingsJapgolly.officeJs.officeJsStrings.ScaleFromBottomRight
import typingsJapgolly.officeJs.officeJsStrings.ScaleFromMiddle
import typingsJapgolly.officeJs.officeJsStrings.ScaleFromTopLeft
import typingsJapgolly.officeJs.officeJsStrings.SendBackward
import typingsJapgolly.officeJs.officeJsStrings.SendToBack
import typingsJapgolly.officeJs.officeJsStrings.TwoCell
import typingsJapgolly.officeJs.officeJsStrings.UNKNOWN
import typingsJapgolly.officeJs.officeJsStrings.Unsupported
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a generic shape object in the worksheet. A shape could be a geometric shape, a line, a group of shapes, etc.
  To learn more about the shape object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-shapes | Work with shapes using the Excel JavaScript API}.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait Shape
  extends StObject
     with ClientObject {
  
  /**
    * Specifies the alternative description text for a `Shape` object.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var altTextDescription: String = js.native
  
  /**
    * Specifies the alternative title text for a `Shape` object.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var altTextTitle: String = js.native
  
  /**
    * Returns the number of connection sites on this shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val connectionSiteCount: Double = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Shape: RequestContext = js.native
  
  /**
    * Copies and pastes a `Shape` object.
    The pasted shape is copied to the same pixel location as this shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    *
    * @param destinationSheet The sheet to which the shape object will be pasted. The default value is the copied shape's worksheet.
    */
  def copyTo(): Shape = js.native
  def copyTo(destinationSheet: String): Shape = js.native
  def copyTo(destinationSheet: Worksheet): Shape = js.native
  
  /**
    * Removes the shape from the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def delete(): Unit = js.native
  
  /**
    * Gets the display name of the shape. A newly created shape has a generated name
    that is localized and may not match its `name`. In this scenario, you can use
    this API to get the name that is displayed in the UI.
    *
    * @remarks
    * [Api set: ExcelApi 1.15]
    */
  val displayName: String = js.native
  
  /**
    * Returns the fill formatting of this shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val fill: ShapeFill = js.native
  
  /**
    * Returns the geometric shape associated with the shape. An error will be thrown if the shape type is not "GeometricShape".
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val geometricShape: GeometricShape = js.native
  
  /**
    * Specifies the geometric shape type of this geometric shape. See `Excel.GeometricShapeType` for details. Returns `null` if the shape type is not "GeometricShape".
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var geometricShapeType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178, starting with typingsJapgolly.officeJs.Excel.GeometricShapeType, typingsJapgolly.officeJs.officeJsStrings.LineInverse, typingsJapgolly.officeJs.officeJsStrings.Triangle */ Any = js.native
  
  /**
    * Converts the shape to an image and returns the image as a base64-encoded string. The DPI is 96. The only supported formats are `Excel.PictureFormat.BMP`, `Excel.PictureFormat.PNG`, `Excel.PictureFormat.JPEG`, and `Excel.PictureFormat.GIF`.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param format Specifies the format of the image.
    */
  def getAsImage(format: UNKNOWN | BMP | JPEG | GIF | PNG | SVG): ClientResult[String] = js.native
  /**
    * Converts the shape to an image and returns the image as a base64-encoded string. The DPI is 96. The only supported formats are `Excel.PictureFormat.BMP`, `Excel.PictureFormat.PNG`, `Excel.PictureFormat.JPEG`, and `Excel.PictureFormat.GIF`.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param format Specifies the format of the image.
    */
  def getAsImage(format: PictureFormat): ClientResult[String] = js.native
  
  /**
    * Returns the shape group associated with the shape. An error will be thrown if the shape type is not "GroupShape".
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val group: ShapeGroup = js.native
  
  /**
    * Specifies the height, in points, of the shape.
    Throws an `InvalidArgument` exception when set with a negative value or zero as an input.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var height: Double = js.native
  
  /**
    * Specifies the shape identifier.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val id: String = js.native
  
  /**
    * Returns the image associated with the shape. An error will be thrown if the shape type is not "Image".
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val image: Image = js.native
  
  /**
    * Moves the shape horizontally by the specified number of points.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param increment The increment, in points, the shape will be horizontally moved. A positive value moves the shape to the right and a negative value moves it to the left. If the sheet is right-to-left oriented, this is reversed: positive values will move the shape to the left and negative values will move it to the right.
    */
  def incrementLeft(increment: Double): Unit = js.native
  
  /**
    * Rotates the shape clockwise around the z-axis by the specified number of degrees.
    Use the `rotation` property to set the absolute rotation of the shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param increment How many degrees the shape will be rotated. A positive value rotates the shape clockwise and a negative value rotates it counterclockwise.
    */
  def incrementRotation(increment: Double): Unit = js.native
  
  /**
    * Moves the shape vertically by the specified number of points.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param increment The increment, in points, the shape will be vertically moved. A positive value moves the shape down and a negative value moves it up.
    */
  def incrementTop(increment: Double): Unit = js.native
  
  /**
    * The distance, in points, from the left side of the shape to the left side of the worksheet.
    Throws an `InvalidArgument` exception when set with a negative value as an input.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var left: Double = js.native
  
  /**
    * Specifies the level of the specified shape. For example, a level of 0 means that the shape is not part of any groups, a level of 1 means the shape is part of a top-level group, and a level of 2 means the shape is part of a sub-group of the top level.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val level: Double = js.native
  
  /**
    * Returns the line associated with the shape. An error will be thrown if the shape type is not "Line".
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val line: Line = js.native
  
  /**
    * Returns the line formatting of this shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val lineFormat: ShapeLineFormat = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Shape = js.native
  def load(options: ShapeLoadOptions): Shape = js.native
  def load(propertyNamesAndPaths: Expand): Shape = js.native
  def load(propertyNames: String): Shape = js.native
  def load(propertyNames: js.Array[String]): Shape = js.native
  
  /**
    * Specifies if the aspect ratio of this shape is locked.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var lockAspectRatio: Boolean = js.native
  
  /**
    * Specifies the name of the shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var name: String = js.native
  
  /**
    * Occurs when the shape is activated.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @eventproperty
    */
  val onActivated: EventHandlers[ShapeActivatedEventArgs] = js.native
  
  /**
    * Occurs when the shape is deactivated.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @eventproperty
    */
  val onDeactivated: EventHandlers[ShapeDeactivatedEventArgs] = js.native
  
  /**
    * Specifies the parent group of this shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val parentGroup: Shape = js.native
  
  /**
    * Represents how the object is attached to the cells below it.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var placement: Placement | TwoCell | OneCell | Absolute = js.native
  
  /**
    * Specifies the rotation, in degrees, of the shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var rotation: Double = js.native
  
  /**
    * Scales the height of the shape by a specified factor. For images, you can indicate whether you want to scale the shape relative to the original or the current size. Shapes other than pictures are always scaled relative to their current height.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param scaleFactor Specifies the ratio between the height of the shape after you resize it and the current or original height.
    * @param scaleType Specifies whether the shape is scaled relative to its original or current size. The original size scaling option only works for images.
    * @param scaleFrom Optional. Specifies which part of the shape retains its position when the shape is scaled. If omitted, it represents the shape's upper left corner retains its position.
    */
  def scaleHeight(scaleFactor: Double, scaleType: CurrentSize | OriginalSize): Unit = js.native
  def scaleHeight(
    scaleFactor: Double,
    scaleType: CurrentSize | OriginalSize,
    scaleFrom: ScaleFromTopLeft | ScaleFromMiddle | ScaleFromBottomRight
  ): Unit = js.native
  /**
    * Scales the height of the shape by a specified factor. For images, you can indicate whether you want to scale the shape relative to the original or the current size. Shapes other than pictures are always scaled relative to their current height.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param scaleFactor Specifies the ratio between the height of the shape after you resize it and the current or original height.
    * @param scaleType Specifies whether the shape is scaled relative to its original or current size. The original size scaling option only works for images.
    * @param scaleFrom Optional. Specifies which part of the shape retains its position when the shape is scaled. If omitted, it represents the shape's upper left corner retains its position.
    */
  def scaleHeight(scaleFactor: Double, scaleType: ShapeScaleType): Unit = js.native
  def scaleHeight(scaleFactor: Double, scaleType: ShapeScaleType, scaleFrom: ShapeScaleFrom): Unit = js.native
  
  /**
    * Scales the width of the shape by a specified factor. For images, you can indicate whether you want to scale the shape relative to the original or the current size. Shapes other than pictures are always scaled relative to their current width.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param scaleFactor Specifies the ratio between the width of the shape after you resize it and the current or original width.
    * @param scaleType Specifies whether the shape is scaled relative to its original or current size. The original size scaling option only works for images.
    * @param scaleFrom Optional. Specifies which part of the shape retains its position when the shape is scaled. If omitted, it represents the shape's upper left corner retains its position.
    */
  def scaleWidth(scaleFactor: Double, scaleType: CurrentSize | OriginalSize): Unit = js.native
  def scaleWidth(
    scaleFactor: Double,
    scaleType: CurrentSize | OriginalSize,
    scaleFrom: ScaleFromTopLeft | ScaleFromMiddle | ScaleFromBottomRight
  ): Unit = js.native
  /**
    * Scales the width of the shape by a specified factor. For images, you can indicate whether you want to scale the shape relative to the original or the current size. Shapes other than pictures are always scaled relative to their current width.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param scaleFactor Specifies the ratio between the width of the shape after you resize it and the current or original width.
    * @param scaleType Specifies whether the shape is scaled relative to its original or current size. The original size scaling option only works for images.
    * @param scaleFrom Optional. Specifies which part of the shape retains its position when the shape is scaled. If omitted, it represents the shape's upper left corner retains its position.
    */
  def scaleWidth(scaleFactor: Double, scaleType: ShapeScaleType): Unit = js.native
  def scaleWidth(scaleFactor: Double, scaleType: ShapeScaleType, scaleFrom: ShapeScaleFrom): Unit = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ShapeUpdateData): Unit = js.native
  def set(properties: ShapeUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Shape): Unit = js.native
  
  /**
    * Moves the specified shape up or down the collection's z-order, which shifts it in front of or behind other shapes.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param position Where to move the shape in the z-order stack relative to the other shapes. See `Excel.ShapeZOrder` for details.
    */
  def setZOrder(position: BringToFront | BringForward | SendToBack | SendBackward): Unit = js.native
  /**
    * Moves the specified shape up or down the collection's z-order, which shifts it in front of or behind other shapes.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @param position Where to move the shape in the z-order stack relative to the other shapes. See `Excel.ShapeZOrder` for details.
    */
  def setZOrder(position: ShapeZOrder): Unit = js.native
  
  /**
    * Returns the text frame object of this shape.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val textFrame: TextFrame = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Shape object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ShapeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ShapeData = js.native
  
  /**
    * The distance, in points, from the top edge of the shape to the top edge of the worksheet.
    Throws an `InvalidArgument` exception when set with a negative value as an input.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var top: Double = js.native
  
  /**
    * Returns the type of this shape. See `Excel.ShapeType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val `type`: ShapeType | Unsupported | typingsJapgolly.officeJs.officeJsStrings.Image | typingsJapgolly.officeJs.officeJsStrings.GeometricShape | Group | typingsJapgolly.officeJs.officeJsStrings.Line = js.native
  
  /**
    * Specifies if the shape is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var visible: Boolean = js.native
  
  /**
    * Specifies the width, in points, of the shape.
    Throws an `InvalidArgument` exception when set with a negative value or zero as an input.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var width: Double = js.native
  
  /**
    * Returns the position of the specified shape in the z-order, with 0 representing the bottom of the order stack.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val zOrderPosition: Double = js.native
}
