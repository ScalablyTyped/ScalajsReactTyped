package typingsJapgolly.rcTable.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcTable.fixedHeaderMod.FixedHeaderProps
import typingsJapgolly.rcTable.interfaceMod.ColumnType
import typingsJapgolly.rcTable.interfaceMod.ColumnsType
import typingsJapgolly.rcTable.interfaceMod.StickyOffsets
import typingsJapgolly.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FixedHeader {
  def apply[RecordType](
    colWidths: js.Array[Double],
    columCount: Double,
    columns: ColumnsType[RecordType],
    flattenColumns: js.Array[ColumnType[RecordType]],
    stickyOffsets: StickyOffsets,
    onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => CallbackTo[HTMLAttributes[HTMLElement]],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    FixedHeaderProps[RecordType], 
    MountedWithRawType[
      FixedHeaderProps[RecordType], 
      js.Object, 
      RawMounted[FixedHeaderProps[RecordType], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(colWidths = colWidths.asInstanceOf[js.Any], columCount = columCount.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onHeaderRow")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.rcTable.interfaceMod.ColumnType[RecordType]], t1: /* index */ js.UndefOr[scala.Double]) => onHeaderRow(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.rcTable.fixedHeaderMod.FixedHeaderProps[RecordType], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcTable.fixedHeaderMod.FixedHeaderProps[RecordType]])(children: _*)
  }
  @JSImport("rc-table/lib/Header/FixedHeader", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

