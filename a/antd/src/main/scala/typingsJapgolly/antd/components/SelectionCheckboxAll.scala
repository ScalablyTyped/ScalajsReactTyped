package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.Anon_DefaultChecked
import typingsJapgolly.antd.libTableCreateStoreMod.Store
import typingsJapgolly.antd.libTableInterfaceMod.SelectionCheckboxAllProps
import typingsJapgolly.antd.libTableInterfaceMod.SelectionItem
import typingsJapgolly.antd.libTableInterfaceMod.TableLocale
import typingsJapgolly.antd.libTableSelectionCheckboxAllMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SelectionCheckboxAll {
  def apply[T](
    data: js.Array[T],
    disabled: Boolean,
    locale: TableLocale,
    store: Store,
    getCheckboxPropsByItem: (T, Double) => CallbackTo[Anon_DefaultChecked],
    getRecordKey: (T, js.UndefOr[Double]) => CallbackTo[String],
    onSelect: (String, Double, js.Any) => Callback,
    getPopupContainer: /* triggerNode */ js.UndefOr[HTMLElement] => CallbackTo[HTMLElement] = null,
    hideDefaultSelections: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    selections: js.Array[SelectionItem] | Boolean = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SelectionCheckboxAllProps[T], default[T], Unit, SelectionCheckboxAllProps[T]] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
  
      __obj.updateDynamic("getCheckboxPropsByItem")(js.Any.fromFunction2((t0: T, t1: scala.Double) => getCheckboxPropsByItem(t0, t1).runNow()))
    __obj.updateDynamic("getRecordKey")(js.Any.fromFunction2((t0: T, t1: js.UndefOr[scala.Double]) => getRecordKey(t0, t1).runNow()))
    __obj.updateDynamic("onSelect")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: js.Any) => onSelect(t0, t1, t2).runNow()))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* triggerNode */ js.UndefOr[org.scalajs.dom.raw.HTMLElement]) => getPopupContainer(t0).runNow()))
    if (!js.isUndefined(hideDefaultSelections)) __obj.updateDynamic("hideDefaultSelections")(hideDefaultSelections.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (selections != null) __obj.updateDynamic("selections")(selections.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libTableInterfaceMod.SelectionCheckboxAllProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libTableSelectionCheckboxAllMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libTableInterfaceMod.SelectionCheckboxAllProps[T]])(children: _*)
  }
  @JSImport("antd/lib/table/SelectionCheckboxAll", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

