package typingsJapgolly.firebaseDatabase.eventMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseDatabase.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  /**
    * @return {!function()}
    */
  def getEventRunner(): js.Function0[Unit]
  /**
    * @return {!string}
    */
  def getEventType(): String
  /**
    * @return {!Path}
    */
  def getPath(): Path
}

object Event {
  @scala.inline
  def apply(
    getEventRunner: CallbackTo[js.Function0[Unit]],
    getEventType: CallbackTo[String],
    getPath: CallbackTo[Path]
  ): Event = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEventRunner")(getEventRunner.toJsFn)
    __obj.updateDynamic("getEventType")(getEventType.toJsFn)
    __obj.updateDynamic("getPath")(getPath.toJsFn)
    __obj.asInstanceOf[Event]
  }
}

