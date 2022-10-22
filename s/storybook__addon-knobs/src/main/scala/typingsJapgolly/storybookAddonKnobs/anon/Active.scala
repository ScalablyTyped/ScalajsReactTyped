package typingsJapgolly.storybookAddonKnobs.anon

import typingsJapgolly.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Active extends StObject {
  
  var active: Validator[Boolean]
  
  var api: Validator[PickAPIonoffemitgetQueryP]
  
  var onReset: Validator[js.UndefOr[js.Object]]
}
object Active {
  
  inline def apply(
    active: Validator[Boolean],
    api: Validator[PickAPIonoffemitgetQueryP],
    onReset: Validator[js.UndefOr[js.Object]]
  ): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], onReset = onReset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  
  extension [Self <: Active](x: Self) {
    
    inline def setActive(value: Validator[Boolean]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setApi(value: Validator[PickAPIonoffemitgetQueryP]): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setOnReset(value: Validator[js.UndefOr[js.Object]]): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
  }
}
