package typingsJapgolly.reactTagAutocomplete.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagComponentProps extends js.Object {
  var classNames: ClassNames
  var tag: Tag
  def onDelete(event: ReactMouseEventFrom[HTMLButtonElement]): Unit
}

object TagComponentProps {
  @scala.inline
  def apply(classNames: ClassNames, onDelete: ReactMouseEventFrom[HTMLButtonElement] => Callback, tag: Tag): TagComponentProps = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("onDelete")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onDelete(t0).runNow()))
    __obj.asInstanceOf[TagComponentProps]
  }
}

