package typingsJapgolly.antd.libAutoDashCompleteInputElementMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputElementProps extends js.Object {
  var children: Element
}

object InputElementProps {
  @scala.inline
  def apply(children: VdomElement): InputElementProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputElementProps]
  }
}

