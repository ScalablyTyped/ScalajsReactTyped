package typingsJapgolly.vueTestUtils

import org.scalajs.dom.Node
import typingsJapgolly.vueTestUtils.distBaseWrapperMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDomWrapperMod {
  
  @JSImport("@vue/test-utils/dist/domWrapper", "DOMWrapper")
  @js.native
  open class DOMWrapper[NodeType /* <: Node */] protected () extends default[NodeType] {
    def this(element: NodeType) = this()
    
    /* private */ var setChecked: Any = js.native
    
    /* private */ var setSelected: Any = js.native
  }
}
