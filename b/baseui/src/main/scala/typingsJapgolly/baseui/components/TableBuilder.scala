package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.baseuiStrings.ASC
import typingsJapgolly.baseui.baseuiStrings.DESC
import typingsJapgolly.baseui.tableSemanticMod.BuilderOverrides
import typingsJapgolly.baseui.tableSemanticMod.TableBuilderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableBuilder {
  def apply[RowT](
    data: js.Array[RowT],
    horizontalScrollWidth: String = null,
    onSort: /* columnId */ String => Callback = null,
    overrides: BuilderOverrides = null,
    sortColumn: String = null,
    sortOrder: ASC | DESC = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    TableBuilderProps[RowT], 
    typingsJapgolly.baseui.tableSemanticMod.TableBuilder[RowT], 
    Unit, 
    TableBuilderProps[RowT]
  ] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
      if (horizontalScrollWidth != null) __obj.updateDynamic("horizontalScrollWidth")(horizontalScrollWidth.asInstanceOf[js.Any])
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction1((t0: /* columnId */ java.lang.String) => onSort(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (sortColumn != null) __obj.updateDynamic("sortColumn")(sortColumn.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.tableSemanticMod.TableBuilderProps[RowT], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.tableSemanticMod.TableBuilder[RowT]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.tableSemanticMod.TableBuilderProps[RowT]])(children: _*)
  }
  @JSImport("baseui/table-semantic", "TableBuilder")
  @js.native
  object componentImport extends js.Object
  
}

