package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Policy extends StObject {
  
  var policy: js.UndefOr[IlmPolicy] = js.undefined
}
object Policy {
  
  inline def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  
  extension [Self <: Policy](x: Self) {
    
    inline def setPolicy(value: IlmPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
