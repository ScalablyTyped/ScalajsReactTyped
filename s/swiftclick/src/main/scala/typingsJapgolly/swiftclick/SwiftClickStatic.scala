package typingsJapgolly.swiftclick

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwiftClickStatic extends js.Object {
  def attach(contextEl: Element): SwiftClickObject
}

object SwiftClickStatic {
  @scala.inline
  def apply(attach: Element => CallbackTo[SwiftClickObject]): SwiftClickStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attach")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => attach(t0).runNow()))
    __obj.asInstanceOf[SwiftClickStatic]
  }
}

