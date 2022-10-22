package typingsJapgolly.redisClient.anon

import typingsJapgolly.redisClient.redisClientBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tls extends StObject {
  
  var tls: js.UndefOr[`false`] = js.undefined
}
object Tls {
  
  inline def apply(): Tls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tls]
  }
  
  extension [Self <: Tls](x: Self) {
    
    inline def setTls(value: `false`): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
