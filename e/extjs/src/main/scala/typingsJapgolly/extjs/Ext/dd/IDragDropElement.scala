package typingsJapgolly.extjs.Ext.dd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragDropElement extends js.Object {
  /** [Method] Returns the X position of an html element
  		* @param el HTMLElement the element for which to get the position
  		* @returns Number the X coordinate
  		*/
  var getPosX: js.UndefOr[js.Function1[/* el */ js.UndefOr[HTMLElement], Double]] = js.undefined
  /** [Method] Returns the Y position of an html element
  		* @param el HTMLElement the element for which to get the position
  		* @returns Number the Y coordinate
  		*/
  var getPosY: js.UndefOr[js.Function1[/* el */ js.UndefOr[HTMLElement], Double]] = js.undefined
  /** [Method] Gets the scrollLeft
  		* @returns Number the document's scrollTop
  		*/
  var getScrollLeft: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Gets the scrollTop
  		* @returns Number the document's scrollTop
  		*/
  var getScrollTop: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the specified element style property
  		* @param el HTMLElement the element
  		* @param styleProp String the style property
  		* @returns String The value of the style property
  		*/
  var getStyle: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[HTMLElement], /* styleProp */ js.UndefOr[String], String]
  ] = js.undefined
  /** [Method] Recursively searches the immediate parent and all child nodes for the handle element in order to determine wheter or
  		* @param node HTMLElement the html element to inspect
  		*/
  var handleWasClicked: js.UndefOr[js.Function1[/* node */ js.UndefOr[HTMLElement], Unit]] = js.undefined
  /** [Method] Sets the x y position of an element to the location of the target element
  		* @param moveEl HTMLElement The element to move
  		* @param targetEl HTMLElement The position reference element
  		*/
  var moveToEl: js.UndefOr[
    js.Function2[/* moveEl */ js.UndefOr[HTMLElement], /* targetEl */ js.UndefOr[HTMLElement], Unit]
  ] = js.undefined
  /** [Method] Numeric array sort function
  		* @param a Number
  		* @param b Number
  		* @returns Number positive, negative or 0
  		*/
  var numericSort: js.UndefOr[js.Function2[/* a */ js.UndefOr[Double], /* b */ js.UndefOr[Double], Double]] = js.undefined
  /** [Method] Swap two nodes
  		* @param n1 HTMLElement the first node to swap
  		* @param n2 HTMLElement the other node to swap
  		*/
  var swapNode: js.UndefOr[
    js.Function2[/* n1 */ js.UndefOr[HTMLElement], /* n2 */ js.UndefOr[HTMLElement], Unit]
  ] = js.undefined
}

object IDragDropElement {
  @scala.inline
  def apply(
    getPosX: /* el */ js.UndefOr[HTMLElement] => CallbackTo[Double] = null,
    getPosY: /* el */ js.UndefOr[HTMLElement] => CallbackTo[Double] = null,
    getScrollLeft: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getScrollTop: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getStyle: (/* el */ js.UndefOr[HTMLElement], /* styleProp */ js.UndefOr[String]) => CallbackTo[String] = null,
    handleWasClicked: /* node */ js.UndefOr[HTMLElement] => Callback = null,
    moveToEl: (/* moveEl */ js.UndefOr[HTMLElement], /* targetEl */ js.UndefOr[HTMLElement]) => Callback = null,
    numericSort: (/* a */ js.UndefOr[Double], /* b */ js.UndefOr[Double]) => CallbackTo[Double] = null,
    swapNode: (/* n1 */ js.UndefOr[HTMLElement], /* n2 */ js.UndefOr[HTMLElement]) => Callback = null
  ): IDragDropElement = {
    val __obj = js.Dynamic.literal()
    if (getPosX != null) __obj.updateDynamic("getPosX")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[org.scalajs.dom.raw.HTMLElement]) => getPosX(t0).runNow()))
    if (getPosY != null) __obj.updateDynamic("getPosY")(js.Any.fromFunction1((t0: /* el */ js.UndefOr[org.scalajs.dom.raw.HTMLElement]) => getPosY(t0).runNow()))
    getScrollLeft.foreach(p => __obj.updateDynamic("getScrollLeft")(p.toJsFn))
    getScrollTop.foreach(p => __obj.updateDynamic("getScrollTop")(p.toJsFn))
    if (getStyle != null) __obj.updateDynamic("getStyle")(js.Any.fromFunction2((t0: /* el */ js.UndefOr[org.scalajs.dom.raw.HTMLElement], t1: /* styleProp */ js.UndefOr[java.lang.String]) => getStyle(t0, t1).runNow()))
    if (handleWasClicked != null) __obj.updateDynamic("handleWasClicked")(js.Any.fromFunction1((t0: /* node */ js.UndefOr[org.scalajs.dom.raw.HTMLElement]) => handleWasClicked(t0).runNow()))
    if (moveToEl != null) __obj.updateDynamic("moveToEl")(js.Any.fromFunction2((t0: /* moveEl */ js.UndefOr[org.scalajs.dom.raw.HTMLElement], t1: /* targetEl */ js.UndefOr[org.scalajs.dom.raw.HTMLElement]) => moveToEl(t0, t1).runNow()))
    if (numericSort != null) __obj.updateDynamic("numericSort")(js.Any.fromFunction2((t0: /* a */ js.UndefOr[scala.Double], t1: /* b */ js.UndefOr[scala.Double]) => numericSort(t0, t1).runNow()))
    if (swapNode != null) __obj.updateDynamic("swapNode")(js.Any.fromFunction2((t0: /* n1 */ js.UndefOr[org.scalajs.dom.raw.HTMLElement], t1: /* n2 */ js.UndefOr[org.scalajs.dom.raw.HTMLElement]) => swapNode(t0, t1).runNow()))
    __obj.asInstanceOf[IDragDropElement]
  }
}

