package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.anon.PartialLinkerOptions
import typingsJapgolly.angularCompilerCli.linkerSrcAstAstHostMod.AstHost
import typingsJapgolly.angularCompilerCli.linkerSrcFileLinkerLinkerOptionsMod.LinkerOptions
import typingsJapgolly.angularCompilerCli.linkerSrcFileLinkerTranslatorMod.Translator
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typingsJapgolly.angularCompilerCli.srcNgtscSourcemapsMod.SourceFileLoader
import typingsJapgolly.angularCompilerCli.srcNgtscTranslatorSrcApiAstFactoryMod.AstFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcFileLinkerLinkerEnvironmentMod {
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/linker_environment", "LinkerEnvironment")
  @js.native
  /* private */ open class LinkerEnvironment[TStatement, TExpression] () extends StObject {
    
    val factory: AstFactory[TStatement, TExpression] = js.native
    
    val fileSystem: ReadonlyFileSystem = js.native
    
    val host: AstHost[TExpression] = js.native
    
    val logger: Logger = js.native
    
    val options: LinkerOptions = js.native
    
    val sourceFileLoader: SourceFileLoader | Null = js.native
    
    val translator: Translator[TStatement, TExpression] = js.native
  }
  /* static members */
  object LinkerEnvironment {
    
    @JSImport("@angular/compiler-cli/linker/src/file_linker/linker_environment", "LinkerEnvironment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[TStatement, TExpression](
      fileSystem: ReadonlyFileSystem,
      logger: Logger,
      host: AstHost[TExpression],
      factory: AstFactory[TStatement, TExpression],
      options: PartialLinkerOptions
    ): LinkerEnvironment[TStatement, TExpression] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(fileSystem.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], host.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LinkerEnvironment[TStatement, TExpression]]
  }
}
