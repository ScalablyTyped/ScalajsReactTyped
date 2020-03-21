package typingsJapgolly.seamlessImmutable.mod.ImmutableDate

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** New functions added by seamless-immutable. */
trait Additions extends js.Object {
  def asMutable(): js.Date
}

object Additions {
  @scala.inline
  def apply(asMutable: CallbackTo[js.Date]): Additions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asMutable")(asMutable.toJsFn)
    __obj.asInstanceOf[Additions]
  }
}

