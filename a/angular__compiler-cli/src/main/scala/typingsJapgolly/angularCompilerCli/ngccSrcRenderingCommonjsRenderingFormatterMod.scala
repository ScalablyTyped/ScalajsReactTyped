package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.ngccSrcHostNgccHostMod.NgccReflectionHost
import typingsJapgolly.angularCompilerCli.ngccSrcRenderingEsm5RenderingFormatterMod.Esm5RenderingFormatter
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcRenderingCommonjsRenderingFormatterMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/rendering/commonjs_rendering_formatter", "CommonJsRenderingFormatter")
  @js.native
  open class CommonJsRenderingFormatter protected () extends Esm5RenderingFormatter {
    def this(fs: PathManipulation, commonJsHost: NgccReflectionHost, isCore: Boolean) = this()
    
    /* protected */ var commonJsHost: NgccReflectionHost = js.native
  }
}
