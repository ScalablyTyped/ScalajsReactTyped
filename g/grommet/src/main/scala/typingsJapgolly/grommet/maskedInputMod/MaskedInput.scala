package typingsJapgolly.grommet.maskedInputMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.grommet.grommetStrings.id
import typingsJapgolly.grommet.grommetStrings.mask
import typingsJapgolly.grommet.grommetStrings.name
import typingsJapgolly.grommet.grommetStrings.plain
import typingsJapgolly.grommet.grommetStrings.size
import typingsJapgolly.grommet.grommetStrings.value
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.std.HTMLInputElement
import typingsJapgolly.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/MaskedInput", "MaskedInput")
@js.native
class MaskedInput protected ()
  extends Component[
      MaskedInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        id | mask | name | plain | size | value
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: MaskedInputProps with (Omit[
        DetailedHTMLProps[
          InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
          org.scalajs.dom.raw.HTMLInputElement
        ], 
        id | mask | name | plain | size | value
      ])) = this()
  def this(
    props: MaskedInputProps with (Omit[
        DetailedHTMLProps[
          InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
          org.scalajs.dom.raw.HTMLInputElement
        ], 
        id | mask | name | plain | size | value
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/MaskedInput", "MaskedInput")
@js.native
object MaskedInput extends TopLevel[
      ComponentClass[
        MaskedInputProps with (Omit[
          DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
          id | mask | name | plain | size | value
        ]), 
        ComponentState
      ]
    ]

