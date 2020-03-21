package typingsJapgolly.grommet.tabMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.grommet.grommetStrings.title
import typingsJapgolly.grommet.utilsMod.Omit
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Tab", "Tab")
@js.native
class Tab protected ()
  extends Component[
      TabProps with (Omit[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        title
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: TabProps with (Omit[
        DetailedHTMLProps[
          ButtonHTMLAttributes[org.scalajs.dom.raw.HTMLButtonElement], 
          org.scalajs.dom.raw.HTMLButtonElement
        ], 
        title
      ])) = this()
  def this(
    props: TabProps with (Omit[
        DetailedHTMLProps[
          ButtonHTMLAttributes[org.scalajs.dom.raw.HTMLButtonElement], 
          org.scalajs.dom.raw.HTMLButtonElement
        ], 
        title
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/Tab", "Tab")
@js.native
object Tab extends TopLevel[
      ComponentClass[
        TabProps with (Omit[
          DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
          title
        ]), 
        ComponentState
      ]
    ]

