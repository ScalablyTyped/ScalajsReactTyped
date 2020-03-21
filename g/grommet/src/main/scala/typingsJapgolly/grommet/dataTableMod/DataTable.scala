package typingsJapgolly.grommet.dataTableMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.TableHTMLAttributes
import typingsJapgolly.std.HTMLTableElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/DataTable", "DataTable")
@js.native
class DataTable protected ()
  extends Component[
      DataTableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: DataTableProps with (DetailedHTMLProps[
        TableHTMLAttributes[org.scalajs.dom.raw.HTMLTableElement], 
        org.scalajs.dom.raw.HTMLTableElement
      ])) = this()
  def this(
    props: DataTableProps with (DetailedHTMLProps[
        TableHTMLAttributes[org.scalajs.dom.raw.HTMLTableElement], 
        org.scalajs.dom.raw.HTMLTableElement
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/DataTable", "DataTable")
@js.native
object DataTable extends TopLevel[
      ComponentClass[
        DataTableProps with (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]), 
        ComponentState
      ]
    ]

