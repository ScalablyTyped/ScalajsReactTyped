package typingsJapgolly.dojo.dojox.gfx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/canvas.html
  *
  * This the graphics rendering bridge for W3C Canvas compliant browsers.
  * Since Canvas is an immediate mode graphics api, with no object graph or
  * eventing capabilities, use of this module alone will only add in drawing support.
  * The additional module, canvasWithEvents extends this module with additional support
  * for handling events on Canvas.  By default, the support for events is now included
  * however, if only drawing capabilities are needed, canvas event module can be disabled
  * using the dojoConfig option, canvasEvents:true|false.
  * The id of the Canvas renderer is 'canvas'.  This id can be used when switch Dojo's
  * graphics context between renderer implementations.  See dojox/gfx/_base.switchRenderer
  * API.
  *
  */
trait canvas extends js.Object {
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
    *
    */
  def attachNode(): Unit
  /**
    *
    */
  def attachSurface(): Unit
  /**
    * creates a surface (Canvas)
    *
    * @param parentNode a parent node
    * @param width width of surface, e.g., "100px"
    * @param height height of surface, e.g., "100px"
    */
  def createSurface(parentNode: HTMLElement, width: String, height: String): js.Any
}

object canvas {
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
    attachNode: Callback,
    attachSurface: Callback,
    createSurface: (HTMLElement, String, String) => CallbackTo[js.Any]
  ): canvas = {
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
    __obj.updateDynamic("attachNode")(attachNode.toJsFn)
    __obj.updateDynamic("attachSurface")(attachSurface.toJsFn)
    __obj.updateDynamic("createSurface")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.HTMLElement, t1: java.lang.String, t2: java.lang.String) => createSurface(t0, t1, t2).runNow()))
    __obj.asInstanceOf[canvas]
  }
}

