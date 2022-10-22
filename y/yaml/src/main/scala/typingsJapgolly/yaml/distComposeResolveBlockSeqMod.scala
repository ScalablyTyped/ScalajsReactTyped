package typingsJapgolly.yaml

import typingsJapgolly.yaml.distComposeComposeNodeMod.ComposeContext
import typingsJapgolly.yaml.distComposeComposeNodeMod.ComposeNode_
import typingsJapgolly.yaml.distComposeComposerMod.ComposeErrorHandler
import typingsJapgolly.yaml.distNodesNodeMod.ParsedNode
import typingsJapgolly.yaml.distNodesYamlseqMod.YAMLSeq.Parsed
import typingsJapgolly.yaml.distParseCstMod.BlockSequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComposeResolveBlockSeqMod {
  
  @JSImport("yaml/dist/compose/resolve-block-seq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveBlockSeq(
    hasComposeNodeComposeEmptyNode: ComposeNode_,
    ctx: ComposeContext,
    bs: BlockSequence,
    onError: ComposeErrorHandler
  ): Parsed[ParsedNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveBlockSeq")(hasComposeNodeComposeEmptyNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], bs.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Parsed[ParsedNode]]
}
