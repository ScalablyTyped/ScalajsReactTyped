package typingsJapgolly.reduxForm.fieldArrayMod

import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericFieldArray[FieldValue, P]
  extends Component[BaseFieldArrayProps[P, FieldValue], js.Object, js.Any] {
  var name: String = js.native
  var valid: Boolean = js.native
  def getRenderedComponent(): japgolly.scalajs.react.raw.React.Component[WrappedFieldArrayProps[FieldValue] with P with js.Object, js.Object] = js.native
}

