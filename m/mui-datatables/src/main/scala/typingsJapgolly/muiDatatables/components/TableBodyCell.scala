package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.muiDatatables.mod.MUIDataTableBodyCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableBodyCell {
  def apply(
    className: String = null,
    classes: js.Object = null,
    colIndex: Int | Double = null,
    columnHeader: js.Any = null,
    dataIndex: Int | Double = null,
    options: js.Object = null,
    otherProps: js.Any = null,
    rowIndex: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Any = null
  ): UnmountedSimple[
    MUIDataTableBodyCell, 
    MountedWithRawType[MUIDataTableBodyCell, js.Object, RawMounted[MUIDataTableBodyCell, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (colIndex != null) __obj.updateDynamic("colIndex")(colIndex.asInstanceOf[js.Any])
    if (columnHeader != null) __obj.updateDynamic("columnHeader")(columnHeader.asInstanceOf[js.Any])
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (otherProps != null) __obj.updateDynamic("otherProps")(otherProps.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.muiDatatables.mod.MUIDataTableBodyCell, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.muiDatatables.mod.MUIDataTableBodyCell])
  }
  @JSImport("mui-datatables", "TableBodyCell")
  @js.native
  object componentImport extends js.Object
  
}

