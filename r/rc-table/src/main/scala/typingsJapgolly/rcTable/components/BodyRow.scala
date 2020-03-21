package typingsJapgolly.rcTable.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcTable.AnonChildren
import typingsJapgolly.rcTable.bodyRowMod.BodyRowProps
import typingsJapgolly.rcTable.interfaceMod.CustomizeComponent
import typingsJapgolly.rcTable.interfaceMod.Key
import typingsJapgolly.rcTable.interfaceMod.StickyOffsets
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BodyRow {
  def apply[RecordType /* <: AnonChildren[RecordType] */](
    cellComponent: CustomizeComponent[HTMLAttributes[HTMLElement]],
    childrenColumnName: String,
    expandedKeys: Set[Key],
    index: Double,
    record: RecordType,
    recordKey: Key,
    rowComponent: CustomizeComponent[HTMLAttributes[HTMLElement]],
    rowKey: typingsJapgolly.react.mod.Key,
    stickyOffsets: StickyOffsets,
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => CallbackTo[Key],
    onRow: (RecordType, /* index */ js.UndefOr[Double]) => CallbackTo[HTMLAttributes[HTMLElement]],
    rowExpandable: RecordType => CallbackTo[Boolean],
    className: String = null,
    indent: Int | Double = null,
    style: CSSProperties = null,
    key: js.UndefOr[japgolly.scalajs.react.Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    BodyRowProps[RecordType], 
    MountedWithRawType[BodyRowProps[RecordType], js.Object, RawMounted[BodyRowProps[RecordType], js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], childrenColumnName = childrenColumnName.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any], rowComponent = rowComponent.asInstanceOf[js.Any], rowKey = rowKey.asInstanceOf[js.Any], stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
  
      __obj.updateDynamic("getRowKey")(js.Any.fromFunction2((t0: RecordType, t1: /* index */ js.UndefOr[scala.Double]) => getRowKey(t0, t1).runNow()))
    __obj.updateDynamic("onRow")(js.Any.fromFunction2((t0: RecordType, t1: /* index */ js.UndefOr[scala.Double]) => onRow(t0, t1).runNow()))
    __obj.updateDynamic("rowExpandable")(js.Any.fromFunction1((t0: RecordType) => rowExpandable(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.rcTable.bodyRowMod.BodyRowProps[RecordType], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcTable.bodyRowMod.BodyRowProps[RecordType]])(children: _*)
  }
  @JSImport("rc-table/lib/Body/BodyRow", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

