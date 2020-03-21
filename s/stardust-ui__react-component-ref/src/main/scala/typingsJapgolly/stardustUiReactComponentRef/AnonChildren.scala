package typingsJapgolly.stardustUiReactComponentRef

import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.propTypes.mod.ReactElementLike
import typingsJapgolly.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: Validator[ReactElementLike]
  var innerRef: Validator[Ref]
}

object AnonChildren {
  @scala.inline
  def apply(children: Validator[ReactElementLike], innerRef: Validator[Ref]): AnonChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], innerRef = innerRef.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildren]
  }
}

