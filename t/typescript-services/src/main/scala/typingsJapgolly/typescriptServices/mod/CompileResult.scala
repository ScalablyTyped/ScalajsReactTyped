package typingsJapgolly.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "CompileResult")
@js.native
open class CompileResult ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.CompileResult {
  
  /* CompleteClass */
  var diagnostics: js.Array[typingsJapgolly.typescriptServices.TypeScript.Diagnostic] = js.native
  
  /* CompleteClass */
  var outputFiles: js.Array[typingsJapgolly.typescriptServices.TypeScript.OutputFile] = js.native
}
object CompileResult {
  
  @JSImport("typescript-services", "CompileResult")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromDiagnostics(diagnostics: js.Array[typingsJapgolly.typescriptServices.TypeScript.Diagnostic]): typingsJapgolly.typescriptServices.TypeScript.CompileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDiagnostics")(diagnostics.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.CompileResult]
  
  /* static member */
  inline def fromOutputFiles(outputFiles: js.Array[typingsJapgolly.typescriptServices.TypeScript.OutputFile]): typingsJapgolly.typescriptServices.TypeScript.CompileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOutputFiles")(outputFiles.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.CompileResult]
}
