package typingsJapgolly.atom.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeDescriptor extends js.Object {
  /** Returns all scopes for this descriptor. */
  def getScopesArray(): js.Array[String]
}

object ScopeDescriptor {
  @scala.inline
  def apply(getScopesArray: CallbackTo[js.Array[String]]): ScopeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getScopesArray")(getScopesArray.toJsFn)
    __obj.asInstanceOf[ScopeDescriptor]
  }
}

