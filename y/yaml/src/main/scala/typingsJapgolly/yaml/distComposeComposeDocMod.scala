package typingsJapgolly.yaml

import typingsJapgolly.yaml.distComposeComposerMod.ComposeErrorHandler
import typingsJapgolly.yaml.distDocDirectivesMod.Directives
import typingsJapgolly.yaml.distDocDocumentMod.Document.Parsed
import typingsJapgolly.yaml.distNodesNodeMod.ParsedNode
import typingsJapgolly.yaml.distOptionsMod.DocumentOptions
import typingsJapgolly.yaml.distOptionsMod.ParseOptions
import typingsJapgolly.yaml.distOptionsMod.SchemaOptions
import typingsJapgolly.yaml.distParseCstMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComposeComposeDocMod {
  
  @JSImport("yaml/dist/compose/compose-doc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeDoc(
    options: ParseOptions & DocumentOptions & SchemaOptions,
    directives: Directives,
    hasOffsetStartValueEnd: Document,
    onError: ComposeErrorHandler
  ): Parsed[ParsedNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeDoc")(options.asInstanceOf[js.Any], directives.asInstanceOf[js.Any], hasOffsetStartValueEnd.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Parsed[ParsedNode]]
}
