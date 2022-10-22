package typingsJapgolly.tsLoader

import typingsJapgolly.tsLoader.anon.Compiler
import typingsJapgolly.tsLoader.anon.Typeoftypescript
import typingsJapgolly.tsLoader.distInterfacesMod.LoaderOptions
import typingsJapgolly.tsLoader.distLoggerMod.Logger
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.ParsedCommandLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompilerSetupMod {
  
  @JSImport("ts-loader/dist/compilerSetup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCompiler(loaderOptions: LoaderOptions, log: Logger): Compiler = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompiler")(loaderOptions.asInstanceOf[js.Any], log.asInstanceOf[js.Any])).asInstanceOf[Compiler]
  
  inline def getCompilerOptions(configParseResult: ParsedCommandLine, compiler: Typeoftypescript): CompilerOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompilerOptions")(configParseResult.asInstanceOf[js.Any], compiler.asInstanceOf[js.Any])).asInstanceOf[CompilerOptions]
}
