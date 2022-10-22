package typingsJapgolly.hapiHapi.mod

import typingsJapgolly.hapiHapi.hapiHapiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessSetting extends StObject {
  
  var entity: js.UndefOr[AccessEntity] = js.undefined
  
  var scope: AccessScopes | `false`
}
object AccessSetting {
  
  inline def apply(scope: AccessScopes | `false`): AccessSetting = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessSetting]
  }
  
  extension [Self <: AccessSetting](x: Self) {
    
    inline def setEntity(value: AccessEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setScope(value: AccessScopes | `false`): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
