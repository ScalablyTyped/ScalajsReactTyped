package typingsJapgolly.vueRuntimeDom.mod

import org.scalajs.dom.Node
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Note: this file is auto concatenated to the end of the bundled d.ts during
// build.
/* augmented module */
object vueReactivityAugmentingMod {
  
  trait RefUnwrapBailTypes extends StObject {
    
    var runtimeDOMBailTypes: Node | Window
  }
  object RefUnwrapBailTypes {
    
    inline def apply(runtimeDOMBailTypes: Node | Window): RefUnwrapBailTypes = {
      val __obj = js.Dynamic.literal(runtimeDOMBailTypes = runtimeDOMBailTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefUnwrapBailTypes]
    }
    
    extension [Self <: RefUnwrapBailTypes](x: Self) {
      
      inline def setRuntimeDOMBailTypes(value: Node | Window): Self = StObject.set(x, "runtimeDOMBailTypes", value.asInstanceOf[js.Any])
    }
  }
}
