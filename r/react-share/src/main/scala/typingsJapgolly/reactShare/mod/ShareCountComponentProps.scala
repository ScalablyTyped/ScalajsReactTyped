package typingsJapgolly.reactShare.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareCountComponentProps extends js.Object {
  /** Supply a function as the child to render anything but the count */
  var children: js.UndefOr[js.Function1[/* shareCount */ Double, Node]] = js.undefined
  /** Classes to apply (if any) */
  var className: js.UndefOr[String] = js.undefined
  /** The URL you are sharing */
  var url: String
}

object ShareCountComponentProps {
  @scala.inline
  def apply(
    url: String,
    children: /* shareCount */ Double => CallbackTo[Node] = null,
    className: String = null
  ): ShareCountComponentProps = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* shareCount */ scala.Double) => children(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareCountComponentProps]
  }
}

