package typingsJapgolly.atStardustDashUiReactDashComponentDashRef

import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.propDashTypes.propDashTypesMod.ReactElementLike
import typingsJapgolly.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: Validator[ReactElementLike]
  var innerRef: Validator[Ref]
}

object Anon_Children {
  @scala.inline
  def apply(children: Validator[ReactElementLike], innerRef: Validator[Ref]): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], innerRef = innerRef.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Children]
  }
}

