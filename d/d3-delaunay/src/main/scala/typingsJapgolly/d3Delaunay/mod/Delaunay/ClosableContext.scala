package typingsJapgolly.d3Delaunay.mod.Delaunay

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for the closePath() method of the CanvasPathMethods API.
  */
trait ClosableContext extends js.Object {
  /**
    * closePath() method of the CanvasPathMethods API.
    */
  def closePath(): Unit
}

object ClosableContext {
  @scala.inline
  def apply(closePath: Callback): ClosableContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closePath")(closePath.toJsFn)
    __obj.asInstanceOf[ClosableContext]
  }
}

