package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.BoundTarget
import typingsJapgolly.angularCompilerCli.anon.Identifiers
import typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcContextMod.ComponentMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscIndexerSrcTemplateMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/indexer/src/template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTemplateIdentifiers(boundTemplate: BoundTarget[ComponentMeta]): Identifiers = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateIdentifiers")(boundTemplate.asInstanceOf[js.Any]).asInstanceOf[Identifiers]
}
