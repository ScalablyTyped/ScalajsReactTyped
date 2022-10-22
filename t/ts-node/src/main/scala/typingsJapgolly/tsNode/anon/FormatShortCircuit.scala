package typingsJapgolly.tsNode.anon

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatShortCircuit extends StObject {
  
  var format: NodeLoaderHooksFormat
  
  var shortCircuit: js.UndefOr[Boolean] = js.undefined
  
  var source: js.UndefOr[String | Buffer] = js.undefined
}
object FormatShortCircuit {
  
  inline def apply(format: NodeLoaderHooksFormat): FormatShortCircuit = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatShortCircuit]
  }
  
  extension [Self <: FormatShortCircuit](x: Self) {
    
    inline def setFormat(value: NodeLoaderHooksFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setShortCircuit(value: Boolean): Self = StObject.set(x, "shortCircuit", value.asInstanceOf[js.Any])
    
    inline def setShortCircuitUndefined: Self = StObject.set(x, "shortCircuit", js.undefined)
    
    inline def setSource(value: String | Buffer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
