package typingsJapgolly.angularForms.anon

import typingsJapgolly.angularForms.mod.FormHooks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOn extends StObject {
  
  var updateOn: js.UndefOr[FormHooks] = js.undefined
}
object UpdateOn {
  
  inline def apply(): UpdateOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOn]
  }
  
  extension [Self <: UpdateOn](x: Self) {
    
    inline def setUpdateOn(value: FormHooks): Self = StObject.set(x, "updateOn", value.asInstanceOf[js.Any])
    
    inline def setUpdateOnUndefined: Self = StObject.set(x, "updateOn", js.undefined)
  }
}
