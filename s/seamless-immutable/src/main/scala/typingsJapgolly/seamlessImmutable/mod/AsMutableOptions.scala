package typingsJapgolly.seamlessImmutable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsMutableOptions[TDeep /* <: Boolean */] extends js.Object {
  var deep: TDeep
}

object AsMutableOptions {
  @scala.inline
  def apply[TDeep /* <: Boolean */](deep: TDeep): AsMutableOptions[TDeep] = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsMutableOptions[TDeep]]
  }
}

