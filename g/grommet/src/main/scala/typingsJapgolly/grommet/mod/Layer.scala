package typingsJapgolly.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.grommet.layerMod.LayerProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Layer")
@js.native
class Layer protected ()
  extends Component[
      LayerProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: LayerProps with (DetailedHTMLProps[
        HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement], 
        org.scalajs.dom.raw.HTMLDivElement
      ])) = this()
  def this(
    props: LayerProps with (DetailedHTMLProps[
        HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement], 
        org.scalajs.dom.raw.HTMLDivElement
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet", "Layer")
@js.native
object Layer extends TopLevel[
      ComponentClass[
        LayerProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
        ComponentState
      ]
    ]

