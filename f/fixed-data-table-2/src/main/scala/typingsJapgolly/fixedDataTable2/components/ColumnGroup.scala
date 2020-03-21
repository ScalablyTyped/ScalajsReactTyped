package typingsJapgolly.fixedDataTable2.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fixedDataTable2.fixedDataTable2Strings.center
import typingsJapgolly.fixedDataTable2.fixedDataTable2Strings.left
import typingsJapgolly.fixedDataTable2.fixedDataTable2Strings.right
import typingsJapgolly.fixedDataTable2.mod.ColumnGroupHeaderProps
import typingsJapgolly.fixedDataTable2.mod.ColumnGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColumnGroup {
  def apply(
    align: left | center | right = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    header: String | Element | (js.Function1[/* props */ ColumnGroupHeaderProps, String | Element]) = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ColumnGroupProps, 
    typingsJapgolly.fixedDataTable2.mod.ColumnGroup, 
    Unit, 
    ColumnGroupProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.fixedDataTable2.mod.ColumnGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.fixedDataTable2.mod.ColumnGroup](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.fixedDataTable2.mod.ColumnGroupProps])(children: _*)
  }
  @JSImport("fixed-data-table-2", "ColumnGroup")
  @js.native
  object componentImport extends js.Object
  
}

