package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List {
  def apply(
    className: String = null,
    dataSource: js.Array[_] = null,
    id: String = null,
    modifier: String = null,
    renderFooter: js.UndefOr[CallbackTo[js.UndefOr[Element]]] = js.undefined,
    renderHeader: js.UndefOr[CallbackTo[js.UndefOr[Element]]] = js.undefined,
    renderRow: (/* row */ js.Any, /* index */ js.UndefOr[Double]) => CallbackTo[js.UndefOr[Element]] = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HTMLAttributesidclassNameDataSource, 
    typingsJapgolly.reactOnsenui.mod.List, 
    Unit, 
    HTMLAttributesidclassNameDataSource
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    renderFooter.foreach(p => __obj.updateDynamic("renderFooter")(p.toJsFn))
    renderHeader.foreach(p => __obj.updateDynamic("renderHeader")(p.toJsFn))
    if (renderRow != null) __obj.updateDynamic("renderRow")(js.Any.fromFunction2((t0: /* row */ js.Any, t1: /* index */ js.UndefOr[scala.Double]) => renderRow(t0, t1).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameDataSource, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOnsenui.mod.List](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameDataSource])(children: _*)
  }
  @JSImport("react-onsenui", "List")
  @js.native
  object componentImport extends js.Object
  
}

