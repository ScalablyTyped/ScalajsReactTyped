package typingsJapgolly.yaml

import typingsJapgolly.yaml.distComposeComposeNodeMod.ComposeContext
import typingsJapgolly.yaml.distComposeComposeNodeMod.ComposeNode_
import typingsJapgolly.yaml.distComposeComposerMod.ComposeErrorHandler
import typingsJapgolly.yaml.distNodesNodeMod.ParsedNode
import typingsJapgolly.yaml.distNodesYamlmapMod.YAMLMap.Parsed
import typingsJapgolly.yaml.distParseCstMod.FlowCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComposeResolveFlowCollectionMod {
  
  @JSImport("yaml/dist/compose/resolve-flow-collection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveFlowCollection(
    hasComposeNodeComposeEmptyNode: ComposeNode_,
    ctx: ComposeContext,
    fc: FlowCollection,
    onError: ComposeErrorHandler
  ): (Parsed[ParsedNode, ParsedNode | Null]) | typingsJapgolly.yaml.distNodesYamlseqMod.YAMLSeq.Parsed[ParsedNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFlowCollection")(hasComposeNodeComposeEmptyNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], fc.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[(Parsed[ParsedNode, ParsedNode | Null]) | typingsJapgolly.yaml.distNodesYamlseqMod.YAMLSeq.Parsed[ParsedNode]]
}
