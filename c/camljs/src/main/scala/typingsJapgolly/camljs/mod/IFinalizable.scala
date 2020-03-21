package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFinalizable extends IFinalizableToString {
  /** Get the resulting CAML query as SP.CamlQuery object */
  def ToCamlQuery(): js.Any
}

object IFinalizable {
  @scala.inline
  def apply(ToCamlQuery: CallbackTo[js.Any], ToString: CallbackTo[String]): IFinalizable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ToCamlQuery")(ToCamlQuery.toJsFn)
    __obj.updateDynamic("ToString")(ToString.toJsFn)
    __obj.asInstanceOf[IFinalizable]
  }
}

