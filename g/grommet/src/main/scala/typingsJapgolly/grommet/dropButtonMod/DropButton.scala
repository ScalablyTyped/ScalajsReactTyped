package typingsJapgolly.grommet.dropButtonMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.grommet.buttonMod.ButtonProps
import typingsJapgolly.grommet.grommetStrings.color
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

@JSImport("grommet/components/DropButton", "DropButton")
@js.native
class DropButton protected ()
  extends Component[
      DropButtonProps with ButtonProps with (Omit[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        color
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: DropButtonProps with ButtonProps with (Omit[
        DetailedHTMLProps[
          ButtonHTMLAttributes[org.scalajs.dom.raw.HTMLButtonElement], 
          org.scalajs.dom.raw.HTMLButtonElement
        ], 
        color
      ])) = this()
  def this(
    props: DropButtonProps with ButtonProps with (Omit[
        DetailedHTMLProps[
          ButtonHTMLAttributes[org.scalajs.dom.raw.HTMLButtonElement], 
          org.scalajs.dom.raw.HTMLButtonElement
        ], 
        color
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/DropButton", "DropButton")
@js.native
object DropButton extends TopLevel[
      ComponentClass[
        DropButtonProps with ButtonProps with (Omit[
          DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
          color
        ]), 
        ComponentState
      ]
    ]

