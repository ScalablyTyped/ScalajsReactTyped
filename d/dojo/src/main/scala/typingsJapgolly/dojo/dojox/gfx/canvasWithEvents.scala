package typingsJapgolly.dojo.dojox.gfx

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/canvasWithEvents.html
  *
  * This the graphics rendering bridge for W3C Canvas compliant browsers which extends
  * the basic canvas drawing renderer bridge to add additional support for graphics events
  * on Shapes.
  * Since Canvas is an immediate mode graphics api, with no object graph or
  * eventing capabilities, use of the canvas module alone will only add in drawing support.
  * This additional module, canvasWithEvents extends this module with additional support
  * for handling events on Canvas.  By default, the support for events is now included
  * however, if only drawing capabilities are needed, canvas event module can be disabled
  * using the dojoConfig option, canvasEvents:true|false.
  *
  */
trait canvasWithEvents extends js.Object {
  /**
    *
    */
  def Circle(): Unit
  /**
    *
    */
  def Ellipse(): Unit
  /**
    *
    */
  def Group(): Unit
  /**
    *
    */
  def Image(): Unit
  /**
    *
    */
  def Line(): Unit
  /**
    *
    */
  def Path(): Unit
  /**
    *
    */
  def Polyline(): Unit
  /**
    *
    */
  def Rect(): Unit
  /**
    *
    */
  def Shape(): Unit
  /**
    *
    */
  def Surface(): Unit
  /**
    *
    */
  def Text(): Unit
  /**
    *
    */
  def TextPath(): Unit
  /**
    * creates a surface (Canvas)
    *
    * @param parentNode a parent node
    * @param width width of surface, e.g., "100px"
    * @param height height of surface, e.g., "100px"
    */
  def createSurface(parentNode: HTMLElement, width: String, height: String): Unit
}

object canvasWithEvents {
  @scala.inline
  def apply(
    Circle: Callback,
    Ellipse: Callback,
    Group: Callback,
    Image: Callback,
    Line: Callback,
    Path: Callback,
    Polyline: Callback,
    Rect: Callback,
    Shape: Callback,
    Surface: Callback,
    Text: Callback,
    TextPath: Callback,
    createSurface: (HTMLElement, String, String) => Callback
  ): canvasWithEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Circle")(Circle.toJsFn)
    __obj.updateDynamic("Ellipse")(Ellipse.toJsFn)
    __obj.updateDynamic("Group")(Group.toJsFn)
    __obj.updateDynamic("Image")(Image.toJsFn)
    __obj.updateDynamic("Line")(Line.toJsFn)
    __obj.updateDynamic("Path")(Path.toJsFn)
    __obj.updateDynamic("Polyline")(Polyline.toJsFn)
    __obj.updateDynamic("Rect")(Rect.toJsFn)
    __obj.updateDynamic("Shape")(Shape.toJsFn)
    __obj.updateDynamic("Surface")(Surface.toJsFn)
    __obj.updateDynamic("Text")(Text.toJsFn)
    __obj.updateDynamic("TextPath")(TextPath.toJsFn)
    __obj.updateDynamic("createSurface")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.HTMLElement, t1: java.lang.String, t2: java.lang.String) => createSurface(t0, t1, t2).runNow()))
    __obj.asInstanceOf[canvasWithEvents]
  }
}

