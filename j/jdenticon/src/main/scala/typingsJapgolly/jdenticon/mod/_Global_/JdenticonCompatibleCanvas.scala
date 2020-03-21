package typingsJapgolly.jdenticon.mod._Global_

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jdenticon.jdenticonStrings.`2d`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a subset of `HTMLCanvasElement` to allow using incomplete canvas implementations, 
  * like `canvas-renderer`.
  */
trait JdenticonCompatibleCanvas extends js.Object {
  // HTMLCanvasElement
  val height: Double
  val width: Double
  @JSName("getContext")
  def getContext_2d(contextId: `2d`): JdenticonCompatibleCanvasRenderingContext2D | Null
}

object JdenticonCompatibleCanvas {
  @scala.inline
  def apply(
    getContext: `2d` => CallbackTo[JdenticonCompatibleCanvasRenderingContext2D | Null],
    height: Double,
    width: Double
  ): JdenticonCompatibleCanvas = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("getContext")(js.Any.fromFunction1((t0: typingsJapgolly.jdenticon.jdenticonStrings.`2d`) => getContext(t0).runNow()))
    __obj.asInstanceOf[JdenticonCompatibleCanvas]
  }
}

