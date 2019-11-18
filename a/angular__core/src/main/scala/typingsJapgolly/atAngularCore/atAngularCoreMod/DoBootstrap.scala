package typingsJapgolly.atAngularCore.atAngularCoreMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoBootstrap extends js.Object {
  def ngDoBootstrap(appRef: ApplicationRef): Unit
}

object DoBootstrap {
  @scala.inline
  def apply(ngDoBootstrap: ApplicationRef => Callback): DoBootstrap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ngDoBootstrap")(js.Any.fromFunction1((t0: typingsJapgolly.atAngularCore.atAngularCoreMod.ApplicationRef) => ngDoBootstrap(t0).runNow()))
    __obj.asInstanceOf[DoBootstrap]
  }
}

