package typingsJapgolly.stylableRuntime

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import typingsJapgolly.stylableRuntime.distTypesMod.NodeRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKeyedListRendererMod {
  
  @JSImport("@stylable/runtime/dist/keyed-list-renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDOMListRenderer[I, O /* <: Element */, C /* <: Element */](nodeRenderer: NodeRenderer[I, O]): DOMListRenderer[I, O, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDOMListRenderer")(nodeRenderer.asInstanceOf[js.Any]).asInstanceOf[DOMListRenderer[I, O, C]]
  
  @js.native
  trait DOMListRenderer[I, O /* <: Element */, C /* <: Element */] extends StObject {
    
    var nodes: StringDictionary[O] = js.native
    
    def render(container: C): Unit = js.native
    def render(container: C, data: js.Array[I]): Unit = js.native
  }
}
