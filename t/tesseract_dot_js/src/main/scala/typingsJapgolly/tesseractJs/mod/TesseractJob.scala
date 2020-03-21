package typingsJapgolly.tesseractJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TesseractJob extends js.Object {
  var error: js.UndefOr[js.Function1[/* error */ js.Error, TesseractJob]] = js.undefined
  def `catch`(callback: js.Function1[/* error */ js.Error, Unit]): TesseractJob
  def `finally`(callback: js.Function1[/* resultOrError */ js.Error | Page, Unit]): TesseractJob
  def progress(callback: js.Function1[/* progress */ Progress, Unit]): TesseractJob
  def `then`(callback: js.Function1[/* result */ Page, Unit]): TesseractJob
}

object TesseractJob {
  @scala.inline
  def apply(
    `catch`: js.Function1[/* error */ js.Error, Unit] => CallbackTo[TesseractJob],
    `finally`: js.Function1[/* resultOrError */ js.Error | Page, Unit] => CallbackTo[TesseractJob],
    progress: js.Function1[/* progress */ Progress, Unit] => CallbackTo[TesseractJob],
    `then`: js.Function1[/* result */ Page, Unit] => CallbackTo[TesseractJob],
    error: /* error */ js.Error => CallbackTo[TesseractJob] = null
  ): TesseractJob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction1((t0: js.Function1[/* error */ js.Error, scala.Unit]) => `catch`(t0).runNow()))
    __obj.updateDynamic("finally")(js.Any.fromFunction1((t0: js.Function1[/* resultOrError */ js.Error | typingsJapgolly.tesseractJs.mod.Page, scala.Unit]) => `finally`(t0).runNow()))
    __obj.updateDynamic("progress")(js.Any.fromFunction1((t0: js.Function1[/* progress */ typingsJapgolly.tesseractJs.mod.Progress, scala.Unit]) => progress(t0).runNow()))
    __obj.updateDynamic("then")(js.Any.fromFunction1((t0: js.Function1[/* result */ typingsJapgolly.tesseractJs.mod.Page, scala.Unit]) => `then`(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* error */ js.Error) => error(t0).runNow()))
    __obj.asInstanceOf[TesseractJob]
  }
}

