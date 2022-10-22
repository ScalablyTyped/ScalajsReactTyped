package typingsJapgolly.parse5Htmlparser2TreeAdapter

import typingsJapgolly.domhandler.libNodeMod.AnyNode
import typingsJapgolly.domhandler.libNodeMod.ChildNode
import typingsJapgolly.domhandler.libNodeMod.ParentNode
import typingsJapgolly.domhandler.mod.Comment
import typingsJapgolly.domhandler.mod.Document
import typingsJapgolly.domhandler.mod.Element
import typingsJapgolly.domhandler.mod.ProcessingInstruction
import typingsJapgolly.domhandler.mod.Text
import typingsJapgolly.parse5.distTreeAdaptersInterfaceMod.TreeAdapter
import typingsJapgolly.parse5.distTreeAdaptersInterfaceMod.TreeAdapterTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse5-htmlparser2-tree-adapter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("parse5-htmlparser2-tree-adapter", "adapter")
  @js.native
  val adapter: TreeAdapter[Htmlparser2TreeAdapterMap] = js.native
  
  inline def serializeDoctypeContent(name: String, publicId: String, systemId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeDoctypeContent")(name.asInstanceOf[js.Any], publicId.asInstanceOf[js.Any], systemId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Htmlparser2TreeAdapterMap = TreeAdapterTypeMap[
    AnyNode, 
    ParentNode, 
    ChildNode, 
    Document, 
    Document, 
    Element, 
    Comment, 
    Text, 
    Element, 
    ProcessingInstruction
  ]
}
