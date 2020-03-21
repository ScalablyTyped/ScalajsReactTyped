package typingsJapgolly.ddTrace.mod.plugins

import typingsJapgolly.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [amqp10](https://github.com/noodlefrenzy/node-amqp10) module.
  */
trait amqp10
  extends Integration
     with Analyzable

object amqp10 {
  @scala.inline
  def apply(
    analytics: Boolean | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    service: String = null
  ): amqp10 = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[amqp10]
  }
}

