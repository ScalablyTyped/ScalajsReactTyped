package typingsJapgolly.officeJs.PowerPoint

import typingsJapgolly.officeJs.OfficeExtension.ClientObject
import typingsJapgolly.officeJs.PowerPoint.Interfaces.ShapeData
import typingsJapgolly.officeJs.PowerPoint.Interfaces.ShapeLoadOptions
import typingsJapgolly.officeJs.anon.Expand
import typingsJapgolly.officeJs.officeJsStrings.GeometricShape
import typingsJapgolly.officeJs.officeJsStrings.Group
import typingsJapgolly.officeJs.officeJsStrings.Image
import typingsJapgolly.officeJs.officeJsStrings.Line
import typingsJapgolly.officeJs.officeJsStrings.Unsupported
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single shape in the slide.
  *
  * @remarks
  * [Api set: PowerPointApi 1.3]
  */
@js.native
trait Shape
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Shape: RequestContext = js.native
  
  /**
    * Deletes the shape from the shape collection. Does nothing if the shape does not exist.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  def delete(): Unit = js.native
  
  /**
    * Returns the fill formatting of this shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  val fill: ShapeFill = js.native
  
  /**
    * Specifies the height, in points, of the shape. Throws an `InvalidArgument` exception when set with a negative value.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var height: Double = js.native
  
  /**
    * Gets the unique ID of the shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  val id: String = js.native
  
  /**
    * The distance, in points, from the left side of the shape to the left side of the slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var left: Double = js.native
  
  /**
    * Returns the line formatting of this shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
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
    * Specifies the name of this shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var name: String = js.native
  
  /**
    * Returns a collection of tags in the shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  val tags: TagCollection = js.native
  
  /**
    * Returns the text frame object of this shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  val textFrame: TextFrame = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original PowerPoint.Shape object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.ShapeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ShapeData = js.native
  
  /**
    * The distance, in points, from the top edge of the shape to the top edge of the slide.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var top: Double = js.native
  
  /**
    * Returns the type of this shape. See {@link PowerPoint.ShapeType} for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  val `type`: ShapeType | Unsupported | Image | GeometricShape | Group | Line = js.native
  
  /**
    * Specifies the width, in points, of the shape. Throws an `InvalidArgument` exception when set with a negative value.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var width: Double = js.native
}
