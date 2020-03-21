package typingsJapgolly.reactOnsenui

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier ? :string,   dataSource ? :std.Array<any>,   renderRow ? :(row : any, index ? : number): react.react._Global_.JSX.Element | undefined,   renderFooter ? :(): react.react._Global_.JSX.Element | undefined,   renderHeader ? :(): react.react._Global_.JSX.Element | undefined} */
trait HTMLAttributesidclassNameDataSource extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[js.Array[_]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var renderFooter: js.UndefOr[js.Function0[js.UndefOr[Element]]] = js.undefined
  var renderHeader: js.UndefOr[js.Function0[js.UndefOr[Element]]] = js.undefined
  var renderRow: js.UndefOr[
    js.Function2[/* row */ js.Any, /* index */ js.UndefOr[Double], js.UndefOr[Element]]
  ] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HTMLAttributesidclassNameDataSource {
  @scala.inline
  def apply(
    className: String = null,
    dataSource: js.Array[_] = null,
    id: String = null,
    modifier: String = null,
    renderFooter: js.UndefOr[CallbackTo[js.UndefOr[Element]]] = js.undefined,
    renderHeader: js.UndefOr[CallbackTo[js.UndefOr[Element]]] = js.undefined,
    renderRow: (/* row */ js.Any, /* index */ js.UndefOr[Double]) => CallbackTo[js.UndefOr[Element]] = null,
    style: CSSProperties = null
  ): HTMLAttributesidclassNameDataSource = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    renderFooter.foreach(p => __obj.updateDynamic("renderFooter")(p.toJsFn))
    renderHeader.foreach(p => __obj.updateDynamic("renderHeader")(p.toJsFn))
    if (renderRow != null) __obj.updateDynamic("renderRow")(js.Any.fromFunction2((t0: /* row */ js.Any, t1: /* index */ js.UndefOr[scala.Double]) => renderRow(t0, t1).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNameDataSource]
  }
}

