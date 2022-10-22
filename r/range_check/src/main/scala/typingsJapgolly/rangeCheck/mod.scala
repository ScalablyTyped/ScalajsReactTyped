package typingsJapgolly.rangeCheck

import typingsJapgolly.rangeCheck.rangeCheckInts.`0`
import typingsJapgolly.rangeCheck.rangeCheckInts.`4`
import typingsJapgolly.rangeCheck.rangeCheckInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("range_check", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def displayIP(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("displayIP")().asInstanceOf[String]
  inline def displayIP(ip: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("displayIP")(ip.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def inRange(ip: String, ranges: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inRange")(ip.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def inRange(ip: String, ranges: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inRange")(ip.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def in_range(ip: String, ranges: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("in_range")(ip.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def in_range(ip: String, ranges: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("in_range")(ip.asInstanceOf[js.Any], ranges.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isIP(ip: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIP")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRange(range: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRange")(range.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isV4(ip: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isV4")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isV6(ip: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isV6")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def searchIP(ip: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("searchIP")(ip.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def storeIP(ip: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("storeIP")(ip.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def validIp(ip: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validIp")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validRange(range: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validRange")(range.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def valid_ip(ip: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("valid_ip")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def valid_range(range: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("valid_range")(range.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def ver(ip: String): `0` | `4` | `6` = ^.asInstanceOf[js.Dynamic].applyDynamic("ver")(ip.asInstanceOf[js.Any]).asInstanceOf[`0` | `4` | `6`]
}
