package typingsJapgolly.webcl.WEBCL

import typingsJapgolly.webcl.webclInts.`0x10`
import typingsJapgolly.webcl.webclInts.`0x1`
import typingsJapgolly.webcl.webclInts.`0x20`
import typingsJapgolly.webcl.webclInts.`0x2`
import typingsJapgolly.webcl.webclInts.`0x40`
import typingsJapgolly.webcl.webclInts.`0x4`
import typingsJapgolly.webcl.webclInts.`0x8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* cl_device_fp_config - bitfield */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webcl.webclInts.`0x1`
  - typingsJapgolly.webcl.webclInts.`0x2`
  - typingsJapgolly.webcl.webclInts.`0x4`
  - typingsJapgolly.webcl.webclInts.`0x8`
  - typingsJapgolly.webcl.webclInts.`0x10`
  - typingsJapgolly.webcl.webclInts.`0x20`
  - typingsJapgolly.webcl.webclInts.`0x40`
*/
trait DeviceFPConfigBits extends StObject
object DeviceFPConfigBits {
  
  inline def FP_DENORM: `0x1` = 0x1.asInstanceOf[`0x1`]
  
  inline def FP_FMA: `0x20` = 0x20.asInstanceOf[`0x20`]
  
  inline def FP_INF_NAN: `0x2` = 0x2.asInstanceOf[`0x2`]
  
  inline def FP_ROUND_TO_INF: `0x10` = 0x10.asInstanceOf[`0x10`]
  
  inline def FP_ROUND_TO_NEAREST: `0x4` = 0x4.asInstanceOf[`0x4`]
  
  inline def FP_ROUND_TO_ZERO: `0x8` = 0x8.asInstanceOf[`0x8`]
  
  inline def FP_SOFT_FLOAT: `0x40` = 0x40.asInstanceOf[`0x40`]
}
