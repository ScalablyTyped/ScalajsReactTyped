package typingsJapgolly.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.grommet.formFieldMod.FormFieldProps
import typingsJapgolly.grommet.grommetStrings.placeholder
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

@JSImport("grommet", "FormField")
@js.native
class FormField protected ()
  extends Component[
      FormFieldProps with (Omit[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        placeholder
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: FormFieldProps with (Omit[
        DetailedHTMLProps[
          InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
          org.scalajs.dom.raw.HTMLInputElement
        ], 
        placeholder
      ])) = this()
  def this(
    props: FormFieldProps with (Omit[
        DetailedHTMLProps[
          InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
          org.scalajs.dom.raw.HTMLInputElement
        ], 
        placeholder
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet", "FormField")
@js.native
object FormField extends TopLevel[
      ComponentClass[
        FormFieldProps with (Omit[
          DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
          placeholder
        ]), 
        ComponentState
      ]
    ]

