package typingsJapgolly.webcl.WEBCL

import typingsJapgolly.webcl.webclInts.`0x11D0`
import typingsJapgolly.webcl.webclInts.`0x11D1`
import typingsJapgolly.webcl.webclInts.`0x11D3`
import typingsJapgolly.webcl.webclInts.`0x11D4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* cl_event_info  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webcl.webclInts.`0x11D0`
  - typingsJapgolly.webcl.webclInts.`0x11D1`
  - typingsJapgolly.webcl.webclInts.`0x11D3`
  - typingsJapgolly.webcl.webclInts.`0x11D4`
*/
trait EventInfo extends StObject
object EventInfo {
  
  //EVENT_REFERENCE_COUNT                     = 0x11D2, // disallowed
  inline def EVENT_COMMAND_EXECUTION_STATUS: `0x11D3` = 0x11D3.asInstanceOf[`0x11D3`]
  
  inline def EVENT_COMMAND_QUEUE: `0x11D0` = 0x11D0.asInstanceOf[`0x11D0`]
  
  inline def EVENT_COMMAND_TYPE: `0x11D1` = 0x11D1.asInstanceOf[`0x11D1`]
  
  inline def EVENT_CONTEXT: `0x11D4` = 0x11D4.asInstanceOf[`0x11D4`]
}
