package typingsJapgolly.grommet.listMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/List", "List")
@js.native
class List protected ()
  extends Component[
      ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: ListProps with (DetailedHTMLProps[
        HTMLAttributes[org.scalajs.dom.raw.HTMLUListElement], 
        org.scalajs.dom.raw.HTMLUListElement
      ])) = this()
  def this(
    props: ListProps with (DetailedHTMLProps[
        HTMLAttributes[org.scalajs.dom.raw.HTMLUListElement], 
        org.scalajs.dom.raw.HTMLUListElement
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/List", "List")
@js.native
object List extends TopLevel[
      ComponentClass[
        ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]), 
        ComponentState
      ]
    ]

