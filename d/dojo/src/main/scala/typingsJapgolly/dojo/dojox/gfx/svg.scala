package typingsJapgolly.dojo.dojox.gfx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/svg.html
  *
  * This the graphics rendering bridge for browsers compliant with W3C SVG1.0.
  * This is the preferred renderer to use for interactive and accessible graphics.
  *
  */
trait svg extends js.Object {
  /**
    *
    */
  var dasharray: js.Object
  /**
    *
    */
  var useSvgWeb: Boolean
  /**
    *
    */
  var xmlns: js.Object
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
    * creates a shape from a Node
    *
    * @param node an SVG node
    */
  def attachNode(node: HTMLElement): Unit
  /**
    * creates a surface from a Node
    *
    * @param node an SVG node
    */
  def attachSurface(node: HTMLElement): Unit
  /**
    *
    * @param parentNode
    * @param width
    * @param height
    */
  def createSurface(parentNode: js.Any, width: js.Any, height: js.Any): Unit
  /**
    * Adds the gfxElement to event.gfxTarget if none exists. This new
    * property will carry the GFX element associated with this event.
    *
    * @param event The current input event (MouseEvent or TouchEvent)
    * @param gfxElement The GFX target element
    */
  def fixTarget(event: js.Object, gfxElement: js.Object): Unit
  /**
    * looks up a node by its external name
    *
    * @param name an SVG external reference
    */
  def getRef(name: String): js.Any
}

object svg {
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
    attachNode: HTMLElement => Callback,
    attachSurface: HTMLElement => Callback,
    createSurface: (js.Any, js.Any, js.Any) => Callback,
    dasharray: js.Object,
    fixTarget: (js.Object, js.Object) => Callback,
    getRef: String => CallbackTo[js.Any],
    useSvgWeb: Boolean,
    xmlns: js.Object
  ): svg = {
    val __obj = js.Dynamic.literal(dasharray = dasharray.asInstanceOf[js.Any], useSvgWeb = useSvgWeb.asInstanceOf[js.Any], xmlns = xmlns.asInstanceOf[js.Any])
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
    __obj.updateDynamic("attachNode")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => attachNode(t0).runNow()))
    __obj.updateDynamic("attachSurface")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => attachSurface(t0).runNow()))
    __obj.updateDynamic("createSurface")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => createSurface(t0, t1, t2).runNow()))
    __obj.updateDynamic("fixTarget")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => fixTarget(t0, t1).runNow()))
    __obj.updateDynamic("getRef")(js.Any.fromFunction1((t0: java.lang.String) => getRef(t0).runNow()))
    __obj.asInstanceOf[svg]
  }
}

