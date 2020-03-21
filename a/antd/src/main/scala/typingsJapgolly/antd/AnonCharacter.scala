package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCharacter extends js.Object {
  var character: Element
}

object AnonCharacter {
  @scala.inline
  def apply(character: VdomElement): AnonCharacter = {
    val __obj = js.Dynamic.literal()
    if (character != null) __obj.updateDynamic("character")(character.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCharacter]
  }
}

