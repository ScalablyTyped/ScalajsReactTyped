package typingsJapgolly.grommet.radioButtonMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/RadioButton", "RadioButton")
@js.native
class RadioButton protected ()
  extends Component[
      RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: RadioButtonProps with (DetailedHTMLProps[
        InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
        org.scalajs.dom.raw.HTMLInputElement
      ])) = this()
  def this(
    props: RadioButtonProps with (DetailedHTMLProps[
        InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
        org.scalajs.dom.raw.HTMLInputElement
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/RadioButton", "RadioButton")
@js.native
object RadioButton extends TopLevel[
      ComponentClass[
        RadioButtonProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]), 
        ComponentState
      ]
    ]

