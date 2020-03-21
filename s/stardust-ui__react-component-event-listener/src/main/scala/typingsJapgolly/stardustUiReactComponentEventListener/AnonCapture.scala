package typingsJapgolly.stardustUiReactComponentEventListener

import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.Node
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCapture extends js.Object {
  var capture: Requireable[Boolean]
  var listener: Validator[js.Function1[/* repeated */ _, _]]
  var targetRef: Validator[RefHandle[Node | Window_]]
  var `type`: Validator[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 91 */ js.Any
  ]
}

object AnonCapture {
  @scala.inline
  def apply(
    capture: Requireable[Boolean],
    listener: Validator[js.Function1[/* repeated */ _, _]],
    targetRef: Validator[RefHandle[Node | Window_]],
    `type`: Validator[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 91 */ js.Any
    ]
  ): AnonCapture = {
    val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any], listener = listener.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCapture]
  }
}

