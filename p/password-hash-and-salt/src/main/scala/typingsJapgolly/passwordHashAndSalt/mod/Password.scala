package typingsJapgolly.passwordHashAndSalt.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Password extends js.Object {
  def hash(cb: js.Function2[/* error */ String, /* hash */ String, Unit]): Unit
  def verifyAgainst(hash: String, cb: js.Function2[/* error */ String, /* verified */ Boolean, Unit]): Unit
}

object Password {
  @scala.inline
  def apply(
    hash: js.Function2[/* error */ String, /* hash */ String, Unit] => Callback,
    verifyAgainst: (String, js.Function2[/* error */ String, /* verified */ Boolean, Unit]) => Callback
  ): Password = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(js.Any.fromFunction1((t0: js.Function2[/* error */ java.lang.String, /* hash */ java.lang.String, scala.Unit]) => hash(t0).runNow()))
    __obj.updateDynamic("verifyAgainst")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[/* error */ java.lang.String, /* verified */ scala.Boolean, scala.Unit]) => verifyAgainst(t0, t1).runNow()))
    __obj.asInstanceOf[Password]
  }
}

