package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.redisClientBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ANY extends StObject {
  
  var ANY: js.UndefOr[`true`] = js.undefined
  
  var value: Double
}
object ANY {
  
  inline def apply(value: Double): ANY = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ANY]
  }
  
  extension [Self <: ANY](x: Self) {
    
    inline def setANY(value: `true`): Self = StObject.set(x, "ANY", value.asInstanceOf[js.Any])
    
    inline def setANYUndefined: Self = StObject.set(x, "ANY", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
