package typingsJapgolly.bingmaps.Microsoft.Maps

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseEventArgs extends ILayerMouseEventArgs {
  /** The event that occurred. */
  var eventName: String
  /** A boolean indicating if the primary button, such as the left mouse button or a tap on a touch screen, was used during a mouse down or up event. */
  var isPrimary: Boolean
  /** A boolean indicating if the secondary mouse button, such as the right mouse button, was used during a mouse down or up event. */
  var isSecondary: Boolean
  /** If the target is a shape, this will be the layer that the shape is in. */
  var layer: Layer
  /** The map location of where the event occurred. */
  var location: Location
  /** The x-value of the pixel coordinate on the page of the mouse cursor. */
  var pageX: Double
  /** The y-value of the pixel coordinate on the page of the mouse cursor. */
  var pageY: Double
  /** The pixel coordinate of the mouse cusrsor relative to the top left corner of the map div. */
  var point: Point
  /** The object that triggered the event. */
  var target: Map | IPrimitive
  /** The type of the object that the event is attached to. Valid values include the following: ‘map’, 'layer', ‘polygon’, ‘polyline’, or ‘pushpin’ */
  var targetType: String
  /**	The number of units that the mouse wheel has changed. */
  var wheelDelta: Double
  /**
    * Returns the x-value of the pixel coordinate, relative to the map, of the mouse.
    * @returns The x-value of the pixel coordinate, relative to the map, of the mouse.
    */
  def getX(): Double
  /**
    * Returns the y-value of the pixel coordinate, relative to the map, of the mouse.
    * @returns The y-value of the pixel coordinate, relative to the map, of the mouse.
    */
  def getY(): Double
}

object IMouseEventArgs {
  @scala.inline
  def apply(
    eventName: String,
    getX: CallbackTo[Double],
    getY: CallbackTo[Double],
    isPrimary: Boolean,
    isSecondary: Boolean,
    layer: Layer,
    location: Location,
    pageX: Double,
    pageY: Double,
    point: Point,
    primitive: IPrimitive,
    target: Map | IPrimitive,
    targetType: String,
    wheelDelta: Double
  ): IMouseEventArgs = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], isPrimary = isPrimary.asInstanceOf[js.Any], isSecondary = isSecondary.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], primitive = primitive.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any], wheelDelta = wheelDelta.asInstanceOf[js.Any])
    __obj.updateDynamic("getX")(getX.toJsFn)
    __obj.updateDynamic("getY")(getY.toJsFn)
    __obj.asInstanceOf[IMouseEventArgs]
  }
}

