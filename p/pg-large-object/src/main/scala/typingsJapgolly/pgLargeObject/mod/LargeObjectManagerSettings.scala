package typingsJapgolly.pgLargeObject.mod

import typingsJapgolly.pg.mod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LargeObjectManagerSettings extends js.Object {
  var pg: js.UndefOr[Client] = js.undefined
  var pgPromise: js.UndefOr[js.Object] = js.undefined
}

object LargeObjectManagerSettings {
  @scala.inline
  def apply(pg: Client = null, pgPromise: js.Object = null): LargeObjectManagerSettings = {
    val __obj = js.Dynamic.literal()
    if (pg != null) __obj.updateDynamic("pg")(pg.asInstanceOf[js.Any])
    if (pgPromise != null) __obj.updateDynamic("pgPromise")(pgPromise.asInstanceOf[js.Any])
    __obj.asInstanceOf[LargeObjectManagerSettings]
  }
}

