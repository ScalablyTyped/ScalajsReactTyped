package typingsJapgolly.passportLocalMongoose.mod

import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PassportLocalDocument extends Document_ {
  def authenticate(password: String): js.Promise[AuthenticationResult] = js.native
  def authenticate(password: String, cb: js.Function3[/* err */ js.Any, /* user */ js.Any, /* error */ js.Any, Unit]): Unit = js.native
  def changePassword(oldPassword: String, newPassword: String): js.Promise[PassportLocalDocument] = js.native
  def changePassword(
    oldPassword: String,
    newPassword: String,
    cb: js.Function2[/* err */ js.Any, /* res */ js.Any, Unit]
  ): Unit = js.native
  def resetAttempts(): js.Promise[PassportLocalDocument] = js.native
  def resetAttempts(cb: js.Function2[/* err */ js.Any, /* res */ js.Any, Unit]): Unit = js.native
  def setPassword(password: String): js.Promise[PassportLocalDocument] = js.native
  def setPassword(password: String, cb: js.Function2[/* err */ js.Any, /* res */ js.Any, Unit]): Unit = js.native
}

