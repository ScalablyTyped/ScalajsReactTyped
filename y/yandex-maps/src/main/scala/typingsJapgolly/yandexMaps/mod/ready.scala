package typingsJapgolly.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "ready")
@js.native
object ready extends js.Object {
  def apply(): js.Promise[Unit] = js.native
  def apply(successCallback: js.Function0[_ | IReadyobject]): js.Promise[Unit] = js.native
  def apply(successCallback: js.Function0[_ | IReadyobject], errorCallback: js.Function0[_]): js.Promise[Unit] = js.native
  def apply(
    successCallback: js.Function0[_ | IReadyobject],
    errorCallback: js.Function0[_],
    context: js.Object
  ): js.Promise[Unit] = js.native
}

