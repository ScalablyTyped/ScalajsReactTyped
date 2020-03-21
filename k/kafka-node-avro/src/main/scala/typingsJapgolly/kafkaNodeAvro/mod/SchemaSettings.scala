package typingsJapgolly.kafkaNodeAvro.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaSettings extends js.Object {
  /** Kafka schema registry url */
  var registry: String
}

object SchemaSettings {
  @scala.inline
  def apply(registry: String): SchemaSettings = {
    val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SchemaSettings]
  }
}

