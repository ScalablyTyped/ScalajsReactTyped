package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.ngccSrcAnalysisNgccReferencesRegistryMod.NgccReferencesRegistry
import typingsJapgolly.angularCompilerCli.ngccSrcHostNgccHostMod.NgccReflectionHost
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcAnalysisPrivateDeclarationsAnalyzerMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/analysis/private_declarations_analyzer", "PrivateDeclarationsAnalyzer")
  @js.native
  open class PrivateDeclarationsAnalyzer protected () extends StObject {
    def this(host: NgccReflectionHost, referencesRegistry: NgccReferencesRegistry) = this()
    
    def analyzeProgram(program: Program): PrivateDeclarationsAnalyses = js.native
    
    /* private */ var getPrivateDeclarations: Any = js.native
    
    /* private */ var getRootFiles: Any = js.native
    
    /* private */ var host: Any = js.native
    
    /* private */ var referencesRegistry: Any = js.native
  }
  
  trait ExportInfo extends StObject {
    
    var dtsFrom: js.UndefOr[AbsoluteFsPath | Null] = js.undefined
    
    var from: AbsoluteFsPath
    
    var identifier: String
  }
  object ExportInfo {
    
    inline def apply(from: AbsoluteFsPath, identifier: String): ExportInfo = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportInfo]
    }
    
    extension [Self <: ExportInfo](x: Self) {
      
      inline def setDtsFrom(value: AbsoluteFsPath): Self = StObject.set(x, "dtsFrom", value.asInstanceOf[js.Any])
      
      inline def setDtsFromNull: Self = StObject.set(x, "dtsFrom", null)
      
      inline def setDtsFromUndefined: Self = StObject.set(x, "dtsFrom", js.undefined)
      
      inline def setFrom(value: AbsoluteFsPath): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    }
  }
  
  type PrivateDeclarationsAnalyses = js.Array[ExportInfo]
}
