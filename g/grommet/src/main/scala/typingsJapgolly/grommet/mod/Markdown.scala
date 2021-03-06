package typingsJapgolly.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.grommet.markdownMod.MarkdownProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Markdown")
@js.native
class Markdown protected ()
  extends Component[
      MarkdownProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: MarkdownProps with (DetailedHTMLProps[
        HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement], 
        org.scalajs.dom.raw.HTMLDivElement
      ])) = this()
  def this(
    props: MarkdownProps with (DetailedHTMLProps[
        HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement], 
        org.scalajs.dom.raw.HTMLDivElement
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet", "Markdown")
@js.native
object Markdown extends TopLevel[
      ComponentClass[
        MarkdownProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
        ComponentState
      ]
    ]

