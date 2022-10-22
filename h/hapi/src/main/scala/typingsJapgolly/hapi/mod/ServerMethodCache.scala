package typingsJapgolly.hapi.mod

import typingsJapgolly.catbox.mod.PolicyOptions
import typingsJapgolly.hapi.hapiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerMethodCache
  extends StObject
     with PolicyOptions[Any] {
  
  @JSName("generateTimeout")
  var generateTimeout_ServerMethodCache: Double | `false`
}
object ServerMethodCache {
  
  inline def apply(generateTimeout: Double | `false`): ServerMethodCache = {
    val __obj = js.Dynamic.literal(generateTimeout = generateTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerMethodCache]
  }
  
  extension [Self <: ServerMethodCache](x: Self) {
    
    inline def setGenerateTimeout(value: Double | `false`): Self = StObject.set(x, "generateTimeout", value.asInstanceOf[js.Any])
  }
}
