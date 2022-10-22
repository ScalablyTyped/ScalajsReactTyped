package typingsJapgolly.rcTable.libInterfaceMod

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.rcTable.anon.OnScroll
import typingsJapgolly.rcTable.anon.ShowTitle
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.TdHTMLAttributes
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CellEllipsisType = ShowTitle | Boolean

type ColumnsType[RecordType] = js.Array[ColumnGroupType[RecordType] | ColumnType[RecordType]]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.react.mod.ComponentType[P]
  - typingsJapgolly.react.mod.ForwardRefExoticComponent[P]
  - typingsJapgolly.react.mod.FC[P]
  - typingsJapgolly.rcTable.rcTableStrings.a
  - typingsJapgolly.rcTable.rcTableStrings.abbr
  - typingsJapgolly.rcTable.rcTableStrings.address
  - typingsJapgolly.rcTable.rcTableStrings.area
  - typingsJapgolly.rcTable.rcTableStrings.article
  - typingsJapgolly.rcTable.rcTableStrings.aside
  - typingsJapgolly.rcTable.rcTableStrings.audio
  - typingsJapgolly.rcTable.rcTableStrings.b
  - typingsJapgolly.rcTable.rcTableStrings.base
  - typingsJapgolly.rcTable.rcTableStrings.bdi
  - typingsJapgolly.rcTable.rcTableStrings.bdo
  - typingsJapgolly.rcTable.rcTableStrings.big
  - typingsJapgolly.rcTable.rcTableStrings.blockquote
  - typingsJapgolly.rcTable.rcTableStrings.body
  - typingsJapgolly.rcTable.rcTableStrings.br
  - typingsJapgolly.rcTable.rcTableStrings.button
  - typingsJapgolly.rcTable.rcTableStrings.canvas
  - typingsJapgolly.rcTable.rcTableStrings.caption
  - typingsJapgolly.rcTable.rcTableStrings.cite
  - typingsJapgolly.rcTable.rcTableStrings.code
  - typingsJapgolly.rcTable.rcTableStrings.col
  - typingsJapgolly.rcTable.rcTableStrings.colgroup
  - typingsJapgolly.rcTable.rcTableStrings.data
  - typingsJapgolly.rcTable.rcTableStrings.datalist
  - typingsJapgolly.rcTable.rcTableStrings.dd
  - typingsJapgolly.rcTable.rcTableStrings.del
  - typingsJapgolly.rcTable.rcTableStrings.details
  - typingsJapgolly.rcTable.rcTableStrings.dfn
  - typingsJapgolly.rcTable.rcTableStrings.dialog
  - typingsJapgolly.rcTable.rcTableStrings.div
  - typingsJapgolly.rcTable.rcTableStrings.dl
  - typingsJapgolly.rcTable.rcTableStrings.dt
  - typingsJapgolly.rcTable.rcTableStrings.em
  - typingsJapgolly.rcTable.rcTableStrings.embed
  - typingsJapgolly.rcTable.rcTableStrings.fieldset
  - typingsJapgolly.rcTable.rcTableStrings.figcaption
  - typingsJapgolly.rcTable.rcTableStrings.figure
  - typingsJapgolly.rcTable.rcTableStrings.footer
  - typingsJapgolly.rcTable.rcTableStrings.form
  - typingsJapgolly.rcTable.rcTableStrings.h1
  - typingsJapgolly.rcTable.rcTableStrings.h2
  - typingsJapgolly.rcTable.rcTableStrings.h3
  - typingsJapgolly.rcTable.rcTableStrings.h4
  - typingsJapgolly.rcTable.rcTableStrings.h5
  - typingsJapgolly.rcTable.rcTableStrings.h6
  - typingsJapgolly.rcTable.rcTableStrings.head
  - typingsJapgolly.rcTable.rcTableStrings.header
  - typingsJapgolly.rcTable.rcTableStrings.hgroup
  - typingsJapgolly.rcTable.rcTableStrings.hr
  - typingsJapgolly.rcTable.rcTableStrings.html
  - typingsJapgolly.rcTable.rcTableStrings.i
  - typingsJapgolly.rcTable.rcTableStrings.iframe
  - typingsJapgolly.rcTable.rcTableStrings.img
  - typingsJapgolly.rcTable.rcTableStrings.input
  - typingsJapgolly.rcTable.rcTableStrings.ins
  - typingsJapgolly.rcTable.rcTableStrings.kbd
  - typingsJapgolly.rcTable.rcTableStrings.keygen
  - typingsJapgolly.rcTable.rcTableStrings.label
  - typingsJapgolly.rcTable.rcTableStrings.legend
  - typingsJapgolly.rcTable.rcTableStrings.li
  - typingsJapgolly.rcTable.rcTableStrings.link
  - typingsJapgolly.rcTable.rcTableStrings.main
  - typingsJapgolly.rcTable.rcTableStrings.map
  - typingsJapgolly.rcTable.rcTableStrings.mark
  - typingsJapgolly.rcTable.rcTableStrings.menu
  - typingsJapgolly.rcTable.rcTableStrings.menuitem
  - typingsJapgolly.rcTable.rcTableStrings.meta
  - typingsJapgolly.rcTable.rcTableStrings.meter
  - typingsJapgolly.rcTable.rcTableStrings.nav
  - typingsJapgolly.rcTable.rcTableStrings.noscript
  - typingsJapgolly.rcTable.rcTableStrings.`object`
  - typingsJapgolly.rcTable.rcTableStrings.ol
  - typingsJapgolly.rcTable.rcTableStrings.optgroup
  - typingsJapgolly.rcTable.rcTableStrings.option
  - typingsJapgolly.rcTable.rcTableStrings.output
  - typingsJapgolly.rcTable.rcTableStrings.p
  - typingsJapgolly.rcTable.rcTableStrings.param
  - typingsJapgolly.rcTable.rcTableStrings.picture
  - typingsJapgolly.rcTable.rcTableStrings.pre
  - typingsJapgolly.rcTable.rcTableStrings.progress
  - typingsJapgolly.rcTable.rcTableStrings.q
  - typingsJapgolly.rcTable.rcTableStrings.rp
  - typingsJapgolly.rcTable.rcTableStrings.rt
  - typingsJapgolly.rcTable.rcTableStrings.ruby
  - typingsJapgolly.rcTable.rcTableStrings.s
  - typingsJapgolly.rcTable.rcTableStrings.samp
  - typingsJapgolly.rcTable.rcTableStrings.slot
  - typingsJapgolly.rcTable.rcTableStrings.script
  - typingsJapgolly.rcTable.rcTableStrings.section
  - typingsJapgolly.rcTable.rcTableStrings.select
  - typingsJapgolly.rcTable.rcTableStrings.small
  - typingsJapgolly.rcTable.rcTableStrings.source
  - typingsJapgolly.rcTable.rcTableStrings.span
  - typingsJapgolly.rcTable.rcTableStrings.strong
  - typingsJapgolly.rcTable.rcTableStrings.style
  - typingsJapgolly.rcTable.rcTableStrings.sub
  - typingsJapgolly.rcTable.rcTableStrings.summary
  - typingsJapgolly.rcTable.rcTableStrings.sup
  - typingsJapgolly.rcTable.rcTableStrings.table
  - typingsJapgolly.rcTable.rcTableStrings.template
  - typingsJapgolly.rcTable.rcTableStrings.tbody
  - typingsJapgolly.rcTable.rcTableStrings.td
  - typingsJapgolly.rcTable.rcTableStrings.textarea
  - typingsJapgolly.rcTable.rcTableStrings.tfoot
  - typingsJapgolly.rcTable.rcTableStrings.th
  - typingsJapgolly.rcTable.rcTableStrings.thead
  - typingsJapgolly.rcTable.rcTableStrings.time
  - typingsJapgolly.rcTable.rcTableStrings.title
  - typingsJapgolly.rcTable.rcTableStrings.tr
  - typingsJapgolly.rcTable.rcTableStrings.track
  - typingsJapgolly.rcTable.rcTableStrings.u
  - typingsJapgolly.rcTable.rcTableStrings.ul
  - typingsJapgolly.rcTable.rcTableStrings.`var`
  - typingsJapgolly.rcTable.rcTableStrings.video
  - typingsJapgolly.rcTable.rcTableStrings.wbr
  - typingsJapgolly.rcTable.rcTableStrings.webview
*/
type Component[P] = _Component[P] | ComponentType[P] | ForwardRefExoticComponent[P] | FC[P]

type CustomizeComponent = Component[Any]

type CustomizeScrollBody[RecordType] = js.Function2[/* data */ js.Array[RecordType], /* info */ OnScroll, Node]

type DataIndex = String | Double | (js.Array[String | Double])

type DefaultRecordType = Record[String, Any]

type ExpandedRowRender[ValueType] = js.Function4[
/* record */ ValueType, 
/* index */ Double, 
/* indent */ Double, 
/* expanded */ Boolean, 
Node]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rcTable.rcTableStrings.left
  - typingsJapgolly.rcTable.rcTableStrings.right
  - scala.Boolean
*/
type FixedType = _FixedType | Boolean

type GetComponent = js.Function2[
/* path */ js.Array[String], 
/* defaultComponent */ js.UndefOr[CustomizeComponent], 
CustomizeComponent]

type GetComponentProps[DataType] = js.Function2[
/* data */ DataType, 
/* index */ js.UndefOr[Double], 
HTMLAttributes[Any] | TdHTMLAttributes[Any]]

type GetRowKey[RecordType] = js.Function2[/* record */ RecordType, /* index */ js.UndefOr[Double], Key]

type Key = typingsJapgolly.react.mod.Key

type PanelRender[RecordType] = js.Function1[/* data */ js.Array[RecordType], Node]

type RenderExpandIcon[RecordType] = js.Function1[/* props */ RenderExpandIconProps[RecordType], Node]

type RowClassName[RecordType] = js.Function3[/* record */ RecordType, /* index */ Double, /* indent */ Double, String]

type TriggerEventHandler[RecordType] = js.Function2[/* record */ RecordType, /* event */ ReactMouseEventFrom[HTMLElement], Unit]
