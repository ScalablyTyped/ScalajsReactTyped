package typingsJapgolly.pulumiPulumi.automationEventsMod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreludeEvent extends StObject {
  
  var config: Record[String, String]
}
object PreludeEvent {
  
  inline def apply(config: Record[String, String]): PreludeEvent = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreludeEvent]
  }
  
  extension [Self <: PreludeEvent](x: Self) {
    
    inline def setConfig(value: Record[String, String]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
  }
}
