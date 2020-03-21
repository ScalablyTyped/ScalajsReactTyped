package typingsJapgolly.reactVirtualized

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.Validator
import typingsJapgolly.reactVirtualized.esScrollSyncMod.ScrollSyncChildProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenValidator extends js.Object {
  var children: Validator[js.Function1[/* props */ ScrollSyncChildProps, Node]]
}

object AnonChildrenValidator {
  @scala.inline
  def apply(children: Validator[js.Function1[/* props */ ScrollSyncChildProps, Node]]): AnonChildrenValidator = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildrenValidator]
  }
}

