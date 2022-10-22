package typingsJapgolly.storybookApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Prepared extends StObject {
  
  var prepared: js.UndefOr[Boolean] = js.undefined
  
  var provider: typingsJapgolly.storybookApi.distTs3Dot9ModulesProviderMod.Provider
}
object Prepared {
  
  inline def apply(provider: typingsJapgolly.storybookApi.distTs3Dot9ModulesProviderMod.Provider): Prepared = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prepared]
  }
  
  extension [Self <: Prepared](x: Self) {
    
    inline def setPrepared(value: Boolean): Self = StObject.set(x, "prepared", value.asInstanceOf[js.Any])
    
    inline def setPreparedUndefined: Self = StObject.set(x, "prepared", js.undefined)
    
    inline def setProvider(value: typingsJapgolly.storybookApi.distTs3Dot9ModulesProviderMod.Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
