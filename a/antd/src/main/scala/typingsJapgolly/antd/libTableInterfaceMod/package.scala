package typingsJapgolly.antd.libTableInterfaceMod

import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ColumnTitle[RecordType] = Node | (js.Function1[/* props */ ColumnTitleProps[RecordType], Node])

type ColumnsType[RecordType] = js.Array[ColumnGroupType[RecordType] | ColumnType[RecordType]]

type CompareFn[T] = js.Function3[/* a */ T, /* b */ T, /* sortOrder */ js.UndefOr[SortOrder], Double]

/* Rewritten from type alias, can be one of: 
  - scala.Null
  - typingsJapgolly.antd.antdStrings.row
  - typingsJapgolly.antd.antdStrings.nest
*/
type ExpandType = _ExpandType | Null

type FilterKey = js.Array[Key] | Null

type FilterSearchType[RecordType] = Boolean | (js.Function2[/* input */ String, /* record */ RecordType, Boolean])

type FilterValue = js.Array[Key | Boolean]

type GetPopupContainer = js.Function1[/* triggerNode */ HTMLElement, HTMLElement]

type Key = typingsJapgolly.react.mod.Key

type SelectionItemSelectFn = js.Function1[/* currentRowKeys */ js.Array[Key], Unit]

type SelectionSelectFn[T] = js.Function4[
/* record */ T, 
/* selected */ Boolean, 
/* selectedRows */ js.Array[T], 
/* nativeEvent */ Event, 
Unit]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.antd.antdStrings.descend
  - typingsJapgolly.antd.antdStrings.ascend
  - scala.Null
*/
type SortOrder = _SortOrder | Null

type TransformColumns[RecordType] = js.Function1[/* columns */ ColumnsType[RecordType], ColumnsType[RecordType]]
