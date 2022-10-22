package typingsJapgolly.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.facebookJsSdk.anon.Max
  - typingsJapgolly.facebookJsSdk.anon.Min
  - typingsJapgolly.facebookJsSdk.anon.MaxMin
*/
trait AgeRange extends StObject
object AgeRange {
  
  inline def Max(): typingsJapgolly.facebookJsSdk.anon.Max = {
    val __obj = js.Dynamic.literal(max = 17, min = 13)
    __obj.asInstanceOf[typingsJapgolly.facebookJsSdk.anon.Max]
  }
  
  inline def MaxMin(max: Unit): typingsJapgolly.facebookJsSdk.anon.MaxMin = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = 21)
    __obj.asInstanceOf[typingsJapgolly.facebookJsSdk.anon.MaxMin]
  }
  
  inline def Min(): typingsJapgolly.facebookJsSdk.anon.Min = {
    val __obj = js.Dynamic.literal(max = 20, min = 18)
    __obj.asInstanceOf[typingsJapgolly.facebookJsSdk.anon.Min]
  }
}
