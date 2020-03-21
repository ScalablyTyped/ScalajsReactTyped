package typingsJapgolly.senchaTouch.Ext.event

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDom extends js.Object {
  /** [Property] (Number) */
  var distance: js.UndefOr[Double] = js.undefined
  /** [Method] Gets the x coordinate of the event
  		* @returns Number
  		*/
  var getPageX: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Gets the y coordinate of the event
  		* @returns Number
  		*/
  var getPageY: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Gets the target for the event
  		* @param selector String A simple selector to filter the target or look for an ancestor of the target
  		* @param maxDepth Number/Mixed The max depth to search as a number or element (defaults to 10 || document.body)
  		* @param returnEl Boolean true to return a Ext.Element object instead of DOM node.
  		* @returns HTMLElement
  		*/
  var getTarget: js.UndefOr[
    js.Function3[
      /* selector */ js.UndefOr[String], 
      /* maxDepth */ js.UndefOr[js.Any], 
      /* returnEl */ js.UndefOr[Boolean], 
      HTMLElement
    ]
  ] = js.undefined
  /** [Method] Returns the time of the event
  		* @returns Date
  		*/
  var getTime: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the X and Y coordinates of the event
  		* @returns Array
  		*/
  var getXY: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Property] (Number) */
  var pageX: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var pageY: js.UndefOr[Double] = js.undefined
  /** [Method] Prevents the browsers default handling of the event  */
  var preventDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (HTMLElement) */
  var target: js.UndefOr[HTMLElement] = js.undefined
}

object IDom {
  @scala.inline
  def apply(
    distance: Int | Double = null,
    getPageX: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getPageY: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getTarget: (/* selector */ js.UndefOr[String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => CallbackTo[HTMLElement] = null,
    getTime: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getXY: js.UndefOr[CallbackTo[Array]] = js.undefined,
    pageX: Int | Double = null,
    pageY: Int | Double = null,
    preventDefault: js.UndefOr[Callback] = js.undefined,
    target: HTMLElement = null
  ): IDom = {
    val __obj = js.Dynamic.literal()
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    getPageX.foreach(p => __obj.updateDynamic("getPageX")(p.toJsFn))
    getPageY.foreach(p => __obj.updateDynamic("getPageY")(p.toJsFn))
    if (getTarget != null) __obj.updateDynamic("getTarget")(js.Any.fromFunction3((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* maxDepth */ js.UndefOr[js.Any], t2: /* returnEl */ js.UndefOr[scala.Boolean]) => getTarget(t0, t1, t2).runNow()))
    getTime.foreach(p => __obj.updateDynamic("getTime")(p.toJsFn))
    getXY.foreach(p => __obj.updateDynamic("getXY")(p.toJsFn))
    if (pageX != null) __obj.updateDynamic("pageX")(pageX.asInstanceOf[js.Any])
    if (pageY != null) __obj.updateDynamic("pageY")(pageY.asInstanceOf[js.Any])
    preventDefault.foreach(p => __obj.updateDynamic("preventDefault")(p.toJsFn))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDom]
  }
}

