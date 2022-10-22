package typingsJapgolly.speedtestNet.mod

import typingsJapgolly.speedtestNet.speedtestNetStrings.config
import typingsJapgolly.speedtestNet.speedtestNetStrings.download
import typingsJapgolly.speedtestNet.speedtestNetStrings.log
import typingsJapgolly.speedtestNet.speedtestNetStrings.ping
import typingsJapgolly.speedtestNet.speedtestNetStrings.result
import typingsJapgolly.speedtestNet.speedtestNetStrings.testStart
import typingsJapgolly.speedtestNet.speedtestNetStrings.upload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseEvent extends StObject {
  
  var `type`: config | log | testStart | ping | download | upload | result
}
object BaseEvent {
  
  inline def apply(`type`: config | log | testStart | ping | download | upload | result): BaseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEvent]
  }
  
  extension [Self <: BaseEvent](x: Self) {
    
    inline def setType(value: config | log | testStart | ping | download | upload | result): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
