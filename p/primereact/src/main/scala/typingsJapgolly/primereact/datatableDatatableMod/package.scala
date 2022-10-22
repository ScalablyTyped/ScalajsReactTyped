package typingsJapgolly.primereact.datatableDatatableMod

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.primereact.primereactStrings.self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DataTableAppendToType = js.UndefOr[self | HTMLElement | Null]

type DataTableEditingRows = StringDictionary[Boolean]

type DataTableEmptyMessageType = Node | (js.Function1[/* frozen */ Boolean, Node])

type DataTableExpandedRows = StringDictionary[Boolean]

type DataTableFilterMeta = StringDictionary[DataTableFilterMetaData | DataTableOperatorFilterMetaData]

type DataTableFooterTemplateOptions = DataTableHeaderTemplateOptions

type DataTableFooterTemplateType = Node | (js.Function1[/* options */ DataTableFooterTemplateOptions, Node])

type DataTableGlobalFilterType = js.UndefOr[String | Null]

type DataTableHeaderTemplateType = Node | (js.Function1[/* options */ DataTableHeaderTemplateOptions, Node])

type DataTableMultiSortMetaType = js.UndefOr[js.Array[DataTableSortMeta] | Null]

type DataTableRowGroupFooterTemplateType = Node | (js.Function2[/* data */ Any, /* options */ DataTableRowGroupFooterTemplateOptions, Node])

type DataTableRowGroupHeaderTemplateType = Node | (js.Function2[/* data */ Any, /* options */ DataTableRowGroupHeaderTemplateOptions, Node])

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.primereact.primereactInts.`1`
  - typingsJapgolly.primereact.primereactInts.`0`
  - typingsJapgolly.primereact.primereactInts.`-1`
  - scala.Unit
  - scala.Null
*/
type DataTableSortOrderType = js.UndefOr[_DataTableSortOrderType | Null]

type DataTableUnselectParams = DataTableSelectParams
