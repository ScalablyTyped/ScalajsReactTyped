package typingsJapgolly.oidcProvider.anon

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.cryptoMod.KeyObject
import typingsJapgolly.oidcProvider.oidcProviderInts.`1`
import typingsJapgolly.oidcProvider.oidcProviderInts.`2`
import typingsJapgolly.oidcProvider.oidcProviderInts.`3`
import typingsJapgolly.oidcProvider.oidcProviderInts.`4`
import typingsJapgolly.oidcProvider.oidcProviderStrings.local
import typingsJapgolly.oidcProvider.oidcProviderStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kid extends StObject {
  
  var key: js.UndefOr[KeyObject | Buffer] = js.undefined
  
  var kid: js.UndefOr[String] = js.undefined
  
  var purpose: local | public
  
  var version: `1` | `2` | `3` | `4`
}
object Kid {
  
  inline def apply(purpose: local | public, version: `1` | `2` | `3` | `4`): Kid = {
    val __obj = js.Dynamic.literal(purpose = purpose.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kid]
  }
  
  extension [Self <: Kid](x: Self) {
    
    inline def setKey(value: KeyObject | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
    
    inline def setPurpose(value: local | public): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: `1` | `2` | `3` | `4`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
