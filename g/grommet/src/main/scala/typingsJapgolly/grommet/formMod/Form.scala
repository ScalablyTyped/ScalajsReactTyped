package typingsJapgolly.grommet.formMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FormHTMLAttributes
import typingsJapgolly.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Form", "Form")
@js.native
class Form protected ()
  extends Component[
      FormProps with (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: FormProps with (DetailedHTMLProps[
        FormHTMLAttributes[org.scalajs.dom.raw.HTMLFormElement], 
        org.scalajs.dom.raw.HTMLFormElement
      ])) = this()
  def this(
    props: FormProps with (DetailedHTMLProps[
        FormHTMLAttributes[org.scalajs.dom.raw.HTMLFormElement], 
        org.scalajs.dom.raw.HTMLFormElement
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/Form", "Form")
@js.native
object Form extends TopLevel[
      ComponentClass[
        FormProps with (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement]), 
        ComponentState
      ]
    ]

