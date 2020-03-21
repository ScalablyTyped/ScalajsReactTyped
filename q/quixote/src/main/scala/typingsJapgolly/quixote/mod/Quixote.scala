package typingsJapgolly.quixote.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.quixote.QFrame
import typingsJapgolly.quixote.QuixoteFrameOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quixote extends js.Object {
  def createFrame(
    options: QuixoteFrameOptions,
    callback: js.Function2[/* err */ js.Error, /* loadedFrame */ QFrame, Unit]
  ): QFrame
}

object Quixote {
  @scala.inline
  def apply(
    createFrame: (QuixoteFrameOptions, js.Function2[/* err */ js.Error, /* loadedFrame */ QFrame, Unit]) => CallbackTo[QFrame]
  ): Quixote = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createFrame")(js.Any.fromFunction2((t0: typingsJapgolly.quixote.QuixoteFrameOptions, t1: js.Function2[/* err */ js.Error, /* loadedFrame */ typingsJapgolly.quixote.QFrame, scala.Unit]) => createFrame(t0, t1).runNow()))
    __obj.asInstanceOf[Quixote]
  }
}

