package typingsJapgolly.fixedDataTable.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fixedDataTable.mod.CellProps
import typingsJapgolly.fixedDataTable.mod.ColumnGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColumnGroup {
  def apply(
    header: String | Element | (js.Function1[/* props */ CellProps, String | Element]),
    align: String = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ColumnGroupProps, 
    typingsJapgolly.fixedDataTable.mod.ColumnGroup, 
    Unit, 
    ColumnGroupProps
  ] = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.fixedDataTable.mod.ColumnGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.fixedDataTable.mod.ColumnGroup](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.fixedDataTable.mod.ColumnGroupProps])(children: _*)
  }
  @JSImport("fixed-data-table", "ColumnGroup")
  @js.native
  object componentImport extends js.Object
  
}

