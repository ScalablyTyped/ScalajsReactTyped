package typingsJapgolly.firmata.mod

import typingsJapgolly.firmata.firmataInts.`0x00`
import typingsJapgolly.firmata.firmataInts.`0x01`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L491-L494
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firmata.firmataInts.`0x00`
  - typingsJapgolly.firmata.firmataInts.`0x01`
*/
trait SERIAL_MODE extends StObject
object SERIAL_MODE {
  
  inline def CONTINUOUS_READ: `0x00` = 0x00.asInstanceOf[`0x00`]
  
  inline def STOP_READING: `0x01` = 0x01.asInstanceOf[`0x01`]
}
