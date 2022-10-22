package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.Excel.Interfaces.RangeFillData
import typingsJapgolly.officeJs.Excel.Interfaces.RangeFillLoadOptions
import typingsJapgolly.officeJs.Excel.Interfaces.RangeFillUpdateData
import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.OfficeExtension.UpdateOptions
import typingsJapgolly.officeJs.anon.Expand
import typingsJapgolly.officeJs.officeJsStrings.Checker
import typingsJapgolly.officeJs.officeJsStrings.CrissCross
import typingsJapgolly.officeJs.officeJsStrings.Down
import typingsJapgolly.officeJs.officeJsStrings.Gray16
import typingsJapgolly.officeJs.officeJsStrings.Gray25
import typingsJapgolly.officeJs.officeJsStrings.Gray50
import typingsJapgolly.officeJs.officeJsStrings.Gray75
import typingsJapgolly.officeJs.officeJsStrings.Gray8
import typingsJapgolly.officeJs.officeJsStrings.Grid
import typingsJapgolly.officeJs.officeJsStrings.Horizontal
import typingsJapgolly.officeJs.officeJsStrings.LightDown
import typingsJapgolly.officeJs.officeJsStrings.LightHorizontal
import typingsJapgolly.officeJs.officeJsStrings.LightUp
import typingsJapgolly.officeJs.officeJsStrings.LightVertical
import typingsJapgolly.officeJs.officeJsStrings.LinearGradient
import typingsJapgolly.officeJs.officeJsStrings.None
import typingsJapgolly.officeJs.officeJsStrings.RectangularGradient
import typingsJapgolly.officeJs.officeJsStrings.SemiGray75
import typingsJapgolly.officeJs.officeJsStrings.Solid
import typingsJapgolly.officeJs.officeJsStrings.Up
import typingsJapgolly.officeJs.officeJsStrings.Vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the background of a range object.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait RangeFill
  extends StObject
     with ClientObject {
  
  /**
    * Resets the range background.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  def clear(): Unit = js.native
  
  /**
    * HTML color code representing the color of the background, in the form #RRGGBB (e.g., "FFA500"), or as a named HTML color (e.g., "orange")
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var color: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeFill: RequestContext = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeFill = js.native
  def load(options: RangeFillLoadOptions): RangeFill = js.native
  def load(propertyNamesAndPaths: Expand): RangeFill = js.native
  def load(propertyNames: String): RangeFill = js.native
  def load(propertyNames: js.Array[String]): RangeFill = js.native
  
  /**
    * The pattern of a range. See `Excel.FillPattern` for details. LinearGradient and RectangularGradient are not supported.
    A `null` value indicates that the entire range doesn't have a uniform pattern setting.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var pattern: FillPattern | None | Solid | Gray50 | Gray75 | Gray25 | Horizontal | Vertical | Down | Up | Checker | SemiGray75 | LightHorizontal | LightVertical | LightDown | LightUp | Grid | CrissCross | Gray16 | Gray8 | LinearGradient | RectangularGradient = js.native
  
  /**
    * The HTML color code representing the color of the range pattern, in the form #RRGGBB (e.g., "FFA500"), or as a named HTML color (e.g., "orange").
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: String = js.native
  
  /**
    * Specifies a double that lightens or darkens a pattern color for the range fill. The value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A `null` value indicates that the range doesn't have uniform `patternTintAndShade` settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: Double = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: RangeFillUpdateData): Unit = js.native
  def set(properties: RangeFillUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: RangeFill): Unit = js.native
  
  /**
    * Specifies a double that lightens or darkens a color for the range fill. The value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A `null` value indicates that the range doesn't have uniform `tintAndShade` settings.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.RangeFill object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeFillData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): RangeFillData = js.native
}
