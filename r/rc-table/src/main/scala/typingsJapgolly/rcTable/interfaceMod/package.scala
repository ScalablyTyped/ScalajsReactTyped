package typingsJapgolly.rcTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceMod {
  type ColumnsType[RecordType] = js.Array[
    typingsJapgolly.rcTable.interfaceMod.ColumnGroupType[RecordType] | typingsJapgolly.rcTable.interfaceMod.ColumnType[RecordType]
  ]
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
  type Component[P] = typingsJapgolly.rcTable.interfaceMod._Component[P] | typingsJapgolly.react.mod.ComponentType[P] | typingsJapgolly.react.mod.ForwardRefExoticComponent[P] | typingsJapgolly.react.mod.FC[P]
  type CustomizeComponent[P /* <: typingsJapgolly.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLElement] */] = typingsJapgolly.rcTable.interfaceMod.Component[P]
  type CustomizeScrollBody[RecordType] = js.Function2[
    /* data */ js.Array[RecordType], 
    /* info */ typingsJapgolly.rcTable.AnonOnScroll, 
    japgolly.scalajs.react.raw.React.Node
  ]
  type DataIndex = java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double])
  type DefaultRecordType = typingsJapgolly.std.Record[java.lang.String, js.Any]
  type ExpandedRowRender[ValueType] = js.Function4[
    /* record */ ValueType, 
    /* index */ scala.Double, 
    /* indent */ scala.Double, 
    /* expanded */ scala.Boolean, 
    japgolly.scalajs.react.raw.React.Node
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcTable.rcTableStrings.left
    - typingsJapgolly.rcTable.rcTableStrings.right
    - scala.Boolean
  */
  type FixedType = typingsJapgolly.rcTable.interfaceMod._FixedType | scala.Boolean
  type GetComponent = js.Function2[
    /* path */ js.Array[java.lang.String], 
    /* defaultComponent */ js.UndefOr[
      typingsJapgolly.rcTable.interfaceMod.CustomizeComponent[typingsJapgolly.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]]
    ], 
    typingsJapgolly.rcTable.interfaceMod.CustomizeComponent[typingsJapgolly.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]]
  ]
  type GetComponentProps[DataType] = js.Function2[
    /* data */ DataType, 
    /* index */ js.UndefOr[scala.Double], 
    typingsJapgolly.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]
  ]
  type GetRowKey[RecordType] = js.Function2[
    /* record */ RecordType, 
    /* index */ js.UndefOr[scala.Double], 
    typingsJapgolly.rcTable.interfaceMod.Key
  ]
  type Key = typingsJapgolly.react.mod.Key
  type PanelRender[RecordType] = js.Function1[/* data */ js.Array[RecordType], japgolly.scalajs.react.raw.React.Node]
  type RenderExpandIcon[RecordType] = js.Function1[
    /* props */ typingsJapgolly.rcTable.interfaceMod.RenderExpandIconProps[RecordType], 
    japgolly.scalajs.react.raw.React.Node
  ]
  type RowClassName[RecordType] = js.Function3[
    /* record */ RecordType, 
    /* index */ scala.Double, 
    /* indent */ scala.Double, 
    java.lang.String
  ]
  type TriggerEventHandler[RecordType] = js.Function2[
    /* record */ RecordType, 
    /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
}
