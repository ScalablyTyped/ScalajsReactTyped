package typingsJapgolly.ioredis.anon

import typingsJapgolly.ioredis.ioredisStrings.auth_
import typingsJapgolly.ioredis.ioredisStrings.monitor
import typingsJapgolly.ioredis.ioredisStrings.ping
import typingsJapgolly.ioredis.ioredisStrings.psubscribe
import typingsJapgolly.ioredis.ioredisStrings.punsubscribe
import typingsJapgolly.ioredis.ioredisStrings.quit
import typingsJapgolly.ioredis.ioredisStrings.subscribe
import typingsJapgolly.ioredis.ioredisStrings.unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in keyof ioredis.ioredis/built/Command.CommandNameFlags ]: ioredis.ioredis/built/Command.CommandNameFlags[key]} */
trait keyinkeyofCommandNameFlag extends StObject {
  
  var ENTER_SUBSCRIBER_MODE: js.Tuple2[subscribe, psubscribe]
  
  var EXIT_SUBSCRIBER_MODE: js.Tuple2[unsubscribe, punsubscribe]
  
  var VALID_IN_MONITOR_MODE: js.Tuple2[monitor, auth_]
  
  var VALID_IN_SUBSCRIBER_MODE: js.Tuple6[subscribe, psubscribe, unsubscribe, punsubscribe, ping, quit]
  
  var WILL_DISCONNECT: js.Array[quit]
}
object keyinkeyofCommandNameFlag {
  
  inline def apply(
    ENTER_SUBSCRIBER_MODE: js.Tuple2[subscribe, psubscribe],
    EXIT_SUBSCRIBER_MODE: js.Tuple2[unsubscribe, punsubscribe],
    VALID_IN_MONITOR_MODE: js.Tuple2[monitor, auth_],
    VALID_IN_SUBSCRIBER_MODE: js.Tuple6[subscribe, psubscribe, unsubscribe, punsubscribe, ping, quit],
    WILL_DISCONNECT: js.Array[quit]
  ): keyinkeyofCommandNameFlag = {
    val __obj = js.Dynamic.literal(ENTER_SUBSCRIBER_MODE = ENTER_SUBSCRIBER_MODE.asInstanceOf[js.Any], EXIT_SUBSCRIBER_MODE = EXIT_SUBSCRIBER_MODE.asInstanceOf[js.Any], VALID_IN_MONITOR_MODE = VALID_IN_MONITOR_MODE.asInstanceOf[js.Any], VALID_IN_SUBSCRIBER_MODE = VALID_IN_SUBSCRIBER_MODE.asInstanceOf[js.Any], WILL_DISCONNECT = WILL_DISCONNECT.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinkeyofCommandNameFlag]
  }
  
  extension [Self <: keyinkeyofCommandNameFlag](x: Self) {
    
    inline def setENTER_SUBSCRIBER_MODE(value: js.Tuple2[subscribe, psubscribe]): Self = StObject.set(x, "ENTER_SUBSCRIBER_MODE", value.asInstanceOf[js.Any])
    
    inline def setEXIT_SUBSCRIBER_MODE(value: js.Tuple2[unsubscribe, punsubscribe]): Self = StObject.set(x, "EXIT_SUBSCRIBER_MODE", value.asInstanceOf[js.Any])
    
    inline def setVALID_IN_MONITOR_MODE(value: js.Tuple2[monitor, auth_]): Self = StObject.set(x, "VALID_IN_MONITOR_MODE", value.asInstanceOf[js.Any])
    
    inline def setVALID_IN_SUBSCRIBER_MODE(value: js.Tuple6[subscribe, psubscribe, unsubscribe, punsubscribe, ping, quit]): Self = StObject.set(x, "VALID_IN_SUBSCRIBER_MODE", value.asInstanceOf[js.Any])
    
    inline def setWILL_DISCONNECT(value: js.Array[quit]): Self = StObject.set(x, "WILL_DISCONNECT", value.asInstanceOf[js.Any])
    
    inline def setWILL_DISCONNECTVarargs(value: quit*): Self = StObject.set(x, "WILL_DISCONNECT", js.Array(value*))
  }
}
