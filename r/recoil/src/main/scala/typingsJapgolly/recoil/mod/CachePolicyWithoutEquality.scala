package typingsJapgolly.recoil.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.recoil.anon.Eviction
  - typingsJapgolly.recoil.anon.`0`
  - typingsJapgolly.recoil.anon.`1`
*/
trait CachePolicyWithoutEquality extends StObject
object CachePolicyWithoutEquality {
  
  inline def `0`(): typingsJapgolly.recoil.anon.`0` = {
    val __obj = js.Dynamic.literal(eviction = "keep-all")
    __obj.asInstanceOf[typingsJapgolly.recoil.anon.`0`]
  }
  
  inline def `1`(): typingsJapgolly.recoil.anon.`1` = {
    val __obj = js.Dynamic.literal(eviction = "most-recent")
    __obj.asInstanceOf[typingsJapgolly.recoil.anon.`1`]
  }
  
  inline def Eviction(maxSize: Double): typingsJapgolly.recoil.anon.Eviction = {
    val __obj = js.Dynamic.literal(eviction = "lru", maxSize = maxSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.recoil.anon.Eviction]
  }
}
