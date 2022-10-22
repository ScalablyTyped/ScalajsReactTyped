package typingsJapgolly.tsNode.anon

import typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShortCircuit extends StObject {
  
  var format: js.UndefOr[NodeLoaderHooksFormat] = js.undefined
  
  var shortCircuit: js.UndefOr[Boolean] = js.undefined
  
  var url: String
}
object ShortCircuit {
  
  inline def apply(url: String): ShortCircuit = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortCircuit]
  }
  
  extension [Self <: ShortCircuit](x: Self) {
    
    inline def setFormat(value: NodeLoaderHooksFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setShortCircuit(value: Boolean): Self = StObject.set(x, "shortCircuit", value.asInstanceOf[js.Any])
    
    inline def setShortCircuitUndefined: Self = StObject.set(x, "shortCircuit", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
