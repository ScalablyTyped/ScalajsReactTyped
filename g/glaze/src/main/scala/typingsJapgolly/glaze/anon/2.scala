package typingsJapgolly.glaze.anon

import typingsJapgolly.glaze.glazeInts.`4`
import typingsJapgolly.glaze.glazeInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  val `1`: typingsJapgolly.glaze.glazeInts.`1`
  
  val `2`: typingsJapgolly.glaze.glazeInts.`2`
  
  val `4`: typingsJapgolly.glaze.glazeInts.`4`
  
  val `8`: typingsJapgolly.glaze.glazeInts.`8`
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(1)
    __obj.updateDynamic("2")(2)
    __obj.updateDynamic("4")(4)
    __obj.updateDynamic("8")(8)
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def set1(value: typingsJapgolly.glaze.glazeInts.`1`): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set2(value: typingsJapgolly.glaze.glazeInts.`2`): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    inline def set4(value: `4`): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
    
    inline def set8(value: `8`): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
  }
}
