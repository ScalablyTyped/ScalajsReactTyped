package typingsJapgolly.yaml

import typingsJapgolly.yaml.distComposeComposeNodeMod.ComposeContext
import typingsJapgolly.yaml.distComposeComposeNodeMod.ComposeNode_
import typingsJapgolly.yaml.distComposeComposerMod.ComposeErrorHandler
import typingsJapgolly.yaml.distNodesNodeMod.ParsedNode
import typingsJapgolly.yaml.distNodesYamlmapMod.YAMLMap.Parsed
import typingsJapgolly.yaml.distParseCstMod.BlockMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComposeResolveBlockMapMod {
  
  @JSImport("yaml/dist/compose/resolve-block-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveBlockMap(
    hasComposeNodeComposeEmptyNode: ComposeNode_,
    ctx: ComposeContext,
    bm: BlockMap,
    onError: ComposeErrorHandler
  ): Parsed[ParsedNode, ParsedNode | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveBlockMap")(hasComposeNodeComposeEmptyNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], bm.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Parsed[ParsedNode, ParsedNode | Null]]
}
