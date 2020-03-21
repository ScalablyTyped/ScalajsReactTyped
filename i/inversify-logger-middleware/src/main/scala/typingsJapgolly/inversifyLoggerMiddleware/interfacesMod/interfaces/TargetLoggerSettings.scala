package typingsJapgolly.inversifyLoggerMiddleware.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetLoggerSettings extends js.Object {
  var metadata: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[Boolean] = js.undefined
  var serviceIdentifier: js.UndefOr[Boolean] = js.undefined
}

object TargetLoggerSettings {
  @scala.inline
  def apply(
    metadata: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[Boolean] = js.undefined,
    serviceIdentifier: js.UndefOr[Boolean] = js.undefined
  ): TargetLoggerSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(metadata)) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(serviceIdentifier)) __obj.updateDynamic("serviceIdentifier")(serviceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetLoggerSettings]
  }
}

