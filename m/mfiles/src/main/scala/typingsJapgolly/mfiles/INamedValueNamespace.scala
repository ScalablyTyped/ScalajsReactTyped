package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INamedValueNamespace extends js.Object {
  var NamedValues: INamedValues
  var NamespaceName: String
  def Clone(): INamedValueNamespace
}

object INamedValueNamespace {
  @scala.inline
  def apply(Clone: CallbackTo[INamedValueNamespace], NamedValues: INamedValues, NamespaceName: String): INamedValueNamespace = {
    val __obj = js.Dynamic.literal(NamedValues = NamedValues.asInstanceOf[js.Any], NamespaceName = NamespaceName.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[INamedValueNamespace]
  }
}

