package typingsJapgolly.reactTableFilter.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactTableFilter.mod.TabfilterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableFilter {
  def apply(
    rows: String | js.Array[String] | StringDictionary[Boolean],
    onFilterUpdate: (js.Array[String], js.Array[js.Any]) => CallbackTo[js.Array[js.Any] | Unit],
    initialFilters: String | js.Array[String] | StringDictionary[Boolean] = null,
    rowClass: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TabfilterProps, typingsJapgolly.reactTableFilter.mod.TableFilter, Unit, TabfilterProps] = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onFilterUpdate")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: js.Array[js.Any]) => onFilterUpdate(t0, t1).runNow()))
    if (initialFilters != null) __obj.updateDynamic("initialFilters")(initialFilters.asInstanceOf[js.Any])
    if (rowClass != null) __obj.updateDynamic("rowClass")(rowClass.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTableFilter.mod.TabfilterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTableFilter.mod.TableFilter](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTableFilter.mod.TabfilterProps])(children: _*)
  }
  @JSImport("react-table-filter", "TableFilter")
  @js.native
  object componentImport extends js.Object
  
}

