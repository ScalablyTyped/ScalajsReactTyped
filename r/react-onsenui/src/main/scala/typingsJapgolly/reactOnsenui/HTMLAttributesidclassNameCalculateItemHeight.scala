package typingsJapgolly.reactOnsenui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier ? :string,   length ? :number, renderRow (rowIndex : number): any, calculateItemHeight (rowIndex : number): any} */
trait HTMLAttributesidclassNameCalculateItemHeight extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  def calculateItemHeight(rowIndex: Double): js.Any
  def renderRow(rowIndex: Double): js.Any
}

object HTMLAttributesidclassNameCalculateItemHeight {
  @scala.inline
  def apply(
    calculateItemHeight: Double => CallbackTo[js.Any],
    renderRow: Double => CallbackTo[js.Any],
    className: String = null,
    id: String = null,
    length: Int | Double = null,
    modifier: String = null,
    style: CSSProperties = null
  ): HTMLAttributesidclassNameCalculateItemHeight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calculateItemHeight")(js.Any.fromFunction1((t0: scala.Double) => calculateItemHeight(t0).runNow()))
    __obj.updateDynamic("renderRow")(js.Any.fromFunction1((t0: scala.Double) => renderRow(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNameCalculateItemHeight]
  }
}

