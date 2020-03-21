package typingsJapgolly.quixote

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quixote_ extends js.Object {
  // Create a test iframe. This is a slow operation, so once you have a frame, it's best to use QFrame.reset() on it rather than creating a new frame for each test
  def createFrame(
    options: QuixoteFrameOptions,
    callback: js.Function2[/* err */ js.Error, /* loadedFrame */ QFrame, Unit]
  ): QFrame
}

object Quixote_ {
  @scala.inline
  def apply(
    createFrame: (QuixoteFrameOptions, js.Function2[/* err */ js.Error, /* loadedFrame */ QFrame, Unit]) => CallbackTo[QFrame]
  ): Quixote_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createFrame")(js.Any.fromFunction2((t0: typingsJapgolly.quixote.QuixoteFrameOptions, t1: js.Function2[/* err */ js.Error, /* loadedFrame */ typingsJapgolly.quixote.QFrame, scala.Unit]) => createFrame(t0, t1).runNow()))
    __obj.asInstanceOf[Quixote_]
  }
}

