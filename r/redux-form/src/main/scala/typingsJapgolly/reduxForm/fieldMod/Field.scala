package typingsJapgolly.reduxForm.fieldMod

import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/Field", "Field")
@js.native
class Field[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */] ()
  extends Component[P, js.Object, js.Any] {
  var dirty: Boolean = js.native
  var name: String = js.native
  var pristine: Boolean = js.native
  var value: js.Any = js.native
  def getRenderedComponent(): japgolly.scalajs.react.raw.React.Component[WrappedFieldProps with P with js.Object, js.Object] = js.native
}

