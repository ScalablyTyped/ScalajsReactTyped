package typingsJapgolly.yaml

import typingsJapgolly.yaml.distComposeComposeNodeMod.ComposeContext
import typingsJapgolly.yaml.distComposeComposeNodeMod.ComposeNode_
import typingsJapgolly.yaml.distComposeComposerMod.ComposeErrorHandler
import typingsJapgolly.yaml.distNodesNodeMod.ParsedNode
import typingsJapgolly.yaml.distParseCstMod.BlockMap
import typingsJapgolly.yaml.distParseCstMod.BlockSequence
import typingsJapgolly.yaml.distParseCstMod.FlowCollection
import typingsJapgolly.yaml.distParseCstMod.SourceToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComposeComposeCollectionMod {
  
  @JSImport("yaml/dist/compose/compose-collection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeCollection(
    CN: ComposeNode_,
    ctx: ComposeContext,
    token: BlockMap,
    tagToken: Null,
    onError: ComposeErrorHandler
  ): ParsedNode = (^.asInstanceOf[js.Dynamic].applyDynamic("composeCollection")(CN.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], token.asInstanceOf[js.Any], tagToken.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[ParsedNode]
  inline def composeCollection(
    CN: ComposeNode_,
    ctx: ComposeContext,
    token: BlockMap,
    tagToken: SourceToken,
    onError: ComposeErrorHandler
  ): ParsedNode = (^.asInstanceOf[js.Dynamic].applyDynamic("composeCollection")(CN.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], token.asInstanceOf[js.Any], tagToken.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[ParsedNode]
  inline def composeCollection(
    CN: ComposeNode_,
    ctx: ComposeContext,
    token: BlockSequence,
    tagToken: Null,
    onError: ComposeErrorHandler
  ): ParsedNode = (^.asInstanceOf[js.Dynamic].applyDynamic("composeCollection")(CN.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], token.asInstanceOf[js.Any], tagToken.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[ParsedNode]
  inline def composeCollection(
    CN: ComposeNode_,
    ctx: ComposeContext,
    token: BlockSequence,
    tagToken: SourceToken,
    onError: ComposeErrorHandler
  ): ParsedNode = (^.asInstanceOf[js.Dynamic].applyDynamic("composeCollection")(CN.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], token.asInstanceOf[js.Any], tagToken.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[ParsedNode]
  inline def composeCollection(
    CN: ComposeNode_,
    ctx: ComposeContext,
    token: FlowCollection,
    tagToken: Null,
    onError: ComposeErrorHandler
  ): ParsedNode = (^.asInstanceOf[js.Dynamic].applyDynamic("composeCollection")(CN.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], token.asInstanceOf[js.Any], tagToken.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[ParsedNode]
  inline def composeCollection(
    CN: ComposeNode_,
    ctx: ComposeContext,
    token: FlowCollection,
    tagToken: SourceToken,
    onError: ComposeErrorHandler
  ): ParsedNode = (^.asInstanceOf[js.Dynamic].applyDynamic("composeCollection")(CN.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], token.asInstanceOf[js.Any], tagToken.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[ParsedNode]
}
