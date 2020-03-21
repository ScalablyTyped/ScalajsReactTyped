package typingsJapgolly.storybookApi.mod

import japgolly.scalajs.react.raw.React.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: (Component[js.Object, js.Object]) | (js.Function1[/* props */ Combo, Component[js.Object, js.Object]])
}

object Children {
  @scala.inline
  def apply(
    children: (Component[js.Object, js.Object]) | (js.Function1[/* props */ Combo, Component[js.Object, js.Object]])
  ): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Children]
  }
}

