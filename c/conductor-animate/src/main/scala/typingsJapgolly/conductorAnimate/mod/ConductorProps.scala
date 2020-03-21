package typingsJapgolly.conductorAnimate.mod

import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ReactNodeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConductorProps extends js.Object {
  var animations: Animations
  var children: Node | ReactNodeArray
  var config: StringDictionary[Config] | (js.Function2[/* id */ String, /* additional */ js.Object, Config])
}

object ConductorProps {
  @scala.inline
  def apply(
    animations: Animations,
    config: StringDictionary[Config] | (js.Function2[/* id */ String, /* additional */ js.Object, Config]),
    children: Node | ReactNodeArray = null
  ): ConductorProps = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConductorProps]
  }
}

