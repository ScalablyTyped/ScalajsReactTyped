package typingsJapgolly.rabbitmqSchema.mod

import typingsJapgolly.rabbitmqSchema.rabbitmqSchemaStrings.topic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicExchange extends Exchange {
  @JSName("bindings")
  var bindings_TopicExchange: js.Array[TopicBinding]
  @JSName("type")
  var type_TopicExchange: topic
}

object TopicExchange {
  @scala.inline
  def apply(bindings: js.Array[TopicBinding], exchange: String, `type`: topic, options: js.Object = null): TopicExchange = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicExchange]
  }
}

