package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceFileLike extends js.Object {
  def getLineAndCharacterOfPosition(pos: Double): LineAndCharacter
}

object SourceFileLike {
  @scala.inline
  def apply(getLineAndCharacterOfPosition: Double => CallbackTo[LineAndCharacter]): SourceFileLike = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLineAndCharacterOfPosition")(js.Any.fromFunction1((t0: scala.Double) => getLineAndCharacterOfPosition(t0).runNow()))
    __obj.asInstanceOf[SourceFileLike]
  }
}

