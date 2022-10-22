package typingsJapgolly.oidcProvider.anon

import typingsJapgolly.oidcProvider.mod.CanBePromise
import typingsJapgolly.oidcProvider.mod.KoaContextWithOIDC
import typingsJapgolly.oidcProvider.mod.interactionPolicy.Prompt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Policy extends StObject {
  
  var policy: js.UndefOr[js.Array[Prompt]] = js.undefined
  
  var url: js.UndefOr[
    js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* interaction */ typingsJapgolly.oidcProvider.mod.Interaction, 
      CanBePromise[String]
    ]
  ] = js.undefined
}
object Policy {
  
  inline def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  
  extension [Self <: Policy](x: Self) {
    
    inline def setPolicy(value: js.Array[Prompt]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setPolicyVarargs(value: Prompt*): Self = StObject.set(x, "policy", js.Array(value*))
    
    inline def setUrl(
      value: (/* ctx */ KoaContextWithOIDC, /* interaction */ typingsJapgolly.oidcProvider.mod.Interaction) => CanBePromise[String]
    ): Self = StObject.set(x, "url", js.Any.fromFunction2(value))
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
