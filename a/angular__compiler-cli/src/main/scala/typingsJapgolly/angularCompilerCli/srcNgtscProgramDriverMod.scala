package typingsJapgolly.angularCompilerCli

import typingsJapgolly.typescript.mod.CompilerHost
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscProgramDriverMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/program_driver", "NgOriginalFile")
  @js.native
  val NgOriginalFile: js.Symbol = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/program_driver", "TsCreateProgramDriver")
  @js.native
  open class TsCreateProgramDriver protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscProgramDriverSrcTsCreateProgramDriverMod.TsCreateProgramDriver {
    def this(
      originalProgram: Program,
      originalHost: CompilerHost,
      options: CompilerOptions,
      shimExtensionPrefixes: js.Array[String]
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/program_driver", "UpdateMode")
  @js.native
  object UpdateMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.angularCompilerCli.srcNgtscProgramDriverSrcApiMod.UpdateMode & Double
      ] = js.native
    
    /* 0 */ val Complete: typingsJapgolly.angularCompilerCli.srcNgtscProgramDriverSrcApiMod.UpdateMode.Complete & Double = js.native
    
    /* 1 */ val Incremental: typingsJapgolly.angularCompilerCli.srcNgtscProgramDriverSrcApiMod.UpdateMode.Incremental & Double = js.native
  }
}
