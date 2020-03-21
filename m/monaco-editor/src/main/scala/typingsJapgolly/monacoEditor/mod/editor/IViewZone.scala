package typingsJapgolly.monacoEditor.mod.editor

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewZone extends js.Object {
  /**
    * The column after which this zone should appear.
    * If not set, the maxLineColumn of `afterLineNumber` will be used.
    */
  var afterColumn: js.UndefOr[Double] = js.undefined
  /**
    * The line number after which this zone should appear.
    * Use 0 to place a view zone before the first line number.
    */
  var afterLineNumber: Double
  /**
    * The dom node of the view zone
    */
  var domNode: HTMLElement
  /**
    * The height in lines of the view zone.
    * If specified, `heightInPx` will be used instead of this.
    * If neither `heightInPx` nor `heightInLines` is specified, a default of `heightInLines` = 1 will be chosen.
    */
  var heightInLines: js.UndefOr[Double] = js.undefined
  /**
    * The height in px of the view zone.
    * If this is set, the editor will give preference to it rather than `heightInLines` above.
    * If neither `heightInPx` nor `heightInLines` is specified, a default of `heightInLines` = 1 will be chosen.
    */
  var heightInPx: js.UndefOr[Double] = js.undefined
  /**
    * An optional dom node for the view zone that will be placed in the margin area.
    */
  var marginDomNode: js.UndefOr[HTMLElement | Null] = js.undefined
  /**
    * The minimum width in px of the view zone.
    * If this is set, the editor will ensure that the scroll width is >= than this value.
    */
  var minWidthInPx: js.UndefOr[Double] = js.undefined
  /**
    * Callback which gives the height in pixels of the view zone.
    */
  var onComputedHeight: js.UndefOr[js.Function1[/* height */ Double, Unit]] = js.undefined
  /**
    * Callback which gives the relative top of the view zone as it appears (taking scrolling into account).
    */
  var onDomNodeTop: js.UndefOr[js.Function1[/* top */ Double, Unit]] = js.undefined
  /**
    * Suppress mouse down events.
    * If set, the editor will attach a mouse down listener to the view zone and .preventDefault on it.
    * Defaults to false
    */
  var suppressMouseDown: js.UndefOr[Boolean] = js.undefined
}

object IViewZone {
  @scala.inline
  def apply(
    afterLineNumber: Double,
    domNode: HTMLElement,
    afterColumn: Int | Double = null,
    heightInLines: Int | Double = null,
    heightInPx: Int | Double = null,
    marginDomNode: HTMLElement = null,
    minWidthInPx: Int | Double = null,
    onComputedHeight: /* height */ Double => Callback = null,
    onDomNodeTop: /* top */ Double => Callback = null,
    suppressMouseDown: js.UndefOr[Boolean] = js.undefined
  ): IViewZone = {
    val __obj = js.Dynamic.literal(afterLineNumber = afterLineNumber.asInstanceOf[js.Any], domNode = domNode.asInstanceOf[js.Any])
    if (afterColumn != null) __obj.updateDynamic("afterColumn")(afterColumn.asInstanceOf[js.Any])
    if (heightInLines != null) __obj.updateDynamic("heightInLines")(heightInLines.asInstanceOf[js.Any])
    if (heightInPx != null) __obj.updateDynamic("heightInPx")(heightInPx.asInstanceOf[js.Any])
    if (marginDomNode != null) __obj.updateDynamic("marginDomNode")(marginDomNode.asInstanceOf[js.Any])
    if (minWidthInPx != null) __obj.updateDynamic("minWidthInPx")(minWidthInPx.asInstanceOf[js.Any])
    if (onComputedHeight != null) __obj.updateDynamic("onComputedHeight")(js.Any.fromFunction1((t0: /* height */ scala.Double) => onComputedHeight(t0).runNow()))
    if (onDomNodeTop != null) __obj.updateDynamic("onDomNodeTop")(js.Any.fromFunction1((t0: /* top */ scala.Double) => onDomNodeTop(t0).runNow()))
    if (!js.isUndefined(suppressMouseDown)) __obj.updateDynamic("suppressMouseDown")(suppressMouseDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewZone]
  }
}

