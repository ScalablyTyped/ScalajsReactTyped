package typingsJapgolly.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.grommet.grommetStrings.onSelect
import typingsJapgolly.grommet.grommetStrings.placeholder
import typingsJapgolly.grommet.grommetStrings.size
import typingsJapgolly.grommet.textInputMod.TextInputProps
import typingsJapgolly.grommet.utilsMod.Omit
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "TextInput")
@js.native
class TextInput protected ()
  extends Component[
      TextInputProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        onSelect | size | placeholder
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: TextInputProps with (Omit[
        DetailedHTMLProps[
          InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
          org.scalajs.dom.raw.HTMLInputElement
        ], 
        onSelect | size | placeholder
      ])) = this()
  def this(
    props: TextInputProps with (Omit[
        DetailedHTMLProps[
          InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
          org.scalajs.dom.raw.HTMLInputElement
        ], 
        onSelect | size | placeholder
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet", "TextInput")
@js.native
object TextInput extends TopLevel[
      ComponentClass[
        TextInputProps with (Omit[
          DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
          onSelect | size | placeholder
        ]), 
        ComponentState
      ]
    ]

