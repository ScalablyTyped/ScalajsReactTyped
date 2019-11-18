package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CharacterElement extends js.Object {
  var character: Element
}

object Anon_CharacterElement {
  @scala.inline
  def apply(character: VdomElement): Anon_CharacterElement = {
    val __obj = js.Dynamic.literal()
    if (character != null) __obj.updateDynamic("character")(character.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CharacterElement]
  }
}

