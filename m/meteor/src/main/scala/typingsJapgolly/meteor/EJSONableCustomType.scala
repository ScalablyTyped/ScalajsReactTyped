package typingsJapgolly.meteor

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EJSONableCustomType extends js.Object {
  @JSName("clone")
  var clone_FEJSONableCustomType: js.UndefOr[js.Function0[this.type]] = js.undefined
  @JSName("equals")
  var equals_FEJSONableCustomType: js.UndefOr[js.Function1[/* other */ js.Object, Boolean]] = js.undefined
  def toJSONValue(): JSONable
  def typeName(): String
}

object EJSONableCustomType {
  @scala.inline
  def apply(
    toJSONValue: CallbackTo[JSONable],
    typeName: CallbackTo[String],
    clone: js.UndefOr[CallbackTo[EJSONableCustomType]] = js.undefined,
    equals: /* other */ js.Object => CallbackTo[Boolean] = null
  ): EJSONableCustomType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toJSONValue")(toJSONValue.toJsFn)
    __obj.updateDynamic("typeName")(typeName.toJsFn)
    clone.foreach(p => __obj.updateDynamic("clone")(p.toJsFn))
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: /* other */ js.Object) => equals(t0).runNow()))
    __obj.asInstanceOf[EJSONableCustomType]
  }
}

