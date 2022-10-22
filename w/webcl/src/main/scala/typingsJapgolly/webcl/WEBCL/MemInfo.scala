package typingsJapgolly.webcl.WEBCL

import typingsJapgolly.webcl.webclInts.`0x1100`
import typingsJapgolly.webcl.webclInts.`0x1101`
import typingsJapgolly.webcl.webclInts.`0x1102`
import typingsJapgolly.webcl.webclInts.`0x1106`
import typingsJapgolly.webcl.webclInts.`0x1107`
import typingsJapgolly.webcl.webclInts.`0x1108`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* cl_meinfo */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webcl.webclInts.`0x1100`
  - typingsJapgolly.webcl.webclInts.`0x1101`
  - typingsJapgolly.webcl.webclInts.`0x1102`
  - typingsJapgolly.webcl.webclInts.`0x1106`
  - typingsJapgolly.webcl.webclInts.`0x1107`
  - typingsJapgolly.webcl.webclInts.`0x1108`
*/
trait MemInfo extends StObject
object MemInfo {
  
  inline def MEM_ASSOCIATED_MEMOBJECT: `0x1107` = 0x1107.asInstanceOf[`0x1107`]
  
  //MEM_HOST_PTR                              = 0x1103, // disallowed
  //MEM_MAP_COUNT                             = 0x1104, // disallowed
  //MEM_REFERENCE_COUNT                       = 0x1105, // disallowed
  inline def MEM_CONTEXT: `0x1106` = 0x1106.asInstanceOf[`0x1106`]
  
  inline def MEM_FLAGS: `0x1101` = 0x1101.asInstanceOf[`0x1101`]
  
  inline def MEM_OFFSET: `0x1108` = 0x1108.asInstanceOf[`0x1108`]
  
  inline def MEM_SIZE: `0x1102` = 0x1102.asInstanceOf[`0x1102`]
  
  inline def MEM_TYPE: `0x1100` = 0x1100.asInstanceOf[`0x1100`]
}
