package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.anon.Host
import typingsJapgolly.angularCompilerCli.srcTransformersApiMod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTransformersProgramMod {
  
  @JSImport("@angular/compiler-cli/src/transformers/program", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createProgram(hasRootNamesOptionsHostOldProgram: Host): Program = ^.asInstanceOf[js.Dynamic].applyDynamic("createProgram")(hasRootNamesOptionsHostOldProgram.asInstanceOf[js.Any]).asInstanceOf[Program]
}
