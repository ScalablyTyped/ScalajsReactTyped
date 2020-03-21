package typingsJapgolly.typesafeActions.typeHelpersMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeMeta[TType /* <: TypeConstant */] extends js.Object {
  var getType: js.UndefOr[js.Function0[TType]] = js.undefined
}

object TypeMeta {
  @scala.inline
  def apply[TType /* <: TypeConstant */](getType: js.UndefOr[CallbackTo[TType]] = js.undefined): TypeMeta[TType] = {
    val __obj = js.Dynamic.literal()
    getType.foreach(p => __obj.updateDynamic("getType")(p.toJsFn))
    __obj.asInstanceOf[TypeMeta[TType]]
  }
}

