package typingsJapgolly.inkTestingLibrary.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inkTestingLibrary.AnonWrite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderResponse extends js.Object {
  var frames: js.Array[String]
  var stdin: AnonWrite
  def lastFrame(): String
  def rerender(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkElement */ js.Any
  ): Unit
  def unmount(): Unit
}

object RenderResponse {
  @scala.inline
  def apply(
    frames: js.Array[String],
    lastFrame: CallbackTo[String],
    rerender: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkElement */ js.Any => Callback,
    stdin: AnonWrite,
    unmount: Callback
  ): RenderResponse = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], stdin = stdin.asInstanceOf[js.Any])
    __obj.updateDynamic("lastFrame")(lastFrame.toJsFn)
    __obj.updateDynamic("rerender")(js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkElement */ js.Any) => rerender(t0).runNow()))
    __obj.updateDynamic("unmount")(unmount.toJsFn)
    __obj.asInstanceOf[RenderResponse]
  }
}

