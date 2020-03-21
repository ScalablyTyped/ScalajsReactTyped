package typingsJapgolly.dojo.dijit.base

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.dijit.place.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_base/place.html
  *
  * Deprecated back compatibility module, new code should use dijit/place directly instead of using this module.
  * 
  */
trait place extends js.Object {
  /**
    * Deprecated method, unneeded when using dijit/place directly.
    * Transforms the passed array of preferred positions into a format suitable for
    * passing as the aroundCorners argument to dijit/place.placeOnScreenAroundElement.
    * 
    * @param position This variable controls the position of the drop down.It's an array of strings with the following values:before: places drop down to the left of the target node/widget, or to the right inthe case of RTL scripts like Hebrew and Arabicafter: places drop down to the right of the target node/widget, or to the left inthe case of RTL scripts like Hebrew and Arabicabove: drop down goes above target nodebelow: drop down goes below target nodeThe list is positions is tried, in order, until a position is found where the drop down fitswithin the viewport.             
    * @param leftToRight Whether the popup will be displaying in leftToRight mode.             
    */
  def getPopupAroundAlignment(position: js.Array[String], leftToRight: Boolean): Unit
  /**
    * Deprecated method to return the dimensions and scroll position of the viewable area of a browser window.
    * New code should use windowUtils.getBox()
    * 
    */
  def getViewport(): Unit
  /**
    * Positions node kitty-corner to the rectangle centered at (pos.x, pos.y) with width and height of
    * padding.x  2 and padding.y  2, or zero if padding not specified.  Picks first corner in corners[]
    * where node is fully visible, or the corner where it's most visible.
    * 
    * Node is assumed to be absolutely or relatively positioned.
    * 
    * @param node The node to position             
    * @param pos Object like {x: 10, y: 20}             
    * @param corners Array of Strings representing order to try corners of the node in, like ["TR", "BL"].Possible values are:"BL" - bottom left"BR" - bottom right"TL" - top left"TR" - top right             
    * @param padding               OptionalOptional param to set padding, to put some buffer around the element you want to position.Defaults to zero.             
    * @param layoutNode For things like tooltip, they are displayed differently (and have different dimensions)based on their orientation relative to the parent.  This adjusts the popup based on orientation.             
    */
  def placeOnScreen(node: HTMLElement, pos: Position, corners: js.Array[String], padding: Position, layoutNode: js.Any): js.Any
  /**
    * Like dijit.placeOnScreenAroundNode(), except it accepts an arbitrary object
    * for the "around" argument and finds a proper processor to place a node.
    * Deprecated, new code should use dijit/place.around() instead.
    * 
    * @param node             
    * @param aroundNode             
    * @param aroundCorners             
    * @param layoutNode             
    */
  def placeOnScreenAroundElement(node: js.Any, aroundNode: js.Any, aroundCorners: js.Any, layoutNode: js.Any): Unit
  /**
    * Position node adjacent or kitty-corner to aroundNode
    * such that it's fully visible in viewport.
    * Deprecated, new code should use dijit/place.around() instead.
    * 
    * @param node             
    * @param aroundNode             
    * @param aroundCorners             
    * @param layoutNode             
    */
  def placeOnScreenAroundNode(node: js.Any, aroundNode: js.Any, aroundCorners: js.Any, layoutNode: js.Any): Unit
  /**
    * Like dijit.placeOnScreenAroundNode(), except that the "around"
    * parameter is an arbitrary rectangle on the screen (x, y, width, height)
    * instead of a dom node.
    * Deprecated, new code should use dijit/place.around() instead.
    * 
    * @param node             
    * @param aroundRect             
    * @param aroundCorners             
    * @param layoutNode             
    */
  def placeOnScreenAroundRectangle(node: js.Any, aroundRect: js.Any, aroundCorners: js.Any, layoutNode: js.Any): Unit
}

object place {
  @scala.inline
  def apply(
    getPopupAroundAlignment: (js.Array[String], Boolean) => Callback,
    getViewport: Callback,
    placeOnScreen: (HTMLElement, Position, js.Array[String], Position, js.Any) => CallbackTo[js.Any],
    placeOnScreenAroundElement: (js.Any, js.Any, js.Any, js.Any) => Callback,
    placeOnScreenAroundNode: (js.Any, js.Any, js.Any, js.Any) => Callback,
    placeOnScreenAroundRectangle: (js.Any, js.Any, js.Any, js.Any) => Callback
  ): place = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPopupAroundAlignment")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: scala.Boolean) => getPopupAroundAlignment(t0, t1).runNow()))
    __obj.updateDynamic("getViewport")(getViewport.toJsFn)
    __obj.updateDynamic("placeOnScreen")(js.Any.fromFunction5((t0: org.scalajs.dom.raw.HTMLElement, t1: typingsJapgolly.dojo.dijit.place.Position, t2: js.Array[java.lang.String], t3: typingsJapgolly.dojo.dijit.place.Position, t4: js.Any) => placeOnScreen(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("placeOnScreenAroundElement")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => placeOnScreenAroundElement(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("placeOnScreenAroundNode")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => placeOnScreenAroundNode(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("placeOnScreenAroundRectangle")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => placeOnScreenAroundRectangle(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[place]
  }
}

