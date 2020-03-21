package typingsJapgolly.jestSpecificSnapshot.mod._Global_.jest

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R, T] extends js.Object {
  def toMatchSpecificSnapshot(snapshotFilename: String): R
}

object Matchers {
  @scala.inline
  def apply[R, T](toMatchSpecificSnapshot: String => CallbackTo[R]): Matchers[R, T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toMatchSpecificSnapshot")(js.Any.fromFunction1((t0: java.lang.String) => toMatchSpecificSnapshot(t0).runNow()))
    __obj.asInstanceOf[Matchers[R, T]]
  }
}

