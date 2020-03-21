package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeConsumerProps extends js.Object {
  def children(props: ThemeProps): Element
}

object ThemeConsumerProps {
  @scala.inline
  def apply(children: ThemeProps => CallbackTo[Element]): ThemeConsumerProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeMaterialUi.mod.ThemeProps) => children(t0).runNow()))
    __obj.asInstanceOf[ThemeConsumerProps]
  }
}

