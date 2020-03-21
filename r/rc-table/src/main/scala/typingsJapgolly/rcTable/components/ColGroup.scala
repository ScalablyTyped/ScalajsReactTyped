package typingsJapgolly.rcTable.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcTable.colGroupMod.ColGroupProps
import typingsJapgolly.rcTable.interfaceMod.ColumnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColGroup {
  def apply[RecordType](
    colWidths: js.Array[Double | String],
    columCount: Int | Double = null,
    columns: js.Array[ColumnType[RecordType]] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ColGroupProps[RecordType], 
    MountedWithRawType[
      ColGroupProps[RecordType], 
      js.Object, 
      RawMounted[ColGroupProps[RecordType], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(colWidths = colWidths.asInstanceOf[js.Any])
  
      if (columCount != null) __obj.updateDynamic("columCount")(columCount.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.rcTable.colGroupMod.ColGroupProps[RecordType], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcTable.colGroupMod.ColGroupProps[RecordType]])(children: _*)
  }
  @JSImport("rc-table/lib/ColGroup", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

