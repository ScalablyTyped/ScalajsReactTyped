package typingsJapgolly.reactable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactable.AnonColumn
import typingsJapgolly.reactable.mod.ColumnsType
import typingsJapgolly.reactable.mod.TableComponentProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table {
  def apply[T](
    className: String = null,
    columns: js.Array[ColumnsType] = null,
    currentPage: Int | Double = null,
    data: js.Array[T] = null,
    defaultSort: AnonColumn = null,
    filterBy: String = null,
    filterable: js.Array[String] = null,
    hideFilterInput: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    itemsPerPage: Int | Double = null,
    noDataText: String = null,
    onFilter: /* text */ String => Callback = null,
    pageButtonLimit: Int | Double = null,
    sortBy: js.UndefOr[Boolean] = js.undefined,
    sortable: js.Array[String] | Boolean = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    TableComponentProperties[T], 
    typingsJapgolly.reactable.mod.Table[T], 
    Unit, 
    TableComponentProperties[T]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultSort != null) __obj.updateDynamic("defaultSort")(defaultSort.asInstanceOf[js.Any])
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy.asInstanceOf[js.Any])
    if (filterable != null) __obj.updateDynamic("filterable")(filterable.asInstanceOf[js.Any])
    if (!js.isUndefined(hideFilterInput)) __obj.updateDynamic("hideFilterInput")(hideFilterInput.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => onFilter(t0).runNow()))
    if (pageButtonLimit != null) __obj.updateDynamic("pageButtonLimit")(pageButtonLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(sortBy)) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    if (sortable != null) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactable.mod.TableComponentProperties[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactable.mod.Table[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactable.mod.TableComponentProperties[T]])(children: _*)
  }
  @JSImport("reactable", "Table")
  @js.native
  object componentImport extends js.Object
  
}

