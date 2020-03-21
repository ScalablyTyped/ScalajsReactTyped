package typingsJapgolly.dojo.dojox.gfx

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/silverlight.html
  *
  * This the graphics rendering bridge for the Microsoft Silverlight plugin.
  * Silverlight is a faster implementation on IE6-8 than the default 2d graphics, VML
  *
  */
trait silverlight extends js.Object {
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
    * @param node a Silverlight node
    */
  def attachNode(node: HTMLElement): Unit
  /**
    * creates a surface from a Node
    *
    * @param node a Silverlight node
    */
  def attachSurface(node: HTMLElement): Unit
  /**
    * creates a surface (Silverlight)
    *
    * @param parentNode a parent node
    * @param width width of surface, e.g., "100px"
    * @param height height of surface, e.g., "100px"
    */
  def createSurface(parentNode: HTMLElement, width: String, height: String): Unit
}

object silverlight {
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
    createSurface: (HTMLElement, String, String) => Callback
  ): silverlight = {
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
    __obj.updateDynamic("attachNode")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => attachNode(t0).runNow()))
    __obj.updateDynamic("attachSurface")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => attachSurface(t0).runNow()))
    __obj.updateDynamic("createSurface")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.HTMLElement, t1: java.lang.String, t2: java.lang.String) => createSurface(t0, t1, t2).runNow()))
    __obj.asInstanceOf[silverlight]
  }
}

