package typingsJapgolly.openui5.anon

import typingsJapgolly.openui5.sapUiModelContextMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `36` extends StObject {
  
  /**
    * If present, it must point to this meta model's root entity container, that is, `oDetails.context.getModel()
    * === this` and `oDetails.context.getPath() === "/"`
    */
  var context: js.UndefOr[default] = js.undefined
}
object `36` {
  
  inline def apply(): `36` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`36`]
  }
  
  extension [Self <: `36`](x: Self) {
    
    inline def setContext(value: default): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
  }
}
