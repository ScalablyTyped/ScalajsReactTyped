package typingsJapgolly.reduxForm.formNameMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reduxForm.AnonForm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormNameProps extends js.Object {
  def children(props: AnonForm): Node
}

object FormNameProps {
  @scala.inline
  def apply(children: AnonForm => CallbackTo[Node]): FormNameProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reduxForm.AnonForm) => children(t0).runNow()))
    __obj.asInstanceOf[FormNameProps]
  }
}

