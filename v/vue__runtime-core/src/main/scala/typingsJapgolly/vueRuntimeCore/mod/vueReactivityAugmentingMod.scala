package typingsJapgolly.vueRuntimeCore.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.vueRuntimeCore.anon._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Note: this file is auto concatenated to the end of the bundled d.ts during
// build.
/* augmented module */
object vueReactivityAugmentingMod {
  
  trait RefUnwrapBailTypes extends StObject {
    
    var runtimeCoreBailTypes: (VNode[RendererNode, RendererElement, StringDictionary[Any]]) | _empty
  }
  object RefUnwrapBailTypes {
    
    inline def apply(runtimeCoreBailTypes: (VNode[RendererNode, RendererElement, StringDictionary[Any]]) | _empty): RefUnwrapBailTypes = {
      val __obj = js.Dynamic.literal(runtimeCoreBailTypes = runtimeCoreBailTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefUnwrapBailTypes]
    }
    
    extension [Self <: RefUnwrapBailTypes](x: Self) {
      
      inline def setRuntimeCoreBailTypes(value: (VNode[RendererNode, RendererElement, StringDictionary[Any]]) | _empty): Self = StObject.set(x, "runtimeCoreBailTypes", value.asInstanceOf[js.Any])
    }
  }
}
