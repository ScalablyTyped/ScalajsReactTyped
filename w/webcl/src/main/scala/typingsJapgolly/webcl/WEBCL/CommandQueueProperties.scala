package typingsJapgolly.webcl.WEBCL

import typingsJapgolly.webcl.webclInts.`0x1`
import typingsJapgolly.webcl.webclInts.`0x2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* cl_command_queue_properties - bitfield */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webcl.webclInts.`0x1`
  - typingsJapgolly.webcl.webclInts.`0x2`
*/
trait CommandQueueProperties extends StObject
object CommandQueueProperties {
  
  inline def QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE: `0x1` = 0x1.asInstanceOf[`0x1`]
  
  inline def QUEUE_PROFILING_ENABLE: `0x2` = 0x2.asInstanceOf[`0x2`]
}
