package typingsJapgolly.typesafeActions

import typingsJapgolly.typesafeActions.createActionMod.PayloadMetaAction
import typingsJapgolly.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeT[T /* <: TypeConstant */]
  extends PayloadMetaAction[T, js.Any, js.Any] {
  var `type`: T
}

object AnonTypeT {
  @scala.inline
  def apply[T /* <: TypeConstant */](`type`: T): AnonTypeT[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeT[T]]
  }
}

