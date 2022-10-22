package typingsJapgolly.slate

import typingsJapgolly.slate.anon.Always
import typingsJapgolly.slate.anon.At
import typingsJapgolly.slate.anon.Compare
import typingsJapgolly.slate.anon.Hanging
import typingsJapgolly.slate.anon.Match
import typingsJapgolly.slate.anon.Mode
import typingsJapgolly.slate.anon.Split
import typingsJapgolly.slate.distInterfacesEditorMod.Editor
import typingsJapgolly.slate.distInterfacesElementMod.Element
import typingsJapgolly.slate.distInterfacesNodeMod.Node
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformsNodeMod {
  
  @js.native
  trait NodeTransforms extends StObject {
    
    def insertNodes[T /* <: Node */](editor: Editor, nodes: js.Array[Node]): Unit = js.native
    def insertNodes[T /* <: Node */](editor: Editor, nodes: js.Array[Node], options: At[T]): Unit = js.native
    def insertNodes[T /* <: Node */](editor: Editor, nodes: Node): Unit = js.native
    def insertNodes[T /* <: Node */](editor: Editor, nodes: Node, options: At[T]): Unit = js.native
    
    def liftNodes[T /* <: Node */](editor: Editor): Unit = js.native
    def liftNodes[T /* <: Node */](editor: Editor, options: Match[T]): Unit = js.native
    
    def mergeNodes[T /* <: Node */](editor: Editor): Unit = js.native
    def mergeNodes[T /* <: Node */](editor: Editor, options: Hanging[T]): Unit = js.native
    
    def moveNodes[T /* <: Node */](editor: Editor, options: Mode[T]): Unit = js.native
    
    def removeNodes[T /* <: Node */](editor: Editor): Unit = js.native
    def removeNodes[T /* <: Node */](editor: Editor, options: Hanging[T]): Unit = js.native
    
    def setNodes[T /* <: Node */](editor: Editor, props: Partial[T]): Unit = js.native
    def setNodes[T /* <: Node */](editor: Editor, props: Partial[T], options: Compare[T]): Unit = js.native
    
    def splitNodes[T /* <: Node */](editor: Editor): Unit = js.native
    def splitNodes[T /* <: Node */](editor: Editor, options: Always[T]): Unit = js.native
    
    def unsetNodes[T /* <: Node */](editor: Editor, props: String): Unit = js.native
    def unsetNodes[T /* <: Node */](editor: Editor, props: String, options: Split[T]): Unit = js.native
    def unsetNodes[T /* <: Node */](editor: Editor, props: js.Array[String]): Unit = js.native
    def unsetNodes[T /* <: Node */](editor: Editor, props: js.Array[String], options: Split[T]): Unit = js.native
    
    def unwrapNodes[T /* <: Node */](editor: Editor): Unit = js.native
    def unwrapNodes[T /* <: Node */](editor: Editor, options: Split[T]): Unit = js.native
    
    def wrapNodes[T /* <: Node */](editor: Editor, element: Element): Unit = js.native
    def wrapNodes[T /* <: Node */](editor: Editor, element: Element, options: Split[T]): Unit = js.native
  }
  @JSImport("slate/dist/transforms/node", "NodeTransforms")
  @js.native
  val NodeTransforms: typingsJapgolly.slate.distTransformsNodeMod.NodeTransforms = js.native
}
