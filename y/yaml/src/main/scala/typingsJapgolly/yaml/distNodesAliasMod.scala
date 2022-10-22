package typingsJapgolly.yaml

import typingsJapgolly.yaml.anon.FlowScalartypealias
import typingsJapgolly.yaml.distDocDocumentMod.Document
import typingsJapgolly.yaml.distNodesNodeMod.Node
import typingsJapgolly.yaml.distNodesNodeMod.NodeBase
import typingsJapgolly.yaml.distNodesNodeMod.Range
import typingsJapgolly.yaml.distNodesNodeMod._Node
import typingsJapgolly.yaml.distNodesNodeMod._ParsedNode
import typingsJapgolly.yaml.distNodesScalarMod.Scalar
import typingsJapgolly.yaml.distNodesToJSMod.ToJSContext
import typingsJapgolly.yaml.distNodesYamlmapMod.YAMLMap
import typingsJapgolly.yaml.distNodesYamlseqMod.YAMLSeq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesAliasMod {
  
  @JSImport("yaml/dist/nodes/Alias", "Alias")
  @js.native
  open class Alias protected ()
    extends NodeBase
       with _Node[Any] {
    def this(source: String) = this()
    
    var anchor: js.UndefOr[scala.Nothing] = js.native
    
    /**
      * Resolve the value of this alias within `doc`, finding the last
      * instance of the `source` anchor before this node.
      */
    def resolve(doc: Document[Node[Any]]): js.UndefOr[Scalar[Any] | (YAMLMap[Any, Any]) | YAMLSeq[Any]] = js.native
    
    var source: String = js.native
    
    def toJSON(_arg: Any): js.Object | Null = js.native
    def toJSON(_arg: Any, ctx: ToJSContext): js.Object | Null = js.native
    def toJSON(_arg: Unit, ctx: ToJSContext): js.Object | Null = js.native
  }
  object Alias {
    
    @js.native
    trait Parsed
      extends Alias
         with _ParsedNode {
      
      @JSName("range")
      var range_Parsed: Range = js.native
      
      @JSName("srcToken")
      var srcToken_Parsed: js.UndefOr[FlowScalartypealias] = js.native
    }
  }
}
