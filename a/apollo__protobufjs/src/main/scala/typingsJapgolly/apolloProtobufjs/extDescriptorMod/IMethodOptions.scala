package typingsJapgolly.apolloProtobufjs.extDescriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMethodOptions extends StObject {
  
  var deprecated: js.UndefOr[Boolean] = js.undefined
}
object IMethodOptions {
  
  inline def apply(): IMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMethodOptions]
  }
  
  extension [Self <: IMethodOptions](x: Self) {
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
  }
}
