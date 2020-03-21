package typingsJapgolly.griddleReact.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.griddleReact.mod.GriddleComponent
import typingsJapgolly.griddleReact.mod.components.CellProps
import typingsJapgolly.griddleReact.mod.components.ColumnDefinition
import typingsJapgolly.griddleReact.mod.components.ColumnDefinitionProps
import typingsJapgolly.griddleReact.mod.components.TableHeadingCellProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsColumnDefinition {
  def apply(
    id: String,
    StringDictionary: // Allow custom plugin props
  /* x */ StringDictionary[js.Any] = null,
    colSpan: Int | Double = null,
    cssClassName: String | (js.Function1[/* props */ js.Any, String]) = null,
    customComponent: GriddleComponent[CellProps with js.Any] = null,
    customHeadingComponent: GriddleComponent[TableHeadingCellProps with js.Any] = null,
    extraData: js.Any = null,
    filterable: js.UndefOr[Boolean] = js.undefined,
    headerCssClassName: String | (js.Function1[/* props */ js.Any, String]) = null,
    isMetadata: js.UndefOr[Boolean] = js.undefined,
    locked: js.UndefOr[Boolean] = js.undefined,
    order: Int | Double = null,
    sortMethod: (/* data */ js.Array[js.Any], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => CallbackTo[Double] = null,
    sortType: String = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ColumnDefinitionProps, ColumnDefinition, Unit, ColumnDefinitionProps] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (cssClassName != null) __obj.updateDynamic("cssClassName")(cssClassName.asInstanceOf[js.Any])
    if (customComponent != null) __obj.updateDynamic("customComponent")(customComponent.asInstanceOf[js.Any])
    if (customHeadingComponent != null) __obj.updateDynamic("customHeadingComponent")(customHeadingComponent.asInstanceOf[js.Any])
    if (extraData != null) __obj.updateDynamic("extraData")(extraData.asInstanceOf[js.Any])
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable.asInstanceOf[js.Any])
    if (headerCssClassName != null) __obj.updateDynamic("headerCssClassName")(headerCssClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(isMetadata)) __obj.updateDynamic("isMetadata")(isMetadata.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (sortMethod != null) __obj.updateDynamic("sortMethod")(js.Any.fromFunction3((t0: /* data */ js.Array[js.Any], t1: /* column */ java.lang.String, t2: /* sortAscending */ js.UndefOr[scala.Boolean]) => sortMethod(t0, t1, t2).runNow()))
    if (sortType != null) __obj.updateDynamic("sortType")(sortType.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.griddleReact.mod.components.ColumnDefinitionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.griddleReact.mod.components.ColumnDefinition](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.griddleReact.mod.components.ColumnDefinitionProps])(children: _*)
  }
  @JSImport("griddle-react", "components.ColumnDefinition")
  @js.native
  object componentImport extends js.Object
  
}

