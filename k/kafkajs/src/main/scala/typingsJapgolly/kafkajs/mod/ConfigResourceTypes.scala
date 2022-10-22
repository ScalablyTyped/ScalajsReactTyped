package typingsJapgolly.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConfigResourceTypes extends StObject
@JSImport("kafkajs", "ConfigResourceTypes")
@js.native
object ConfigResourceTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConfigResourceTypes & Double] = js.native
  
  @js.native
  sealed trait BROKER
    extends StObject
       with ConfigResourceTypes
  /* 4 */ val BROKER: typingsJapgolly.kafkajs.mod.ConfigResourceTypes.BROKER & Double = js.native
  
  @js.native
  sealed trait BROKER_LOGGER
    extends StObject
       with ConfigResourceTypes
  /* 8 */ val BROKER_LOGGER: typingsJapgolly.kafkajs.mod.ConfigResourceTypes.BROKER_LOGGER & Double = js.native
  
  @js.native
  sealed trait TOPIC
    extends StObject
       with ConfigResourceTypes
  /* 2 */ val TOPIC: typingsJapgolly.kafkajs.mod.ConfigResourceTypes.TOPIC & Double = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with ConfigResourceTypes
  /* 0 */ val UNKNOWN: typingsJapgolly.kafkajs.mod.ConfigResourceTypes.UNKNOWN & Double = js.native
}
